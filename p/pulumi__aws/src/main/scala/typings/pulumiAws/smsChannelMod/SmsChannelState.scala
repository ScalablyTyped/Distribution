package typings.pulumiAws.smsChannelMod

import typings.pulumiPulumi.outputMod.Input
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
  def apply(): SmsChannelState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SmsChannelState]
  }
  @scala.inline
  implicit class SmsChannelStateOps[Self <: SmsChannelState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplicationId(value: Input[String]): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setPromotionalMessagesPerSecond(value: Input[Double]): Self = this.set("promotionalMessagesPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePromotionalMessagesPerSecond: Self = this.set("promotionalMessagesPerSecond", js.undefined)
    @scala.inline
    def setSenderId(value: Input[String]): Self = this.set("senderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderId: Self = this.set("senderId", js.undefined)
    @scala.inline
    def setShortCode(value: Input[String]): Self = this.set("shortCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortCode: Self = this.set("shortCode", js.undefined)
    @scala.inline
    def setTransactionalMessagesPerSecond(value: Input[Double]): Self = this.set("transactionalMessagesPerSecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransactionalMessagesPerSecond: Self = this.set("transactionalMessagesPerSecond", js.undefined)
  }
  
}

