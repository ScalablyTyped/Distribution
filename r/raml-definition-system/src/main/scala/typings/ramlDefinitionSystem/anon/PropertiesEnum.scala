package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesEnum extends StObject {
  
  var name: String
  
  var properties: Enum
}
object PropertiesEnum {
  
  inline def apply(name: String, properties: Enum): PropertiesEnum = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesEnum]
  }
  
  extension [Self <: PropertiesEnum](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Enum): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
