package typings.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceType extends StObject {
  
  var resourceType: NameString
}
object ResourceType {
  
  inline def apply(resourceType: NameString): ResourceType = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResourceType] (val x: Self) extends AnyVal {
    
    inline def setResourceType(value: NameString): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
