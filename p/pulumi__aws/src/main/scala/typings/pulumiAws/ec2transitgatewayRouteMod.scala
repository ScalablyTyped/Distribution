package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/ec2transitgateway/route", "Route")
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
    inline def get(name: String, id: Input[ID]): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Route]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Route]
    inline def get(name: String, id: Input[ID], state: RouteState): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Route]
    inline def get(name: String, id: Input[ID], state: RouteState, opts: CustomResourceOptions): Route = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Route]
    
    /**
      * Returns true if the given object is an instance of Route.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/route.Route */ Boolean]
  }
  
  trait RouteArgs extends StObject {
    
    /**
      * Indicates whether to drop traffic that matches this route (default to `false`).
      */
    val blackhole: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
      */
    val destinationCidrBlock: Input[String]
    
    /**
      * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
      */
    val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway Route Table.
      */
    val transitGatewayRouteTableId: Input[String]
  }
  object RouteArgs {
    
    inline def apply(destinationCidrBlock: Input[String], transitGatewayRouteTableId: Input[String]): RouteArgs = {
      val __obj = js.Dynamic.literal(destinationCidrBlock = destinationCidrBlock.asInstanceOf[js.Any], transitGatewayRouteTableId = transitGatewayRouteTableId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteArgs]
    }
    
    extension [Self <: RouteArgs](x: Self) {
      
      inline def setBlackhole(value: Input[Boolean]): Self = StObject.set(x, "blackhole", value.asInstanceOf[js.Any])
      
      inline def setBlackholeUndefined: Self = StObject.set(x, "blackhole", js.undefined)
      
      inline def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayAttachmentId(value: Input[String]): Self = StObject.set(x, "transitGatewayAttachmentId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "transitGatewayAttachmentId", js.undefined)
      
      inline def setTransitGatewayRouteTableId(value: Input[String]): Self = StObject.set(x, "transitGatewayRouteTableId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteState extends StObject {
    
    /**
      * Indicates whether to drop traffic that matches this route (default to `false`).
      */
    val blackhole: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * IPv4 or IPv6 RFC1924 CIDR used for destination matches. Routing decisions are based on the most specific match.
      */
    val destinationCidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway Attachment (required if `blackhole` is set to false).
      */
    val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway Route Table.
      */
    val transitGatewayRouteTableId: js.UndefOr[Input[String]] = js.undefined
  }
  object RouteState {
    
    inline def apply(): RouteState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteState]
    }
    
    extension [Self <: RouteState](x: Self) {
      
      inline def setBlackhole(value: Input[Boolean]): Self = StObject.set(x, "blackhole", value.asInstanceOf[js.Any])
      
      inline def setBlackholeUndefined: Self = StObject.set(x, "blackhole", js.undefined)
      
      inline def setDestinationCidrBlock(value: Input[String]): Self = StObject.set(x, "destinationCidrBlock", value.asInstanceOf[js.Any])
      
      inline def setDestinationCidrBlockUndefined: Self = StObject.set(x, "destinationCidrBlock", js.undefined)
      
      inline def setTransitGatewayAttachmentId(value: Input[String]): Self = StObject.set(x, "transitGatewayAttachmentId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "transitGatewayAttachmentId", js.undefined)
      
      inline def setTransitGatewayRouteTableId(value: Input[String]): Self = StObject.set(x, "transitGatewayRouteTableId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayRouteTableIdUndefined: Self = StObject.set(x, "transitGatewayRouteTableId", js.undefined)
    }
  }
}
