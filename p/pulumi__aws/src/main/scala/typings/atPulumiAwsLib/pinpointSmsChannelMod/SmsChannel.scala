package typings
package atPulumiAwsLib.pinpointSmsChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/smsChannel", "SmsChannel")
@js.native
class SmsChannel protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a SmsChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: SmsChannelArgs) = this()
  def this(name: java.lang.String, args: SmsChannelArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * Promotional messages per second that can be sent.
    */
  val promotionalMessagesPerSecond: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * Sender identifier of your messages.
    */
  val senderId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The Short Code registered with the phone provider.
    */
  val shortCode: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Transactional messages per second that can be sent.
    */
  val transactionalMessagesPerSecond: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
}

/* static members */
@JSImport("@pulumi/aws/pinpoint/smsChannel", "SmsChannel")
@js.native
object SmsChannel extends js.Object {
  /**
    * Get an existing SmsChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.pinpointSmsChannelMod.SmsChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointSmsChannelMod.SmsChannelState
  ): atPulumiAwsLib.pinpointSmsChannelMod.SmsChannel = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.pinpointSmsChannelMod.SmsChannelState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.pinpointSmsChannelMod.SmsChannel = js.native
  /**
    * Returns true if the given object is an instance of SmsChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/smsChannel.SmsChannel */ scala.Boolean = js.native
}

