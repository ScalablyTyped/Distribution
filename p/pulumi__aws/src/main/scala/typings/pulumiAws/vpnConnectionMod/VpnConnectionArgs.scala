package typings.pulumiAws.vpnConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpnConnectionArgs extends js.Object {
  /**
    * The ID of the customer gateway.
    */
  val customerGatewayId: Input[String] = js.native
  /**
    * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
    */
  val staticRoutesOnly: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Tags to apply to the connection.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The ID of the EC2 Transit Gateway.
    */
  val transitGatewayId: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block of the inside IP addresses for the first VPN tunnel.
    */
  val tunnel1InsideCidr: js.UndefOr[Input[String]] = js.native
  /**
    * The preshared key of the first VPN tunnel.
    */
  val tunnel1PresharedKey: js.UndefOr[Input[String]] = js.native
  /**
    * The CIDR block of the inside IP addresses for the second VPN tunnel.
    */
  val tunnel2InsideCidr: js.UndefOr[Input[String]] = js.native
  /**
    * The preshared key of the second VPN tunnel.
    */
  val tunnel2PresharedKey: js.UndefOr[Input[String]] = js.native
  /**
    * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: Input[String] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: js.UndefOr[Input[String]] = js.native
}

object VpnConnectionArgs {
  @scala.inline
  def apply(
    customerGatewayId: Input[String],
    `type`: Input[String],
    staticRoutesOnly: Input[Boolean] = null,
    tags: Input[StringDictionary[_]] = null,
    transitGatewayId: Input[String] = null,
    tunnel1InsideCidr: Input[String] = null,
    tunnel1PresharedKey: Input[String] = null,
    tunnel2InsideCidr: Input[String] = null,
    tunnel2PresharedKey: Input[String] = null,
    vpnGatewayId: Input[String] = null
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

