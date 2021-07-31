package typings.pulumiAws.containerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceRequirements extends StObject {
  
  /**
    * The type of resource to assign to a container. The only supported value is GPU.
    */
  var `type`: String
  
  /**
    * The number of physical GPUs the Amazon ECS container agent will reserve for the container.
    * The number of GPUs reserved for all containers in a task should not exceed the number of
    * available GPUs on the container instance the task is launched on.
    */
  var value: String
}
object ResourceRequirements {
  
  @scala.inline
  def apply(`type`: String, value: String): ResourceRequirements = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequirements]
  }
  
  @scala.inline
  implicit class ResourceRequirementsMutableBuilder[Self <: ResourceRequirements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
