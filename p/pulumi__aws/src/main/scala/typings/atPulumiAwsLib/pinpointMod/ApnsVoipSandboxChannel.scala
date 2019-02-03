package typings
package atPulumiAwsLib.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint", "ApnsVoipSandboxChannel")
@js.native
class ApnsVoipSandboxChannel protected ()
  extends atPulumiAwsLib.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannel {
  /**
    * Create a ApnsVoipSandboxChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: atPulumiAwsLib.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannelArgs) = this()
  def this(name: java.lang.String, args: atPulumiAwsLib.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/pinpoint", "ApnsVoipSandboxChannel")
@js.native
object ApnsVoipSandboxChannel extends js.Object {
  /**
    * Get an existing ApnsVoipSandboxChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannelState
  ): atPulumiAwsLib.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannelState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.pinpointApnsVoipSandboxChannelMod.ApnsVoipSandboxChannel = js.native
}

