package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateElasticInferenceAccelerator extends js.Object {
  /**
    * Accelerator type.
    */
  var `type`: String = js.native
}

object LaunchTemplateElasticInferenceAccelerator {
  @scala.inline
  def apply(`type`: String): LaunchTemplateElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAccelerator]
  }
}

