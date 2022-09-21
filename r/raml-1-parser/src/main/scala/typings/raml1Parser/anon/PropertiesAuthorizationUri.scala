package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAuthorizationUri extends StObject {
  
  var name: java.lang.String
  
  var properties: AuthorizationUri
}
object PropertiesAuthorizationUri {
  
  inline def apply(name: java.lang.String, properties: AuthorizationUri): PropertiesAuthorizationUri = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAuthorizationUri]
  }
  
  extension [Self <: PropertiesAuthorizationUri](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AuthorizationUri): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
