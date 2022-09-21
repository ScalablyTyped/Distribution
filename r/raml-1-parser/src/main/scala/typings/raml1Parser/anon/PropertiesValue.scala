package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesValue extends StObject {
  
  var name: java.lang.String
  
  var properties: Value
}
object PropertiesValue {
  
  inline def apply(name: java.lang.String, properties: Value): PropertiesValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesValue]
  }
  
  extension [Self <: PropertiesValue](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Value): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
