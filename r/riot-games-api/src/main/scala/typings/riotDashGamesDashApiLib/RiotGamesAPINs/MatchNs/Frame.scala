package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var events: js.Array[Event]
  var participanFrames: js.Array[org.scalablytyped.runtime.StringDictionary[ParticipantFrame]]
  var timestamp: scala.Double
}

object Frame {
  @scala.inline
  def apply(
    events: js.Array[Event],
    participanFrames: js.Array[org.scalablytyped.runtime.StringDictionary[ParticipantFrame]],
    timestamp: scala.Double
  ): Frame = {
    val __obj = js.Dynamic.literal(events = events, participanFrames = participanFrames, timestamp = timestamp)
  
    __obj.asInstanceOf[Frame]
  }
}

