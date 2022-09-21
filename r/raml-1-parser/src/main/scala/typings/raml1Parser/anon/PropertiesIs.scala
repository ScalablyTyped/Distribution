package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesIs extends StObject {
  
  var name: java.lang.String
  
  var properties: Is
}
object PropertiesIs {
  
  inline def apply(name: java.lang.String, properties: Is): PropertiesIs = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesIs]
  }
  
  extension [Self <: PropertiesIs](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Is): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
