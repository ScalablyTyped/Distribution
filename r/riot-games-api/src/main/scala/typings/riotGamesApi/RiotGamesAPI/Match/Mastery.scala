package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mastery extends StObject {
  
  var masteryId: Double
  
  var rank: Double
}
object Mastery {
  
  inline def apply(masteryId: Double, rank: Double): Mastery = {
    val __obj = js.Dynamic.literal(masteryId = masteryId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mastery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mastery] (val x: Self) extends AnyVal {
    
    inline def setMasteryId(value: Double): Self = StObject.set(x, "masteryId", value.asInstanceOf[js.Any])
    
    inline def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
  }
}
