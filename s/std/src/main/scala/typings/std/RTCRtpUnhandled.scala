package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtpUnhandled extends js.Object {
  var muxId: js.UndefOr[java.lang.String] = js.native
  var payloadType: js.UndefOr[Double] = js.native
  var ssrc: js.UndefOr[Double] = js.native
}

object RTCRtpUnhandled {
  @scala.inline
  def apply(): RTCRtpUnhandled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtpUnhandled]
  }
  @scala.inline
  implicit class RTCRtpUnhandledOps[Self <: RTCRtpUnhandled] (val x: Self) extends AnyVal {
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
    def setMuxId(value: java.lang.String): Self = this.set("muxId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMuxId: Self = this.set("muxId", js.undefined)
    @scala.inline
    def setPayloadType(value: Double): Self = this.set("payloadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayloadType: Self = this.set("payloadType", js.undefined)
    @scala.inline
    def setSsrc(value: Double): Self = this.set("ssrc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsrc: Self = this.set("ssrc", js.undefined)
  }
  
}

