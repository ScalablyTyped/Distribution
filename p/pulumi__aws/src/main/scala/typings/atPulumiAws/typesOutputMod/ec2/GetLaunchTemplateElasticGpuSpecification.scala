package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLaunchTemplateElasticGpuSpecification extends js.Object {
  var `type`: String = js.native
}

object GetLaunchTemplateElasticGpuSpecification {
  @scala.inline
  def apply(`type`: String): GetLaunchTemplateElasticGpuSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateElasticGpuSpecification]
  }
}

