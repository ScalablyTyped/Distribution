package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesSecuritySchemeName extends StObject {
  
  var name: String
  
  var properties: SecuritySchemeName
}
object PropertiesSecuritySchemeName {
  
  inline def apply(name: String, properties: SecuritySchemeName): PropertiesSecuritySchemeName = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesSecuritySchemeName]
  }
  
  extension [Self <: PropertiesSecuritySchemeName](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: SecuritySchemeName): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
