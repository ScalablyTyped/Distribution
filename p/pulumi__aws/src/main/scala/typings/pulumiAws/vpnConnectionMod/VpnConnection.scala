package typings.pulumiAws.vpnConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.ec2.VpnConnectionRoute
import typings.pulumiAws.outputMod.ec2.VpnConnectionVgwTelemetry
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
    * Amazon Resource Name (ARN) of the VPN Connection.
    */
  val arn: Output_[String] = js.native
  /**
    * The configuration information for the VPN connection's customer gateway (in the native XML format).
    */
  val customerGatewayConfiguration: Output_[String] = js.native
  /**
    * The ID of the customer gateway.
    */
  val customerGatewayId: Output_[String] = js.native
  val routes: Output_[js.Array[VpnConnectionRoute]] = js.native
  /**
    * Whether the VPN connection uses static routes exclusively. Static routes must be used for devices that don't support BGP.
    */
  val staticRoutesOnly: Output_[Boolean] = js.native
  /**
    * Tags to apply to the connection.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * When associated with an EC2 Transit Gateway (`transitGatewayId` argument), the attachment ID.
    */
  val transitGatewayAttachmentId: Output_[String] = js.native
  /**
    * The ID of the EC2 Transit Gateway.
    */
  val transitGatewayId: Output_[js.UndefOr[String]] = js.native
  /**
    * The public IP address of the first VPN tunnel.
    */
  val tunnel1Address: Output_[String] = js.native
  /**
    * The bgp asn number of the first VPN tunnel.
    */
  val tunnel1BgpAsn: Output_[String] = js.native
  /**
    * The bgp holdtime of the first VPN tunnel.
    */
  val tunnel1BgpHoldtime: Output_[Double] = js.native
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (Customer Gateway Side).
    */
  val tunnel1CgwInsideAddress: Output_[String] = js.native
  /**
    * The CIDR block of the inside IP addresses for the first VPN tunnel.
    */
  val tunnel1InsideCidr: Output_[String] = js.native
  /**
    * The preshared key of the first VPN tunnel.
    */
  val tunnel1PresharedKey: Output_[String] = js.native
  /**
    * The RFC 6890 link-local address of the first VPN tunnel (VPN Gateway Side).
    */
  val tunnel1VgwInsideAddress: Output_[String] = js.native
  /**
    * The public IP address of the second VPN tunnel.
    */
  val tunnel2Address: Output_[String] = js.native
  /**
    * The bgp asn number of the second VPN tunnel.
    */
  val tunnel2BgpAsn: Output_[String] = js.native
  /**
    * The bgp holdtime of the second VPN tunnel.
    */
  val tunnel2BgpHoldtime: Output_[Double] = js.native
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (Customer Gateway Side).
    */
  val tunnel2CgwInsideAddress: Output_[String] = js.native
  /**
    * The CIDR block of the inside IP addresses for the second VPN tunnel.
    */
  val tunnel2InsideCidr: Output_[String] = js.native
  /**
    * The preshared key of the second VPN tunnel.
    */
  val tunnel2PresharedKey: Output_[String] = js.native
  /**
    * The RFC 6890 link-local address of the second VPN tunnel (VPN Gateway Side).
    */
  val tunnel2VgwInsideAddress: Output_[String] = js.native
  /**
    * The type of VPN connection. The only type AWS supports at this time is "ipsec.1".
    */
  val `type`: Output_[String] = js.native
  val vgwTelemetries: Output_[js.Array[VpnConnectionVgwTelemetry]] = js.native
  /**
    * The ID of the Virtual Private Gateway.
    */
  val vpnGatewayId: Output_[js.UndefOr[String]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VpnConnection = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpnConnection = js.native
  def get(name: String, id: Input[ID], state: VpnConnectionState): VpnConnection = js.native
  def get(name: String, id: Input[ID], state: VpnConnectionState, opts: CustomResourceOptions): VpnConnection = js.native
  /**
    * Returns true if the given object is an instance of VpnConnection.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/vpnConnection.VpnConnection */ Boolean = js.native
}

