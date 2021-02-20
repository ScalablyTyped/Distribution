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

object vpcEndpointRouteTableAssociationMod {
  
  @JSImport("@pulumi/aws/ec2/vpcEndpointRouteTableAssociation", "VpcEndpointRouteTableAssociation")
  @js.native
  class VpcEndpointRouteTableAssociation protected () extends CustomResource {
    /**
      * Create a VpcEndpointRouteTableAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcEndpointRouteTableAssociationArgs) = this()
    def this(name: String, args: VpcEndpointRouteTableAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Identifier of the EC2 Route Table to be associated with the VPC Endpoint.
      */
    val routeTableId: Output_[String] = js.native
    
    /**
      * Identifier of the VPC Endpoint with which the EC2 Route Table will be associated.
      */
    val vpcEndpointId: Output_[String] = js.native
  }
  /* static members */
  object VpcEndpointRouteTableAssociation {
    
    /**
      * Get an existing VpcEndpointRouteTableAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/ec2/vpcEndpointRouteTableAssociation", "VpcEndpointRouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): VpcEndpointRouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointRouteTableAssociation", "VpcEndpointRouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcEndpointRouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointRouteTableAssociation", "VpcEndpointRouteTableAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: VpcEndpointRouteTableAssociationState): VpcEndpointRouteTableAssociation = js.native
    @JSImport("@pulumi/aws/ec2/vpcEndpointRouteTableAssociation", "VpcEndpointRouteTableAssociation.get")
    @js.native
    def get(
      name: String,
      id: Input[ID],
      state: VpcEndpointRouteTableAssociationState,
      opts: CustomResourceOptions
    ): VpcEndpointRouteTableAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of VpcEndpointRouteTableAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/ec2/vpcEndpointRouteTableAssociation", "VpcEndpointRouteTableAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointRouteTableAssociation.VpcEndpointRouteTableAssociation */ Boolean = js.native
  }
  
  @js.native
  trait VpcEndpointRouteTableAssociationArgs extends StObject {
    
    /**
      * Identifier of the EC2 Route Table to be associated with the VPC Endpoint.
      */
    val routeTableId: Input[String] = js.native
    
    /**
      * Identifier of the VPC Endpoint with which the EC2 Route Table will be associated.
      */
    val vpcEndpointId: Input[String] = js.native
  }
  object VpcEndpointRouteTableAssociationArgs {
    
    @scala.inline
    def apply(routeTableId: Input[String], vpcEndpointId: Input[String]): VpcEndpointRouteTableAssociationArgs = {
      val __obj = js.Dynamic.literal(routeTableId = routeTableId.asInstanceOf[js.Any], vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcEndpointRouteTableAssociationArgs]
    }
    
    @scala.inline
    implicit class VpcEndpointRouteTableAssociationArgsMutableBuilder[Self <: VpcEndpointRouteTableAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VpcEndpointRouteTableAssociationState extends StObject {
    
    /**
      * Identifier of the EC2 Route Table to be associated with the VPC Endpoint.
      */
    val routeTableId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Identifier of the VPC Endpoint with which the EC2 Route Table will be associated.
      */
    val vpcEndpointId: js.UndefOr[Input[String]] = js.native
  }
  object VpcEndpointRouteTableAssociationState {
    
    @scala.inline
    def apply(): VpcEndpointRouteTableAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcEndpointRouteTableAssociationState]
    }
    
    @scala.inline
    implicit class VpcEndpointRouteTableAssociationStateMutableBuilder[Self <: VpcEndpointRouteTableAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRouteTableId(value: Input[String]): Self = StObject.set(x, "routeTableId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouteTableIdUndefined: Self = StObject.set(x, "routeTableId", js.undefined)
      
      @scala.inline
      def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointIdUndefined: Self = StObject.set(x, "vpcEndpointId", js.undefined)
    }
  }
}
