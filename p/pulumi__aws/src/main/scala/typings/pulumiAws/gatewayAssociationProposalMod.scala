package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gatewayAssociationProposalMod {
  
  @JSImport("@pulumi/aws/directconnect/gatewayAssociationProposal", "GatewayAssociationProposal")
  @js.native
  class GatewayAssociationProposal protected () extends CustomResource {
    /**
      * Create a GatewayAssociationProposal resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayAssociationProposalArgs) = this()
    def this(name: String, args: GatewayAssociationProposalArgs, opts: CustomResourceOptions) = this()
    
    /**
      * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
      */
    val allowedPrefixes: Output_[js.Array[String]] = js.native
    
    /**
      * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
      */
    val associatedGatewayId: Output_[String] = js.native
    
    /**
      * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
      */
    val associatedGatewayOwnerAccountId: Output_[String] = js.native
    
    /**
      * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
      */
    val associatedGatewayType: Output_[String] = js.native
    
    /**
      * Direct Connect Gateway identifier.
      */
    val dxGatewayId: Output_[String] = js.native
    
    /**
      * AWS Account identifier of the Direct Connect Gateway's owner.
      */
    val dxGatewayOwnerAccountId: Output_[String] = js.native
  }
  /* static members */
  object GatewayAssociationProposal {
    
    @JSImport("@pulumi/aws/directconnect/gatewayAssociationProposal", "GatewayAssociationProposal")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GatewayAssociationProposal resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): GatewayAssociationProposal = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[GatewayAssociationProposal]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): GatewayAssociationProposal = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GatewayAssociationProposal]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayAssociationProposalState): GatewayAssociationProposal = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[GatewayAssociationProposal]
    @scala.inline
    def get(name: String, id: Input[ID], state: GatewayAssociationProposalState, opts: CustomResourceOptions): GatewayAssociationProposal = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GatewayAssociationProposal]
    
    /**
      * Returns true if the given object is an instance of GatewayAssociationProposal.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociationProposal.GatewayAssociationProposal */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociationProposal.GatewayAssociationProposal */ Boolean]
  }
  
  trait GatewayAssociationProposalArgs extends StObject {
    
    /**
      * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
      */
    val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
      */
    val associatedGatewayId: Input[String]
    
    /**
      * Direct Connect Gateway identifier.
      */
    val dxGatewayId: Input[String]
    
    /**
      * AWS Account identifier of the Direct Connect Gateway's owner.
      */
    val dxGatewayOwnerAccountId: Input[String]
  }
  object GatewayAssociationProposalArgs {
    
    @scala.inline
    def apply(
      associatedGatewayId: Input[String],
      dxGatewayId: Input[String],
      dxGatewayOwnerAccountId: Input[String]
    ): GatewayAssociationProposalArgs = {
      val __obj = js.Dynamic.literal(associatedGatewayId = associatedGatewayId.asInstanceOf[js.Any], dxGatewayId = dxGatewayId.asInstanceOf[js.Any], dxGatewayOwnerAccountId = dxGatewayOwnerAccountId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayAssociationProposalArgs]
    }
    
    @scala.inline
    implicit class GatewayAssociationProposalArgsMutableBuilder[Self <: GatewayAssociationProposalArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedPrefixes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedPrefixesUndefined: Self = StObject.set(x, "allowedPrefixes", js.undefined)
      
      @scala.inline
      def setAllowedPrefixesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedPrefixes", js.Array(value :_*))
      
      @scala.inline
      def setAssociatedGatewayId(value: Input[String]): Self = StObject.set(x, "associatedGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxGatewayOwnerAccountId(value: Input[String]): Self = StObject.set(x, "dxGatewayOwnerAccountId", value.asInstanceOf[js.Any])
    }
  }
  
  trait GatewayAssociationProposalState extends StObject {
    
    /**
      * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
      */
    val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
      */
    val associatedGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
      */
    val associatedGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
      */
    val associatedGatewayType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Direct Connect Gateway identifier.
      */
    val dxGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * AWS Account identifier of the Direct Connect Gateway's owner.
      */
    val dxGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.undefined
  }
  object GatewayAssociationProposalState {
    
    @scala.inline
    def apply(): GatewayAssociationProposalState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GatewayAssociationProposalState]
    }
    
    @scala.inline
    implicit class GatewayAssociationProposalStateMutableBuilder[Self <: GatewayAssociationProposalState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedPrefixes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedPrefixes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedPrefixesUndefined: Self = StObject.set(x, "allowedPrefixes", js.undefined)
      
      @scala.inline
      def setAllowedPrefixesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedPrefixes", js.Array(value :_*))
      
      @scala.inline
      def setAssociatedGatewayId(value: Input[String]): Self = StObject.set(x, "associatedGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatedGatewayIdUndefined: Self = StObject.set(x, "associatedGatewayId", js.undefined)
      
      @scala.inline
      def setAssociatedGatewayOwnerAccountId(value: Input[String]): Self = StObject.set(x, "associatedGatewayOwnerAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatedGatewayOwnerAccountIdUndefined: Self = StObject.set(x, "associatedGatewayOwnerAccountId", js.undefined)
      
      @scala.inline
      def setAssociatedGatewayType(value: Input[String]): Self = StObject.set(x, "associatedGatewayType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociatedGatewayTypeUndefined: Self = StObject.set(x, "associatedGatewayType", js.undefined)
      
      @scala.inline
      def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxGatewayIdUndefined: Self = StObject.set(x, "dxGatewayId", js.undefined)
      
      @scala.inline
      def setDxGatewayOwnerAccountId(value: Input[String]): Self = StObject.set(x, "dxGatewayOwnerAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxGatewayOwnerAccountIdUndefined: Self = StObject.set(x, "dxGatewayOwnerAccountId", js.undefined)
    }
  }
}
