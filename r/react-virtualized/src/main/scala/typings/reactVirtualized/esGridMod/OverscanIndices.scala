package typings.reactVirtualized.esGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverscanIndices extends js.Object {
  var overscanStartIndex: Double
  var overscanStopIndex: Double
}

object OverscanIndices {
  @scala.inline
  def apply(overscanStartIndex: Double, overscanStopIndex: Double): OverscanIndices = {
    val __obj = js.Dynamic.literal(overscanStartIndex = overscanStartIndex.asInstanceOf[js.Any], overscanStopIndex = overscanStopIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OverscanIndices]
  }
}

