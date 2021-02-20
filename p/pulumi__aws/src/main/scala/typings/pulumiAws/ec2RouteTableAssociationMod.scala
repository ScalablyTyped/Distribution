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

object ec2RouteTableAssociationMod {
  
  @JSImport("@pulumi/aws/ec2/routeTableAssociation", "RouteTableAssociation")
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
      * The gateway ID to create an association. Conflicts with `subnetId`.
      */
    val gatewayId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The ID of the routing table to associate with.
      */
    val routeTableId: Output_[String] = js.native
    
    /**
      * The subnet ID to create an association. Conflicts with `gatewayId`.
      */
    val subnetId: Output_[js.UndefOr[String]] = js.native
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
    @JSImport("@pulumi/aws/ec2/routeTableAssociation", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2/routeTableAssociation", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2/routeTableAssociation", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState): RouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2/routeTableAssociation", "RouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: RouteTableAssociationState, opts: CustomResourceOptions): RouteTableAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of RouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/routeTableAssociation", "RouteTableAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/routeTableAssociation.RouteTableAssociation */ Boolean = js.native
  }
  
  @js.native
  trait RouteTableAssociationArgs extends StObject {
    
    /**
      * The gateway ID to create an association. Conflicts with `subnetId`.
      */
    val gatewayId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the routing table to associate with.
      */
    val routeTableId: Input[String] = js.native
    
    /**
      * The subnet ID to create an association. Conflicts with `gatewayId`.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
  }
  object RouteTableAssociationArgs {
    
    @scala.inline
    def apply(routeTableId: Input[String]): RouteTableAssociationArgs = {
      val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteTableAssociationArgs]
    }
    
    @scala.inline
    implicit class RouteTableAssociationArgsMutableBuilder[Self <: RouteTableAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGatewayId(value: Input[String]): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
      
      @scala.inline
      def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    }
  }
  
  @js.native
  trait RouteTableAssociationState extends StObject {
    
    /**
      * The gateway ID to create an association. Conflicts with `subnetId`.
      */
    val gatewayId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the routing table to associate with.
      */
    val routeTableId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The subnet ID to create an association. Conflicts with `gatewayId`.
      */
    val subnetId: js.UndefOr[Input[String]] = js.native
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
      def setGatewayId(value: Input[String]): Self = StObject.set(x, "gatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayIdUndefined: Self = StObject.set(x, "gatewayId", js.undefined)
      
      @scala.inline
      def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableIdUndefined: Self = StObject.set(x, "routeTableId", js.undefined)
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    }
  }
}
