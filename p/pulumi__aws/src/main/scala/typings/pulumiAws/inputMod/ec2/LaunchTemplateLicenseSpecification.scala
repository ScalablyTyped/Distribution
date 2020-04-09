package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateLicenseSpecification extends js.Object {
  /**
    * ARN of the license configuration.
    */
  var licenseConfigurationArn: Input[String] = js.native
}

object LaunchTemplateLicenseSpecification {
  @scala.inline
  def apply(licenseConfigurationArn: Input[String]): LaunchTemplateLicenseSpecification = {
    val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LaunchTemplateLicenseSpecification]
  }
}

