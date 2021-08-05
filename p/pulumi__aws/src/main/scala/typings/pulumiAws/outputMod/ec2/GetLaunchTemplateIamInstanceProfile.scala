package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLaunchTemplateIamInstanceProfile extends StObject {
  
  /**
    * Amazon Resource Name (ARN) of the launch template.
    */
  var arn: String
  
  /**
    * The name of the filter field. Valid values can be found in the [EC2 DescribeLaunchTemplates API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLaunchTemplates.html).
    */
  var name: String
}
object GetLaunchTemplateIamInstanceProfile {
  
  inline def apply(arn: String, name: String): GetLaunchTemplateIamInstanceProfile = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLaunchTemplateIamInstanceProfile]
  }
  
  extension [Self <: GetLaunchTemplateIamInstanceProfile](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
