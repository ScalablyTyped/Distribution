package typings.pulumiAws.pinpointMod

import typings.pulumiAws.apnsChannelMod.ApnsChannelArgs
import typings.pulumiAws.apnsChannelMod.ApnsChannelState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint", "ApnsChannel")
@js.native
class ApnsChannel protected ()
  extends typings.pulumiAws.apnsChannelMod.ApnsChannel {
  /**
    * Create a ApnsChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ApnsChannelArgs) = this()
  def this(name: String, args: ApnsChannelArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/pinpoint", "ApnsChannel")
@js.native
object ApnsChannel extends js.Object {
  /**
    * Get an existing ApnsChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.apnsChannelMod.ApnsChannel = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): typings.pulumiAws.apnsChannelMod.ApnsChannel = js.native
  def get(name: String, id: Input[ID], state: ApnsChannelState): typings.pulumiAws.apnsChannelMod.ApnsChannel = js.native
  def get(name: String, id: Input[ID], state: ApnsChannelState, opts: CustomResourceOptions): typings.pulumiAws.apnsChannelMod.ApnsChannel = js.native
  /**
    * Returns true if the given object is an instance of ApnsChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/apnsChannel.ApnsChannel */ Boolean = js.native
}

