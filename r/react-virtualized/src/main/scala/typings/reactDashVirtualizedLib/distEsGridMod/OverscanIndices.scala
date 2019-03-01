package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverscanIndices extends js.Object {
  var overscanStartIndex: scala.Double
  var overscanStopIndex: scala.Double
}

object OverscanIndices {
  @scala.inline
  def apply(overscanStartIndex: scala.Double, overscanStopIndex: scala.Double): OverscanIndices = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("overscanStartIndex")(overscanStartIndex)
    __obj.updateDynamic("overscanStopIndex")(overscanStopIndex)
    __obj.asInstanceOf[OverscanIndices]
  }
}

