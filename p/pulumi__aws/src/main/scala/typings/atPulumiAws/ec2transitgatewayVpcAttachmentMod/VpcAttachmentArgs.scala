package typings.atPulumiAws.ec2transitgatewayVpcAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcAttachmentArgs extends js.Object {
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
  def apply(
    subnetIds: Input[js.Array[Input[String]]],
    transitGatewayId: Input[String],
    vpcId: Input[String],
    dnsSupport: Input[String] = null,
    ipv6Support: Input[String] = null,
    tags: Input[StringDictionary[Input[String]]] = null,
    transitGatewayDefaultRouteTableAssociation: Input[Boolean] = null,
    transitGatewayDefaultRouteTablePropagation: Input[Boolean] = null
  ): VpcAttachmentArgs = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any], transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    if (dnsSupport != null) __obj.updateDynamic("dnsSupport")(dnsSupport.asInstanceOf[js.Any])
    if (ipv6Support != null) __obj.updateDynamic("ipv6Support")(ipv6Support.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitGatewayDefaultRouteTableAssociation != null) __obj.updateDynamic("transitGatewayDefaultRouteTableAssociation")(transitGatewayDefaultRouteTableAssociation.asInstanceOf[js.Any])
    if (transitGatewayDefaultRouteTablePropagation != null) __obj.updateDynamic("transitGatewayDefaultRouteTablePropagation")(transitGatewayDefaultRouteTablePropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcAttachmentArgs]
  }
}

