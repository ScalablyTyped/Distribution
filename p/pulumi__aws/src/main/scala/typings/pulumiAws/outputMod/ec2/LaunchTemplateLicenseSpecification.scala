package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateLicenseSpecification extends js.Object {
  /**
    * ARN of the license configuration.
    */
  var licenseConfigurationArn: String = js.native
}

object LaunchTemplateLicenseSpecification {
  @scala.inline
  def apply(licenseConfigurationArn: String): LaunchTemplateLicenseSpecification = {
    val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateLicenseSpecification]
  }
  @scala.inline
  implicit class LaunchTemplateLicenseSpecificationOps[Self <: LaunchTemplateLicenseSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLicenseConfigurationArn(value: String): Self = this.set("licenseConfigurationArn", value.asInstanceOf[js.Any])
  }
  
}

