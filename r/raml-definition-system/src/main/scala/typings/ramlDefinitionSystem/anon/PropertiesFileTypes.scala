package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesFileTypes extends StObject {
  
  var name: String
  
  var properties: FileTypes
}
object PropertiesFileTypes {
  
  inline def apply(name: String, properties: FileTypes): PropertiesFileTypes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesFileTypes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesFileTypes] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: FileTypes): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
