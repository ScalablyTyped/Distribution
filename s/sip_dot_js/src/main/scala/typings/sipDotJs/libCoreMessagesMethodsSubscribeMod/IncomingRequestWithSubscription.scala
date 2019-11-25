package typings.sipDotJs.libCoreMessagesMethodsSubscribeMod

import typings.sipDotJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typings.sipDotJs.libCoreSubscriptionSubscriptionMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingRequestWithSubscription extends js.Object {
  /** The NOTIFY request which established the subscription. */
  val request: IncomingNotifyRequest
  /** If subscription state is not "terminated", then the subscription. Otherwise undefined. */
  val subscription: js.UndefOr[Subscription] = js.undefined
}

object IncomingRequestWithSubscription {
  @scala.inline
  def apply(request: IncomingNotifyRequest, subscription: Subscription = null): IncomingRequestWithSubscription = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncomingRequestWithSubscription]
  }
}

