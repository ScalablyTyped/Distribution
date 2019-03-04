package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragPreviousAndNextLocation extends PreviousAndNextLocation {
  var nextParent: TreeItem | scala.Null
  var prevParent: TreeItem | scala.Null
}

object OnDragPreviousAndNextLocation {
  @scala.inline
  def apply(
    nextPath: reactDashSortableDashTreeLib.NumberOrStringArray,
    nextTreeIndex: scala.Double,
    prevPath: reactDashSortableDashTreeLib.NumberOrStringArray,
    prevTreeIndex: scala.Double,
    nextParent: TreeItem = null,
    prevParent: TreeItem = null
  ): OnDragPreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath, nextTreeIndex = nextTreeIndex, prevPath = prevPath, prevTreeIndex = prevTreeIndex)
    if (nextParent != null) __obj.updateDynamic("nextParent")(nextParent)
    if (prevParent != null) __obj.updateDynamic("prevParent")(prevParent)
    __obj.asInstanceOf[OnDragPreviousAndNextLocation]
  }
}

