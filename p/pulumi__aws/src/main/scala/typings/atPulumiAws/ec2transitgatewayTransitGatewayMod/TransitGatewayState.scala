package typings.atPulumiAws.ec2transitgatewayTransitGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGatewayState extends js.Object {
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
  @scala.inline
  def apply(
    amazonSideAsn: Input[Double] = null,
    arn: Input[ARN] = null,
    associationDefaultRouteTableId: Input[String] = null,
    autoAcceptSharedAttachments: Input[String] = null,
    defaultRouteTableAssociation: Input[String] = null,
    defaultRouteTablePropagation: Input[String] = null,
    description: Input[String] = null,
    dnsSupport: Input[String] = null,
    ownerId: Input[String] = null,
    propagationDefaultRouteTableId: Input[String] = null,
    tags: Input[StringDictionary[Input[String]]] = null,
    vpnEcmpSupport: Input[String] = null
  ): TransitGatewayState = {
    val __obj = js.Dynamic.literal()
    if (amazonSideAsn != null) __obj.updateDynamic("amazonSideAsn")(amazonSideAsn.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (associationDefaultRouteTableId != null) __obj.updateDynamic("associationDefaultRouteTableId")(associationDefaultRouteTableId.asInstanceOf[js.Any])
    if (autoAcceptSharedAttachments != null) __obj.updateDynamic("autoAcceptSharedAttachments")(autoAcceptSharedAttachments.asInstanceOf[js.Any])
    if (defaultRouteTableAssociation != null) __obj.updateDynamic("defaultRouteTableAssociation")(defaultRouteTableAssociation.asInstanceOf[js.Any])
    if (defaultRouteTablePropagation != null) __obj.updateDynamic("defaultRouteTablePropagation")(defaultRouteTablePropagation.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dnsSupport != null) __obj.updateDynamic("dnsSupport")(dnsSupport.asInstanceOf[js.Any])
    if (ownerId != null) __obj.updateDynamic("ownerId")(ownerId.asInstanceOf[js.Any])
    if (propagationDefaultRouteTableId != null) __obj.updateDynamic("propagationDefaultRouteTableId")(propagationDefaultRouteTableId.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpnEcmpSupport != null) __obj.updateDynamic("vpnEcmpSupport")(vpnEcmpSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayState]
  }
}

