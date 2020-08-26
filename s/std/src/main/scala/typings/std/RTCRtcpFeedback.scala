package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCRtcpFeedback extends js.Object {
  var parameter: js.UndefOr[java.lang.String] = js.native
  var `type`: js.UndefOr[java.lang.String] = js.native
}

object RTCRtcpFeedback {
  @scala.inline
  def apply(): RTCRtcpFeedback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCRtcpFeedback]
  }
  @scala.inline
  implicit class RTCRtcpFeedbackOps[Self <: RTCRtcpFeedback] (val x: Self) extends AnyVal {
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
    def setParameter(value: java.lang.String): Self = this.set("parameter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    @scala.inline
    def setType(value: java.lang.String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

