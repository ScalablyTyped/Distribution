package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtpCodecCapability extends js.Object {
  var channels: js.UndefOr[Double] = js.undefined
  var clockRate: Double
  var mimeType: java.lang.String
  var sdpFmtpLine: js.UndefOr[java.lang.String] = js.undefined
}

object RTCRtpCodecCapability {
  @scala.inline
  def apply(
    clockRate: Double,
    mimeType: java.lang.String,
    channels: js.UndefOr[Double] = js.undefined,
    sdpFmtpLine: java.lang.String = null
  ): RTCRtpCodecCapability = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    if (!js.isUndefined(channels)) __obj.updateDynamic("channels")(channels.get.asInstanceOf[js.Any])
    if (sdpFmtpLine != null) __obj.updateDynamic("sdpFmtpLine")(sdpFmtpLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecCapability]
  }
}

