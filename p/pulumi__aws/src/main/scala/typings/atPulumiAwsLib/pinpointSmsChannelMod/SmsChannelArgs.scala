package typings
package atPulumiAwsLib.pinpointSmsChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsChannelArgs extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Sender identifier of your messages.
    */
  val senderId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Short Code registered with the phone provider.
    */
  val shortCode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object SmsChannelArgs {
  @scala.inline
  def apply(
    applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    senderId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    shortCode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): SmsChannelArgs = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (senderId != null) __obj.updateDynamic("senderId")(senderId.asInstanceOf[js.Any])
    if (shortCode != null) __obj.updateDynamic("shortCode")(shortCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsChannelArgs]
  }
}

