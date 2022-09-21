package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesFormat extends StObject {
  
  var name: String
  
  var properties: Format
}
object PropertiesFormat {
  
  inline def apply(name: String, properties: Format): PropertiesFormat = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesFormat]
  }
  
  extension [Self <: PropertiesFormat](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Format): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
