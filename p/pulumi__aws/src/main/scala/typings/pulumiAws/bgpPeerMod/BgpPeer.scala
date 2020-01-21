package typings.pulumiAws.bgpPeerMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer")
@js.native
class BgpPeer protected () extends CustomResource {
  /**
    * Create a BgpPeer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BgpPeerArgs) = this()
  def this(name: String, args: BgpPeerArgs, opts: CustomResourceOptions) = this()
  /**
    * The address family for the BGP peer. `ipv4 ` or `ipv6`.
    */
  val addressFamily: Output_[String] = js.native
  /**
    * The IPv4 CIDR address to use to send traffic to Amazon.
    * Required for IPv4 BGP peers on public virtual interfaces.
    */
  val amazonAddress: Output_[String] = js.native
  /**
    * The Direct Connect endpoint on which the BGP peer terminates.
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
    * The ID of the BGP peer.
    */
  val bgpPeerId: Output_[String] = js.native
  /**
    * The Up/Down state of the BGP peer.
    */
  val bgpStatus: Output_[String] = js.native
  /**
    * The IPv4 CIDR destination address to which Amazon should send traffic.
    * Required for IPv4 BGP peers on public virtual interfaces.
    */
  val customerAddress: Output_[String] = js.native
  /**
    * The ID of the Direct Connect virtual interface on which to create the BGP peer.
    */
  val virtualInterfaceId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/directconnect/bgpPeer", "BgpPeer")
@js.native
object BgpPeer extends js.Object {
  /**
    * Get an existing BgpPeer resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): BgpPeer = js.native
  def get(name: String, id: Input[ID], state: BgpPeerState): BgpPeer = js.native
  def get(name: String, id: Input[ID], state: BgpPeerState, opts: CustomResourceOptions): BgpPeer = js.native
  /**
    * Returns true if the given object is an instance of BgpPeer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/bgpPeer.BgpPeer */ Boolean = js.native
}

