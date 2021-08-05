package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PassiveDto extends StObject {
  
  var description: String
  
  var image: ImageDto
  
  var name: String
  
  var sanitizedDescription: String
}
object PassiveDto {
  
  inline def apply(description: String, image: ImageDto, name: String, sanitizedDescription: String): PassiveDto = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassiveDto]
  }
  
  extension [Self <: PassiveDto](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setImage(value: ImageDto): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSanitizedDescription(value: String): Self = StObject.set(x, "sanitizedDescription", value.asInstanceOf[js.Any])
  }
}
