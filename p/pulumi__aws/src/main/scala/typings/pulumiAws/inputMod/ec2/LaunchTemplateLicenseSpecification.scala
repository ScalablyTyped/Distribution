package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LaunchTemplateLicenseSpecification extends StObject {
  
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
  
  @scala.inline
  implicit class LaunchTemplateLicenseSpecificationMutableBuilder[Self <: LaunchTemplateLicenseSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseConfigurationArn(value: Input[String]): Self = StObject.set(x, "licenseConfigurationArn", value.asInstanceOf[js.Any])
  }
}
