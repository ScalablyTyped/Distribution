package typings
package reactDashSortableDashHocLib.reactDashSortableDashHocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortEnd extends js.Object {
  var collection: Offset
  var newIndex: scala.Double
  var oldIndex: scala.Double
}

object SortEnd {
  @scala.inline
  def apply(collection: Offset, newIndex: scala.Double, oldIndex: scala.Double): SortEnd = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    __obj.updateDynamic("newIndex")(newIndex)
    __obj.updateDynamic("oldIndex")(oldIndex)
    __obj.asInstanceOf[SortEnd]
  }
}

