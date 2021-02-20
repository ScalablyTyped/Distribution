package typings.riotGamesApi.RiotGamesAPI.Match

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mastery extends StObject {
  
  var masteryId: Double = js.native
  
  var rank: Double = js.native
}
object Mastery {
  
  @scala.inline
  def apply(masteryId: Double, rank: Double): Mastery = {
    val __obj = js.Dynamic.literal(masteryId = masteryId.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mastery]
  }
  
  @scala.inline
  implicit class MasteryMutableBuilder[Self <: Mastery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasteryId(value: Double): Self = StObject.set(x, "masteryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRank(value: Double): Self = StObject.set(x, "rank", value.asInstanceOf[js.Any])
  }
}
