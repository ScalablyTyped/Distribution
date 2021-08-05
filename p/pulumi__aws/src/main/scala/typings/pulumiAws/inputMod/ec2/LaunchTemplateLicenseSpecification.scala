package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateLicenseSpecification extends StObject {
  
  /**
    * ARN of the license configuration.
    */
  var licenseConfigurationArn: Input[String]
}
object LaunchTemplateLicenseSpecification {
  
  inline def apply(licenseConfigurationArn: Input[String]): LaunchTemplateLicenseSpecification = {
    val __obj = js.Dynamic.literal(licenseConfigurationArn = licenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateLicenseSpecification]
  }
  
  extension [Self <: LaunchTemplateLicenseSpecification](x: Self) {
    
    inline def setLicenseConfigurationArn(value: Input[String]): Self = StObject.set(x, "licenseConfigurationArn", value.asInstanceOf[js.Any])
  }
}
