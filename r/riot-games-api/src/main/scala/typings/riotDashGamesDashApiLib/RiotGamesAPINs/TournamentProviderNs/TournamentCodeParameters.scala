package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TournamentProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TournamentCodeParameters extends js.Object {
  var allowedSummonerIds: SummonerIdParams
  var mapType: java.lang.String
  var metadata: java.lang.String
  var pickType: java.lang.String
  var spectatorType: java.lang.String
  var teamSize: scala.Double
}

object TournamentCodeParameters {
  @scala.inline
  def apply(
    allowedSummonerIds: SummonerIdParams,
    mapType: java.lang.String,
    metadata: java.lang.String,
    pickType: java.lang.String,
    spectatorType: java.lang.String,
    teamSize: scala.Double
  ): TournamentCodeParameters = {
    val __obj = js.Dynamic.literal(allowedSummonerIds = allowedSummonerIds, mapType = mapType, metadata = metadata, pickType = pickType, spectatorType = spectatorType, teamSize = teamSize)
  
    __obj.asInstanceOf[TournamentCodeParameters]
  }
}

