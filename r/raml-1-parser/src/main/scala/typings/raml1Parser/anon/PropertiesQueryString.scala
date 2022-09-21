package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesQueryString extends StObject {
  
  var name: java.lang.String
  
  var properties: QueryString
}
object PropertiesQueryString {
  
  inline def apply(name: java.lang.String, properties: QueryString): PropertiesQueryString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesQueryString]
  }
  
  extension [Self <: PropertiesQueryString](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: QueryString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
