package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.reactDashSortableDashTree.NumberOrStringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMovePreviousAndNextLocation extends PreviousAndNextLocation {
  var nextParentNode: TreeItem | Null
}

object OnMovePreviousAndNextLocation {
  @scala.inline
  def apply(
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double,
    nextParentNode: TreeItem = null
  ): OnMovePreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath, nextTreeIndex = nextTreeIndex, prevPath = prevPath, prevTreeIndex = prevTreeIndex)
    if (nextParentNode != null) __obj.updateDynamic("nextParentNode")(nextParentNode)
    __obj.asInstanceOf[OnMovePreviousAndNextLocation]
  }
}

