package typings.atPulumiAws.pinpointEmailChannelMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/pinpoint/emailChannel", "EmailChannel")
@js.native
class EmailChannel protected () extends CustomResource {
  /**
    * Create a EmailChannel resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EmailChannelArgs) = this()
  def this(name: String, args: EmailChannelArgs, opts: CustomResourceOptions) = this()
  /**
    * The application ID.
    */
  val applicationId: Output[String] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The email address used to send emails from.
    */
  val fromAddress: Output[String] = js.native
  /**
    * The ARN of an identity verified with SES.
    */
  val identity: Output[String] = js.native
  /**
    * Messages per second that can be sent.
    */
  val messagesPerSecond: Output[Double] = js.native
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
    */
  val roleArn: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/pinpoint/emailChannel", "EmailChannel")
@js.native
object EmailChannel extends js.Object {
  /**
    * Get an existing EmailChannel resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): EmailChannel = js.native
  def get(name: String, id: Input[ID], state: EmailChannelState): EmailChannel = js.native
  def get(name: String, id: Input[ID], state: EmailChannelState, opts: CustomResourceOptions): EmailChannel = js.native
  /**
    * Returns true if the given object is an instance of EmailChannel.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/pinpoint/emailChannel.EmailChannel */ Boolean = js.native
}

