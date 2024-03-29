package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    
    @JSImport("@pulumi/aws/directconnect/gatewayAssociation", "GatewayAssociation")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing GatewayAssociation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): GatewayAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[GatewayAssociation]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): GatewayAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GatewayAssociation]
    inline def get(name: String, id: Input[ID], state: GatewayAssociationState): GatewayAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[GatewayAssociation]
    inline def get(name: String, id: Input[ID], state: GatewayAssociationState, opts: CustomResourceOptions): GatewayAssociation = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[GatewayAssociation]
    
    /**
      * Returns true if the given object is an instance of GatewayAssociation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociation.GatewayAssociation */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/directconnect/gatewayAssociation.GatewayAssociation */ Boolean]
  }
  
  trait GatewayAssociationArgs extends StObject {
    
    /**
      * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
      */
    val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
      * Used for single account Direct Connect gateway associations.
      */
    val associatedGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
      * Used for cross-account Direct Connect gateway associations.
      */
    val associatedGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the Direct Connect gateway.
      */
    val dxGatewayId: Input[String]
    
    /**
      * The ID of the Direct Connect gateway association proposal.
      * Used for cross-account Direct Connect gateway associations.
      */
    val proposalId: js.UndefOr[Input[String]] = js.undefined
  }
  object GatewayAssociationArgs {
    
    inline def apply(dxGatewayId: Input[String]): GatewayAssociationArgs = {
      val __obj = js.Dynamic.literal(dxGatewayId = dxGatewayId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GatewayAssociationArgs]
    }
    
    extension [Self <: GatewayAssociationArgs](x: Self) {
      
      inline def setAllowedPrefixes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedPrefixes", value.asInstanceOf[js.Any])
      
      inline def setAllowedPrefixesUndefined: Self = StObject.set(x, "allowedPrefixes", js.undefined)
      
      inline def setAllowedPrefixesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedPrefixes", js.Array(value :_*))
      
      inline def setAssociatedGatewayId(value: Input[String]): Self = StObject.set(x, "associatedGatewayId", value.asInstanceOf[js.Any])
      
      inline def setAssociatedGatewayIdUndefined: Self = StObject.set(x, "associatedGatewayId", js.undefined)
      
      inline def setAssociatedGatewayOwnerAccountId(value: Input[String]): Self = StObject.set(x, "associatedGatewayOwnerAccountId", value.asInstanceOf[js.Any])
      
      inline def setAssociatedGatewayOwnerAccountIdUndefined: Self = StObject.set(x, "associatedGatewayOwnerAccountId", js.undefined)
      
      inline def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      inline def setProposalId(value: Input[String]): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
      
      inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    }
  }
  
  trait GatewayAssociationState extends StObject {
    
    /**
      * VPC prefixes (CIDRs) to advertise to the Direct Connect gateway. Defaults to the CIDR block of the VPC associated with the Virtual Gateway. To enable drift detection, must be configured.
      */
    val allowedPrefixes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The ID of the VGW or transit gateway with which to associate the Direct Connect gateway.
      * Used for single account Direct Connect gateway associations.
      */
    val associatedGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the VGW or transit gateway with which to associate the Direct Connect gateway.
      * Used for cross-account Direct Connect gateway associations.
      */
    val associatedGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of the associated gateway, `transitGateway` or `virtualPrivateGateway`.
      */
    val associatedGatewayType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the Direct Connect gateway association.
      */
    val dxGatewayAssociationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the Direct Connect gateway.
      */
    val dxGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the AWS account that owns the Direct Connect gateway.
      */
    val dxGatewayOwnerAccountId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The ID of the Direct Connect gateway association proposal.
      * Used for cross-account Direct Connect gateway associations.
      */
    val proposalId: js.UndefOr[Input[String]] = js.undefined
  }
  object GatewayAssociationState {
    
    inline def apply(): GatewayAssociationState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GatewayAssociationState]
    }
    
    extension [Self <: GatewayAssociationState](x: Self) {
      
      inline def setAllowedPrefixes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedPrefixes", value.asInstanceOf[js.Any])
      
      inline def setAllowedPrefixesUndefined: Self = StObject.set(x, "allowedPrefixes", js.undefined)
      
      inline def setAllowedPrefixesVarargs(value: Input[String]*): Self = StObject.set(x, "allowedPrefixes", js.Array(value :_*))
      
      inline def setAssociatedGatewayId(value: Input[String]): Self = StObject.set(x, "associatedGatewayId", value.asInstanceOf[js.Any])
      
      inline def setAssociatedGatewayIdUndefined: Self = StObject.set(x, "associatedGatewayId", js.undefined)
      
      inline def setAssociatedGatewayOwnerAccountId(value: Input[String]): Self = StObject.set(x, "associatedGatewayOwnerAccountId", value.asInstanceOf[js.Any])
      
      inline def setAssociatedGatewayOwnerAccountIdUndefined: Self = StObject.set(x, "associatedGatewayOwnerAccountId", js.undefined)
      
      inline def setAssociatedGatewayType(value: Input[String]): Self = StObject.set(x, "associatedGatewayType", value.asInstanceOf[js.Any])
      
      inline def setAssociatedGatewayTypeUndefined: Self = StObject.set(x, "associatedGatewayType", js.undefined)
      
      inline def setDxGatewayAssociationId(value: Input[String]): Self = StObject.set(x, "dxGatewayAssociationId", value.asInstanceOf[js.Any])
      
      inline def setDxGatewayAssociationIdUndefined: Self = StObject.set(x, "dxGatewayAssociationId", js.undefined)
      
      inline def setDxGatewayId(value: Input[String]): Self = StObject.set(x, "dxGatewayId", value.asInstanceOf[js.Any])
      
      inline def setDxGatewayIdUndefined: Self = StObject.set(x, "dxGatewayId", js.undefined)
      
      inline def setDxGatewayOwnerAccountId(value: Input[String]): Self = StObject.set(x, "dxGatewayOwnerAccountId", value.asInstanceOf[js.Any])
      
      inline def setDxGatewayOwnerAccountIdUndefined: Self = StObject.set(x, "dxGatewayOwnerAccountId", js.undefined)
      
      inline def setProposalId(value: Input[String]): Self = StObject.set(x, "proposalId", value.asInstanceOf[js.Any])
      
      inline def setProposalIdUndefined: Self = StObject.set(x, "proposalId", js.undefined)
    }
  }
}
