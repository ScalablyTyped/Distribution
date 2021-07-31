package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateLicenseSpecification extends StObject {
  
  /**
    * ARN of the license configuration.
    */
  var licenseConfigurationArn: String
}
object LaunchTemplateLicenseSpecification {
  
  @scala.inline
  def apply(licenseConfigurationArn: String): LaunchTemplateLicenseSpecification = {
    val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateLicenseSpecification]
  }
  
  @scala.inline
  implicit class LaunchTemplateLicenseSpecificationMutableBuilder[Self <: LaunchTemplateLicenseSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "licenseConfigurationArn", value.asInstanceOf[js.Any])
  }
}
