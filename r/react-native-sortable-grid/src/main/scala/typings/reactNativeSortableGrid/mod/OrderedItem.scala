package typings.reactNativeSortableGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderedItem extends js.Object {
  var key: String = js.native
  var order: Double = js.native
  var ref: SortableGridItem | Null = js.native
}

object OrderedItem {
  @scala.inline
  def apply(key: String, order: Double): OrderedItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedItem]
  }
  @scala.inline
  implicit class OrderedItemOps[Self <: OrderedItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: SortableGridItem): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

