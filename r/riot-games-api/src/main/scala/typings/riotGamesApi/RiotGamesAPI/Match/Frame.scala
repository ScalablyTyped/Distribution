package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Frame extends StObject {
  
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
  implicit class FrameMutableBuilder[Self <: Frame] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    @scala.inline
    def setParticipanFrames(value: js.Array[StringDictionary[ParticipantFrame]]): Self = StObject.set(x, "participanFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipanFramesVarargs(value: StringDictionary[ParticipantFrame]*): Self = StObject.set(x, "participanFrames", js.Array(value :_*))
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
