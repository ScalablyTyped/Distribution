package typings.riotGamesApi.RiotGamesAPI.Team

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamStatDetailDto extends js.Object {
  
  var averageGamesPlayed: Double = js.native
  
  var losses: Double = js.native
  
  var teamStatType: String = js.native
  
  var wins: Double = js.native
}
object TeamStatDetailDto {
  
  @scala.inline
  def apply(averageGamesPlayed: Double, losses: Double, teamStatType: String, wins: Double): TeamStatDetailDto = {
    val __obj = js.Dynamic.literal(averageGamesPlayed = averageGamesPlayed.asInstanceOf[js.Any], losses = losses.asInstanceOf[js.Any], teamStatType = teamStatType.asInstanceOf[js.Any], wins = wins.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamStatDetailDto]
  }
  
  @scala.inline
  implicit class TeamStatDetailDtoOps[Self <: TeamStatDetailDto] (val x: Self) extends AnyVal {
    
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
    def setAverageGamesPlayed(value: Double): Self = this.set("averageGamesPlayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLosses(value: Double): Self = this.set("losses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamStatType(value: String): Self = this.set("teamStatType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWins(value: Double): Self = this.set("wins", value.asInstanceOf[js.Any])
  }
}
