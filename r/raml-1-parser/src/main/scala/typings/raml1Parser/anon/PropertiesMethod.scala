package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesMethod extends StObject {
  
  var name: java.lang.String
  
  var properties: Method
}
object PropertiesMethod {
  
  inline def apply(name: java.lang.String, properties: Method): PropertiesMethod = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesMethod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesMethod] (val x: Self) extends AnyVal {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Method): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
