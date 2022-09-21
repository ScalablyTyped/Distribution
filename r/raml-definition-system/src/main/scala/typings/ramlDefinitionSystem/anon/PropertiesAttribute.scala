package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAttribute extends StObject {
  
  var name: String
  
  var properties: Attribute
}
object PropertiesAttribute {
  
  inline def apply(name: String, properties: Attribute): PropertiesAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAttribute]
  }
  
  extension [Self <: PropertiesAttribute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Attribute): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
