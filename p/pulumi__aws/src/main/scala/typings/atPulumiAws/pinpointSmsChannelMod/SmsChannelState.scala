package typings.atPulumiAws.pinpointSmsChannelMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmsChannelState extends js.Object {
  /**
    * The application ID.
    */
  val applicationId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether the channel is enabled or disabled. Defaults to `true`.
    */
  val enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Promotional messages per second that can be sent.
    */
  val promotionalMessagesPerSecond: js.UndefOr[Input[Double]] = js.native
  /**
    * Sender identifier of your messages.
    */
  val senderId: js.UndefOr[Input[String]] = js.native
  /**
    * The Short Code registered with the phone provider.
    */
  val shortCode: js.UndefOr[Input[String]] = js.native
  /**
    * Transactional messages per second that can be sent.
    */
  val transactionalMessagesPerSecond: js.UndefOr[Input[Double]] = js.native
}

object SmsChannelState {
  @scala.inline
  def apply(
    applicationId: Input[String] = null,
    enabled: Input[Boolean] = null,
    promotionalMessagesPerSecond: Input[Double] = null,
    senderId: Input[String] = null,
    shortCode: Input[String] = null,
    transactionalMessagesPerSecond: Input[Double] = null
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

