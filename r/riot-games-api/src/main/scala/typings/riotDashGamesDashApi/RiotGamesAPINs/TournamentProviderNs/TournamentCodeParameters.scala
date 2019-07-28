package typings.riotDashGamesDashApi.RiotGamesAPINs.TournamentProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TournamentCodeParameters extends js.Object {
  var allowedSummonerIds: SummonerIdParams
  var mapType: String
  var metadata: String
  var pickType: String
  var spectatorType: String
  var teamSize: Double
}

object TournamentCodeParameters {
  @scala.inline
  def apply(
    allowedSummonerIds: SummonerIdParams,
    mapType: String,
    metadata: String,
    pickType: String,
    spectatorType: String,
    teamSize: Double
  ): TournamentCodeParameters = {
    val __obj = js.Dynamic.literal(allowedSummonerIds = allowedSummonerIds, mapType = mapType, metadata = metadata, pickType = pickType, spectatorType = spectatorType, teamSize = teamSize)
  
    __obj.asInstanceOf[TournamentCodeParameters]
  }
}

