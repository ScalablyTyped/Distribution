package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Frame extends js.Object {
  var events: js.Array[Event] = js.native
  var participanFrames: js.Array[StringDictionary[ParticipantFrame]] = js.native
  var timestamp: Double = js.native
}

object Frame {
  @scala.inline
  def apply(
    events: js.Array[Event],
    participanFrames: js.Array[StringDictionary[ParticipantFrame]],
    timestamp: Double
  ): Frame = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], participanFrames = participanFrames.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  @scala.inline
  implicit class FrameOps[Self <: Frame] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: Event*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def setParticipanFramesVarargs(value: StringDictionary[ParticipantFrame]*): Self = this.set("participanFrames", js.Array(value :_*))
    @scala.inline
    def setParticipanFrames(value: js.Array[StringDictionary[ParticipantFrame]]): Self = this.set("participanFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}

