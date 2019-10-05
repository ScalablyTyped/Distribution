package typings.riotDashGamesDashApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MatchHistorySummaryDto extends js.Object {
  var assists: Double
  var date: Double
  var deaths: Double
  var gameId: Double
  var gameMode: String
  var invalid: Boolean
  var kills: Double
  var mapId: Double
  var opposingTeamKills: Double
  var opposingTeamName: String
  var win: Boolean
}

object MatchHistorySummaryDto {
  @scala.inline
  def apply(
    assists: Double,
    date: Double,
    deaths: Double,
    gameId: Double,
    gameMode: String,
    invalid: Boolean,
    kills: Double,
    mapId: Double,
    opposingTeamKills: Double,
    opposingTeamName: String,
    win: Boolean
  ): MatchHistorySummaryDto = {
    val __obj = js.Dynamic.literal(assists = assists, date = date, deaths = deaths, gameId = gameId, gameMode = gameMode, invalid = invalid, kills = kills, mapId = mapId, opposingTeamKills = opposingTeamKills, opposingTeamName = opposingTeamName, win = win)
  
    __obj.asInstanceOf[MatchHistorySummaryDto]
  }
}

