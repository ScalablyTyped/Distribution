package typings.reactDashVirtualized.reactDashVirtualizedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverscanIndexRange extends js.Object {
  var overscanStartIndex: Double
  var overscanStopIndex: Double
}

object OverscanIndexRange {
  @scala.inline
  def apply(overscanStartIndex: Double, overscanStopIndex: Double): OverscanIndexRange = {
    val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex, overscanStopIndex = overscanStopIndex)
  
    __obj.asInstanceOf[OverscanIndexRange]
  }
}

