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

object routeTableAssociationMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/routeTableAssociation", "RouteTableAssociation")
  @js.native
  class RouteTableAssociation protected () extends CustomResource {
    /**
      * Create a RouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: RouteTableAssociationArgs) = this()
    def this(name: String, args: RouteTableAssociationArgs, opts: CustomResourceOptions) = this()
    
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
  object RouteTableAssociation {
    
    /**
      * Get an existing RouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2transitgateway/routeTableAssociation", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/routeTableAssociation", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/routeTableAssociation", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState): RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2transitgateway/routeTableAssociation", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState, opts: CustomResourceOptions): RouteTableAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2transitgateway/routeTableAssociation", "RouteTableAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/routeTableAssociation.RouteTableAssociation */ Boolean = js.native
  }
  
  @js.native
  trait RouteTableAssociationArgs extends StObject {
    
    /**
      * Identifier of EC2 Transit Gateway Attachment.
      */
    val transitGatewayAttachmentId: Input[String] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway Route Table.
      */
    val transitGatewayRouteTableId: Input[String] = js.native
  }
  object RouteTableAssociationArgs {
    
    @scala.inline
    def apply(transitGatewayAttachmentId: Input[String], transitGatewayRouteTableId: Input[String]): RouteTableAssociationArgs = {
      val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any], transitGatewayRouteTableId = transitGatewayRouteTableId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteTableAssociationArgs]
    }
    
    @scala.inline
    implicit class RouteTableAssociationArgsMutableBuilder[Self <: RouteTableAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransitGatewayAttachmentId(value: Input[String]): Self = StObject.set(x, "transitGatewayAttachmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayRouteTableId(value: Input[String]): Self = StObject.set(x, "transitGatewayRouteTableId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RouteTableAssociationState extends StObject {
    
    /**
      * Identifier of the resource
      */
    val resourceId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Type of the resource
      */
    val resourceType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway Attachment.
      */
    val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway Route Table.
      */
    val transitGatewayRouteTableId: js.UndefOr[Input[String]] = js.native
  }
  object RouteTableAssociationState {
    
    @scala.inline
    def apply(): RouteTableAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteTableAssociationState]
    }
    
    @scala.inline
    implicit class RouteTableAssociationStateMutableBuilder[Self <: RouteTableAssociationState] (val x: Self) extends AnyVal {
      
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
