package typings.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcMod

import typings.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcStrings.environment
import typings.reactDashNativeDashWebrtc.reactDashNativeDashWebrtcStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackConstraints extends js.Object {
  var facingMode: user | environment
  var mandatory: MandatoryMedia
  var optional: js.Array[MediaSources]
}

object MediaTrackConstraints {
  @scala.inline
  def apply(facingMode: user | environment, mandatory: MandatoryMedia, optional: js.Array[MediaSources]): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal(facingMode = facingMode.asInstanceOf[js.Any], mandatory = mandatory.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaTrackConstraints]
  }
}

