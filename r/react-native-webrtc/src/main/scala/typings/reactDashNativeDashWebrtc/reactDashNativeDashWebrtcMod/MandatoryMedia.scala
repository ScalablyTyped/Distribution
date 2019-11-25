package typings.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MandatoryMedia extends js.Object {
  var minFrameRate: Double
  var minHeight: Double
  var minWidth: Double
}

object MandatoryMedia {
  @scala.inline
  def apply(minFrameRate: Double, minHeight: Double, minWidth: Double): MandatoryMedia = {
    val __obj = js.Dynamic.literal(minFrameRate = minFrameRate.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MandatoryMedia]
  }
}

