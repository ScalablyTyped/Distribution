package typings.atPulumiAws.directconnectHostedPublicVirtualInterfaceMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/hostedPublicVirtualInterface", "HostedPublicVirtualInterface")
@js.native
class HostedPublicVirtualInterface protected () extends CustomResource {
  /**
    * Create a HostedPublicVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: HostedPublicVirtualInterfaceArgs) = this()
  def this(name: String, args: HostedPublicVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: Output[String] = js.native
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: Output[String] = js.native
  /**
    * The ARN of the virtual interface.
    */
  val arn: Output[String] = js.native
  /**
    * The Direct Connect endpoint on which the virtual interface terminates.
    */
  val awsDevice: Output[String] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: Output[Double] = js.native
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: Output[String] = js.native
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: Output[String] = js.native
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: Output[String] = js.native
  /**
    * The name for the virtual interface.
    */
  val name: Output[String] = js.native
  /**
    * The AWS account that will own the new virtual interface.
    */
  val ownerAccountId: Output[String] = js.native
  /**
    * A list of routes to be advertised to the AWS network in this region.
    */
  val routeFilterPrefixes: Output[js.Array[String]] = js.native
  /**
    * The VLAN ID.
    */
  val vlan: Output[Double] = js.native
}

/* static members */
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
  def get(name: String, id: Input[ID]): HostedPublicVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceState): HostedPublicVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: HostedPublicVirtualInterfaceState, opts: CustomResourceOptions): HostedPublicVirtualInterface = js.native
  /**
    * Returns true if the given object is an instance of HostedPublicVirtualInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/hostedPublicVirtualInterface.HostedPublicVirtualInterface */ Boolean = js.native
}

