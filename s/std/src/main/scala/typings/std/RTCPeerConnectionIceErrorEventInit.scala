package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnectionIceErrorEventInit extends EventInit {
  var errorCode: Double = js.native
  var hostCandidate: js.UndefOr[java.lang.String] = js.native
  var statusText: js.UndefOr[java.lang.String] = js.native
  var url: js.UndefOr[java.lang.String] = js.native
}

object RTCPeerConnectionIceErrorEventInit {
  @scala.inline
  def apply(errorCode: Double): RTCPeerConnectionIceErrorEventInit = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCPeerConnectionIceErrorEventInit]
  }
  @scala.inline
  implicit class RTCPeerConnectionIceErrorEventInitOps[Self <: RTCPeerConnectionIceErrorEventInit] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: Double): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setHostCandidate(value: java.lang.String): Self = this.set("hostCandidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostCandidate: Self = this.set("hostCandidate", js.undefined)
    @scala.inline
    def setStatusText(value: java.lang.String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
    @scala.inline
    def setUrl(value: java.lang.String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}

