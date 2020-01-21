package typings.reactNativeSortableGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemOrder extends js.Object {
  var itemOrder: js.Array[OrderedItem]
}

object ItemOrder {
  @scala.inline
  def apply(itemOrder: js.Array[OrderedItem]): ItemOrder = {
    val __obj = js.Dynamic.literal(itemOrder = itemOrder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemOrder]
  }
}

