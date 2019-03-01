package typings
package reactDashVirtualizedLib.reactDashVirtualizedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverscanIndexRange extends js.Object {
  var overscanStartIndex: scala.Double
  var overscanStopIndex: scala.Double
}

object OverscanIndexRange {
  @scala.inline
  def apply(overscanStartIndex: scala.Double, overscanStopIndex: scala.Double): OverscanIndexRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("overscanStartIndex")(overscanStartIndex)
    __obj.updateDynamic("overscanStopIndex")(overscanStopIndex)
    __obj.asInstanceOf[OverscanIndexRange]
  }
}

