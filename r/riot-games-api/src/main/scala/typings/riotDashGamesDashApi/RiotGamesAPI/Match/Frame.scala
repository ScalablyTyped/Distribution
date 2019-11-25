package typings.riotDashGamesDashApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var events: js.Array[Event]
  var participanFrames: js.Array[StringDictionary[ParticipantFrame]]
  var timestamp: Double
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
}

