package typings.reactSortableTree.mod

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
    val __obj = js.Dynamic.literal(nextPath = nextPath.asInstanceOf[js.Any], nextTreeIndex = nextTreeIndex.asInstanceOf[js.Any], prevPath = prevPath.asInstanceOf[js.Any], prevTreeIndex = prevTreeIndex.asInstanceOf[js.Any], nextParent = nextParent.asInstanceOf[js.Any], prevParent = prevParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnDragPreviousAndNextLocation]
  }
}

