package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesBody extends StObject {
  
  var name: java.lang.String
  
  var properties: Body
}
object PropertiesBody {
  
  inline def apply(name: java.lang.String, properties: Body): PropertiesBody = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesBody]
  }
  
  extension [Self <: PropertiesBody](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Body): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
