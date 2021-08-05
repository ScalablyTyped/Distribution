package typings.pulumiAws.inputMod.ecs

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskDefinitionInferenceAccelerator extends StObject {
  
  /**
    * The Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
    */
  var deviceName: Input[String]
  
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: Input[String]
}
object TaskDefinitionInferenceAccelerator {
  
  inline def apply(deviceName: Input[String], deviceType: Input[String]): TaskDefinitionInferenceAccelerator = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskDefinitionInferenceAccelerator]
  }
  
  extension [Self <: TaskDefinitionInferenceAccelerator](x: Self) {
    
    inline def setDeviceName(value: Input[String]): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceType(value: Input[String]): Self = StObject.set(x, "deviceType", value.asInstanceOf[js.Any])
  }
}
