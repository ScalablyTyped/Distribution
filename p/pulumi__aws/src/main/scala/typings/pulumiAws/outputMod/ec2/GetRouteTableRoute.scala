package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRouteTableRoute extends StObject {
  
  /**
    * The CIDR block of the route.
    */
  var cidrBlock: String = js.native
  
  /**
    * The ID of the Egress Only Internet Gateway.
    */
  var egressOnlyGatewayId: String = js.native
  
  /**
    * The id of an Internet Gateway or Virtual Private Gateway which is connected to the Route Table (not exported if not passed as a parameter).
    */
  var gatewayId: String = js.native
  
  /**
    * The EC2 instance ID.
    */
  var instanceId: String = js.native
  
  /**
    * The IPv6 CIDR block of the route.
    */
  var ipv6CidrBlock: String = js.native
  
  /**
    * The Local Gateway ID.
    */
  var localGatewayId: String = js.native
  
  /**
    * The NAT Gateway ID.
    */
  var natGatewayId: String = js.native
  
  /**
    * The ID of the elastic network interface (eni) to use.
    */
  var networkInterfaceId: String = js.native
  
  /**
    * The EC2 Transit Gateway ID.
    */
  var transitGatewayId: String = js.native
  
  /**
    * The VPC Endpoint ID.
    */
  var vpcEndpointId: String = js.native
  
  /**
    * The VPC Peering ID.
    */
  var vpcPeeringConnectionId: String = js.native
}
object GetRouteTableRoute {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class GetRouteTableRouteMutableBuilder[Self <: GetRouteTableRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrBlock(value: String): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressOnlyGatewayId(value: String): Self = StObject.set(x, "egressOnlyGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = StObject.set(x, "ipv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatGatewayId(value: String): Self = StObject.set(x, "natGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcEndpointId(value: String): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
  }
}
