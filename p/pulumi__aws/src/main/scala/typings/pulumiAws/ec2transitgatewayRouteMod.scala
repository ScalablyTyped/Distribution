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

object ec2transitgatewayRouteMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/route", "Route")
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
      * Indicates whether to drop traffic that matches this route (default to `false`).
      */
    val blackhole: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
      */
    val destinationCidrBlock: Output_[String] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
      */
    val transitGatewayAttachmentId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway Route Table.
      */
    val transitGatewayRouteTableId: Output_[String] = js.native
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
    @JSImport("@pulumi/aws/ec2transitgateway/route", "Route.get")
    @js.native
    def get(name: String, id: Input[ID]): Route = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/route", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Route = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/route", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState): Route = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/route", "Route.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): Route = js.native
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway/route", "Route.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ Boolean = js.native
  }
  
  @js.native
  trait RouteArgs extends StObject {
    
    /**
      * Indicates whether to drop traffic that matches this route (default to `false`).
      */
    val blackhole: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
      */
    val destinationCidrBlock: Input[String] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
      */
    val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway Route Table.
      */
    val transitGatewayRouteTableId: Input[String] = js.native
  }
  object RouteArgs {
    
    @scala.inline
    def apply(destinationCidrBlock: Input[String], transitGatewayRouteTableId: Input[String]): RouteArgs = {
      val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], transitGatewayRouteTableId = transitGatewayRouteTableId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteArgs]
    }
    
    @scala.inline
    implicit class RouteArgsMutableBuilder[Self <: RouteArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlackhole(value: Input[Boolean]): Self = StObject.set(x, "blackhole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlackholeUndefined: Self = StObject.set(x, "blackhole", js.undefined)
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayAttachmentId(value: Input[String]): Self = StObject.set(x, "transitGatewayAttachmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "transitGatewayAttachmentId", js.undefined)
      
      @scala.inline
      def setTransitGatewayRouteTableId(value: Input[String]): Self = StObject.set(x, "transitGatewayRouteTableId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteState extends StObject {
    
    /**
      * Indicates whether to drop traffic that matches this route (default to `false`).
      */
    val blackhole: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
      */
    val destinationCidrBlock: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
      */
    val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway Route Table.
      */
    val transitGatewayRouteTableId: js.UndefOr[Input[String]] = js.native
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
      def setBlackhole(value: Input[Boolean]): Self = StObject.set(x, "blackhole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlackholeUndefined: Self = StObject.set(x, "blackhole", js.undefined)
      
      @scala.inline
      def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
      
      @scala.inline
      def setTransitGatewayAttachmentId(value: Input[String]): Self = StObject.set(x, "transitGatewayAttachmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "transitGatewayAttachmentId", js.undefined)
      
      @scala.inline
      def setTransitGatewayRouteTableId(value: Input[String]): Self = StObject.set(x, "transitGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayRouteTableIdUndefined: Self = StObject.set(x, "transitGatewayRouteTableId", js.undefined)
    }
  }
}
