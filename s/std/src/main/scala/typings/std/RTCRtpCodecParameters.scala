package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpCodecParameters extends js.Object {
  var channels: js.UndefOr[Double] = js.undefined
  var clockRate: Double
  var mimeType: java.lang.String
  var payloadType: Double
  var sdpFmtpLine: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRtpCodecParameters {
  @scala.inline
  def apply(
    clockRate: Double,
    mimeType: java.lang.String,
    payloadType: Double,
    channels: js.UndefOr[Double] = js.undefined,
    sdpFmtpLine: java.lang.String = null
  ): RTCRtpCodecParameters = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any])
    if (!js.isUndefined(channels)) __obj.updateDynamic("channels")(channels.get.asInstanceOf[js.Any])
    if (sdpFmtpLine != null) __obj.updateDynamic("sdpFmtpLine")(sdpFmtpLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecParameters]
  }
}

