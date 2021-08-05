package typings.screeps.anon

import typings.screeps.ResourceConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceType extends StObject {
  
  var amount: Double
  
  var resourceType: ResourceConstant
  
  var targetId: String
}
object ResourceType {
  
  inline def apply(amount: Double, resourceType: ResourceConstant, targetId: String): ResourceType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceType]
  }
  
  extension [Self <: ResourceType](x: Self) {
    
    inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: ResourceConstant): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
