package typings.reactNativeSortableGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemOrder extends js.Object {
  
  var itemOrder: js.Array[OrderedItem] = js.native
}
object ItemOrder {
  
  @scala.inline
  def apply(itemOrder: js.Array[OrderedItem]): ItemOrder = {
    val __obj = js.Dynamic.literal(itemOrder = itemOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOrder]
  }
  
  @scala.inline
  implicit class ItemOrderOps[Self <: ItemOrder] (val x: Self) extends AnyVal {
    
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
    def setItemOrderVarargs(value: OrderedItem*): Self = this.set("itemOrder", js.Array(value :_*))
    
    @scala.inline
    def setItemOrder(value: js.Array[OrderedItem]): Self = this.set("itemOrder", value.asInstanceOf[js.Any])
  }
}
