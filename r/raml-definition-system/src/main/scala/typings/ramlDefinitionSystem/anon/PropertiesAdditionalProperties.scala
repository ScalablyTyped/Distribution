package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAdditionalProperties extends StObject {
  
  var name: String
  
  var properties: AdditionalProperties
}
object PropertiesAdditionalProperties {
  
  inline def apply(name: String, properties: AdditionalProperties): PropertiesAdditionalProperties = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAdditionalProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesAdditionalProperties] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AdditionalProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
