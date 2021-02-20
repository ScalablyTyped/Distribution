package typings.screeps.anon

import typings.screeps.ResourceConstant
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceType extends StObject {
  
  var amount: Double = js.native
  
  var resourceType: ResourceConstant = js.native
  
  var targetId: String = js.native
}
object ResourceType {
  
  @scala.inline
  def apply(amount: Double, resourceType: ResourceConstant, targetId: String): ResourceType = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any], targetId = targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceType]
  }
  
  @scala.inline
  implicit class ResourceTypeMutableBuilder[Self <: ResourceType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceType(value: ResourceConstant): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
  }
}
