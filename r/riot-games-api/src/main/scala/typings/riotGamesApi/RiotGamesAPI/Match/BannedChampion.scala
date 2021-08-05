package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BannedChampion extends StObject {
  
  var championId: Double
  
  var pickTurn: Double
}
object BannedChampion {
  
  inline def apply(championId: Double, pickTurn: Double): BannedChampion = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], pickTurn = pickTurn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannedChampion]
  }
  
  extension [Self <: BannedChampion](x: Self) {
    
    inline def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
    
    inline def setPickTurn(value: Double): Self = StObject.set(x, "pickTurn", value.asInstanceOf[js.Any])
  }
}
