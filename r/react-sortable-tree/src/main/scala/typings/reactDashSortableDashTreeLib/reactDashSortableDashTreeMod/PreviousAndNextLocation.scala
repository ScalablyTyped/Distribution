package typings
package reactDashSortableDashTreeLib.reactDashSortableDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousAndNextLocation extends js.Object {
  var nextPath: reactDashSortableDashTreeLib.NumberOrStringArray
  var nextTreeIndex: scala.Double
  var prevPath: reactDashSortableDashTreeLib.NumberOrStringArray
  var prevTreeIndex: scala.Double
}

object PreviousAndNextLocation {
  @scala.inline
  def apply(
    nextPath: reactDashSortableDashTreeLib.NumberOrStringArray,
    nextTreeIndex: scala.Double,
    prevPath: reactDashSortableDashTreeLib.NumberOrStringArray,
    prevTreeIndex: scala.Double
  ): PreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath, nextTreeIndex = nextTreeIndex, prevPath = prevPath, prevTreeIndex = prevTreeIndex)
  
    __obj.asInstanceOf[PreviousAndNextLocation]
  }
}

