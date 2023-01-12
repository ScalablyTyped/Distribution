package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesHeaders extends StObject {
  
  var name: String
  
  var properties: Headers
}
object PropertiesHeaders {
  
  inline def apply(name: String, properties: Headers): PropertiesHeaders = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesHeaders]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesHeaders] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Headers): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
