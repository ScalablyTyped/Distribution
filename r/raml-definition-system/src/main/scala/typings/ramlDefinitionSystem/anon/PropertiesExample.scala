package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesExample extends StObject {
  
  var name: String
  
  var properties: Example
}
object PropertiesExample {
  
  inline def apply(name: String, properties: Example): PropertiesExample = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesExample]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesExample] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Example): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
