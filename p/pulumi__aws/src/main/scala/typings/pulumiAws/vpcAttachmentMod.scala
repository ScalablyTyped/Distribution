package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vpcAttachmentMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/vpcAttachment", "VpcAttachment")
  @js.native
  class VpcAttachment protected () extends CustomResource {
    /**
      * Create a VpcAttachment resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAttachmentArgs) = this()
    def this(name: String, args: VpcAttachmentArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
      */
    val applianceModeSupport: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val dnsSupport: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
      */
    val ipv6Support: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Identifiers of EC2 Subnets.
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway VPC Attachment.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
      */
    val transitGatewayDefaultRouteTableAssociation: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
      */
    val transitGatewayDefaultRouteTablePropagation: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: Output_[String] = js.native
    
    /**
      * Identifier of EC2 VPC.
      */
    val vpcId: Output_[String] = js.native
    
    /**
      * Identifier of the AWS account that owns the EC2 VPC.
      */
    val vpcOwnerId: Output_[String] = js.native
  }
  /* static members */
  object VpcAttachment {
    
    @JSImport("@pulumi/aws/ec2transitgateway/vpcAttachment", "VpcAttachment")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcAttachment resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): VpcAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcAttachmentState): VpcAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcAttachment]
    @scala.inline
    def get(name: String, id: Input[ID], state: VpcAttachmentState, opts: CustomResourceOptions): VpcAttachment = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcAttachment]
    
    /**
      * Returns true if the given object is an instance of VpcAttachment.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachment.VpcAttachment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachment.VpcAttachment */ Boolean]
  }
  
  trait VpcAttachmentArgs extends StObject {
    
    /**
      * Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
      */
    val applianceModeSupport: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val dnsSupport: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
      */
    val ipv6Support: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifiers of EC2 Subnets.
      */
    val subnetIds: Input[js.Array[Input[String]]]
    
    /**
      * Key-value tags for the EC2 Transit Gateway VPC Attachment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
      */
    val transitGatewayDefaultRouteTableAssociation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
      */
    val transitGatewayDefaultRouteTablePropagation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: Input[String]
    
    /**
      * Identifier of EC2 VPC.
      */
    val vpcId: Input[String]
  }
  object VpcAttachmentArgs {
    
    @scala.inline
    def apply(subnetIds: Input[js.Array[Input[String]]], transitGatewayId: Input[String], vpcId: Input[String]): VpcAttachmentArgs = {
      val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcAttachmentArgs]
    }
    
    @scala.inline
    implicit class VpcAttachmentArgsMutableBuilder[Self <: VpcAttachmentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplianceModeSupport(value: Input[String]): Self = StObject.set(x, "applianceModeSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplianceModeSupportUndefined: Self = StObject.set(x, "applianceModeSupport", js.undefined)
      
      @scala.inline
      def setDnsSupport(value: Input[String]): Self = StObject.set(x, "dnsSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsSupportUndefined: Self = StObject.set(x, "dnsSupport", js.undefined)
      
      @scala.inline
      def setIpv6Support(value: Input[String]): Self = StObject.set(x, "ipv6Support", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6SupportUndefined: Self = StObject.set(x, "ipv6Support", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitGatewayDefaultRouteTableAssociation(value: Input[Boolean]): Self = StObject.set(x, "transitGatewayDefaultRouteTableAssociation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayDefaultRouteTableAssociationUndefined: Self = StObject.set(x, "transitGatewayDefaultRouteTableAssociation", js.undefined)
      
      @scala.inline
      def setTransitGatewayDefaultRouteTablePropagation(value: Input[Boolean]): Self = StObject.set(x, "transitGatewayDefaultRouteTablePropagation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayDefaultRouteTablePropagationUndefined: Self = StObject.set(x, "transitGatewayDefaultRouteTablePropagation", js.undefined)
      
      @scala.inline
      def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
    }
  }
  
  trait VpcAttachmentState extends StObject {
    
    /**
      * Whether Appliance Mode support is enabled. If enabled, a traffic flow between a source and destination uses the same Availability Zone for the VPC attachment for the lifetime of that flow. Valid values: `disable`, `enable`. Default value: `disable`.
      */
    val applianceModeSupport: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val dnsSupport: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
      */
    val ipv6Support: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifiers of EC2 Subnets.
      */
    val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Key-value tags for the EC2 Transit Gateway VPC Attachment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
      */
    val transitGatewayDefaultRouteTableAssociation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. This cannot be configured or perform drift detection with Resource Access Manager shared EC2 Transit Gateways. Default value: `true`.
      */
    val transitGatewayDefaultRouteTablePropagation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Identifier of EC2 Transit Gateway.
      */
    val transitGatewayId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of EC2 VPC.
      */
    val vpcId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the AWS account that owns the EC2 VPC.
      */
    val vpcOwnerId: js.UndefOr[Input[String]] = js.undefined
  }
  object VpcAttachmentState {
    
    @scala.inline
    def apply(): VpcAttachmentState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcAttachmentState]
    }
    
    @scala.inline
    implicit class VpcAttachmentStateMutableBuilder[Self <: VpcAttachmentState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplianceModeSupport(value: Input[String]): Self = StObject.set(x, "applianceModeSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplianceModeSupportUndefined: Self = StObject.set(x, "applianceModeSupport", js.undefined)
      
      @scala.inline
      def setDnsSupport(value: Input[String]): Self = StObject.set(x, "dnsSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDnsSupportUndefined: Self = StObject.set(x, "dnsSupport", js.undefined)
      
      @scala.inline
      def setIpv6Support(value: Input[String]): Self = StObject.set(x, "ipv6Support", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6SupportUndefined: Self = StObject.set(x, "ipv6Support", js.undefined)
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTransitGatewayDefaultRouteTableAssociation(value: Input[Boolean]): Self = StObject.set(x, "transitGatewayDefaultRouteTableAssociation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayDefaultRouteTableAssociationUndefined: Self = StObject.set(x, "transitGatewayDefaultRouteTableAssociation", js.undefined)
      
      @scala.inline
      def setTransitGatewayDefaultRouteTablePropagation(value: Input[Boolean]): Self = StObject.set(x, "transitGatewayDefaultRouteTablePropagation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayDefaultRouteTablePropagationUndefined: Self = StObject.set(x, "transitGatewayDefaultRouteTablePropagation", js.undefined)
      
      @scala.inline
      def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      @scala.inline
      def setVpcOwnerId(value: Input[String]): Self = StObject.set(x, "vpcOwnerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcOwnerIdUndefined: Self = StObject.set(x, "vpcOwnerId", js.undefined)
    }
  }
}
