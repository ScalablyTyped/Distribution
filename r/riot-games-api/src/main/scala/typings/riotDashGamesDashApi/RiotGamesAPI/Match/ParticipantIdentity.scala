package typings.riotDashGamesDashApi.RiotGamesAPI.Match

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
    val __obj = js.Dynamic.literal(participantId = participantId.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParticipantIdentity]
  }
}

