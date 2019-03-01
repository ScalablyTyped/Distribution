package typings
package atPulumiAwsLib.pinpointEmailChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailChannelState extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The email address used to send emails from.
    */
  val fromAddress: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ARN of an identity verified with SES.
    */
  val identity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Messages per second that can be sent.
    */
  val messagesPerSecond: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object EmailChannelState {
  @scala.inline
  def apply(
    applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    fromAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    identity: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    messagesPerSecond: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

