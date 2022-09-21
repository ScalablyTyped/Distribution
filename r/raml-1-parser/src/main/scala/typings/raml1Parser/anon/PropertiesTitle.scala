package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesTitle extends StObject {
  
  var name: java.lang.String
  
  var properties: Title
}
object PropertiesTitle {
  
  inline def apply(name: java.lang.String, properties: Title): PropertiesTitle = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesTitle]
  }
  
  extension [Self <: PropertiesTitle](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Title): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
