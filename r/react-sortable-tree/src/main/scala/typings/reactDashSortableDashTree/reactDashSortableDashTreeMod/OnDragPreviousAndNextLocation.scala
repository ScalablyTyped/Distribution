package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

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
    val __obj = js.Dynamic.literal(nextPath = nextPath.asInstanceOf[js.Any], nextTreeIndex = nextTreeIndex.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any])
    if (nextParent != null) __obj.updateDynamic("nextParent")(nextParent.asInstanceOf[js.Any])
    if (prevParent != null) __obj.updateDynamic("prevParent")(prevParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDragPreviousAndNextLocation]
  }
}

