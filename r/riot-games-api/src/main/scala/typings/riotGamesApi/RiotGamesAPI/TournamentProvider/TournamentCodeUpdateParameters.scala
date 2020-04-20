package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TournamentCodeUpdateParameters extends js.Object {
  var allowedParticipants: String
  var mapType: String
  var pickType: String
  var spectatorType: String
}

object TournamentCodeUpdateParameters {
  @scala.inline
  def apply(allowedParticipants: String, mapType: String, pickType: String, spectatorType: String): TournamentCodeUpdateParameters = {
    val __obj = js.Dynamic.literal(allowedParticipants = allowedParticipants.asInstanceOf[js.Any], mapType = mapType.asInstanceOf[js.Any], pickType = pickType.asInstanceOf[js.Any], spectatorType = spectatorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TournamentCodeUpdateParameters]
  }
}

