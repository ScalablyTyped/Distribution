package typings.pulumiAws.ec2RouteMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteState extends js.Object {
  
  /**
    * The destination CIDR block.
    */
  val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
  
  /**
    * The destination IPv6 CIDR block.
    */
  val destinationIpv6CidrBlock: js.UndefOr[Input[String]] = js.native
  
  val destinationPrefixListId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of a VPC Egress Only Internet Gateway.
    */
  val egressOnlyGatewayId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of a VPC internet gateway or a virtual private gateway.
    */
  val gatewayId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of an EC2 instance.
    */
  val instanceId: js.UndefOr[Input[String]] = js.native
  
  val instanceOwnerId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of a Outpost local gateway.
    */
  val localGatewayId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of a VPC NAT gateway.
    */
  val natGatewayId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of an EC2 network interface.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  
  val origin: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the routing table.
    */
  val routeTableId: js.UndefOr[Input[String]] = js.native
  
  val state: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of an EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of a VPC Endpoint.
    */
  val vpcEndpointId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Identifier of a VPC peering connection.
    */
  val vpcPeeringConnectionId: js.UndefOr[Input[String]] = js.native
}
object RouteState {
  
  @scala.inline
  def apply(): RouteState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteState]
  }
  
  @scala.inline
  implicit class RouteStateOps[Self <: RouteState] (val x: Self) extends AnyVal {
    
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
    def setDestinationCidrBlock(value: Input[String]): Self = this.set("destinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationCidrBlock: Self = this.set("destinationCidrBlock", js.undefined)
    
    @scala.inline
    def setDestinationIpv6CidrBlock(value: Input[String]): Self = this.set("destinationIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationIpv6CidrBlock: Self = this.set("destinationIpv6CidrBlock", js.undefined)
    
    @scala.inline
    def setDestinationPrefixListId(value: Input[String]): Self = this.set("destinationPrefixListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationPrefixListId: Self = this.set("destinationPrefixListId", js.undefined)
    
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
    def setInstanceOwnerId(value: Input[String]): Self = this.set("instanceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceOwnerId: Self = this.set("instanceOwnerId", js.undefined)
    
    @scala.inline
    def setLocalGatewayId(value: Input[String]): Self = this.set("localGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalGatewayId: Self = this.set("localGatewayId", js.undefined)
    
    @scala.inline
    def setNatGatewayId(value: Input[String]): Self = this.set("natGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNatGatewayId: Self = this.set("natGatewayId", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: Input[String]): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("networkInterfaceId", js.undefined)
    
    @scala.inline
    def setOrigin(value: Input[String]): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setRouteTableId(value: Input[String]): Self = this.set("routeTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteTableId: Self = this.set("routeTableId", js.undefined)
    
    @scala.inline
    def setState(value: Input[String]): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: Input[String]): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitGatewayId: Self = this.set("transitGatewayId", js.undefined)
    
    @scala.inline
    def setVpcEndpointId(value: Input[String]): Self = this.set("vpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcEndpointId: Self = this.set("vpcEndpointId", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: Input[String]): Self = this.set("vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcPeeringConnectionId: Self = this.set("vpcPeeringConnectionId", js.undefined)
  }
}
