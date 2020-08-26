package typings.pulumiAws.getRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRouteArgs extends js.Object {
  /**
    * The CIDR block of the Route belonging to the Route Table.
    */
  val destinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR block of the Route belonging to the Route Table.
    */
  val destinationIpv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The Egress Only Gateway ID of the Route belonging to the Route Table.
    */
  val egressOnlyGatewayId: js.UndefOr[String] = js.native
  /**
    * The Gateway ID of the Route belonging to the Route Table.
    */
  val gatewayId: js.UndefOr[String] = js.native
  /**
    * The Instance ID of the Route belonging to the Route Table.
    */
  val instanceId: js.UndefOr[String] = js.native
  /**
    * The NAT Gateway ID of the Route belonging to the Route Table.
    */
  val natGatewayId: js.UndefOr[String] = js.native
  /**
    * The Network Interface ID of the Route belonging to the Route Table.
    */
  val networkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The id of the specific Route Table containing the Route entry.
    */
  val routeTableId: String = js.native
  /**
    * The EC2 Transit Gateway ID of the Route belonging to the Route Table.
    */
  val transitGatewayId: js.UndefOr[String] = js.native
  /**
    * The VPC Peering Connection ID of the Route belonging to the Route Table.
    */
  val vpcPeeringConnectionId: js.UndefOr[String] = js.native
}

object GetRouteArgs {
  @scala.inline
  def apply(routeTableId: String): GetRouteArgs = {
    val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteArgs]
  }
  @scala.inline
  implicit class GetRouteArgsOps[Self <: GetRouteArgs] (val x: Self) extends AnyVal {
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
    def setRouteTableId(value: String): Self = this.set("routeTableId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationCidrBlock(value: String): Self = this.set("destinationCidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("destinationCidrBlock", js.undefined)
    @scala.inline
    def setDestinationIpv6CidrBlock(value: String): Self = this.set("destinationIpv6CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationIpv6CidrBlock: Self = this.set("destinationIpv6CidrBlock", js.undefined)
    @scala.inline
    def setEgressOnlyGatewayId(value: String): Self = this.set("egressOnlyGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgressOnlyGatewayId: Self = this.set("egressOnlyGatewayId", js.undefined)
    @scala.inline
    def setGatewayId(value: String): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayId: Self = this.set("gatewayId", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setNatGatewayId(value: String): Self = this.set("natGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatGatewayId: Self = this.set("natGatewayId", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("transitGatewayId", js.undefined)
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = this.set("vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcPeeringConnectionId: Self = this.set("vpcPeeringConnectionId", js.undefined)
  }
  
}

