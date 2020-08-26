package typings.reactNativeWebrtc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventOnCandidate extends js.Object {
  var candidate: RTCIceCandidateType = js.native
}

object EventOnCandidate {
  @scala.inline
  def apply(candidate: RTCIceCandidateType): EventOnCandidate = {
    val __obj = js.Dynamic.literal(candidate = candidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOnCandidate]
  }
  @scala.inline
  implicit class EventOnCandidateOps[Self <: EventOnCandidate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCandidate(value: RTCIceCandidateType): Self = this.set("candidate", value.asInstanceOf[js.Any])
  }
  
}

