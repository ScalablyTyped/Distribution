package typings.pulumiAws.networkAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkAssociationArgs extends js.Object {
  
  /**
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: Input[String] = js.native
  
  /**
    * A list of up to five custom security groups to apply to the target network. If not specified, the VPC's default security group is assigned.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  /**
    * The ID of the subnet to associate with the Client VPN endpoint.
    */
  val subnetId: Input[String] = js.native
}
object NetworkAssociationArgs {
  
  @scala.inline
  def apply(clientVpnEndpointId: Input[String], subnetId: Input[String]): NetworkAssociationArgs = {
    val __obj = js.Dynamic.literal(clientVpnEndpointId = clientVpnEndpointId.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAssociationArgs]
  }
  
  @scala.inline
  implicit class NetworkAssociationArgsOps[Self <: NetworkAssociationArgs] (val x: Self) extends AnyVal {
    
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
    def setClientVpnEndpointId(value: Input[String]): Self = this.set("clientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
  }
}
