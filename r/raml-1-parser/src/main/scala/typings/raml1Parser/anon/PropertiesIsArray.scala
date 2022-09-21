package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesIsArray extends StObject {
  
  var name: java.lang.String
  
  var properties: IsArray
}
object PropertiesIsArray {
  
  inline def apply(name: java.lang.String, properties: IsArray): PropertiesIsArray = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesIsArray]
  }
  
  extension [Self <: PropertiesIsArray](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: IsArray): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
