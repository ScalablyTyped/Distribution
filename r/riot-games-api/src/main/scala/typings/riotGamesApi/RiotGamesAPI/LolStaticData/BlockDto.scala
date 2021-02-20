package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockDto extends StObject {
  
  var items: js.Array[BlockItemDto] = js.native
  
  var recMath: Boolean = js.native
  
  var `type`: String = js.native
}
object BlockDto {
  
  @scala.inline
  def apply(items: js.Array[BlockItemDto], recMath: Boolean, `type`: String): BlockDto = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], recMath = recMath.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockDto]
  }
  
  @scala.inline
  implicit class BlockDtoMutableBuilder[Self <: BlockDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[BlockItemDto]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: BlockItemDto*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setRecMath(value: Boolean): Self = StObject.set(x, "recMath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
