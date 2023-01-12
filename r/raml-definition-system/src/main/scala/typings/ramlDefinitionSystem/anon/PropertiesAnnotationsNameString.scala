package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesAnnotationsNameString extends StObject {
  
  var name: String
  
  var properties: AnnotationsNameString
}
object PropertiesAnnotationsNameString {
  
  inline def apply(name: String, properties: AnnotationsNameString): PropertiesAnnotationsNameString = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesAnnotationsNameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesAnnotationsNameString] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: AnnotationsNameString): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
