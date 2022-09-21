package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesSecurityScheme extends StObject {
  
  var name: java.lang.String
  
  var properties: SecurityScheme
}
object PropertiesSecurityScheme {
  
  inline def apply(name: java.lang.String, properties: SecurityScheme): PropertiesSecurityScheme = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesSecurityScheme]
  }
  
  extension [Self <: PropertiesSecurityScheme](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: SecurityScheme): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
