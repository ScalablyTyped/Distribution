package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAnnotationsHeaders extends StObject {
  
  var name: String
  
  var properties: AnnotationsHeaders
}
object PropertiesAnnotationsHeaders {
  
  inline def apply(name: String, properties: AnnotationsHeaders): PropertiesAnnotationsHeaders = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAnnotationsHeaders]
  }
  
  extension [Self <: PropertiesAnnotationsHeaders](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AnnotationsHeaders): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
