package typings.riotDashGamesDashApi.RiotGamesAPINs.TournamentProviderNs

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
    val __obj = js.Dynamic.literal(code = code, id = id, lobbyName = lobbyName, map = map, metaData = metaData, participants = participants, password = password, pickType = pickType, providerId = providerId, region = region, spectators = spectators, teamSize = teamSize, tournamentId = tournamentId)
  
    __obj.asInstanceOf[TournamentCodeDto]
  }
}

