package typings
package atPulumiAwsLib.ec2transitgatewayVpcAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcAttachmentArgs extends js.Object {
  /**
    * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val dnsSupport: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether IPv6 support is enabled. Valid values: `disable`, `enable`. Default value: `disable`.
    */
  val ipv6Support: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Identifiers of EC2 Subnets.
    */
  val subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  /**
    * Key-value tags for the EC2 Transit Gateway VPC Attachment.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * Boolean whether the VPC Attachment should be associated with the EC2 Transit Gateway association default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTableAssociation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Boolean whether the VPC Attachment should propagate routes with the EC2 Transit Gateway propagation default route table. Default value: `true`.
    */
  val transitGatewayDefaultRouteTablePropagation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Identifier of EC2 Transit Gateway.
    */
  val transitGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Identifier of EC2 VPC.
    */
  val vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object VpcAttachmentArgs {
  @scala.inline
  def apply(
    subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    transitGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    dnsSupport: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ipv6Support: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    transitGatewayDefaultRouteTableAssociation: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    transitGatewayDefaultRouteTablePropagation: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): VpcAttachmentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    if (dnsSupport != null) __obj.updateDynamic("dnsSupport")(dnsSupport.asInstanceOf[js.Any])
    if (ipv6Support != null) __obj.updateDynamic("ipv6Support")(ipv6Support.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitGatewayDefaultRouteTableAssociation != null) __obj.updateDynamic("transitGatewayDefaultRouteTableAssociation")(transitGatewayDefaultRouteTableAssociation.asInstanceOf[js.Any])
    if (transitGatewayDefaultRouteTablePropagation != null) __obj.updateDynamic("transitGatewayDefaultRouteTablePropagation")(transitGatewayDefaultRouteTablePropagation.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcAttachmentArgs]
  }
}

