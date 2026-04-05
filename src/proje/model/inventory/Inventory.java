package proje.model.inventory;
import proje.model.item.Item;
import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Item> {

    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        if (item != null) {
            items.add(item);
        }
    }

    public boolean removeItem(T item) {
        if (item == null) return false;
        return items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }


}
