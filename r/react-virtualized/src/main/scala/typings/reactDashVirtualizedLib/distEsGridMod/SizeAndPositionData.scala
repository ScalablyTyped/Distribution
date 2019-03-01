package typings
package reactDashVirtualizedLib.distEsGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeAndPositionData extends js.Object {
  var offset: scala.Double
  var size: scala.Double
}

object SizeAndPositionData {
  @scala.inline
  def apply(offset: scala.Double, size: scala.Double): SizeAndPositionData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[SizeAndPositionData]
  }
}

