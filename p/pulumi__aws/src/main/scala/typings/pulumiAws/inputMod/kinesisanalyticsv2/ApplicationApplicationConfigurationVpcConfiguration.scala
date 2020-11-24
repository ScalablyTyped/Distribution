package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationVpcConfiguration extends js.Object {
  
  /**
    * The [Security Group](https://www.terraform.io/docs/providers/aws/r/security_group.html) IDs used by the VPC configuration.
    */
  var securityGroupIds: Input[js.Array[Input[String]]] = js.native
  
  /**
    * The [Subnet](https://www.terraform.io/docs/providers/aws/r/subnet.html) IDs used by the VPC configuration.
    */
  var subnetIds: Input[js.Array[Input[String]]] = js.native
  
  var vpcConfigurationId: js.UndefOr[Input[String]] = js.native
  
  var vpcId: js.UndefOr[Input[String]] = js.native
}
object ApplicationApplicationConfigurationVpcConfiguration {
  
  @scala.inline
  def apply(securityGroupIds: Input[js.Array[Input[String]]], subnetIds: Input[js.Array[Input[String]]]): ApplicationApplicationConfigurationVpcConfiguration = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationVpcConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationVpcConfigurationOps[Self <: ApplicationApplicationConfigurationVpcConfiguration] (val x: Self) extends AnyVal {
    
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
    def setSecurityGroupIdsVarargs(value: Input[String]*): Self = this.set("securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationId(value: Input[String]): Self = this.set("vpcConfigurationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfigurationId: Self = this.set("vpcConfigurationId", js.undefined)
    
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
}
