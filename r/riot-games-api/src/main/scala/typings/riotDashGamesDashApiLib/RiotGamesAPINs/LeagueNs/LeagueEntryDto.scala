package typings
package riotDashGamesDashApiLib.RiotGamesAPINs.LeagueNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LeagueEntryDto extends js.Object {
  var division: java.lang.String
  var isFreshBlood: scala.Boolean
  var isHotStreak: scala.Boolean
  var isInactive: scala.Boolean
  var isVeteran: scala.Boolean
  var leaguePoints: scala.Double
  var losses: scala.Double
  var miniSeries: MiniSeriesDto
  var playerOrTeamId: java.lang.String
  var playerOrTeamName: java.lang.String
  var wins: scala.Double
}

object LeagueEntryDto {
  @scala.inline
  def apply(
    division: java.lang.String,
    isFreshBlood: scala.Boolean,
    isHotStreak: scala.Boolean,
    isInactive: scala.Boolean,
    isVeteran: scala.Boolean,
    leaguePoints: scala.Double,
    losses: scala.Double,
    miniSeries: MiniSeriesDto,
    playerOrTeamId: java.lang.String,
    playerOrTeamName: java.lang.String,
    wins: scala.Double
  ): LeagueEntryDto = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("division")(division)
    __obj.updateDynamic("isFreshBlood")(isFreshBlood)
    __obj.updateDynamic("isHotStreak")(isHotStreak)
    __obj.updateDynamic("isInactive")(isInactive)
    __obj.updateDynamic("isVeteran")(isVeteran)
    __obj.updateDynamic("leaguePoints")(leaguePoints)
    __obj.updateDynamic("losses")(losses)
    __obj.updateDynamic("miniSeries")(miniSeries)
    __obj.updateDynamic("playerOrTeamId")(playerOrTeamId)
    __obj.updateDynamic("playerOrTeamName")(playerOrTeamName)
    __obj.updateDynamic("wins")(wins)
    __obj.asInstanceOf[LeagueEntryDto]
  }
}

