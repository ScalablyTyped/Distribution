package typings.pulumiAws.outputMod.ecs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskDefinitionInferenceAccelerator extends js.Object {
  /**
    * The Elastic Inference accelerator device name. The deviceName must also be referenced in a container definition as a ResourceRequirement.
    */
  var deviceName: String = js.native
  /**
    * The Elastic Inference accelerator type to use.
    */
  var deviceType: String = js.native
}

object TaskDefinitionInferenceAccelerator {
  @scala.inline
  def apply(deviceName: String, deviceType: String): TaskDefinitionInferenceAccelerator = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], deviceType = deviceType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskDefinitionInferenceAccelerator]
  }
}

