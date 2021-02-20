package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MasteryTreeListDto extends StObject {
  
  var masteryTreeItems: js.Array[MasteryTreeItemDto] = js.native
}
object MasteryTreeListDto {
  
  @scala.inline
  def apply(masteryTreeItems: js.Array[MasteryTreeItemDto]): MasteryTreeListDto = {
    val __obj = js.Dynamic.literal(masteryTreeItems = masteryTreeItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryTreeListDto]
  }
  
  @scala.inline
  implicit class MasteryTreeListDtoMutableBuilder[Self <: MasteryTreeListDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMasteryTreeItems(value: js.Array[MasteryTreeItemDto]): Self = StObject.set(x, "masteryTreeItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasteryTreeItemsVarargs(value: MasteryTreeItemDto*): Self = StObject.set(x, "masteryTreeItems", js.Array(value :_*))
  }
}
