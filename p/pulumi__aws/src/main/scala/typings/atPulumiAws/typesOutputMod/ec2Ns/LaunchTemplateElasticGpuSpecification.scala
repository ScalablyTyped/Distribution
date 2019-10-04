package typings.atPulumiAws.typesOutputMod.ec2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateElasticGpuSpecification extends js.Object {
  /**
    * Accelerator type.
    */
  var `type`: String
}

object LaunchTemplateElasticGpuSpecification {
  @scala.inline
  def apply(`type`: String): LaunchTemplateElasticGpuSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LaunchTemplateElasticGpuSpecification]
  }
}

