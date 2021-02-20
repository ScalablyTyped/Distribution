package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Team extends StObject {
  
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
  implicit class TeamMutableBuilder[Self <: Team] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBans(value: js.Array[BannedChampion]): Self = StObject.set(x, "bans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBansVarargs(value: BannedChampion*): Self = StObject.set(x, "bans", js.Array(value :_*))
    
    @scala.inline
    def setBaronKills(value: Double): Self = StObject.set(x, "baronKills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominionVictoryScore(value: Double): Self = StObject.set(x, "dominionVictoryScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragonKills(value: Double): Self = StObject.set(x, "dragonKills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstBaron(value: Boolean): Self = StObject.set(x, "firstBaron", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstBlood(value: Boolean): Self = StObject.set(x, "firstBlood", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstDragon(value: Boolean): Self = StObject.set(x, "firstDragon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstInhibitor(value: Boolean): Self = StObject.set(x, "firstInhibitor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstTower(value: Boolean): Self = StObject.set(x, "firstTower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInhibitorKills(value: Double): Self = StObject.set(x, "inhibitorKills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTowerKills(value: Double): Self = StObject.set(x, "towerKills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVilemawKills(value: Double): Self = StObject.set(x, "vilemawKills", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWinner(value: Boolean): Self = StObject.set(x, "winner", value.asInstanceOf[js.Any])
  }
}
