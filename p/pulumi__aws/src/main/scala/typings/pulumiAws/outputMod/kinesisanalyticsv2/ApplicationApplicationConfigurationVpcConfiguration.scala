package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationVpcConfiguration extends StObject {
  
  /**
    * The [Security Group](https://www.terraform.io/docs/providers/aws/r/security_group.html) IDs used by the VPC configuration.
    */
  var securityGroupIds: js.Array[String]
  
  /**
    * The [Subnet](https://www.terraform.io/docs/providers/aws/r/subnet.html) IDs used by the VPC configuration.
    */
  var subnetIds: js.Array[String]
  
  var vpcConfigurationId: String
  
  var vpcId: String
}
object ApplicationApplicationConfigurationVpcConfiguration {
  
  inline def apply(
    securityGroupIds: js.Array[String],
    subnetIds: js.Array[String],
    vpcConfigurationId: String,
    vpcId: String
  ): ApplicationApplicationConfigurationVpcConfiguration = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcConfigurationId = vpcConfigurationId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationVpcConfiguration]
  }
  
  extension [Self <: ApplicationApplicationConfigurationVpcConfiguration](x: Self) {
    
    inline def setSecurityGroupIds(value: js.Array[String]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsVarargs(value: String*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    inline def setSubnetIds(value: js.Array[String]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdsVarargs(value: String*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
    
    inline def setVpcConfigurationId(value: String): Self = StObject.set(x, "vpcConfigurationId", value.asInstanceOf[js.Any])
    
    inline def setVpcId(value: String): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
  }
}
