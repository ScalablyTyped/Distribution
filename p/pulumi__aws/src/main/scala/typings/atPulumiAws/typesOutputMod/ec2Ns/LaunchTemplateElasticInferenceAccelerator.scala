package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateElasticInferenceAccelerator extends js.Object {
  /**
    * Accelerator type.
    */
  var `type`: String
}

object LaunchTemplateElasticInferenceAccelerator {
  @scala.inline
  def apply(`type`: String): LaunchTemplateElasticInferenceAccelerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LaunchTemplateElasticInferenceAccelerator]
  }
}

