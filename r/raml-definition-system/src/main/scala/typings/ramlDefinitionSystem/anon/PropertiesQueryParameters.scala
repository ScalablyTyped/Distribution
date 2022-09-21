package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesQueryParameters extends StObject {
  
  var name: String
  
  var properties: QueryParameters
}
object PropertiesQueryParameters {
  
  inline def apply(name: String, properties: QueryParameters): PropertiesQueryParameters = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesQueryParameters]
  }
  
  extension [Self <: PropertiesQueryParameters](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: QueryParameters): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
