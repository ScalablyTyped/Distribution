package typings.riotGamesApi.RiotGamesAPI.LolStaticData

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MasteryDto extends StObject {
  
  var description: js.Array[String]
  
  var id: Double
  
  var image: ImageDto
  
  var masteryTree: String
  
  var name: String
  
  var prereq: String
  
  var ranks: Double
  
  var sanitizedDescription: js.Array[String]
}
object MasteryDto {
  
  inline def apply(
    description: js.Array[String],
    id: Double,
    image: ImageDto,
    masteryTree: String,
    name: String,
    prereq: String,
    ranks: Double,
    sanitizedDescription: js.Array[String]
  ): MasteryDto = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], masteryTree = masteryTree.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], prereq = prereq.asInstanceOf[js.Any], ranks = ranks.asInstanceOf[js.Any], sanitizedDescription = sanitizedDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[MasteryDto]
  }
  
  extension [Self <: MasteryDto](x: Self) {
    
    inline def setDescription(value: js.Array[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionVarargs(value: String*): Self = StObject.set(x, "description", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImage(value: ImageDto): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setMasteryTree(value: String): Self = StObject.set(x, "masteryTree", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrereq(value: String): Self = StObject.set(x, "prereq", value.asInstanceOf[js.Any])
    
    inline def setRanks(value: Double): Self = StObject.set(x, "ranks", value.asInstanceOf[js.Any])
    
    inline def setSanitizedDescription(value: js.Array[String]): Self = StObject.set(x, "sanitizedDescription", value.asInstanceOf[js.Any])
    
    inline def setSanitizedDescriptionVarargs(value: String*): Self = StObject.set(x, "sanitizedDescription", js.Array(value*))
  }
}
