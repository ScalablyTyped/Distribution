package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteTableRoute extends StObject {
  
  /**
    * The CIDR block of the route.
    */
  var cidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of a VPC Egress Only Internet Gateway.
    */
  var egressOnlyGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of a VPC internet gateway or a virtual private gateway.
    */
  var gatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of an EC2 instance.
    */
  var instanceId: js.UndefOr[String] = js.undefined
  
  /**
    * The Ipv6 CIDR block of the route.
    */
  var ipv6CidrBlock: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of a Outpost local gateway.
    */
  var localGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of a VPC NAT gateway.
    */
  var natGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of an EC2 network interface.
    */
  var networkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of an EC2 Transit Gateway.
    */
  var transitGatewayId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of a VPC Endpoint.
    */
  var vpcEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * Identifier of a VPC peering connection.
    */
  var vpcPeeringConnectionId: js.UndefOr[String] = js.undefined
}
object RouteTableRoute {
  
  @scala.inline
  def apply(): RouteTableRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTableRoute]
  }
  
  @scala.inline
  implicit class RouteTableRouteMutableBuilder[Self <: RouteTableRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
    
    @scala.inline
    def setEgressOnlyGatewayId(value: String): Self = StObject.set(x, "egressOnlyGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressOnlyGatewayIdUndefined: Self = StObject.set(x, "egressOnlyGatewayId", js.undefined)
    
    @scala.inline
    def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
    
    @scala.inline
    def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayIdUndefined: Self = StObject.set(x, "localGatewayId", js.undefined)
    
    @scala.inline
    def setNatGatewayId(value: String): Self = StObject.set(x, "natGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatGatewayIdUndefined: Self = StObject.set(x, "natGatewayId", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
    
    @scala.inline
    def setVpcEndpointId(value: String): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointIdUndefined: Self = StObject.set(x, "vpcEndpointId", js.undefined)
    
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "vpcPeeringConnectionId", js.undefined)
  }
}
