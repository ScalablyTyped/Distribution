package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MandatoryMedia extends js.Object {
  var minFrameRate: scala.Double
  var minHeight: scala.Double
  var minWidth: scala.Double
}

object MandatoryMedia {
  @scala.inline
  def apply(minFrameRate: scala.Double, minHeight: scala.Double, minWidth: scala.Double): MandatoryMedia = {
    val __obj = js.Dynamic.literal(minFrameRate = minFrameRate, minHeight = minHeight, minWidth = minWidth)
  
    __obj.asInstanceOf[MandatoryMedia]
  }
}

