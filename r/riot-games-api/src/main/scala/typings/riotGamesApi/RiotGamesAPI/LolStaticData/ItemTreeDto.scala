package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemTreeDto extends StObject {
  
  var header: String = js.native
  
  var tags: js.Array[String] = js.native
}
object ItemTreeDto {
  
  @scala.inline
  def apply(header: String, tags: js.Array[String]): ItemTreeDto = {
    val __obj = js.Dynamic.literal(header = header.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemTreeDto]
  }
  
  @scala.inline
  implicit class ItemTreeDtoMutableBuilder[Self <: ItemTreeDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
