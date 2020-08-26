package typings.pulumiAws.gcmChannelMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/gcmChannel", "GcmChannel")
@js.native
class GcmChannel protected () extends CustomResource {
  /**
    * Create a GcmChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: GcmChannelArgs) = this()
  def this(name: String, args: GcmChannelArgs, opts: CustomResourceOptions) = this()
  /**
    * Platform credential API key from Google.
    */
  val apiKey: Output_[String] = js.native
  /**
    * The application ID.
    */
  val applicationId: Output_[String] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/pinpoint/gcmChannel", "GcmChannel")
@js.native
object GcmChannel extends js.Object {
  /**
    * Get an existing GcmChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): GcmChannel = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): GcmChannel = js.native
  def get(name: String, id: Input[ID], state: GcmChannelState): GcmChannel = js.native
  def get(name: String, id: Input[ID], state: GcmChannelState, opts: CustomResourceOptions): GcmChannel = js.native
  /**
    * Returns true if the given object is an instance of GcmChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/gcmChannel.GcmChannel */ Boolean = js.native
}

