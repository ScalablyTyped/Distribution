package typings
package sipDotJsLib.libCoreMessagesMethodsSubscribeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingRequestWithSubscription extends js.Object {
  /** The NOTIFY request which established the subscription. */
  val request: sipDotJsLib.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
  /** If subscription state is not "terminated", then the subscription. Otherwise undefined. */
  val subscription: js.UndefOr[sipDotJsLib.libCoreSubscriptionSubscriptionMod.Subscription] = js.undefined
}

object IncomingRequestWithSubscription {
  @scala.inline
  def apply(
    request: sipDotJsLib.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest,
    subscription: sipDotJsLib.libCoreSubscriptionSubscriptionMod.Subscription = null
  ): IncomingRequestWithSubscription = {
    val __obj = js.Dynamic.literal(request = request)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    __obj.asInstanceOf[IncomingRequestWithSubscription]
  }
}

