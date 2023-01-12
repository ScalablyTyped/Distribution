package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesResponses extends StObject {
  
  var name: java.lang.String
  
  var properties: Responses
}
object PropertiesResponses {
  
  inline def apply(name: java.lang.String, properties: Responses): PropertiesResponses = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesResponses]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesResponses] (val x: Self) extends AnyVal {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Responses): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
