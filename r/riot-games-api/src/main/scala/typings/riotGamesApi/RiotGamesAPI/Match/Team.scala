package typings.riotGamesApi.RiotGamesAPI.Match

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Team extends js.Object {
  
  var bans: js.Array[BannedChampion] = js.native
  
  var baronKills: Double = js.native
  
  var dominionVictoryScore: Double = js.native
  
  var dragonKills: Double = js.native
  
  var firstBaron: Boolean = js.native
  
  var firstBlood: Boolean = js.native
  
  var firstDragon: Boolean = js.native
  
  var firstInhibitor: Boolean = js.native
  
  var firstTower: Boolean = js.native
  
  var inhibitorKills: Double = js.native
  
  var teamId: Double = js.native
  
  var towerKills: Double = js.native
  
  var vilemawKills: Double = js.native
  
  var winner: Boolean = js.native
}
object Team {
  
  @scala.inline
  def apply(
    bans: js.Array[BannedChampion],
    baronKills: Double,
    dominionVictoryScore: Double,
    dragonKills: Double,
    firstBaron: Boolean,
    firstBlood: Boolean,
    firstDragon: Boolean,
    firstInhibitor: Boolean,
    firstTower: Boolean,
    inhibitorKills: Double,
    teamId: Double,
    towerKills: Double,
    vilemawKills: Double,
    winner: Boolean
  ): Team = {
    val __obj = js.Dynamic.literal(bans = bans.asInstanceOf[js.Any], baronKills = baronKills.asInstanceOf[js.Any], dominionVictoryScore = dominionVictoryScore.asInstanceOf[js.Any], dragonKills = dragonKills.asInstanceOf[js.Any], firstBaron = firstBaron.asInstanceOf[js.Any], firstBlood = firstBlood.asInstanceOf[js.Any], firstDragon = firstDragon.asInstanceOf[js.Any], firstInhibitor = firstInhibitor.asInstanceOf[js.Any], firstTower = firstTower.asInstanceOf[js.Any], inhibitorKills = inhibitorKills.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any], towerKills = towerKills.asInstanceOf[js.Any], vilemawKills = vilemawKills.asInstanceOf[js.Any], winner = winner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Team]
  }
  
  @scala.inline
  implicit class TeamOps[Self <: Team] (val x: Self) extends AnyVal {
    
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
    def setBansVarargs(value: BannedChampion*): Self = this.set("bans", js.Array(value :_*))
    
    @scala.inline
    def setBans(value: js.Array[BannedChampion]): Self = this.set("bans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaronKills(value: Double): Self = this.set("baronKills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominionVictoryScore(value: Double): Self = this.set("dominionVictoryScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragonKills(value: Double): Self = this.set("dragonKills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstBaron(value: Boolean): Self = this.set("firstBaron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstBlood(value: Boolean): Self = this.set("firstBlood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDragon(value: Boolean): Self = this.set("firstDragon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstInhibitor(value: Boolean): Self = this.set("firstInhibitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstTower(value: Boolean): Self = this.set("firstTower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInhibitorKills(value: Double): Self = this.set("inhibitorKills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamId(value: Double): Self = this.set("teamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTowerKills(value: Double): Self = this.set("towerKills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVilemawKills(value: Double): Self = this.set("vilemawKills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinner(value: Boolean): Self = this.set("winner", value.asInstanceOf[js.Any])
  }
}
