package typings.riotGamesApi.RiotGamesAPI.Team

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
    val __obj = js.Dynamic.literal(assists = assists.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], deaths = deaths.asInstanceOf[js.Any], gameId = gameId.asInstanceOf[js.Any], gameMode = gameMode.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], kills = kills.asInstanceOf[js.Any], mapId = mapId.asInstanceOf[js.Any], opposingTeamKills = opposingTeamKills.asInstanceOf[js.Any], opposingTeamName = opposingTeamName.asInstanceOf[js.Any], win = win.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchHistorySummaryDto]
  }
}

