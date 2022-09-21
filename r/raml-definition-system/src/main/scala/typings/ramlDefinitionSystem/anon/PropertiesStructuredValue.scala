package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesStructuredValue extends StObject {
  
  var name: String
  
  var properties: StructuredValue
}
object PropertiesStructuredValue {
  
  inline def apply(name: String, properties: StructuredValue): PropertiesStructuredValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesStructuredValue]
  }
  
  extension [Self <: PropertiesStructuredValue](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: StructuredValue): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
