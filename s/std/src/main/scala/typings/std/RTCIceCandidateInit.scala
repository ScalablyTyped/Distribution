package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RTCIceCandidateInit extends js.Object {
  var candidate: js.UndefOr[java.lang.String] = js.native
  var sdpMLineIndex: js.UndefOr[Double | Null] = js.native
  var sdpMid: js.UndefOr[java.lang.String | Null] = js.native
  var usernameFragment: js.UndefOr[java.lang.String | Null] = js.native
}

object RTCIceCandidateInit {
  @scala.inline
  def apply(): RTCIceCandidateInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceCandidateInit]
  }
  @scala.inline
  implicit class RTCIceCandidateInitOps[Self <: RTCIceCandidateInit] (val x: Self) extends AnyVal {
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
    def setCandidate(value: java.lang.String): Self = this.set("candidate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandidate: Self = this.set("candidate", js.undefined)
    @scala.inline
    def setSdpMLineIndex(value: Double): Self = this.set("sdpMLineIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSdpMLineIndex: Self = this.set("sdpMLineIndex", js.undefined)
    @scala.inline
    def setSdpMLineIndexNull: Self = this.set("sdpMLineIndex", null)
    @scala.inline
    def setSdpMid(value: java.lang.String): Self = this.set("sdpMid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSdpMid: Self = this.set("sdpMid", js.undefined)
    @scala.inline
    def setSdpMidNull: Self = this.set("sdpMid", null)
    @scala.inline
    def setUsernameFragment(value: java.lang.String): Self = this.set("usernameFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsernameFragment: Self = this.set("usernameFragment", js.undefined)
    @scala.inline
    def setUsernameFragmentNull: Self = this.set("usernameFragment", null)
  }
  
}

