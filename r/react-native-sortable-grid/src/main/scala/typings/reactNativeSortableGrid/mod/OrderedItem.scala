package typings.reactNativeSortableGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderedItem extends js.Object {
  var key: String
  var order: Double
  var ref: SortableGridItem | Null
}

object OrderedItem {
  @scala.inline
  def apply(key: String, order: Double, ref: SortableGridItem = null): OrderedItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderedItem]
  }
}

