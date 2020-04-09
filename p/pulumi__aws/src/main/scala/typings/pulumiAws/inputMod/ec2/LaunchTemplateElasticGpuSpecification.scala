package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateElasticGpuSpecification extends js.Object {
  /**
    * The [Elastic GPU Type](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/elastic-gpus.html#elastic-gpus-basics)
    */
  var `type`: Input[String] = js.native
}

object LaunchTemplateElasticGpuSpecification {
  @scala.inline
  def apply(`type`: Input[String]): LaunchTemplateElasticGpuSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateElasticGpuSpecification]
  }
}

