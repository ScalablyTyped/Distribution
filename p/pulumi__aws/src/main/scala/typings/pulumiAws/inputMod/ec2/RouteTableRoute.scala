package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteTableRoute extends StObject {
  
  /**
    * The CIDR block of the route.
    */
  var cidrBlock: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of a VPC Egress Only Internet Gateway.
    */
  var egressOnlyGatewayId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of a VPC internet gateway or a virtual private gateway.
    */
  var gatewayId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of an EC2 instance.
    */
  var instanceId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The Ipv6 CIDR block of the route.
    */
  var ipv6CidrBlock: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of a Outpost local gateway.
    */
  var localGatewayId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of a VPC NAT gateway.
    */
  var natGatewayId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of an EC2 network interface.
    */
  var networkInterfaceId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of an EC2 Transit Gateway.
    */
  var transitGatewayId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of a VPC Endpoint.
    */
  var vpcEndpointId: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Identifier of a VPC peering connection.
    */
  var vpcPeeringConnectionId: js.UndefOr[Input[String]] = js.undefined
}
object RouteTableRoute {
  
  inline def apply(): RouteTableRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteTableRoute]
  }
  
  extension [Self <: RouteTableRoute](x: Self) {
    
    inline def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
    
    inline def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
    
    inline def setEgressOnlyGatewayId(value: Input[String]): Self = StObject.set(x, "egressOnlyGatewayId", value.asInstanceOf[js.Any])
    
    inline def setEgressOnlyGatewayIdUndefined: Self = StObject.set(x, "egressOnlyGatewayId", js.undefined)
    
    inline def setGatewayId(value: Input[String]): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
    
    inline def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
    
    inline def setIpv6CidrBlock(value: Input[String]): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlockUndefined: Self = StObject.set(x, "ipv6CidrBlock", js.undefined)
    
    inline def setLocalGatewayId(value: Input[String]): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayIdUndefined: Self = StObject.set(x, "localGatewayId", js.undefined)
    
    inline def setNatGatewayId(value: Input[String]): Self = StObject.set(x, "natGatewayId", value.asInstanceOf[js.Any])
    
    inline def setNatGatewayIdUndefined: Self = StObject.set(x, "natGatewayId", js.undefined)
    
    inline def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
    
    inline def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
    
    inline def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointIdUndefined: Self = StObject.set(x, "vpcEndpointId", js.undefined)
    
    inline def setVpcPeeringConnectionId(value: Input[String]): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "vpcPeeringConnectionId", js.undefined)
  }
}
