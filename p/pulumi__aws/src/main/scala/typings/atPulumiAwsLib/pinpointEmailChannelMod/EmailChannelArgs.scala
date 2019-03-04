package typings
package atPulumiAwsLib.pinpointEmailChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailChannelArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The email address used to send emails from.
    */
  val fromAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ARN of an identity verified with SES.
    */
  val identity: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ARN of an IAM Role used to submit events to Mobile Analytics' event ingestion service.
    */
  val roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object EmailChannelArgs {
  @scala.inline
  def apply(
    applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    fromAddress: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    identity: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): EmailChannelArgs = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any], fromAddress = fromAddress.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailChannelArgs]
  }
}

