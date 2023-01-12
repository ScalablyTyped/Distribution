package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockDto extends StObject {
  
  var items: js.Array[BlockItemDto]
  
  var recMath: Boolean
  
  var `type`: String
}
object BlockDto {
  
  inline def apply(items: js.Array[BlockItemDto], recMath: Boolean, `type`: String): BlockDto = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], recMath = recMath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDto]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockDto] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[BlockItemDto]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: BlockItemDto*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setRecMath(value: Boolean): Self = StObject.set(x, "recMath", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
