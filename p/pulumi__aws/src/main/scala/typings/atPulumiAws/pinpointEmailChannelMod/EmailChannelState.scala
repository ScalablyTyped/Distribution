package typings.atPulumiAws.pinpointEmailChannelMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailChannelState extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The email address used to send emails from.
    */
  val fromAddress: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of an identity verified with SES.
    */
  val identity: js.UndefOr[Input[String]] = js.native
  /**
    * Messages per second that can be sent.
    */
  val messagesPerSecond: js.UndefOr[Input[Double]] = js.native
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}

object EmailChannelState {
  @scala.inline
  def apply(
    applicationId: Input[String] = null,
    enabled: Input[Boolean] = null,
    fromAddress: Input[String] = null,
    identity: Input[String] = null,
    messagesPerSecond: Input[Double] = null,
    roleArn: Input[String] = null
  ): EmailChannelState = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fromAddress != null) __obj.updateDynamic("fromAddress")(fromAddress.asInstanceOf[js.Any])
    if (identity != null) __obj.updateDynamic("identity")(identity.asInstanceOf[js.Any])
    if (messagesPerSecond != null) __obj.updateDynamic("messagesPerSecond")(messagesPerSecond.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailChannelState]
  }
}

