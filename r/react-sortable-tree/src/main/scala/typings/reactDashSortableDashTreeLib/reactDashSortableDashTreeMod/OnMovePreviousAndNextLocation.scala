package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnMovePreviousAndNextLocation extends PreviousAndNextLocation {
  var nextParentNode: TreeItem | scala.Null
}

object OnMovePreviousAndNextLocation {
  @scala.inline
  def apply(
    nextPath: reactDashSortableDashTreeLib.NumberOrStringArray,
    nextTreeIndex: scala.Double,
    prevPath: reactDashSortableDashTreeLib.NumberOrStringArray,
    prevTreeIndex: scala.Double,
    nextParentNode: TreeItem = null
  ): OnMovePreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath, nextTreeIndex = nextTreeIndex, prevPath = prevPath, prevTreeIndex = prevTreeIndex)
    if (nextParentNode != null) __obj.updateDynamic("nextParentNode")(nextParentNode)
    __obj.asInstanceOf[OnMovePreviousAndNextLocation]
  }
}

