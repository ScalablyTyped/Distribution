package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeTablePropagationMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/routeTablePropagation", "RouteTablePropagation")
  @js.native
  class RouteTablePropagation protected () extends CustomResource {
    /**
      * Create a RouteTablePropagation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTablePropagationArgs) = this()
    def this(name: String, args: RouteTablePropagationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Identifier of the resource
      */
    val resourceId: Output_[String] = js.native
    
    /**
      * Type of the resource
      */
    val resourceType: Output_[String] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway Attachment.
      */
    val transitGatewayAttachmentId: Output_[String] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway Route Table.
      */
    val transitGatewayRouteTableId: Output_[String] = js.native
  }
  /* static members */
  object RouteTablePropagation {
    
    @JSImport("@pulumi/aws/ec2transitgateway/routeTablePropagation", "RouteTablePropagation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing RouteTablePropagation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): RouteTablePropagation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[RouteTablePropagation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): RouteTablePropagation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RouteTablePropagation]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteTablePropagationState): RouteTablePropagation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[RouteTablePropagation]
    @scala.inline
    def get(name: String, id: Input[ID], state: RouteTablePropagationState, opts: CustomResourceOptions): RouteTablePropagation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[RouteTablePropagation]
    
    /**
      * Returns true if the given object is an instance of RouteTablePropagation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTablePropagation.RouteTablePropagation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTablePropagation.RouteTablePropagation */ Boolean]
  }
  
  trait RouteTablePropagationArgs extends StObject {
    
    /**
      * Identifier of EC2 Transit Gateway Attachment.
      */
    val transitGatewayAttachmentId: Input[String]
    
    /**
      * Identifier of EC2 Transit Gateway Route Table.
      */
    val transitGatewayRouteTableId: Input[String]
  }
  object RouteTablePropagationArgs {
    
    @scala.inline
    def apply(transitGatewayAttachmentId: Input[String], transitGatewayRouteTableId: Input[String]): RouteTablePropagationArgs = {
      val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any], transitGatewayRouteTableId = transitGatewayRouteTableId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteTablePropagationArgs]
    }
    
    @scala.inline
    implicit class RouteTablePropagationArgsMutableBuilder[Self <: RouteTablePropagationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransitGatewayAttachmentId(value: Input[String]): Self = StObject.set(x, "transitGatewayAttachmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayRouteTableId(value: Input[String]): Self = StObject.set(x, "transitGatewayRouteTableId", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteTablePropagationState extends StObject {
    
    /**
      * Identifier of the resource
      */
    val resourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Type of the resource
      */
    val resourceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway Attachment.
      */
    val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway Route Table.
      */
    val transitGatewayRouteTableId: js.UndefOr[Input[String]] = js.undefined
  }
  object RouteTablePropagationState {
    
    @scala.inline
    def apply(): RouteTablePropagationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteTablePropagationState]
    }
    
    @scala.inline
    implicit class RouteTablePropagationStateMutableBuilder[Self <: RouteTablePropagationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResourceId(value: Input[String]): Self = StObject.set(x, "resourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceIdUndefined: Self = StObject.set(x, "resourceId", js.undefined)
      
      @scala.inline
      def setResourceType(value: Input[String]): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
      
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
