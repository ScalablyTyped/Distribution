package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesDescription extends StObject {
  
  var name: java.lang.String
  
  var properties: Description
}
object PropertiesDescription {
  
  inline def apply(name: java.lang.String, properties: Description): PropertiesDescription = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesDescription]
  }
  
  extension [Self <: PropertiesDescription](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Description): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
