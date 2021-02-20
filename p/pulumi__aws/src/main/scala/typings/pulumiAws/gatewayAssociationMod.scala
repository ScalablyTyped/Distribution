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

object gatewayAssociationMod {
  
  @JSImport("@pulumi/aws/directconnect/gatewayAssociation", "GatewayAssociation")
  @js.native
  class GatewayAssociation protected () extends CustomResource {
    /**
      * Create a GatewayAssociation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayAssociationArgs) = this()
    def this(name: String, args: GatewayAssociationArgs, opts: CustomResourceOptions) = this()
    
    /**
      * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
      */
    val allowedPrefixes: Output_[js.Array[String]] = js.native
    
    /**
      * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
      * Used for single account Direct Connect gateway associations.
      */
    val associatedGatewayId: Output_[String] = js.native
    
    /**
      * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
      * Used for cross-account Direct Connect gateway associations.
      */
    val associatedGatewayOwnerAccountId: Output_[String] = js.native
    
    /**
      * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
      */
    val associatedGatewayType: Output_[String] = js.native
    
    /**
      * The ID of the Direct Connect gateway association.
      */
    val dxGatewayAssociationId: Output_[String] = js.native
    
    /**
      * The ID of the Direct Connect gateway.
      */
    val dxGatewayId: Output_[String] = js.native
    
    /**
      * The ID of the AWS account that owns the Direct Connect gateway.
      */
    val dxGatewayOwnerAccountId: Output_[String] = js.native
    
    /**
      * The ID of the Direct Connect gateway association proposal.
      * Used for cross-account Direct Connect gateway associations.
      */
    val proposalId: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object GatewayAssociation {
    
    /**
      * Get an existing GatewayAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/directconnect/gatewayAssociation", "GatewayAssociation.get")
    @js.native
    def get(name: String, id: Input[ID]): GatewayAssociation = js.native
    @JSImport("@pulumi/aws/directconnect/gatewayAssociation", "GatewayAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GatewayAssociation = js.native
    @JSImport("@pulumi/aws/directconnect/gatewayAssociation", "GatewayAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayAssociationState): GatewayAssociation = js.native
    @JSImport("@pulumi/aws/directconnect/gatewayAssociation", "GatewayAssociation.get")
    @js.native
    def get(name: String, id: Input[ID], state: GatewayAssociationState, opts: CustomResourceOptions): GatewayAssociation = js.native
    
    /**
      * Returns true if the given object is an instance of GatewayAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/directconnect/gatewayAssociation", "GatewayAssociation.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociation.GatewayAssociation */ Boolean = js.native
  }
  
  @js.native
  trait GatewayAssociationArgs extends StObject {
    
    /**
      * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
      */
    val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
      * Used for single account Direct Connect gateway associations.
      */
    val associatedGatewayId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
      * Used for cross-account Direct Connect gateway associations.
      */
    val associatedGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Direct Connect gateway.
      */
    val dxGatewayId: Input[String] = js.native
    
    /**
      * The ID of the Direct Connect gateway association proposal.
      * Used for cross-account Direct Connect gateway associations.
      */
    val proposalId: js.UndefOr[Input[String]] = js.native
  }
  object GatewayAssociationArgs {
    
    @scala.inline
    def apply(dxGatewayId: Input[String]): GatewayAssociationArgs = {
      val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayAssociationArgs]
    }
    
    @scala.inline
    implicit class GatewayAssociationArgsMutableBuilder[Self <: GatewayAssociationArgs] (val x: Self) extends AnyVal {
      
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
      def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProposalId(value: Input[String]): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    }
  }
  
  @js.native
  trait GatewayAssociationState extends StObject {
    
    /**
      * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
      */
    val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
      * Used for single account Direct Connect gateway associations.
      */
    val associatedGatewayId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
      * Used for cross-account Direct Connect gateway associations.
      */
    val associatedGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
      */
    val associatedGatewayType: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Direct Connect gateway association.
      */
    val dxGatewayAssociationId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Direct Connect gateway.
      */
    val dxGatewayId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the AWS account that owns the Direct Connect gateway.
      */
    val dxGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.native
    
    /**
      * The ID of the Direct Connect gateway association proposal.
      * Used for cross-account Direct Connect gateway associations.
      */
    val proposalId: js.UndefOr[Input[String]] = js.native
  }
  object GatewayAssociationState {
    
    @scala.inline
    def apply(): GatewayAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GatewayAssociationState]
    }
    
    @scala.inline
    implicit class GatewayAssociationStateMutableBuilder[Self <: GatewayAssociationState] (val x: Self) extends AnyVal {
      
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
      def setDxGatewayAssociationId(value: Input[String]): Self = StObject.set(x, "dxGatewayAssociationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxGatewayAssociationIdUndefined: Self = StObject.set(x, "dxGatewayAssociationId", js.undefined)
      
      @scala.inline
      def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxGatewayIdUndefined: Self = StObject.set(x, "dxGatewayId", js.undefined)
      
      @scala.inline
      def setDxGatewayOwnerAccountId(value: Input[String]): Self = StObject.set(x, "dxGatewayOwnerAccountId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDxGatewayOwnerAccountIdUndefined: Self = StObject.set(x, "dxGatewayOwnerAccountId", js.undefined)
      
      @scala.inline
      def setProposalId(value: Input[String]): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    }
  }
}
