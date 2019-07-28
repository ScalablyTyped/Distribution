package typings.atPulumiAws.ec2VpnConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AcceptedRouteCount
import typings.atPulumiAws.Anon_DestinationCidrBlock
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/vpnConnection", "VpnConnection")
@js.native
class VpnConnection protected () extends CustomResource {
  /**
    * Create a VpnConnection resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpnConnectionArgs) = this()
  def this(name: String, args: VpnConnectionArgs, opts: CustomResourceOptions) = this()
  /**
    * The configuration information for the VPN connection's customer gateway (in the native XML format).
    */
  val customerGatewayConfiguration: Output[String] = js.native
  /**
    * The ID of the customer gateway.
    */
  val customerGatewayId: Output[String] = js.native
  val routes: Output[js.Array[Anon_DestinationCidrBlock]] = js.native
  /**
    * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
    */
  val staticRoutesOnly: Output[Boolean] = js.native
  /**
    * Tags to apply to the connection.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * When associated with an EC2 Transit Gateway (`transit_gateway_id` argument), the attachment ID.
    */
  val transitGatewayAttachmentId: Output[String] = js.native
  /**
    * The ID of the EC2 Transit Gateway.
    */
  val transitGatewayId: Output[js.UndefOr[String]] = js.native
  /**
    * The public IP address of the first VPN tunnel.
    */
  val tunnel1Address: Output[String] = js.native
  /**
    * The bgp asn number of the first VPN tunnel.
    */
  val tunnel1BgpAsn: Output[String] = js.native
  /**
    * The bgp holdtime of the first VPN tunnel.
    */
  val tunnel1BgpHoldtime: Output[Double] = js.native
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (Customer Gateway Side).
    */
  val tunnel1CgwInsideAddress: Output[String] = js.native
  /**
    * The CIDR block of the inside IP addresses for the first VPN tunnel.
    */
  val tunnel1InsideCidr: Output[String] = js.native
  /**
    * The preshared key of the first VPN tunnel.
    */
  val tunnel1PresharedKey: Output[String] = js.native
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (VPN Gateway Side).
    */
  val tunnel1VgwInsideAddress: Output[String] = js.native
  /**
    * The public IP address of the second VPN tunnel.
    */
  val tunnel2Address: Output[String] = js.native
  /**
    * The bgp asn number of the second VPN tunnel.
    */
  val tunnel2BgpAsn: Output[String] = js.native
  /**
    * The bgp holdtime of the second VPN tunnel.
    */
  val tunnel2BgpHoldtime: Output[Double] = js.native
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (Customer Gateway Side).
    */
  val tunnel2CgwInsideAddress: Output[String] = js.native
  /**
    * The CIDR block of the second IP addresses for the first VPN tunnel.
    */
  val tunnel2InsideCidr: Output[String] = js.native
  /**
    * The preshared key of the second VPN tunnel.
    */
  val tunnel2PresharedKey: Output[String] = js.native
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (VPN Gateway Side).
    */
  val tunnel2VgwInsideAddress: Output[String] = js.native
  /**
    * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: Output[String] = js.native
  val vgwTelemetries: Output[js.Array[Anon_AcceptedRouteCount]] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: Output[js.UndefOr[String]] = js.native
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
  def get(name: String, id: Input[ID]): VpnConnection = js.native
  def get(name: String, id: Input[ID], state: VpnConnectionState): VpnConnection = js.native
  def get(name: String, id: Input[ID], state: VpnConnectionState, opts: CustomResourceOptions): VpnConnection = js.native
  /**
    * Returns true if the given object is an instance of VpnConnection.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnConnection.VpnConnection */ Boolean = js.native
}

