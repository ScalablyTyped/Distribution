package typings.reactDashSortableDashTree.reactDashSortableDashTreeMod

import typings.reactDashSortableDashTree.NumberOrStringArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviousAndNextLocation extends js.Object {
  var nextPath: NumberOrStringArray
  var nextTreeIndex: Double
  var prevPath: NumberOrStringArray
  var prevTreeIndex: Double
}

object PreviousAndNextLocation {
  @scala.inline
  def apply(
    nextPath: NumberOrStringArray,
    nextTreeIndex: Double,
    prevPath: NumberOrStringArray,
    prevTreeIndex: Double
  ): PreviousAndNextLocation = {
    val __obj = js.Dynamic.literal(nextPath = nextPath, nextTreeIndex = nextTreeIndex, prevPath = prevPath, prevTreeIndex = prevTreeIndex)
  
    __obj.asInstanceOf[PreviousAndNextLocation]
  }
}

