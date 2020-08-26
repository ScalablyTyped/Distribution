package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpEncodingParameters extends RTCRtpCodingParameters {
  var active: js.UndefOr[scala.Boolean] = js.native
  var codecPayloadType: js.UndefOr[Double] = js.native
  var dtx: js.UndefOr[RTCDtxStatus] = js.native
  var maxBitrate: js.UndefOr[Double] = js.native
  var maxFramerate: js.UndefOr[Double] = js.native
  var ptime: js.UndefOr[Double] = js.native
  var scaleResolutionDownBy: js.UndefOr[Double] = js.native
}

object RTCRtpEncodingParameters {
  @scala.inline
  def apply(): RTCRtpEncodingParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpEncodingParameters]
  }
  @scala.inline
  implicit class RTCRtpEncodingParametersOps[Self <: RTCRtpEncodingParameters] (val x: Self) extends AnyVal {
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
    def setActive(value: scala.Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setCodecPayloadType(value: Double): Self = this.set("codecPayloadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodecPayloadType: Self = this.set("codecPayloadType", js.undefined)
    @scala.inline
    def setDtx(value: RTCDtxStatus): Self = this.set("dtx", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDtx: Self = this.set("dtx", js.undefined)
    @scala.inline
    def setMaxBitrate(value: Double): Self = this.set("maxBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBitrate: Self = this.set("maxBitrate", js.undefined)
    @scala.inline
    def setMaxFramerate(value: Double): Self = this.set("maxFramerate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxFramerate: Self = this.set("maxFramerate", js.undefined)
    @scala.inline
    def setPtime(value: Double): Self = this.set("ptime", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePtime: Self = this.set("ptime", js.undefined)
    @scala.inline
    def setScaleResolutionDownBy(value: Double): Self = this.set("scaleResolutionDownBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScaleResolutionDownBy: Self = this.set("scaleResolutionDownBy", js.undefined)
  }
  
}

