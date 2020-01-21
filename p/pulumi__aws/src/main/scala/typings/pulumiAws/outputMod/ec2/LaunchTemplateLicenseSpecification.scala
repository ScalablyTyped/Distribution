package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateLicenseSpecification extends js.Object {
  var licenseConfigurationArn: String = js.native
}

object LaunchTemplateLicenseSpecification {
  @scala.inline
  def apply(licenseConfigurationArn: String): LaunchTemplateLicenseSpecification = {
    val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LaunchTemplateLicenseSpecification]
  }
}

