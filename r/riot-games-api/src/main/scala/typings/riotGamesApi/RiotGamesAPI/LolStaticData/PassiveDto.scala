package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassiveDto extends StObject {
  
  var description: String = js.native
  
  var image: ImageDto = js.native
  
  var name: String = js.native
  
  var sanitizedDescription: String = js.native
}
object PassiveDto {
  
  @scala.inline
  def apply(description: String, image: ImageDto, name: String, sanitizedDescription: String): PassiveDto = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassiveDto]
  }
  
  @scala.inline
  implicit class PassiveDtoMutableBuilder[Self <: PassiveDto] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ImageDto): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSanitizedDescription(value: String): Self = StObject.set(x, "sanitizedDescription", value.asInstanceOf[js.Any])
  }
}
