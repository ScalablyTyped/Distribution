package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpCodecParameters extends js.Object {
  var channels: js.UndefOr[scala.Double] = js.undefined
  var clockRate: scala.Double
  var mimeType: java.lang.String
  var payloadType: scala.Double
  var sdpFmtpLine: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRtpCodecParameters {
  @scala.inline
  def apply(
    clockRate: scala.Double,
    mimeType: java.lang.String,
    payloadType: scala.Double,
    channels: scala.Int | scala.Double = null,
    sdpFmtpLine: java.lang.String = null
  ): RTCRtpCodecParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clockRate")(clockRate)
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.updateDynamic("payloadType")(payloadType)
    if (channels != null) __obj.updateDynamic("channels")(channels.asInstanceOf[js.Any])
    if (sdpFmtpLine != null) __obj.updateDynamic("sdpFmtpLine")(sdpFmtpLine)
    __obj.asInstanceOf[RTCRtpCodecParameters]
  }
}

