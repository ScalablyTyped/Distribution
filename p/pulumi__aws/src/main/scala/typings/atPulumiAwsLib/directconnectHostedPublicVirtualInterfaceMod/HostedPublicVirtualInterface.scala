package typings
package atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/hostedPublicVirtualInterface", "HostedPublicVirtualInterface")
@js.native
class HostedPublicVirtualInterface protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a HostedPublicVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: HostedPublicVirtualInterfaceArgs) = this()
  def this(name: java.lang.String, args: HostedPublicVirtualInterfaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ARN of the virtual interface.
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name for the virtual interface.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * A list of routes to be advertised to the AWS network in this region.
    */
  val routeFilterPrefixes: atPulumiPulumiLib.pulumiMod.Output[js.Array[java.lang.String]] = js.native
  /**
    * The VLAN ID.
    */
  val vlan: atPulumiPulumiLib.pulumiMod.Output[scala.Double] = js.native
}

@JSImport("@pulumi/aws/directconnect/hostedPublicVirtualInterface", "HostedPublicVirtualInterface")
@js.native
object HostedPublicVirtualInterface extends js.Object {
  /**
    * Get an existing HostedPublicVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceState
  ): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterfaceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.directconnectHostedPublicVirtualInterfaceMod.HostedPublicVirtualInterface = js.native
}

