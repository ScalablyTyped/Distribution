package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpCodecCapability extends js.Object {
  var channels: js.UndefOr[Double] = js.native
  var clockRate: Double = js.native
  var mimeType: java.lang.String = js.native
  var sdpFmtpLine: js.UndefOr[java.lang.String] = js.native
}

object RTCRtpCodecCapability {
  @scala.inline
  def apply(clockRate: Double, mimeType: java.lang.String): RTCRtpCodecCapability = {
    val __obj = js.Dynamic.literal(clockRate = clockRate.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtpCodecCapability]
  }
  @scala.inline
  implicit class RTCRtpCodecCapabilityOps[Self <: RTCRtpCodecCapability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClockRate(value: Double): Self = this.set("clockRate", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: java.lang.String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannels(value: Double): Self = this.set("channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("channels", js.undefined)
    @scala.inline
    def setSdpFmtpLine(value: java.lang.String): Self = this.set("sdpFmtpLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSdpFmtpLine: Self = this.set("sdpFmtpLine", js.undefined)
  }
  
}

