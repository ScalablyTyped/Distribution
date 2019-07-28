package typings.atPulumiAws.pinpointSmsChannelMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/smsChannel", "SmsChannel")
@js.native
class SmsChannel protected () extends CustomResource {
  /**
    * Create a SmsChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: SmsChannelArgs) = this()
  def this(name: String, args: SmsChannelArgs, opts: CustomResourceOptions) = this()
  /**
    * The application ID.
    */
  val applicationId: Output[String] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * Promotional messages per second that can be sent.
    */
  val promotionalMessagesPerSecond: Output[Double] = js.native
  /**
    * Sender identifier of your messages.
    */
  val senderId: Output[js.UndefOr[String]] = js.native
  /**
    * The Short Code registered with the phone provider.
    */
  val shortCode: Output[js.UndefOr[String]] = js.native
  /**
    * Transactional messages per second that can be sent.
    */
  val transactionalMessagesPerSecond: Output[Double] = js.native
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
  def get(name: String, id: Input[ID]): SmsChannel = js.native
  def get(name: String, id: Input[ID], state: SmsChannelState): SmsChannel = js.native
  def get(name: String, id: Input[ID], state: SmsChannelState, opts: CustomResourceOptions): SmsChannel = js.native
  /**
    * Returns true if the given object is an instance of SmsChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/smsChannel.SmsChannel */ Boolean = js.native
}

