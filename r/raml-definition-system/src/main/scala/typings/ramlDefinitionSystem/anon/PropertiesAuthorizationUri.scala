package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAuthorizationUri extends StObject {
  
  var name: String
  
  var properties: AuthorizationUri
}
object PropertiesAuthorizationUri {
  
  inline def apply(name: String, properties: AuthorizationUri): PropertiesAuthorizationUri = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAuthorizationUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesAuthorizationUri] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AuthorizationUri): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
