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

object vpcAttachmentAccepterMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter", "VpcAttachmentAccepter")
  @js.native
  class VpcAttachmentAccepter protected () extends CustomResource {
    /**
      * Create a VpcAttachmentAccepter resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VpcAttachmentAccepterArgs) = this()
    def this(name: String, args: VpcAttachmentAccepterArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether Appliance Mode support is enabled. Valid values: `disable`, `enable`.
      */
    val applianceModeSupport: Output_[String] = js.native
    
    /**
      * Whether DNS support is enabled. Valid values: `disable`, `enable`.
      */
    val dnsSupport: Output_[String] = js.native
    
    /**
      * Whether IPv6 support is enabled. Valid values: `disable`, `enable`.
      */
    val ipv6Support: Output_[String] = js.native
    
    /**
      * Identifiers of EC2 Subnets.
      */
    val subnetIds: Output_[js.Array[String]] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway VPC Attachment.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The ID of the EC2 Transit Gateway Attachment to manage.
      */
    val transitGatewayAttachmentId: Output_[String] = js.native
    
    /**
      * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
      */
    val transitGatewayDefaultRouteTableAssociation: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
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
  object VpcAttachmentAccepter {
    
    @JSImport("@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter", "VpcAttachmentAccepter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing VpcAttachmentAccepter resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): VpcAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[VpcAttachmentAccepter]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): VpcAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcAttachmentAccepter]
    inline def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState): VpcAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[VpcAttachmentAccepter]
    inline def get(name: String, id: Input[ID], state: VpcAttachmentAccepterState, opts: CustomResourceOptions): VpcAttachmentAccepter = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[VpcAttachmentAccepter]
    
    /**
      * Returns true if the given object is an instance of VpcAttachmentAccepter.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter.VpcAttachmentAccepter */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/vpcAttachmentAccepter.VpcAttachmentAccepter */ Boolean]
  }
  
  trait VpcAttachmentAccepterArgs extends StObject {
    
    /**
      * Key-value tags for the EC2 Transit Gateway VPC Attachment.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The ID of the EC2 Transit Gateway Attachment to manage.
      */
    val transitGatewayAttachmentId: Input[String]
    
    /**
      * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
      */
    val transitGatewayDefaultRouteTableAssociation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
      */
    val transitGatewayDefaultRouteTablePropagation: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object VpcAttachmentAccepterArgs {
    
    inline def apply(transitGatewayAttachmentId: Input[String]): VpcAttachmentAccepterArgs = {
      val __obj = js.Dynamic.literal(transitGatewayAttachmentId = transitGatewayAttachmentId.asInstanceOf[js.Any])
      __obj.asInstanceOf[VpcAttachmentAccepterArgs]
    }
    
    extension [Self <: VpcAttachmentAccepterArgs](x: Self) {
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTransitGatewayAttachmentId(value: Input[String]): Self = StObject.set(x, "transitGatewayAttachmentId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayDefaultRouteTableAssociation(value: Input[Boolean]): Self = StObject.set(x, "transitGatewayDefaultRouteTableAssociation", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayDefaultRouteTableAssociationUndefined: Self = StObject.set(x, "transitGatewayDefaultRouteTableAssociation", js.undefined)
      
      inline def setTransitGatewayDefaultRouteTablePropagation(value: Input[Boolean]): Self = StObject.set(x, "transitGatewayDefaultRouteTablePropagation", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayDefaultRouteTablePropagationUndefined: Self = StObject.set(x, "transitGatewayDefaultRouteTablePropagation", js.undefined)
    }
  }
  
  trait VpcAttachmentAccepterState extends StObject {
    
    /**
      * Whether Appliance Mode support is enabled. Valid values: `disable`, `enable`.
      */
    val applianceModeSupport: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether DNS support is enabled. Valid values: `disable`, `enable`.
      */
    val dnsSupport: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether IPv6 support is enabled. Valid values: `disable`, `enable`.
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
      * The ID of the EC2 Transit Gateway Attachment to manage.
      */
    val transitGatewayAttachmentId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
      */
    val transitGatewayDefaultRouteTableAssociation: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
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
  object VpcAttachmentAccepterState {
    
    inline def apply(): VpcAttachmentAccepterState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VpcAttachmentAccepterState]
    }
    
    extension [Self <: VpcAttachmentAccepterState](x: Self) {
      
      inline def setApplianceModeSupport(value: Input[String]): Self = StObject.set(x, "applianceModeSupport", value.asInstanceOf[js.Any])
      
      inline def setApplianceModeSupportUndefined: Self = StObject.set(x, "applianceModeSupport", js.undefined)
      
      inline def setDnsSupport(value: Input[String]): Self = StObject.set(x, "dnsSupport", value.asInstanceOf[js.Any])
      
      inline def setDnsSupportUndefined: Self = StObject.set(x, "dnsSupport", js.undefined)
      
      inline def setIpv6Support(value: Input[String]): Self = StObject.set(x, "ipv6Support", value.asInstanceOf[js.Any])
      
      inline def setIpv6SupportUndefined: Self = StObject.set(x, "ipv6Support", js.undefined)
      
      inline def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      inline def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      inline def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTransitGatewayAttachmentId(value: Input[String]): Self = StObject.set(x, "transitGatewayAttachmentId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "transitGatewayAttachmentId", js.undefined)
      
      inline def setTransitGatewayDefaultRouteTableAssociation(value: Input[Boolean]): Self = StObject.set(x, "transitGatewayDefaultRouteTableAssociation", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayDefaultRouteTableAssociationUndefined: Self = StObject.set(x, "transitGatewayDefaultRouteTableAssociation", js.undefined)
      
      inline def setTransitGatewayDefaultRouteTablePropagation(value: Input[Boolean]): Self = StObject.set(x, "transitGatewayDefaultRouteTablePropagation", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayDefaultRouteTablePropagationUndefined: Self = StObject.set(x, "transitGatewayDefaultRouteTablePropagation", js.undefined)
      
      inline def setTransitGatewayId(value: Input[String]): Self = StObject.set(x, "transitGatewayId", value.asInstanceOf[js.Any])
      
      inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "transitGatewayId", js.undefined)
      
      inline def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      inline def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
      
      inline def setVpcOwnerId(value: Input[String]): Self = StObject.set(x, "vpcOwnerId", value.asInstanceOf[js.Any])
      
      inline def setVpcOwnerIdUndefined: Self = StObject.set(x, "vpcOwnerId", js.undefined)
    }
  }
}
