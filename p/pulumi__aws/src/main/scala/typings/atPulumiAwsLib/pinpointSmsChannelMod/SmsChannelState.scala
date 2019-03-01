package typings
package atPulumiAwsLib.pinpointSmsChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsChannelState extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * Promotional messages per second that can be sent.
    */
  val promotionalMessagesPerSecond: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * Sender identifier of your messages.
    */
  val senderId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Short Code registered with the phone provider.
    */
  val shortCode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Transactional messages per second that can be sent.
    */
  val transactionalMessagesPerSecond: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object SmsChannelState {
  @scala.inline
  def apply(
    applicationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    enabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    promotionalMessagesPerSecond: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    senderId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    shortCode: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    transactionalMessagesPerSecond: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): SmsChannelState = {
    val __obj = js.Dynamic.literal()
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (promotionalMessagesPerSecond != null) __obj.updateDynamic("promotionalMessagesPerSecond")(promotionalMessagesPerSecond.asInstanceOf[js.Any])
    if (senderId != null) __obj.updateDynamic("senderId")(senderId.asInstanceOf[js.Any])
    if (shortCode != null) __obj.updateDynamic("shortCode")(shortCode.asInstanceOf[js.Any])
    if (transactionalMessagesPerSecond != null) __obj.updateDynamic("transactionalMessagesPerSecond")(transactionalMessagesPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsChannelState]
  }
}

