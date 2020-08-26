package typings.pulumiAws.smsChannelMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
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
  val applicationId: Output_[String] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * Promotional messages per second that can be sent.
    */
  val promotionalMessagesPerSecond: Output_[Double] = js.native
  /**
    * Sender identifier of your messages.
    */
  val senderId: Output_[js.UndefOr[String]] = js.native
  /**
    * The Short Code registered with the phone provider.
    */
  val shortCode: Output_[js.UndefOr[String]] = js.native
  /**
    * Transactional messages per second that can be sent.
    */
  val transactionalMessagesPerSecond: Output_[Double] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): SmsChannel = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SmsChannel = js.native
  def get(name: String, id: Input[ID], state: SmsChannelState): SmsChannel = js.native
  def get(name: String, id: Input[ID], state: SmsChannelState, opts: CustomResourceOptions): SmsChannel = js.native
  /**
    * Returns true if the given object is an instance of SmsChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/smsChannel.SmsChannel */ Boolean = js.native
}

