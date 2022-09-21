package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAuthorizationGrants extends StObject {
  
  var name: java.lang.String
  
  var properties: AuthorizationGrants
}
object PropertiesAuthorizationGrants {
  
  inline def apply(name: java.lang.String, properties: AuthorizationGrants): PropertiesAuthorizationGrants = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAuthorizationGrants]
  }
  
  extension [Self <: PropertiesAuthorizationGrants](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AuthorizationGrants): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
