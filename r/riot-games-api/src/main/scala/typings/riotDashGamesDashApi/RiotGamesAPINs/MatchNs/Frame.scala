package typings.riotDashGamesDashApi.RiotGamesAPINs.MatchNs

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
    val __obj = js.Dynamic.literal(events = events, participanFrames = participanFrames, timestamp = timestamp)
  
    __obj.asInstanceOf[Frame]
  }
}

