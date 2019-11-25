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
    val __obj = js.Dynamic.literal(division = division.asInstanceOf[js.Any], isFreshBlood = isFreshBlood.asInstanceOf[js.Any], isHotStreak = isHotStreak.asInstanceOf[js.Any], isInactive = isInactive.asInstanceOf[js.Any], isVeteran = isVeteran.asInstanceOf[js.Any], leaguePoints = leaguePoints.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], miniSeries = miniSeries.asInstanceOf[js.Any], playerOrTeamId = playerOrTeamId.asInstanceOf[js.Any], playerOrTeamName = playerOrTeamName.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LeagueEntryDto]
  }
}

