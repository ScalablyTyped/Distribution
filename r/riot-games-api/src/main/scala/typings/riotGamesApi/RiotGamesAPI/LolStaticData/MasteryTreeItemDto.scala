package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasteryTreeItemDto extends StObject {
  
  var masteryId: Double
  
  var prereq: String
}
object MasteryTreeItemDto {
  
  @scala.inline
  def apply(masteryId: Double, prereq: String): MasteryTreeItemDto = {
    val __obj = js.Dynamic.literal(masteryId = masteryId.asInstanceOf[js.Any], prereq = prereq.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryTreeItemDto]
  }
  
  @scala.inline
  implicit class MasteryTreeItemDtoMutableBuilder[Self <: MasteryTreeItemDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasteryId(value: Double): Self = StObject.set(x, "masteryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrereq(value: String): Self = StObject.set(x, "prereq", value.asInstanceOf[js.Any])
  }
}
