package typings
package atPulumiAwsLib.pinpointGcmChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/gcmChannel", "GcmChannel")
@js.native
class GcmChannel protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a GcmChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: GcmChannelArgs) = this()
  def this(name: java.lang.String, args: GcmChannelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Platform credential API key from Google.
    */
  val apiKey: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.pinpointGcmChannelMod.GcmChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointGcmChannelMod.GcmChannelState
  ): atPulumiAwsLib.pinpointGcmChannelMod.GcmChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointGcmChannelMod.GcmChannelState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.pinpointGcmChannelMod.GcmChannel = js.native
  /**
    * Returns true if the given object is an instance of GcmChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/gcmChannel.GcmChannel */ scala.Boolean = js.native
}

