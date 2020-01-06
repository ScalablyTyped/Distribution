package typings.atPulumiAws.pinpointEmailChannelMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailChannelArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: Input[String] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The email address used to send emails from.
    */
  val fromAddress: Input[String] = js.native
  /**
    * The ARN of an identity verified with SES.
    */
  val identity: Input[String] = js.native
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
    */
  val roleArn: Input[String] = js.native
}

object EmailChannelArgs {
  @scala.inline
  def apply(
    applicationId: Input[String],
    fromAddress: Input[String],
    identity: Input[String],
    roleArn: Input[String],
    enabled: Input[Boolean] = null
  ): EmailChannelArgs = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], fromAddress = fromAddress.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailChannelArgs]
  }
}

