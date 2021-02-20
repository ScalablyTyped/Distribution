package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2RouteMod {
  
  @JSImport("@pulumi/aws/ec2/route", "Route")
  @js.native
  class Route protected () extends CustomResource {
    /**
      * Create a Route resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteArgs) = this()
    def this(name: String, args: RouteArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The destination CIDR block.
      */
    val destinationCidrBlock: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The destination IPv6 CIDR block.
      */
    val destinationIpv6CidrBlock: Output_[js.UndefOr[String]] = js.native
    
    val destinationPrefixListId: Output_[String] = js.native
    
    /**
      * Identifier of a VPC Egress Only Internet Gateway.
      */
    val egressOnlyGatewayId: Output_[String] = js.native
    
    /**
      * Identifier of a VPC internet gateway or a virtual private gateway.
      */
    val gatewayId: Output_[String] = js.native
    
    /**
      * Identifier of an EC2 instance.
      */
    val instanceId: Output_[String] = js.native
    
    val instanceOwnerId: Output_[String] = js.native
    
    /**
      * Identifier of a Outpost local gateway.
      */
    val localGatewayId: Output_[String] = js.native
    
    /**
      * Identifier of a VPC NAT gateway.
      */
    val natGatewayId: Output_[String] = js.native
    
    /**
      * Identifier of an EC2 network interface.
      */
    val networkInterfaceId: Output_[String] = js.native
    
    val origin: Output_[String] = js.native
    
    /**
      * The ID of the routing table.
      */
    val routeTableId: Output_[String] = js.native
    
    val state: Output_[String] = js.native
    
    /**
      * Identifier of an EC2 Transit Gateway.
      */
    val transitGatewayId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Identifier of a VPC Endpoint.
      */
    val vpcEndpointId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Identifier of a VPC peering connection.
      */
    val vpcPeeringConnectionId: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object Route {
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/route", "Route.get")
    @js.native
    def get(name: String, id: Input[ID]): Route = js.native
    @JSImport("@pulumi/aws/ec2/route", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Route = js.native
    @JSImport("@pulumi/aws/ec2/route", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState): Route = js.native
    @JSImport("@pulumi/aws/ec2/route", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): Route = js.native
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/route", "Route.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/route.Route */ Boolean = js.native
  }
  
  @js.native
  trait RouteArgs extends StObject {
    
    /**
      * The destination CIDR block.
      */
    val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
    
    /**
      * The destination IPv6 CIDR block.
      */
    val destinationIpv6CidrBlock: js.UndefOr[Input[String]] = js.native
    
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
    
    /**
      * The ID of the routing table.
      */
    val routeTableId: Input[String] = js.native
    
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
  object RouteArgs {
    
    @scala.inline
    def apply(routeTableId: Input[String]): RouteArgs = {
      val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteArgs]
    }
    
    @scala.inline
    implicit class RouteArgsMutableBuilder[Self <: RouteArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
      
      @scala.inline
      def setDestinationIpv6CidrBlock(value: Input[String]): Self = StObject.set(x, "destinationIpv6CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationIpv6CidrBlockUndefined: Self = StObject.set(x, "destinationIpv6CidrBlock", js.undefined)
      
      @scala.inline
      def setEgressOnlyGatewayId(value: Input[String]): Self = StObject.set(x, "egressOnlyGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgressOnlyGatewayIdUndefined: Self = StObject.set(x, "egressOnlyGatewayId", js.undefined)
      
      @scala.inline
      def setGatewayId(value: Input[String]): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setLocalGatewayId(value: Input[String]): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayIdUndefined: Self = StObject.set(x, "localGatewayId", js.undefined)
      
      @scala.inline
      def setNatGatewayId(value: Input[String]): Self = StObject.set(x, "natGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNatGatewayIdUndefined: Self = StObject.set(x, "natGatewayId", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      @scala.inline
      def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      @scala.inline
      def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointIdUndefined: Self = StObject.set(x, "vpcEndpointId", js.undefined)
      
      @scala.inline
      def setVpcPeeringConnectionId(value: Input[String]): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "vpcPeeringConnectionId", js.undefined)
    }
  }
  
  @js.native
  trait RouteState extends StObject {
    
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
    implicit class RouteStateMutableBuilder[Self <: RouteState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
      
      @scala.inline
      def setDestinationIpv6CidrBlock(value: Input[String]): Self = StObject.set(x, "destinationIpv6CidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationIpv6CidrBlockUndefined: Self = StObject.set(x, "destinationIpv6CidrBlock", js.undefined)
      
      @scala.inline
      def setDestinationPrefixListId(value: Input[String]): Self = StObject.set(x, "destinationPrefixListId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationPrefixListIdUndefined: Self = StObject.set(x, "destinationPrefixListId", js.undefined)
      
      @scala.inline
      def setEgressOnlyGatewayId(value: Input[String]): Self = StObject.set(x, "egressOnlyGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEgressOnlyGatewayIdUndefined: Self = StObject.set(x, "egressOnlyGatewayId", js.undefined)
      
      @scala.inline
      def setGatewayId(value: Input[String]): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
      
      @scala.inline
      def setInstanceId(value: Input[String]): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceIdUndefined: Self = StObject.set(x, "instanceId", js.undefined)
      
      @scala.inline
      def setInstanceOwnerId(value: Input[String]): Self = StObject.set(x, "instanceOwnerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceOwnerIdUndefined: Self = StObject.set(x, "instanceOwnerId", js.undefined)
      
      @scala.inline
      def setLocalGatewayId(value: Input[String]): Self = StObject.set(x, "localGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalGatewayIdUndefined: Self = StObject.set(x, "localGatewayId", js.undefined)
      
      @scala.inline
      def setNatGatewayId(value: Input[String]): Self = StObject.set(x, "natGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNatGatewayIdUndefined: Self = StObject.set(x, "natGatewayId", js.undefined)
      
      @scala.inline
      def setNetworkInterfaceId(value: Input[String]): Self = StObject.set(x, "networkInterfaceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "networkInterfaceId", js.undefined)
      
      @scala.inline
      def setOrigin(value: Input[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableIdUndefined: Self = StObject.set(x, "routeTableId", js.undefined)
      
      @scala.inline
      def setState(value: Input[String]): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      @scala.inline
      def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointIdUndefined: Self = StObject.set(x, "vpcEndpointId", js.undefined)
      
      @scala.inline
      def setVpcPeeringConnectionId(value: Input[String]): Self = StObject.set(x, "vpcPeeringConnectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcPeeringConnectionIdUndefined: Self = StObject.set(x, "vpcPeeringConnectionId", js.undefined)
    }
  }
}
