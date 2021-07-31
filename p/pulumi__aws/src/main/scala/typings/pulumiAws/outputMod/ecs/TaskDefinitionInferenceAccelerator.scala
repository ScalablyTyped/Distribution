package typings.pulumiAws.outputMod.ecs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinitionInferenceAccelerator extends StObject {
  
  /**
    * The Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
    */
  var deviceName: String
  
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: String
}
object TaskDefinitionInferenceAccelerator {
  
  @scala.inline
  def apply(deviceName: String, deviceType: String): TaskDefinitionInferenceAccelerator = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionInferenceAccelerator]
  }
  
  @scala.inline
  implicit class TaskDefinitionInferenceAcceleratorMutableBuilder[Self <: TaskDefinitionInferenceAccelerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceType(value: String): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
  }
}
