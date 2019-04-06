package typings
package atPulumiAwsLib.ec2VpnConnectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpnConnection", "VpnConnection")
@js.native
class VpnConnection protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a VpnConnection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: VpnConnectionArgs) = this()
  def this(name: java.lang.String, args: VpnConnectionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The configuration information for the VPN connection's customer gateway (in the native XML format).
    */
  val customerGatewayConfiguration: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the customer gateway.
    */
  val customerGatewayId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val routes: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_DestinationCidrBlock]] = js.native
  /**
    * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
    */
  val staticRoutesOnly: atPulumiPulumiLib.outputMod.Output[scala.Boolean] = js.native
  /**
    * Tags to apply to the connection.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * When associated with an EC2 Transit Gateway (`transit_gateway_id` argument), the attachment ID.
    */
  val transitGatewayAttachmentId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the EC2 Transit Gateway.
    */
  val transitGatewayId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The public IP address of the first VPN tunnel.
    */
  val tunnel1Address: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The bgp asn number of the first VPN tunnel.
    */
  val tunnel1BgpAsn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The bgp holdtime of the first VPN tunnel.
    */
  val tunnel1BgpHoldtime: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (Customer Gateway Side).
    */
  val tunnel1CgwInsideAddress: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The CIDR block of the inside IP addresses for the first VPN tunnel.
    */
  val tunnel1InsideCidr: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The preshared key of the first VPN tunnel.
    */
  val tunnel1PresharedKey: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (VPN Gateway Side).
    */
  val tunnel1VgwInsideAddress: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The public IP address of the second VPN tunnel.
    */
  val tunnel2Address: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The bgp asn number of the second VPN tunnel.
    */
  val tunnel2BgpAsn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The bgp holdtime of the second VPN tunnel.
    */
  val tunnel2BgpHoldtime: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (Customer Gateway Side).
    */
  val tunnel2CgwInsideAddress: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The CIDR block of the second IP addresses for the first VPN tunnel.
    */
  val tunnel2InsideCidr: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The preshared key of the second VPN tunnel.
    */
  val tunnel2PresharedKey: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (VPN Gateway Side).
    */
  val tunnel2VgwInsideAddress: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  val vgwTelemetries: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_AcceptedRouteCount]] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/vpnConnection", "VpnConnection")
@js.native
object VpnConnection extends js.Object {
  /**
    * Get an existing VpnConnection resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ec2VpnConnectionMod.VpnConnection = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpnConnectionMod.VpnConnectionState
  ): atPulumiAwsLib.ec2VpnConnectionMod.VpnConnection = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ec2VpnConnectionMod.VpnConnectionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ec2VpnConnectionMod.VpnConnection = js.native
}

