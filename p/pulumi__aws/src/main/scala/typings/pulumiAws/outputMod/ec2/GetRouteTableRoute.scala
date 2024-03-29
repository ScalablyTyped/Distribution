package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRouteTableRoute extends StObject {
  
  /**
    * The CIDR block of the route.
    */
  var cidrBlock: String
  
  /**
    * The ID of the Egress Only Internet Gateway.
    */
  var egressOnlyGatewayId: String
  
  /**
    * The id of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
    */
  var gatewayId: String
  
  /**
    * The EC2 instance ID.
    */
  var instanceId: String
  
  /**
    * The IPv6 CIDR block of the route.
    */
  var ipv6CidrBlock: String
  
  /**
    * The Local Gateway ID.
    */
  var localGatewayId: String
  
  /**
    * The NAT Gateway ID.
    */
  var natGatewayId: String
  
  /**
    * The ID of the elastic network interface (eni) to use.
    */
  var networkInterfaceId: String
  
  /**
    * The EC2 Transit Gateway ID.
    */
  var transitGatewayId: String
  
  /**
    * The VPC Endpoint ID.
    */
  var vpcEndpointId: String
  
  /**
    * The VPC Peering ID.
    */
  var vpcPeeringConnectionId: String
}
object GetRouteTableRoute {
  
  inline def apply(
    cidrBlock: String,
    egressOnlyGatewayId: String,
    gatewayId: String,
    instanceId: String,
    ipv6CidrBlock: String,
    localGatewayId: String,
    natGatewayId: String,
    networkInterfaceId: String,
    transitGatewayId: String,
    vpcEndpointId: String,
    vpcPeeringConnectionId: String
  ): GetRouteTableRoute = {
    val __obj = js.Dynamic.literal(cidrBlock = cidrBlock.asInstanceOf[js.Any], egressOnlyGatewayId = egressOnlyGatewayId.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], ipv6CidrBlock = ipv6CidrBlock.asInstanceOf[js.Any], localGatewayId = localGatewayId.asInstanceOf[js.Any], natGatewayId = natGatewayId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any], vpcPeeringConnectionId = vpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteTableRoute]
  }
  
  extension [Self <: GetRouteTableRoute](x: Self) {
    
    inline def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
    
    inline def setEgressOnlyGatewayId(value: String): Self = StObject.set(x, "egressOnlyGatewayId", value.asInstanceOf[js.Any])
    
    inline def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setIpv6CidrBlock(value: String): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
    
    inline def setNatGatewayId(value: String): Self = StObject.set(x, "natGatewayId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointId(value: String): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
  }
}
