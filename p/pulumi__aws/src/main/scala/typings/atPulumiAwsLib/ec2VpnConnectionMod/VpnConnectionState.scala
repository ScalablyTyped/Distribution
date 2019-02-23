package typings
package atPulumiAwsLib.ec2VpnConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnectionState extends js.Object {
  /**
    * The configuration information for the VPN connection's customer gateway (in the native XML format).
    */
  val customerGatewayConfiguration: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the customer gateway.
    */
  val customerGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val routes: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DestinationCidrBlockSource]
      ]
    ]
  ] = js.undefined
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
    * The public IP address of the first VPN tunnel.
    */
  val tunnel1Address: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The bgp asn number of the first VPN tunnel.
    */
  val tunnel1BgpAsn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The bgp holdtime of the first VPN tunnel.
    */
  val tunnel1BgpHoldtime: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (Customer Gateway Side).
    */
  val tunnel1CgwInsideAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The CIDR block of the inside IP addresses for the first VPN tunnel.
    */
  val tunnel1InsideCidr: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The preshared key of the first VPN tunnel.
    */
  val tunnel1PresharedKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (VPN Gateway Side).
    */
  val tunnel1VgwInsideAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The public IP address of the second VPN tunnel.
    */
  val tunnel2Address: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The bgp asn number of the second VPN tunnel.
    */
  val tunnel2BgpAsn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The bgp holdtime of the second VPN tunnel.
    */
  val tunnel2BgpHoldtime: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (Customer Gateway Side).
    */
  val tunnel2CgwInsideAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The CIDR block of the second IP addresses for the first VPN tunnel.
    */
  val tunnel2InsideCidr: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The preshared key of the second VPN tunnel.
    */
  val tunnel2PresharedKey: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (VPN Gateway Side).
    */
  val tunnel2VgwInsideAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  val vgwTelemetries: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AcceptedRouteCountLastStatusChange]
      ]
    ]
  ] = js.undefined
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

