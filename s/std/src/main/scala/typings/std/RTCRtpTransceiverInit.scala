package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpTransceiverInit extends js.Object {
  var direction: js.UndefOr[RTCRtpTransceiverDirection] = js.undefined
  var sendEncodings: js.UndefOr[js.Array[RTCRtpEncodingParameters]] = js.undefined
  var streams: js.UndefOr[js.Array[MediaStream]] = js.undefined
}

object RTCRtpTransceiverInit {
  @scala.inline
  def apply(
    direction: RTCRtpTransceiverDirection = null,
    sendEncodings: js.Array[RTCRtpEncodingParameters] = null,
    streams: js.Array[MediaStream] = null
  ): RTCRtpTransceiverInit = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (sendEncodings != null) __obj.updateDynamic("sendEncodings")(sendEncodings)
    if (streams != null) __obj.updateDynamic("streams")(streams)
    __obj.asInstanceOf[RTCRtpTransceiverInit]
  }
}

