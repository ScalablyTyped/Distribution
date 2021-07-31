package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessPointVpcConfiguration extends StObject {
  
  /**
    * This access point will only allow connections from the specified VPC ID.
    */
  var vpcId: Input[String]
}
object AccessPointVpcConfiguration {
  
  @scala.inline
  def apply(vpcId: Input[String]): AccessPointVpcConfiguration = {
    val __obj = js.Dynamic.literal(vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessPointVpcConfiguration]
  }
  
  @scala.inline
  implicit class AccessPointVpcConfigurationMutableBuilder[Self <: AccessPointVpcConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
