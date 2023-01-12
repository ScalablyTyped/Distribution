package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAnnotationsResourceType extends StObject {
  
  var name: java.lang.String
  
  var properties: AnnotationsResourceType
}
object PropertiesAnnotationsResourceType {
  
  inline def apply(name: java.lang.String, properties: AnnotationsResourceType): PropertiesAnnotationsResourceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAnnotationsResourceType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesAnnotationsResourceType] (val x: Self) extends AnyVal {
    
    inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AnnotationsResourceType): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
