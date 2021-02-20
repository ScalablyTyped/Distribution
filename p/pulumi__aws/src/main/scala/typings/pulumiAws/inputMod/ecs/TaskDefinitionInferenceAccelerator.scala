package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskDefinitionInferenceAccelerator extends StObject {
  
  /**
    * The Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
    */
  var deviceName: Input[String] = js.native
  
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: Input[String] = js.native
}
object TaskDefinitionInferenceAccelerator {
  
  @scala.inline
  def apply(deviceName: Input[String], deviceType: Input[String]): TaskDefinitionInferenceAccelerator = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionInferenceAccelerator]
  }
  
  @scala.inline
  implicit class TaskDefinitionInferenceAcceleratorMutableBuilder[Self <: TaskDefinitionInferenceAccelerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceType(value: Input[String]): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
  }
}
