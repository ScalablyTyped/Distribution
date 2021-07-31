package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ec2clientvpnRouteMod {
  
  @JSImport("@pulumi/aws/ec2clientvpn/route", "Route")
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
      * The ID of the Client VPN endpoint.
      */
    val clientVpnEndpointId: Output_[String] = js.native
    
    /**
      * A brief description of the authorization rule.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The IPv4 address range, in CIDR notation, of the route destination.
      */
    val destinationCidrBlock: Output_[String] = js.native
    
    /**
      * Indicates how the Client VPN route was added. Will be `add-route` for routes created by this resource.
      */
    val origin: Output_[String] = js.native
    
    /**
      * The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
      */
    val targetVpcSubnetId: Output_[String] = js.native
    
    /**
      * The type of the route.
      */
    val `type`: Output_[String] = js.native
  }
  /* static members */
  object Route {
    
    @JSImport("@pulumi/aws/ec2clientvpn/route", "Route")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Route resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteState): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Route]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Route]
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2clientvpn/route.Route */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2clientvpn/route.Route */ Boolean]
  }
  
  trait RouteArgs extends StObject {
    
    /**
      * The ID of the Client VPN endpoint.
      */
    val clientVpnEndpointId: Input[String]
    
    /**
      * A brief description of the authorization rule.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv4 address range, in CIDR notation, of the route destination.
      */
    val destinationCidrBlock: Input[String]
    
    /**
      * The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
      */
    val targetVpcSubnetId: Input[String]
  }
  object RouteArgs {
    
    @scala.inline
    def apply(
      clientVpnEndpointId: Input[String],
      destinationCidrBlock: Input[String],
      targetVpcSubnetId: Input[String]
    ): RouteArgs = {
      val __obj = js.Dynamic.literal(clientVpnEndpointId = clientVpnEndpointId.asInstanceOf[js.Any], destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], targetVpcSubnetId = targetVpcSubnetId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteArgs]
    }
    
    @scala.inline
    implicit class RouteArgsMutableBuilder[Self <: RouteArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClientVpnEndpointId(value: Input[String]): Self = StObject.set(x, "clientVpnEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetVpcSubnetId(value: Input[String]): Self = StObject.set(x, "targetVpcSubnetId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteState extends StObject {
    
    /**
      * The ID of the Client VPN endpoint.
      */
    val clientVpnEndpointId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A brief description of the authorization rule.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The IPv4 address range, in CIDR notation, of the route destination.
      */
    val destinationCidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Indicates how the Client VPN route was added. Will be `add-route` for routes created by this resource.
      */
    val origin: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the Subnet to route the traffic through. It must already be attached to the Client VPN.
      */
    val targetVpcSubnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the route.
      */
    val `type`: js.UndefOr[Input[String]] = js.undefined
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
      def setClientVpnEndpointId(value: Input[String]): Self = StObject.set(x, "clientVpnEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "clientVpnEndpointId", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
      
      @scala.inline
      def setOrigin(value: Input[String]): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setTargetVpcSubnetId(value: Input[String]): Self = StObject.set(x, "targetVpcSubnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetVpcSubnetIdUndefined: Self = StObject.set(x, "targetVpcSubnetId", js.undefined)
      
      @scala.inline
      def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
