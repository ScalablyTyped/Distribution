package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Player extends StObject {
  
  var matchHistoryUri: String
  
  var profileIcon: Double
  
  var summonerId: Double
  
  var summonerName: String
}
object Player {
  
  inline def apply(matchHistoryUri: String, profileIcon: Double, summonerId: Double, summonerName: String): Player = {
    val __obj = js.Dynamic.literal(matchHistoryUri = matchHistoryUri.asInstanceOf[js.Any], profileIcon = profileIcon.asInstanceOf[js.Any], summonerId = summonerId.asInstanceOf[js.Any], summonerName = summonerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
  
  extension [Self <: Player](x: Self) {
    
    inline def setMatchHistoryUri(value: String): Self = StObject.set(x, "matchHistoryUri", value.asInstanceOf[js.Any])
    
    inline def setProfileIcon(value: Double): Self = StObject.set(x, "profileIcon", value.asInstanceOf[js.Any])
    
    inline def setSummonerId(value: Double): Self = StObject.set(x, "summonerId", value.asInstanceOf[js.Any])
    
    inline def setSummonerName(value: String): Self = StObject.set(x, "summonerName", value.asInstanceOf[js.Any])
  }
}
