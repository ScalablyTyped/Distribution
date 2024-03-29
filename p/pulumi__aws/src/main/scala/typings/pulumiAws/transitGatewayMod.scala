package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitGatewayMod {
  
  @JSImport("@pulumi/aws/ec2transitgateway/transitGateway", "TransitGateway")
  @js.native
  class TransitGateway protected () extends CustomResource {
    /**
      * Create a TransitGateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: TransitGatewayArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: TransitGatewayArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
      */
    val amazonSideAsn: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * EC2 Transit Gateway Amazon Resource Name (ARN)
      */
    val arn: Output_[ARN] = js.native
    
    /**
      * Identifier of the default association route table
      */
    val associationDefaultRouteTableId: Output_[String] = js.native
    
    /**
      * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
      */
    val autoAcceptSharedAttachments: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val defaultRouteTableAssociation: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val defaultRouteTablePropagation: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Description of the EC2 Transit Gateway.
      */
    val description: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val dnsSupport: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Identifier of the AWS account that owns the EC2 Transit Gateway
      */
    val ownerId: Output_[String] = js.native
    
    /**
      * Identifier of the default propagation route table
      */
    val propagationDefaultRouteTableId: Output_[String] = js.native
    
    /**
      * Key-value tags for the EC2 Transit Gateway.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val vpnEcmpSupport: Output_[js.UndefOr[String]] = js.native
  }
  /* static members */
  object TransitGateway {
    
    @JSImport("@pulumi/aws/ec2transitgateway/transitGateway", "TransitGateway")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing TransitGateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): TransitGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[TransitGateway]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): TransitGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TransitGateway]
    inline def get(name: String, id: Input[ID], state: TransitGatewayState): TransitGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[TransitGateway]
    inline def get(name: String, id: Input[ID], state: TransitGatewayState, opts: CustomResourceOptions): TransitGateway = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[TransitGateway]
    
    /**
      * Returns true if the given object is an instance of TransitGateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2transitgateway/transitGateway.TransitGateway */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/ec2transitgateway/transitGateway.TransitGateway */ Boolean]
  }
  
  trait TransitGatewayArgs extends StObject {
    
    /**
      * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
      */
    val amazonSideAsn: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
      */
    val autoAcceptSharedAttachments: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val defaultRouteTableAssociation: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val defaultRouteTablePropagation: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the EC2 Transit Gateway.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val dnsSupport: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value tags for the EC2 Transit Gateway.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val vpnEcmpSupport: js.UndefOr[Input[String]] = js.undefined
  }
  object TransitGatewayArgs {
    
    inline def apply(): TransitGatewayArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitGatewayArgs]
    }
    
    extension [Self <: TransitGatewayArgs](x: Self) {
      
      inline def setAmazonSideAsn(value: Input[Double]): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      inline def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
      
      inline def setAutoAcceptSharedAttachments(value: Input[String]): Self = StObject.set(x, "autoAcceptSharedAttachments", value.asInstanceOf[js.Any])
      
      inline def setAutoAcceptSharedAttachmentsUndefined: Self = StObject.set(x, "autoAcceptSharedAttachments", js.undefined)
      
      inline def setDefaultRouteTableAssociation(value: Input[String]): Self = StObject.set(x, "defaultRouteTableAssociation", value.asInstanceOf[js.Any])
      
      inline def setDefaultRouteTableAssociationUndefined: Self = StObject.set(x, "defaultRouteTableAssociation", js.undefined)
      
      inline def setDefaultRouteTablePropagation(value: Input[String]): Self = StObject.set(x, "defaultRouteTablePropagation", value.asInstanceOf[js.Any])
      
      inline def setDefaultRouteTablePropagationUndefined: Self = StObject.set(x, "defaultRouteTablePropagation", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDnsSupport(value: Input[String]): Self = StObject.set(x, "dnsSupport", value.asInstanceOf[js.Any])
      
      inline def setDnsSupportUndefined: Self = StObject.set(x, "dnsSupport", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpnEcmpSupport(value: Input[String]): Self = StObject.set(x, "vpnEcmpSupport", value.asInstanceOf[js.Any])
      
      inline def setVpnEcmpSupportUndefined: Self = StObject.set(x, "vpnEcmpSupport", js.undefined)
    }
  }
  
  trait TransitGatewayState extends StObject {
    
    /**
      * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
      */
    val amazonSideAsn: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * EC2 Transit Gateway Amazon Resource Name (ARN)
      */
    val arn: js.UndefOr[Input[ARN]] = js.undefined
    
    /**
      * Identifier of the default association route table
      */
    val associationDefaultRouteTableId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
      */
    val autoAcceptSharedAttachments: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val defaultRouteTableAssociation: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val defaultRouteTablePropagation: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Description of the EC2 Transit Gateway.
      */
    val description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val dnsSupport: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the AWS account that owns the EC2 Transit Gateway
      */
    val ownerId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Identifier of the default propagation route table
      */
    val propagationDefaultRouteTableId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Key-value tags for the EC2 Transit Gateway.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
      */
    val vpnEcmpSupport: js.UndefOr[Input[String]] = js.undefined
  }
  object TransitGatewayState {
    
    inline def apply(): TransitGatewayState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitGatewayState]
    }
    
    extension [Self <: TransitGatewayState](x: Self) {
      
      inline def setAmazonSideAsn(value: Input[Double]): Self = StObject.set(x, "amazonSideAsn", value.asInstanceOf[js.Any])
      
      inline def setAmazonSideAsnUndefined: Self = StObject.set(x, "amazonSideAsn", js.undefined)
      
      inline def setArn(value: Input[ARN]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setAssociationDefaultRouteTableId(value: Input[String]): Self = StObject.set(x, "associationDefaultRouteTableId", value.asInstanceOf[js.Any])
      
      inline def setAssociationDefaultRouteTableIdUndefined: Self = StObject.set(x, "associationDefaultRouteTableId", js.undefined)
      
      inline def setAutoAcceptSharedAttachments(value: Input[String]): Self = StObject.set(x, "autoAcceptSharedAttachments", value.asInstanceOf[js.Any])
      
      inline def setAutoAcceptSharedAttachmentsUndefined: Self = StObject.set(x, "autoAcceptSharedAttachments", js.undefined)
      
      inline def setDefaultRouteTableAssociation(value: Input[String]): Self = StObject.set(x, "defaultRouteTableAssociation", value.asInstanceOf[js.Any])
      
      inline def setDefaultRouteTableAssociationUndefined: Self = StObject.set(x, "defaultRouteTableAssociation", js.undefined)
      
      inline def setDefaultRouteTablePropagation(value: Input[String]): Self = StObject.set(x, "defaultRouteTablePropagation", value.asInstanceOf[js.Any])
      
      inline def setDefaultRouteTablePropagationUndefined: Self = StObject.set(x, "defaultRouteTablePropagation", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setDnsSupport(value: Input[String]): Self = StObject.set(x, "dnsSupport", value.asInstanceOf[js.Any])
      
      inline def setDnsSupportUndefined: Self = StObject.set(x, "dnsSupport", js.undefined)
      
      inline def setOwnerId(value: Input[String]): Self = StObject.set(x, "ownerId", value.asInstanceOf[js.Any])
      
      inline def setOwnerIdUndefined: Self = StObject.set(x, "ownerId", js.undefined)
      
      inline def setPropagationDefaultRouteTableId(value: Input[String]): Self = StObject.set(x, "propagationDefaultRouteTableId", value.asInstanceOf[js.Any])
      
      inline def setPropagationDefaultRouteTableIdUndefined: Self = StObject.set(x, "propagationDefaultRouteTableId", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpnEcmpSupport(value: Input[String]): Self = StObject.set(x, "vpnEcmpSupport", value.asInstanceOf[js.Any])
      
      inline def setVpnEcmpSupportUndefined: Self = StObject.set(x, "vpnEcmpSupport", js.undefined)
    }
  }
}
