package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRouteMod {
  
  @JSImport("@pulumi/aws/ec2/getRoute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRoute(args: GetRouteArgs): js.Promise[GetRouteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRoute")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRouteResult]]
  inline def getRoute(args: GetRouteArgs, opts: InvokeOptions): js.Promise[GetRouteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRoute")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRouteResult]]
  
  trait GetRouteArgs extends StObject {
    
    /**
      * The CIDR block of the Route belonging to the Route Table.
      */
    val destinationCidrBlock: js.UndefOr[String] = js.undefined
    
    /**
      * The IPv6 CIDR block of the Route belonging to the Route Table.
      */
    val destinationIpv6CidrBlock: js.UndefOr[String] = js.undefined
    
    /**
      * The Egress Only Gateway ID of the Route belonging to the Route Table.
      */
    val egressOnlyGatewayId: js.UndefOr[String] = js.undefined
    
    /**
      * The Gateway ID of the Route belonging to the Route Table.
      */
    val gatewayId: js.UndefOr[String] = js.undefined
    
    /**
      * The Instance ID of the Route belonging to the Route Table.
      */
    val instanceId: js.UndefOr[String] = js.undefined
    
    /**
      * The Local Gateway ID of the Route belonging to the Route Table.
      */
    val localGatewayId: js.UndefOr[String] = js.undefined
    
    /**
      * The NAT Gateway ID of the Route belonging to the Route Table.
      */
    val natGatewayId: js.UndefOr[String] = js.undefined
    
    /**
      * The Network Interface ID of the Route belonging to the Route Table.
      */
    val networkInterfaceId: js.UndefOr[String] = js.undefined
    
    /**
      * The id of the specific Route Table containing the Route entry.
      */
    val routeTableId: String
    
    /**
      * The EC2 Transit Gateway ID of the Route belonging to the Route Table.
      */
    val transitGatewayId: js.UndefOr[String] = js.undefined
    
    /**
      * The VPC Peering Connection ID of the Route belonging to the Route Table.
      */
    val vpcPeeringConnectionId: js.UndefOr[String] = js.undefined
  }
  object GetRouteArgs {
    
    inline def apply(routeTableId: String): GetRouteArgs = {
      val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRouteArgs]
    }
    
    extension [Self <: GetRouteArgs](x: Self) {
      
      inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
      
      inline def setDestinationIpv6CidrBlock(value: String): Self = StObject.set(x, "destinationIpv6CidrBlock", value.asInstanceOf[js.Any])
      
      inline def setDestinationIpv6CidrBlockUndefined: Self = StObject.set(x, "destinationIpv6CidrBlock", js.undefined)
      
      inline def setEgressOnlyGatewayId(value: String): Self = StObject.set(x, "egressOnlyGatewayId", value.asInstanceOf[js.Any])
      
      inline def setEgressOnlyGatewayIdUndefined: Self = StObject.set(x, "egressOnlyGatewayId", js.undefined)
      
      inline def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      inline def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      inline def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      inline def setLocalGatewayIdUndefined: Self = StObject.set(x, "localGatewayId", js.undefined)
      
      inline def setNatGatewayId(value: String): Self = StObject.set(x, "natGatewayId", value.asInstanceOf[js.Any])
      
      inline def setNatGatewayIdUndefined: Self = StObject.set(x, "natGatewayId", js.undefined)
      
      inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      inline def setRouteTableId(value: String): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      inline def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
      
      inline def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "vpcPeeringConnectionId", js.undefined)
    }
  }
  
  trait GetRouteResult extends StObject {
    
    val destinationCidrBlock: String
    
    val destinationIpv6CidrBlock: String
    
    val egressOnlyGatewayId: String
    
    val gatewayId: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val instanceId: String
    
    val localGatewayId: String
    
    val natGatewayId: String
    
    val networkInterfaceId: String
    
    val routeTableId: String
    
    val transitGatewayId: String
    
    val vpcPeeringConnectionId: String
  }
  object GetRouteResult {
    
    inline def apply(
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
    
    extension [Self <: GetRouteResult](x: Self) {
      
      inline def setDestinationCidrBlock(value: String): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      inline def setDestinationIpv6CidrBlock(value: String): Self = StObject.set(x, "destinationIpv6CidrBlock", value.asInstanceOf[js.Any])
      
      inline def setEgressOnlyGatewayId(value: String): Self = StObject.set(x, "egressOnlyGatewayId", value.asInstanceOf[js.Any])
      
      inline def setGatewayId(value: String): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInstanceId(value: String): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      inline def setLocalGatewayId(value: String): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      inline def setNatGatewayId(value: String): Self = StObject.set(x, "natGatewayId", value.asInstanceOf[js.Any])
      
      inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      inline def setRouteTableId(value: String): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayId(value: String): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      inline def setVpcPeeringConnectionId(value: String): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
    }
  }
}
