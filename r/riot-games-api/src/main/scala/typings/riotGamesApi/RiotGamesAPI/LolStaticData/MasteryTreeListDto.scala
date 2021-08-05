package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasteryTreeListDto extends StObject {
  
  var masteryTreeItems: js.Array[MasteryTreeItemDto]
}
object MasteryTreeListDto {
  
  inline def apply(masteryTreeItems: js.Array[MasteryTreeItemDto]): MasteryTreeListDto = {
    val __obj = js.Dynamic.literal(masteryTreeItems = masteryTreeItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryTreeListDto]
  }
  
  extension [Self <: MasteryTreeListDto](x: Self) {
    
    inline def setMasteryTreeItems(value: js.Array[MasteryTreeItemDto]): Self = StObject.set(x, "masteryTreeItems", value.asInstanceOf[js.Any])
    
    inline def setMasteryTreeItemsVarargs(value: MasteryTreeItemDto*): Self = StObject.set(x, "masteryTreeItems", js.Array(value :_*))
  }
}
