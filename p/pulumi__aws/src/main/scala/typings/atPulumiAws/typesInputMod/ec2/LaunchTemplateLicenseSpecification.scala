package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateLicenseSpecification extends js.Object {
  var licenseConfigurationArn: Input[String]
}

object LaunchTemplateLicenseSpecification {
  @scala.inline
  def apply(licenseConfigurationArn: Input[String]): LaunchTemplateLicenseSpecification = {
    val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LaunchTemplateLicenseSpecification]
  }
}

