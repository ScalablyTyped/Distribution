package typings
package atPulumiAwsLib.ec2VpnConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnectionArgs extends js.Object {
  /**
    * The ID of the customer gateway.
    */
  val customerGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
    */
  val staticRoutesOnly: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Tags to apply to the connection.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The ID of the EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The CIDR block of the inside IP addresses for the first VPN tunnel.
    */
  val tunnel1InsideCidr: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The preshared key of the first VPN tunnel.
    */
  val tunnel1PresharedKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The CIDR block of the second IP addresses for the first VPN tunnel.
    */
  val tunnel2InsideCidr: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The preshared key of the second VPN tunnel.
    */
  val tunnel2PresharedKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object VpnConnectionArgs {
  @scala.inline
  def apply(
    customerGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    staticRoutesOnly: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    transitGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tunnel1InsideCidr: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tunnel1PresharedKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tunnel2InsideCidr: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tunnel2PresharedKey: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    vpnGatewayId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): VpnConnectionArgs = {
    val __obj = js.Dynamic.literal(customerGatewayId = customerGatewayId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (staticRoutesOnly != null) __obj.updateDynamic("staticRoutesOnly")(staticRoutesOnly.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (transitGatewayId != null) __obj.updateDynamic("transitGatewayId")(transitGatewayId.asInstanceOf[js.Any])
    if (tunnel1InsideCidr != null) __obj.updateDynamic("tunnel1InsideCidr")(tunnel1InsideCidr.asInstanceOf[js.Any])
    if (tunnel1PresharedKey != null) __obj.updateDynamic("tunnel1PresharedKey")(tunnel1PresharedKey.asInstanceOf[js.Any])
    if (tunnel2InsideCidr != null) __obj.updateDynamic("tunnel2InsideCidr")(tunnel2InsideCidr.asInstanceOf[js.Any])
    if (tunnel2PresharedKey != null) __obj.updateDynamic("tunnel2PresharedKey")(tunnel2PresharedKey.asInstanceOf[js.Any])
    if (vpnGatewayId != null) __obj.updateDynamic("vpnGatewayId")(vpnGatewayId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnConnectionArgs]
  }
}

