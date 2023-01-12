package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertiesResourceType extends StObject {
  
  var name: String
  
  var properties: ResourceType
}
object PropertiesResourceType {
  
  inline def apply(name: String, properties: ResourceType): PropertiesResourceType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesResourceType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertiesResourceType] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: ResourceType): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
