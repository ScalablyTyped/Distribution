package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCSessionDescriptionInit extends js.Object {
  var sdp: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[RTCSdpType] = js.undefined
}

object RTCSessionDescriptionInit {
  @scala.inline
  def apply(sdp: java.lang.String = null, `type`: RTCSdpType = null): RTCSessionDescriptionInit = {
    val __obj = js.Dynamic.literal()
    if (sdp != null) __obj.updateDynamic("sdp")(sdp.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionDescriptionInit]
  }
}

