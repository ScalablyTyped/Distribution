package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesBody extends StObject {
  
  var name: String
  
  var properties: Body
}
object PropertiesBody {
  
  inline def apply(name: String, properties: Body): PropertiesBody = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesBody]
  }
  
  extension [Self <: PropertiesBody](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Body): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
