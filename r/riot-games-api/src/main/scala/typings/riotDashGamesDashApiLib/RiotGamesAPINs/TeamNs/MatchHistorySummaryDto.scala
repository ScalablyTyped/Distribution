package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.TeamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchHistorySummaryDto extends js.Object {
  var assists: scala.Double
  var date: scala.Double
  var deaths: scala.Double
  var gameId: scala.Double
  var gameMode: java.lang.String
  var invalid: scala.Boolean
  var kills: scala.Double
  var mapId: scala.Double
  var opposingTeamKills: scala.Double
  var opposingTeamName: java.lang.String
  var win: scala.Boolean
}

object MatchHistorySummaryDto {
  @scala.inline
  def apply(
    assists: scala.Double,
    date: scala.Double,
    deaths: scala.Double,
    gameId: scala.Double,
    gameMode: java.lang.String,
    invalid: scala.Boolean,
    kills: scala.Double,
    mapId: scala.Double,
    opposingTeamKills: scala.Double,
    opposingTeamName: java.lang.String,
    win: scala.Boolean
  ): MatchHistorySummaryDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("assists")(assists)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("deaths")(deaths)
    __obj.updateDynamic("gameId")(gameId)
    __obj.updateDynamic("gameMode")(gameMode)
    __obj.updateDynamic("invalid")(invalid)
    __obj.updateDynamic("kills")(kills)
    __obj.updateDynamic("mapId")(mapId)
    __obj.updateDynamic("opposingTeamKills")(opposingTeamKills)
    __obj.updateDynamic("opposingTeamName")(opposingTeamName)
    __obj.updateDynamic("win")(win)
    __obj.asInstanceOf[MatchHistorySummaryDto]
  }
}

