package typings.riotDashGamesDashApi.RiotGamesAPI.League

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeagueEntryDto extends js.Object {
  var division: String
  var isFreshBlood: Boolean
  var isHotStreak: Boolean
  var isInactive: Boolean
  var isVeteran: Boolean
  var leaguePoints: Double
  var losses: Double
  var miniSeries: MiniSeriesDto
  var playerOrTeamId: String
  var playerOrTeamName: String
  var wins: Double
}

object LeagueEntryDto {
  @scala.inline
  def apply(
    division: String,
    isFreshBlood: Boolean,
    isHotStreak: Boolean,
    isInactive: Boolean,
    isVeteran: Boolean,
    leaguePoints: Double,
    losses: Double,
    miniSeries: MiniSeriesDto,
    playerOrTeamId: String,
    playerOrTeamName: String,
    wins: Double
  ): LeagueEntryDto = {
    val __obj = js.Dynamic.literal(division = division, isFreshBlood = isFreshBlood, isHotStreak = isHotStreak, isInactive = isInactive, isVeteran = isVeteran, leaguePoints = leaguePoints, losses = losses, miniSeries = miniSeries, playerOrTeamId = playerOrTeamId, playerOrTeamName = playerOrTeamName, wins = wins)
  
    __obj.asInstanceOf[LeagueEntryDto]
  }
}

