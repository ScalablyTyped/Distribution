package typings.riotGamesApi.RiotGamesAPI.TournamentProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TournamentCodeDto extends js.Object {
  var code: String
  var id: Double
  var lobbyName: String
  var map: String
  var metaData: String
  var participants: js.Array[Double]
  var password: String
  var pickType: String
  var providerId: Double
  var region: String
  var spectators: String
  var teamSize: Double
  var tournamentId: Double
}

object TournamentCodeDto {
  @scala.inline
  def apply(
    code: String,
    id: Double,
    lobbyName: String,
    map: String,
    metaData: String,
    participants: js.Array[Double],
    password: String,
    pickType: String,
    providerId: Double,
    region: String,
    spectators: String,
    teamSize: Double,
    tournamentId: Double
  ): TournamentCodeDto = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lobbyName = lobbyName.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], metaData = metaData.asInstanceOf[js.Any], participants = participants.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], pickType = pickType.asInstanceOf[js.Any], providerId = providerId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], spectators = spectators.asInstanceOf[js.Any], teamSize = teamSize.asInstanceOf[js.Any], tournamentId = tournamentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TournamentCodeDto]
  }
}

