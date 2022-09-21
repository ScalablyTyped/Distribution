package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesTrait extends StObject {
  
  var name: String
  
  var properties: Trait
}
object PropertiesTrait {
  
  inline def apply(name: String, properties: Trait): PropertiesTrait = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesTrait]
  }
  
  extension [Self <: PropertiesTrait](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Trait): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
