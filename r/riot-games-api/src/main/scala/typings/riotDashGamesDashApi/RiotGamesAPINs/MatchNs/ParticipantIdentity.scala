package typings.riotDashGamesDashApi.RiotGamesAPINs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParticipantIdentity extends js.Object {
  var participantId: Double
  var player: Player
}

object ParticipantIdentity {
  @scala.inline
  def apply(participantId: Double, player: Player): ParticipantIdentity = {
    val __obj = js.Dynamic.literal(participantId = participantId, player = player)
  
    __obj.asInstanceOf[ParticipantIdentity]
  }
}

