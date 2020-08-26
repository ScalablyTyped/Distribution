package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultRouteTableRoute extends js.Object {
  /**
    * The CIDR block of the route.
    */
  var cidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of a VPC Egress Only Internet Gateway.
    */
  var egressOnlyGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of a VPC internet gateway or a virtual private gateway.
    */
  var gatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of an EC2 instance.
    */
  var instanceId: js.UndefOr[Input[String]] = js.native
  /**
    * The Ipv6 CIDR block of the route
    */
  var ipv6CidrBlock: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of a VPC NAT gateway.
    */
  var natGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of an EC2 network interface.
    */
  var networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of an EC2 Transit Gateway.
    */
  var transitGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of a VPC peering connection.
    */
  var vpcPeeringConnectionId: js.UndefOr[Input[String]] = js.native
}

object DefaultRouteTableRoute {
  @scala.inline
  def apply(): DefaultRouteTableRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultRouteTableRoute]
  }
  @scala.inline
  implicit class DefaultRouteTableRouteOps[Self <: DefaultRouteTableRoute] (val x: Self) extends AnyVal {
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
    def setCidrBlock(value: Input[String]): Self = this.set("cidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCidrBlock: Self = this.set("cidrBlock", js.undefined)
    @scala.inline
    def setEgressOnlyGatewayId(value: Input[String]): Self = this.set("egressOnlyGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEgressOnlyGatewayId: Self = this.set("egressOnlyGatewayId", js.undefined)
    @scala.inline
    def setGatewayId(value: Input[String]): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayId: Self = this.set("gatewayId", js.undefined)
    @scala.inline
    def setInstanceId(value: Input[String]): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("instanceId", js.undefined)
    @scala.inline
    def setIpv6CidrBlock(value: Input[String]): Self = this.set("ipv6CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("ipv6CidrBlock", js.undefined)
    @scala.inline
    def setNatGatewayId(value: Input[String]): Self = this.set("natGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNatGatewayId: Self = this.set("natGatewayId", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    @scala.inline
    def setTransitGatewayId(value: Input[String]): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("transitGatewayId", js.undefined)
    @scala.inline
    def setVpcPeeringConnectionId(value: Input[String]): Self = this.set("vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcPeeringConnectionId: Self = this.set("vpcPeeringConnectionId", js.undefined)
  }
  
}

