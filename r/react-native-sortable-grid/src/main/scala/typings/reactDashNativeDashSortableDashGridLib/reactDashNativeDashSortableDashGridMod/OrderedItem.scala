package typings
package reactDashNativeDashSortableDashGridLib.reactDashNativeDashSortableDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderedItem extends js.Object {
  var key: java.lang.String
  var order: scala.Double
  var ref: reactDashNativeDashSortableDashGridLib.SortableGridItem | scala.Null
}

object OrderedItem {
  @scala.inline
  def apply(
    key: java.lang.String,
    order: scala.Double,
    ref: reactDashNativeDashSortableDashGridLib.SortableGridItem = null
  ): OrderedItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("order")(order)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[OrderedItem]
  }
}

