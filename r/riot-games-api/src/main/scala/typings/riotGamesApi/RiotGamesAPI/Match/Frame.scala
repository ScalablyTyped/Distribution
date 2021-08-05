package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Frame extends StObject {
  
  var events: js.Array[Event]
  
  var participanFrames: js.Array[StringDictionary[ParticipantFrame]]
  
  var timestamp: Double
}
object Frame {
  
  inline def apply(
    events: js.Array[Event],
    participanFrames: js.Array[StringDictionary[ParticipantFrame]],
    timestamp: Double
  ): Frame = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], participanFrames = participanFrames.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Frame]
  }
  
  extension [Self <: Frame](x: Self) {
    
    inline def setEvents(value: js.Array[Event]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value :_*))
    
    inline def setParticipanFrames(value: js.Array[StringDictionary[ParticipantFrame]]): Self = StObject.set(x, "participanFrames", value.asInstanceOf[js.Any])
    
    inline def setParticipanFramesVarargs(value: StringDictionary[ParticipantFrame]*): Self = StObject.set(x, "participanFrames", js.Array(value :_*))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
