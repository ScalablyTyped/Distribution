package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** One end of a connection—or potential connection—and how it's configured. Each RTCSessionDescription consists of a description type indicating which part of the offer/answer negotiation process it describes and of the SDP descriptor of the session. */
trait RTCSessionDescription extends js.Object {
  val sdp: java.lang.String
  val `type`: RTCSdpType
  def toJSON(): js.Any
}

object RTCSessionDescription {
  @scala.inline
  def apply(sdp: java.lang.String, toJSON: () => js.Any, `type`: RTCSdpType): RTCSessionDescription = {
    val __obj = js.Dynamic.literal(sdp = sdp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCSessionDescription]
  }
}

