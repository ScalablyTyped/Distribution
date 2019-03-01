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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowedSummonerIds")(allowedSummonerIds)
    __obj.updateDynamic("mapType")(mapType)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("pickType")(pickType)
    __obj.updateDynamic("spectatorType")(spectatorType)
    __obj.updateDynamic("teamSize")(teamSize)
    __obj.asInstanceOf[TournamentCodeParameters]
  }
}

