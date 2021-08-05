package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Team extends StObject {
  
  var bans: js.Array[BannedChampion]
  
  var baronKills: Double
  
  var dominionVictoryScore: Double
  
  var dragonKills: Double
  
  var firstBaron: Boolean
  
  var firstBlood: Boolean
  
  var firstDragon: Boolean
  
  var firstInhibitor: Boolean
  
  var firstTower: Boolean
  
  var inhibitorKills: Double
  
  var teamId: Double
  
  var towerKills: Double
  
  var vilemawKills: Double
  
  var winner: Boolean
}
object Team {
  
  inline def apply(
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
  
  extension [Self <: Team](x: Self) {
    
    inline def setBans(value: js.Array[BannedChampion]): Self = StObject.set(x, "bans", value.asInstanceOf[js.Any])
    
    inline def setBansVarargs(value: BannedChampion*): Self = StObject.set(x, "bans", js.Array(value :_*))
    
    inline def setBaronKills(value: Double): Self = StObject.set(x, "baronKills", value.asInstanceOf[js.Any])
    
    inline def setDominionVictoryScore(value: Double): Self = StObject.set(x, "dominionVictoryScore", value.asInstanceOf[js.Any])
    
    inline def setDragonKills(value: Double): Self = StObject.set(x, "dragonKills", value.asInstanceOf[js.Any])
    
    inline def setFirstBaron(value: Boolean): Self = StObject.set(x, "firstBaron", value.asInstanceOf[js.Any])
    
    inline def setFirstBlood(value: Boolean): Self = StObject.set(x, "firstBlood", value.asInstanceOf[js.Any])
    
    inline def setFirstDragon(value: Boolean): Self = StObject.set(x, "firstDragon", value.asInstanceOf[js.Any])
    
    inline def setFirstInhibitor(value: Boolean): Self = StObject.set(x, "firstInhibitor", value.asInstanceOf[js.Any])
    
    inline def setFirstTower(value: Boolean): Self = StObject.set(x, "firstTower", value.asInstanceOf[js.Any])
    
    inline def setInhibitorKills(value: Double): Self = StObject.set(x, "inhibitorKills", value.asInstanceOf[js.Any])
    
    inline def setTeamId(value: Double): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
    
    inline def setTowerKills(value: Double): Self = StObject.set(x, "towerKills", value.asInstanceOf[js.Any])
    
    inline def setVilemawKills(value: Double): Self = StObject.set(x, "vilemawKills", value.asInstanceOf[js.Any])
    
    inline def setWinner(value: Boolean): Self = StObject.set(x, "winner", value.asInstanceOf[js.Any])
  }
}
