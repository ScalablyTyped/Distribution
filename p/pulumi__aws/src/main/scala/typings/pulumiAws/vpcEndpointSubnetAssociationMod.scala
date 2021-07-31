package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcEndpointSubnetAssociationMod {
  
  @JSImport("@pulumi/aws/ec2/vpcEndpointSubnetAssociation", "VpcEndpointSubnetAssociation")
  @js.native
  class VpcEndpointSubnetAssociation protected () extends CustomResource {
    /**
      * Create a VpcEndpointSubnetAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcEndpointSubnetAssociationArgs) = this()
    def this(name: String, args: VpcEndpointSubnetAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the subnet to be associated with the VPC endpoint.
      */
    val subnetId: Output_[String] = js.native
    
    /**
      * The ID of the VPC endpoint with which the subnet will be associated.
      */
    val vpcEndpointId: Output_[String] = js.native
  }
  /* static members */
  object VpcEndpointSubnetAssociation {
    
    @JSImport("@pulumi/aws/ec2/vpcEndpointSubnetAssociation", "VpcEndpointSubnetAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcEndpointSubnetAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): VpcEndpointSubnetAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointSubnetAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcEndpointSubnetAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointSubnetAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcEndpointSubnetAssociationState): VpcEndpointSubnetAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointSubnetAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcEndpointSubnetAssociationState, opts: CustomResourceOptions): VpcEndpointSubnetAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcEndpointSubnetAssociation]
    
    /**
      * Returns true if the given object is an instance of VpcEndpointSubnetAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointSubnetAssociation.VpcEndpointSubnetAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/vpcEndpointSubnetAssociation.VpcEndpointSubnetAssociation */ Boolean]
  }
  
  trait VpcEndpointSubnetAssociationArgs extends StObject {
    
    /**
      * The ID of the subnet to be associated with the VPC endpoint.
      */
    val subnetId: Input[String]
    
    /**
      * The ID of the VPC endpoint with which the subnet will be associated.
      */
    val vpcEndpointId: Input[String]
  }
  object VpcEndpointSubnetAssociationArgs {
    
    @scala.inline
    def apply(subnetId: Input[String], vpcEndpointId: Input[String]): VpcEndpointSubnetAssociationArgs = {
      val __obj = js.Dynamic.literal(subnetId = subnetId.asInstanceOf[js.Any], vpcEndpointId = vpcEndpointId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcEndpointSubnetAssociationArgs]
    }
    
    @scala.inline
    implicit class VpcEndpointSubnetAssociationArgsMutableBuilder[Self <: VpcEndpointSubnetAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
    }
  }
  
  trait VpcEndpointSubnetAssociationState extends StObject {
    
    /**
      * The ID of the subnet to be associated with the VPC endpoint.
      */
    val subnetId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the VPC endpoint with which the subnet will be associated.
      */
    val vpcEndpointId: js.UndefOr[Input[String]] = js.undefined
  }
  object VpcEndpointSubnetAssociationState {
    
    @scala.inline
    def apply(): VpcEndpointSubnetAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcEndpointSubnetAssociationState]
    }
    
    @scala.inline
    implicit class VpcEndpointSubnetAssociationStateMutableBuilder[Self <: VpcEndpointSubnetAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSubnetId(value: Input[String]): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
      
      @scala.inline
      def setVpcEndpointId(value: Input[String]): Self = StObject.set(x, "vpcEndpointId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointIdUndefined: Self = StObject.set(x, "vpcEndpointId", js.undefined)
    }
  }
}
