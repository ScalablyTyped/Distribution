package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAllowedTargets extends StObject {
  
  var name: String
  
  var properties: AllowedTargets
}
object PropertiesAllowedTargets {
  
  inline def apply(name: String, properties: AllowedTargets): PropertiesAllowedTargets = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAllowedTargets]
  }
  
  extension [Self <: PropertiesAllowedTargets](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AllowedTargets): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
