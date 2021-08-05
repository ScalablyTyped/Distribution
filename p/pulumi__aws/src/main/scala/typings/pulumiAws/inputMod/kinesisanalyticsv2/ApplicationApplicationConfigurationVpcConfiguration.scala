package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationVpcConfiguration extends StObject {
  
  /**
    * The [Security Group](https://www.terraform.io/docs/providers/aws/r/security_group.html) IDs used by the VPC configuration.
    */
  var securityGroupIds: Input[js.Array[Input[String]]]
  
  /**
    * The [Subnet](https://www.terraform.io/docs/providers/aws/r/subnet.html) IDs used by the VPC configuration.
    */
  var subnetIds: Input[js.Array[Input[String]]]
  
  var vpcConfigurationId: js.UndefOr[Input[String]] = js.undefined
  
  var vpcId: js.UndefOr[Input[String]] = js.undefined
}
object ApplicationApplicationConfigurationVpcConfiguration {
  
  inline def apply(securityGroupIds: Input[js.Array[Input[String]]], subnetIds: Input[js.Array[Input[String]]]): ApplicationApplicationConfigurationVpcConfiguration = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationVpcConfiguration]
  }
  
  extension [Self <: ApplicationApplicationConfigurationVpcConfiguration](x: Self) {
    
    inline def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
    
    inline def setVpcConfigurationId(value: Input[String]): Self = StObject.set(x, "vpcConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationIdUndefined: Self = StObject.set(x, "vpcConfigurationId", js.undefined)
    
    inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
  }
}
