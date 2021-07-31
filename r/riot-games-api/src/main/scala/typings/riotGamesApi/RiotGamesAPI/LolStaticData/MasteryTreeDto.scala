package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasteryTreeDto extends StObject {
  
  var Defense: js.Array[MasteryTreeListDto]
  
  var Offense: js.Array[MasteryTreeListDto]
  
  var Utility: js.Array[MasteryTreeListDto]
}
object MasteryTreeDto {
  
  @scala.inline
  def apply(
    Defense: js.Array[MasteryTreeListDto],
    Offense: js.Array[MasteryTreeListDto],
    Utility: js.Array[MasteryTreeListDto]
  ): MasteryTreeDto = {
    val __obj = js.Dynamic.literal(Defense = Defense.asInstanceOf[js.Any], Offense = Offense.asInstanceOf[js.Any], Utility = Utility.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryTreeDto]
  }
  
  @scala.inline
  implicit class MasteryTreeDtoMutableBuilder[Self <: MasteryTreeDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefense(value: js.Array[MasteryTreeListDto]): Self = StObject.set(x, "Defense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefenseVarargs(value: MasteryTreeListDto*): Self = StObject.set(x, "Defense", js.Array(value :_*))
    
    @scala.inline
    def setOffense(value: js.Array[MasteryTreeListDto]): Self = StObject.set(x, "Offense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffenseVarargs(value: MasteryTreeListDto*): Self = StObject.set(x, "Offense", js.Array(value :_*))
    
    @scala.inline
    def setUtility(value: js.Array[MasteryTreeListDto]): Self = StObject.set(x, "Utility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtilityVarargs(value: MasteryTreeListDto*): Self = StObject.set(x, "Utility", js.Array(value :_*))
  }
}
