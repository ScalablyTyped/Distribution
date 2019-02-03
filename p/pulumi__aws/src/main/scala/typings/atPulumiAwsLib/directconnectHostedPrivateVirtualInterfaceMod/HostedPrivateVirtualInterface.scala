package typings
package atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterface", "HostedPrivateVirtualInterface")
@js.native
class HostedPrivateVirtualInterface protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a HostedPrivateVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: HostedPrivateVirtualInterfaceArgs) = this()
  def this(name: java.lang.String, args: HostedPrivateVirtualInterfaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ARN of the virtual interface.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  val jumboFrameCapable: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Boolean] = js.native
  /**
    * The maximum transmission unit (MTU) is the size, in bytes, of the largest permissible packet that can be passed over the connection. The MTU of a virtual private interface can be either `1500` or `9001` (jumbo frames). Default is `1500`.
    */
  val mtu: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The name for the virtual interface.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The VLAN ID.
    */
  val vlan: atPulumiPulumiLib.atPulumiPulumiMod.Output[scala.Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/hostedPrivateVirtualInterface", "HostedPrivateVirtualInterface")
@js.native
object HostedPrivateVirtualInterface extends js.Object {
  /**
    * Get an existing HostedPrivateVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceState
  ): atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterfaceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directconnectHostedPrivateVirtualInterfaceMod.HostedPrivateVirtualInterface = js.native
}

