package typings
package reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackConstraints extends js.Object {
  var facingMode: reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.user | reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.environment
  var mandatory: MandatoryMedia
  var optional: js.Array[MediaSources]
}

object MediaTrackConstraints {
  @scala.inline
  def apply(
    facingMode: reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.user | reactDashNativeDashWebrtcLib.reactDashNativeDashWebrtcLibStrings.environment,
    mandatory: MandatoryMedia,
    optional: js.Array[MediaSources]
  ): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal(facingMode = facingMode.asInstanceOf[js.Any], mandatory = mandatory, optional = optional)
  
    __obj.asInstanceOf[MediaTrackConstraints]
  }
}

