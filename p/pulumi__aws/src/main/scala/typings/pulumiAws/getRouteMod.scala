package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRouteMod {
  
  @JSImport("@pulumi/aws/ec2/getRoute", "getRoute")
  @js.native
  def getRoute(args: GetRouteArgs): js.Promise[GetRouteResult] = js.native
  @JSImport("@pulumi/aws/ec2/getRoute", "getRoute")
  @js.native
  def getRoute(args: GetRouteArgs, opts: InvokeOptions): js.Promise[GetRouteResult] = js.native
  
  @js.native
  trait GetRouteArgs extends StObject {
    
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
      * The Local Gateway ID of the Route belonging to the Route Table.
      */
    val localGatewayId: js.UndefOr[String] = js.native
    
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
    implicit class GetRouteArgsMutableBuilder[Self <: GetRouteArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationCidrBlock(value: String): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
      
      @scala.inline
      def setDestinationIpv6CidrBlock(value: String): Self = StObject.set(x, "destinationIpv6CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationIpv6CidrBlockUndefined: Self = StObject.set(x, "destinationIpv6CidrBlock", js.undefined)
      
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
      def setRouteTableId(value: String): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      @scala.inline
      def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "vpcPeeringConnectionId", js.undefined)
    }
  }
  
  @js.native
  trait GetRouteResult extends StObject {
    
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
    implicit class GetRouteResultMutableBuilder[Self <: GetRouteResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationCidrBlock(value: String): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationIpv6CidrBlock(value: String): Self = StObject.set(x, "destinationIpv6CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgressOnlyGatewayId(value: String): Self = StObject.set(x, "egressOnlyGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNatGatewayId(value: String): Self = StObject.set(x, "natGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableId(value: String): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    }
  }
}
