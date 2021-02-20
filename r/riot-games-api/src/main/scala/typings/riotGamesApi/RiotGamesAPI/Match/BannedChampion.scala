package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BannedChampion extends StObject {
  
  var championId: Double = js.native
  
  var pickTurn: Double = js.native
}
object BannedChampion {
  
  @scala.inline
  def apply(championId: Double, pickTurn: Double): BannedChampion = {
    val __obj = js.Dynamic.literal(championId = championId.asInstanceOf[js.Any], pickTurn = pickTurn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BannedChampion]
  }
  
  @scala.inline
  implicit class BannedChampionMutableBuilder[Self <: BannedChampion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChampionId(value: Double): Self = StObject.set(x, "championId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickTurn(value: Double): Self = StObject.set(x, "pickTurn", value.asInstanceOf[js.Any])
  }
}
