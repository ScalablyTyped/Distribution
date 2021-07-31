package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcIpv4CidrBlockAssociationMod {
  
  @JSImport("@pulumi/aws/ec2/vpcIpv4CidrBlockAssociation", "VpcIpv4CidrBlockAssociation")
  @js.native
  class VpcIpv4CidrBlockAssociation protected () extends CustomResource {
    /**
      * Create a VpcIpv4CidrBlockAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcIpv4CidrBlockAssociationArgs) = this()
    def this(name: String, args: VpcIpv4CidrBlockAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The additional IPv4 CIDR block to associate with the VPC.
      */
    val cidrBlock: Output_[String] = js.native
    
    /**
      * The ID of the VPC to make the association with.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object VpcIpv4CidrBlockAssociation {
    
    @JSImport("@pulumi/aws/ec2/vpcIpv4CidrBlockAssociation", "VpcIpv4CidrBlockAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcIpv4CidrBlockAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): VpcIpv4CidrBlockAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcIpv4CidrBlockAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcIpv4CidrBlockAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcIpv4CidrBlockAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcIpv4CidrBlockAssociationState): VpcIpv4CidrBlockAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcIpv4CidrBlockAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcIpv4CidrBlockAssociationState, opts: CustomResourceOptions): VpcIpv4CidrBlockAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcIpv4CidrBlockAssociation]
    
    /**
      * Returns true if the given object is an instance of VpcIpv4CidrBlockAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcIpv4CidrBlockAssociation.VpcIpv4CidrBlockAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/vpcIpv4CidrBlockAssociation.VpcIpv4CidrBlockAssociation */ Boolean]
  }
  
  trait VpcIpv4CidrBlockAssociationArgs extends StObject {
    
    /**
      * The additional IPv4 CIDR block to associate with the VPC.
      */
    val cidrBlock: Input[String]
    
    /**
      * The ID of the VPC to make the association with.
      */
    val vpcId: Input[String]
  }
  object VpcIpv4CidrBlockAssociationArgs {
    
    @scala.inline
    def apply(cidrBlock: Input[String], vpcId: Input[String]): VpcIpv4CidrBlockAssociationArgs = {
      val __obj = js.Dynamic.literal(cidrBlock = cidrBlock.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcIpv4CidrBlockAssociationArgs]
    }
    
    @scala.inline
    implicit class VpcIpv4CidrBlockAssociationArgsMutableBuilder[Self <: VpcIpv4CidrBlockAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait VpcIpv4CidrBlockAssociationState extends StObject {
    
    /**
      * The additional IPv4 CIDR block to associate with the VPC.
      */
    val cidrBlock: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the VPC to make the association with.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object VpcIpv4CidrBlockAssociationState {
    
    @scala.inline
    def apply(): VpcIpv4CidrBlockAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcIpv4CidrBlockAssociationState]
    }
    
    @scala.inline
    implicit class VpcIpv4CidrBlockAssociationStateMutableBuilder[Self <: VpcIpv4CidrBlockAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidrBlock(value: Input[String]): Self = StObject.set(x, "cidrBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlockUndefined: Self = StObject.set(x, "cidrBlock", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
