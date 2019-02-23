package typings
package atPulumiAwsLib.ec2transitgatewayTransitGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGatewayState extends js.Object {
  /**
    * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
    */
  val amazonSideAsn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * EC2 Transit Gateway Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * Identifier of the default association route table
    */
  val associationDefaultRouteTableId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether resource attachment requests are automatically accepted. Valid values: `disable`, `enable`. Default value: `disable`.
    */
  val autoAcceptSharedAttachments: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether resource attachments are automatically associated with the default association route table. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val defaultRouteTableAssociation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether resource attachments automatically propagate routes to the default propagation route table. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val defaultRouteTablePropagation: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Description of the EC2 Transit Gateway.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether DNS support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val dnsSupport: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Identifier of the AWS account that owns the EC2 Transit Gateway
    */
  val ownerId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Identifier of the default propagation route table
    */
  val propagationDefaultRouteTableId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Key-value tags for the EC2 Transit Gateway.
    */
  val tags: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  /**
    * Whether VPN Equal Cost Multipath Protocol support is enabled. Valid values: `disable`, `enable`. Default value: `enable`.
    */
  val vpnEcmpSupport: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

