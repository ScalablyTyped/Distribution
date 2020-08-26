package typings.pulumiAws.networkAssociationMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkAssociationState extends js.Object {
  /**
    * The ID of the Client VPN endpoint.
    */
  val clientVpnEndpointId: js.UndefOr[Input[String]] = js.native
  /**
    * The IDs of the security groups applied to the target network association.
    */
  val securityGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The current state of the target network association.
    */
  val status: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the subnet to associate with the Client VPN endpoint.
    */
  val subnetId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC in which the target network (subnet) is located.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object NetworkAssociationState {
  @scala.inline
  def apply(): NetworkAssociationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkAssociationState]
  }
  @scala.inline
  implicit class NetworkAssociationStateOps[Self <: NetworkAssociationState] (val x: Self) extends AnyVal {
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
    def deleteClientVpnEndpointId: Self = this.set("clientVpnEndpointId", js.undefined)
    @scala.inline
    def setSecurityGroupsVarargs(value: Input[String]*): Self = this.set("securityGroups", js.Array(value :_*))
    @scala.inline
    def setSecurityGroups(value: Input[js.Array[Input[String]]]): Self = this.set("securityGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroups: Self = this.set("securityGroups", js.undefined)
    @scala.inline
    def setStatus(value: Input[String]): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setSubnetId(value: Input[String]): Self = this.set("subnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("subnetId", js.undefined)
    @scala.inline
    def setVpcId(value: Input[String]): Self = this.set("vpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("vpcId", js.undefined)
  }
  
}

