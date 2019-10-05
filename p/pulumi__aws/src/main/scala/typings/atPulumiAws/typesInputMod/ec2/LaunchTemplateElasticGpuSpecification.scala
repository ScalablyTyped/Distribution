package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateElasticGpuSpecification extends js.Object {
  /**
    * Accelerator type.
    */
  var `type`: Input[String]
}

object LaunchTemplateElasticGpuSpecification {
  @scala.inline
  def apply(`type`: Input[String]): LaunchTemplateElasticGpuSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticGpuSpecification]
  }
}

