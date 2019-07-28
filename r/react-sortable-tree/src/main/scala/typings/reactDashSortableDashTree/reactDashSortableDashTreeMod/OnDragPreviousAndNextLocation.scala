package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.reactDashSortableDashTree.NumberOrStringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDragPreviousAndNextLocation extends PreviousAndNextLocation {
  var nextParent: TreeItem | Null
  var prevParent: TreeItem | Null
}

object OnDragPreviousAndNextLocation {
  @scala.inline
  def apply(
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double,
    nextParent: TreeItem = null,
    prevParent: TreeItem = null
  ): OnDragPreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath, nextTreeIndex = nextTreeIndex, prevPath = prevPath, prevTreeIndex = prevTreeIndex)
    if (nextParent != null) __obj.updateDynamic("nextParent")(nextParent)
    if (prevParent != null) __obj.updateDynamic("prevParent")(prevParent)
    __obj.asInstanceOf[OnDragPreviousAndNextLocation]
  }
}

