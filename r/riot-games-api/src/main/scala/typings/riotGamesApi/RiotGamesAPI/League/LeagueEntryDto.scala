package typings.riotGamesApi.RiotGamesAPI.League

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LeagueEntryDto extends js.Object {
  
  var division: String = js.native
  
  var isFreshBlood: Boolean = js.native
  
  var isHotStreak: Boolean = js.native
  
  var isInactive: Boolean = js.native
  
  var isVeteran: Boolean = js.native
  
  var leaguePoints: Double = js.native
  
  var losses: Double = js.native
  
  var miniSeries: MiniSeriesDto = js.native
  
  var playerOrTeamId: String = js.native
  
  var playerOrTeamName: String = js.native
  
  var wins: Double = js.native
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
  
  @scala.inline
  implicit class LeagueEntryDtoOps[Self <: LeagueEntryDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDivision(value: String): Self = this.set("division", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFreshBlood(value: Boolean): Self = this.set("isFreshBlood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHotStreak(value: Boolean): Self = this.set("isHotStreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInactive(value: Boolean): Self = this.set("isInactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVeteran(value: Boolean): Self = this.set("isVeteran", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaguePoints(value: Double): Self = this.set("leaguePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLosses(value: Double): Self = this.set("losses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiniSeries(value: MiniSeriesDto): Self = this.set("miniSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerOrTeamId(value: String): Self = this.set("playerOrTeamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerOrTeamName(value: String): Self = this.set("playerOrTeamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWins(value: Double): Self = this.set("wins", value.asInstanceOf[js.Any])
  }
}
