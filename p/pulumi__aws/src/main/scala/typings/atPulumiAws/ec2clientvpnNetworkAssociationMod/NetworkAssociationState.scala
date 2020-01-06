package typings.atPulumiAws.ec2clientvpnNetworkAssociationMod

import typings.atPulumiPulumi.outputMod.Input
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
  def apply(
    clientVpnEndpointId: Input[String] = null,
    securityGroups: Input[js.Array[Input[String]]] = null,
    status: Input[String] = null,
    subnetId: Input[String] = null,
    vpcId: Input[String] = null
  ): NetworkAssociationState = {
    val __obj = js.Dynamic.literal()
    if (clientVpnEndpointId != null) __obj.updateDynamic("clientVpnEndpointId")(clientVpnEndpointId.asInstanceOf[js.Any])
    if (securityGroups != null) __obj.updateDynamic("securityGroups")(securityGroups.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAssociationState]
  }
}

