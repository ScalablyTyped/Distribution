package typings.atPulumiAws.typesInputMod.ec2Ns

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateElasticInferenceAccelerator extends js.Object {
  /**
    * Accelerator type.
    */
  var `type`: Input[String]
}

object LaunchTemplateElasticInferenceAccelerator {
  @scala.inline
  def apply(`type`: Input[String]): LaunchTemplateElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAccelerator]
  }
}

