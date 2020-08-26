package typings.pulumiAws.publicVirtualInterfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/publicVirtualInterface", "PublicVirtualInterface")
@js.native
class PublicVirtualInterface protected () extends CustomResource {
  /**
    * Create a PublicVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PublicVirtualInterfaceArgs) = this()
  def this(name: String, args: PublicVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: Output_[String] = js.native
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon. Required for IPv4 BGP peers.
    */
  val amazonAddress: Output_[String] = js.native
  val amazonSideAsn: Output_[String] = js.native
  /**
    * The ARN of the virtual interface.
    */
  val arn: Output_[String] = js.native
  /**
    * The Direct Connect endpoint on which the virtual interface terminates.
    */
  val awsDevice: Output_[String] = js.native
  /**
    * The autonomous system (AS) number for Border Gateway Protocol (BGP) configuration.
    */
  val bgpAsn: Output_[Double] = js.native
  /**
    * The authentication key for BGP configuration.
    */
  val bgpAuthKey: Output_[String] = js.native
  /**
    * The ID of the Direct Connect connection (or LAG) on which to create the virtual interface.
    */
  val connectionId: Output_[String] = js.native
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic. Required for IPv4 BGP peers.
    */
  val customerAddress: Output_[String] = js.native
  /**
    * The name for the virtual interface.
    */
  val name: Output_[String] = js.native
  /**
    * A list of routes to be advertised to the AWS network in this region.
    */
  val routeFilterPrefixes: Output_[js.Array[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The VLAN ID.
    */
  val vlan: Output_[Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/publicVirtualInterface", "PublicVirtualInterface")
@js.native
object PublicVirtualInterface extends js.Object {
  /**
    * Get an existing PublicVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): PublicVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): PublicVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState): PublicVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState, opts: CustomResourceOptions): PublicVirtualInterface = js.native
  /**
    * Returns true if the given object is an instance of PublicVirtualInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/publicVirtualInterface.PublicVirtualInterface */ Boolean = js.native
}

