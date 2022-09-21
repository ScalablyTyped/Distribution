package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAnnotationTypes extends StObject {
  
  var name: java.lang.String
  
  var properties: AnnotationTypes
}
object PropertiesAnnotationTypes {
  
  inline def apply(name: java.lang.String, properties: AnnotationTypes): PropertiesAnnotationTypes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAnnotationTypes]
  }
  
  extension [Self <: PropertiesAnnotationTypes](x: Self) {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AnnotationTypes): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
