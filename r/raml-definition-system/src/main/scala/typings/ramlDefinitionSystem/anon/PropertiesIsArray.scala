package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesIsArray extends StObject {
  
  var name: String
  
  var properties: IsArray
}
object PropertiesIsArray {
  
  inline def apply(name: String, properties: IsArray): PropertiesIsArray = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesIsArray]
  }
  
  extension [Self <: PropertiesIsArray](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IsArray): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
