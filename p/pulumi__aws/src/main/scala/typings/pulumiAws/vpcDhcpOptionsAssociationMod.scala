package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcDhcpOptionsAssociationMod {
  
  @JSImport("@pulumi/aws/ec2/vpcDhcpOptionsAssociation", "VpcDhcpOptionsAssociation")
  @js.native
  class VpcDhcpOptionsAssociation protected () extends CustomResource {
    /**
      * Create a VpcDhcpOptionsAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcDhcpOptionsAssociationArgs) = this()
    def this(name: String, args: VpcDhcpOptionsAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ID of the DHCP Options Set to associate to the VPC.
      */
    val dhcpOptionsId: Output_[String] = js.native
    
    /**
      * The ID of the VPC to which we would like to associate a DHCP Options Set.
      */
    val vpcId: Output_[String] = js.native
  }
  /* static members */
  object VpcDhcpOptionsAssociation {
    
    @JSImport("@pulumi/aws/ec2/vpcDhcpOptionsAssociation", "VpcDhcpOptionsAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcDhcpOptionsAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): VpcDhcpOptionsAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcDhcpOptionsAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcDhcpOptionsAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcDhcpOptionsAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcDhcpOptionsAssociationState): VpcDhcpOptionsAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcDhcpOptionsAssociation]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcDhcpOptionsAssociationState, opts: CustomResourceOptions): VpcDhcpOptionsAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcDhcpOptionsAssociation]
    
    /**
      * Returns true if the given object is an instance of VpcDhcpOptionsAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpcDhcpOptionsAssociation.VpcDhcpOptionsAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2/vpcDhcpOptionsAssociation.VpcDhcpOptionsAssociation */ Boolean]
  }
  
  trait VpcDhcpOptionsAssociationArgs extends StObject {
    
    /**
      * The ID of the DHCP Options Set to associate to the VPC.
      */
    val dhcpOptionsId: Input[String]
    
    /**
      * The ID of the VPC to which we would like to associate a DHCP Options Set.
      */
    val vpcId: Input[String]
  }
  object VpcDhcpOptionsAssociationArgs {
    
    @scala.inline
    def apply(dhcpOptionsId: Input[String], vpcId: Input[String]): VpcDhcpOptionsAssociationArgs = {
      val __obj = js.Dynamic.literal(dhcpOptionsId = dhcpOptionsId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcDhcpOptionsAssociationArgs]
    }
    
    @scala.inline
    implicit class VpcDhcpOptionsAssociationArgsMutableBuilder[Self <: VpcDhcpOptionsAssociationArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDhcpOptionsId(value: Input[String]): Self = StObject.set(x, "dhcpOptionsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait VpcDhcpOptionsAssociationState extends StObject {
    
    /**
      * The ID of the DHCP Options Set to associate to the VPC.
      */
    val dhcpOptionsId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the VPC to which we would like to associate a DHCP Options Set.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object VpcDhcpOptionsAssociationState {
    
    @scala.inline
    def apply(): VpcDhcpOptionsAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcDhcpOptionsAssociationState]
    }
    
    @scala.inline
    implicit class VpcDhcpOptionsAssociationStateMutableBuilder[Self <: VpcDhcpOptionsAssociationState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDhcpOptionsId(value: Input[String]): Self = StObject.set(x, "dhcpOptionsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhcpOptionsIdUndefined: Self = StObject.set(x, "dhcpOptionsId", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
