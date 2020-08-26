package typings.sipJs.subscribeMod

import typings.sipJs.notifyMod.IncomingNotifyRequest
import typings.sipJs.subscriptionSubscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingRequestWithSubscription extends js.Object {
  /** The NOTIFY request which established the subscription. */
  val request: IncomingNotifyRequest = js.native
  /** If subscription state is not "terminated", then the subscription. Otherwise undefined. */
  val subscription: js.UndefOr[Subscription] = js.native
}

object IncomingRequestWithSubscription {
  @scala.inline
  def apply(request: IncomingNotifyRequest): IncomingRequestWithSubscription = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingRequestWithSubscription]
  }
  @scala.inline
  implicit class IncomingRequestWithSubscriptionOps[Self <: IncomingRequestWithSubscription] (val x: Self) extends AnyVal {
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
    def setRequest(value: IncomingNotifyRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: Subscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
  }
  
}

