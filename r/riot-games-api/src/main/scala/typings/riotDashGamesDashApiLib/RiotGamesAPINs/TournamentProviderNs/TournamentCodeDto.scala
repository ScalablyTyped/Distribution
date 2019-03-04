package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TournamentCodeDto extends js.Object {
  var code: java.lang.String
  var id: scala.Double
  var lobbyName: java.lang.String
  var map: java.lang.String
  var metaData: java.lang.String
  var participants: js.Array[scala.Double]
  var password: java.lang.String
  var pickType: java.lang.String
  var providerId: scala.Double
  var region: java.lang.String
  var spectators: java.lang.String
  var teamSize: scala.Double
  var tournamentId: scala.Double
}

object TournamentCodeDto {
  @scala.inline
  def apply(
    code: java.lang.String,
    id: scala.Double,
    lobbyName: java.lang.String,
    map: java.lang.String,
    metaData: java.lang.String,
    participants: js.Array[scala.Double],
    password: java.lang.String,
    pickType: java.lang.String,
    providerId: scala.Double,
    region: java.lang.String,
    spectators: java.lang.String,
    teamSize: scala.Double,
    tournamentId: scala.Double
  ): TournamentCodeDto = {
    val __obj = js.Dynamic.literal(code = code, id = id, lobbyName = lobbyName, map = map, metaData = metaData, participants = participants, password = password, pickType = pickType, providerId = providerId, region = region, spectators = spectators, teamSize = teamSize, tournamentId = tournamentId)
  
    __obj.asInstanceOf[TournamentCodeDto]
  }
}

