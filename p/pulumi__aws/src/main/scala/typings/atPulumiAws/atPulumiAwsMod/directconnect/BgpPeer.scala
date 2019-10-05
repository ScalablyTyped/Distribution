package typings.atPulumiAws.atPulumiAwsMod.directconnect

import typings.atPulumiAws.directconnectBgpPeerMod.BgpPeerArgs
import typings.atPulumiAws.directconnectBgpPeerMod.BgpPeerState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "directconnect.BgpPeer")
@js.native
class BgpPeer protected ()
  extends typings.atPulumiAws.directconnectMod.BgpPeer {
  /**
    * Create a BgpPeer resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: BgpPeerArgs) = this()
  def this(name: String, args: BgpPeerArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "directconnect.BgpPeer")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.directconnectBgpPeerMod.BgpPeer = js.native
  def get(name: String, id: Input[ID], state: BgpPeerState): typings.atPulumiAws.directconnectBgpPeerMod.BgpPeer = js.native
  def get(name: String, id: Input[ID], state: BgpPeerState, opts: CustomResourceOptions): typings.atPulumiAws.directconnectBgpPeerMod.BgpPeer = js.native
  /**
    * Returns true if the given object is an instance of BgpPeer.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/bgpPeer.BgpPeer */ Boolean = js.native
}

