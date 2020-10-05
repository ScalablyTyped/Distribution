package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** One end of a connection—or potential connection—and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session. */
@js.native
trait RTCSessionDescription extends js.Object {
  val sdp: java.lang.String = js.native
  val `type`: RTCSdpType = js.native
  def toJSON(): js.Any = js.native
}

object RTCSessionDescription {
  @scala.inline
  def apply(sdp: java.lang.String, toJSON: () => js.Any, `type`: RTCSdpType): RTCSessionDescription = {
    val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionDescription]
  }
  @scala.inline
  implicit class RTCSessionDescriptionOps[Self <: RTCSessionDescription] (val x: Self) extends AnyVal {
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
    def setSdp(value: java.lang.String): Self = this.set("sdp", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Any): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setType(value: RTCSdpType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

