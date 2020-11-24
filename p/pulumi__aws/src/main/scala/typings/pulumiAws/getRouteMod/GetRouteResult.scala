package typings.pulumiAws.getRouteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRouteResult extends js.Object {
  
  val destinationCidrBlock: String = js.native
  
  val destinationIpv6CidrBlock: String = js.native
  
  val egressOnlyGatewayId: String = js.native
  
  val gatewayId: String = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  val instanceId: String = js.native
  
  val localGatewayId: String = js.native
  
  val natGatewayId: String = js.native
  
  val networkInterfaceId: String = js.native
  
  val routeTableId: String = js.native
  
  val transitGatewayId: String = js.native
  
  val vpcPeeringConnectionId: String = js.native
}
object GetRouteResult {
  
  @scala.inline
  def apply(
    destinationCidrBlock: String,
    destinationIpv6CidrBlock: String,
    egressOnlyGatewayId: String,
    gatewayId: String,
    id: String,
    instanceId: String,
    localGatewayId: String,
    natGatewayId: String,
    networkInterfaceId: String,
    routeTableId: String,
    transitGatewayId: String,
    vpcPeeringConnectionId: String
  ): GetRouteResult = {
    val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], destinationIpv6CidrBlock = destinationIpv6CidrBlock.asInstanceOf[js.Any], egressOnlyGatewayId = egressOnlyGatewayId.asInstanceOf[js.Any], gatewayId = gatewayId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], localGatewayId = localGatewayId.asInstanceOf[js.Any], natGatewayId = natGatewayId.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], routeTableId = routeTableId.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcPeeringConnectionId = vpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteResult]
  }
  
  @scala.inline
  implicit class GetRouteResultOps[Self <: GetRouteResult] (val x: Self) extends AnyVal {
    
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
    def setDestinationCidrBlock(value: String): Self = this.set("destinationCidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationIpv6CidrBlock(value: String): Self = this.set("destinationIpv6CidrBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEgressOnlyGatewayId(value: String): Self = this.set("egressOnlyGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayId(value: String): Self = this.set("gatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: String): Self = this.set("instanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalGatewayId(value: String): Self = this.set("localGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNatGatewayId(value: String): Self = this.set("natGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("networkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteTableId(value: String): Self = this.set("routeTableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitGatewayId(value: String): Self = this.set("transitGatewayId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcPeeringConnectionId(value: String): Self = this.set("vpcPeeringConnectionId", value.asInstanceOf[js.Any])
  }
}
