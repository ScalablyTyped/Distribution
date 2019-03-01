package typings
package atPulumiAwsLib.ec2transitgatewayTransitGatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitGatewayArgs extends js.Object {
  /**
    * Private Autonomous System Number (ASN) for the Amazon side of a BGP session. The range is `64512` to `65534` for 16-bit ASNs and `4200000000` to `4294967294` for 32-bit ASNs. Default value: `64512`.
    */
  val amazonSideAsn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
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

object TransitGatewayArgs {
  @scala.inline
  def apply(
    amazonSideAsn: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    autoAcceptSharedAttachments: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultRouteTableAssociation: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    defaultRouteTablePropagation: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    dnsSupport: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tags: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    vpnEcmpSupport: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): TransitGatewayArgs = {
    val __obj = js.Dynamic.literal()
    if (amazonSideAsn != null) __obj.updateDynamic("amazonSideAsn")(amazonSideAsn.asInstanceOf[js.Any])
    if (autoAcceptSharedAttachments != null) __obj.updateDynamic("autoAcceptSharedAttachments")(autoAcceptSharedAttachments.asInstanceOf[js.Any])
    if (defaultRouteTableAssociation != null) __obj.updateDynamic("defaultRouteTableAssociation")(defaultRouteTableAssociation.asInstanceOf[js.Any])
    if (defaultRouteTablePropagation != null) __obj.updateDynamic("defaultRouteTablePropagation")(defaultRouteTablePropagation.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dnsSupport != null) __obj.updateDynamic("dnsSupport")(dnsSupport.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpnEcmpSupport != null) __obj.updateDynamic("vpnEcmpSupport")(vpnEcmpSupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayArgs]
  }
}

