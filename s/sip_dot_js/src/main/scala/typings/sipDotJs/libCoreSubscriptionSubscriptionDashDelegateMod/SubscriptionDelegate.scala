package typings.sipDotJs.libCoreSubscriptionSubscriptionDashDelegateMod

import typings.sipDotJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typings.sipDotJs.libCoreMessagesMethodsSubscribeMod.OutgoingSubscribeRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionDelegate extends js.Object {
  /**
    * Receive NOTIFY request. This includes in dialog NOTIFY requests only.
    * Thus the first NOTIFY (the subscription creating NOTIFY) will not be provided.
    * https://tools.ietf.org/html/rfc6665#section-4.1.3
    * @param request - Incoming NOTIFY request.
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingNotifyRequest, Unit]] = js.undefined
  /**
    * Sent a SUBSCRIBE request. This includes "auto refresh" in dialog SUBSCRIBE requests only.
    * Thus SUBSCRIBE requests triggered by calls to `refresh()` or `subscribe()` will not be provided.
    * Thus the first SUBSCRIBE (the subscription creating SUBSCRIBE) will not be provided.
    * @param request - Outgoing SUBSCRIBE request.
    */
  var onRefresh: js.UndefOr[js.Function1[/* request */ OutgoingSubscribeRequest, Unit]] = js.undefined
  /**
    * Subscription termination. This includes non-NOTIFY termination causes only.
    * Thus this will not be called if a NOTIFY is the cause of termination.
    * https://tools.ietf.org/html/rfc6665#section-4.4.1
    */
  var onTerminated: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SubscriptionDelegate {
  @scala.inline
  def apply(
    onNotify: /* request */ IncomingNotifyRequest => Unit = null,
    onRefresh: /* request */ OutgoingSubscribeRequest => Unit = null,
    onTerminated: () => Unit = null
  ): SubscriptionDelegate = {
    val __obj = js.Dynamic.literal()
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1(onNotify))
    if (onRefresh != null) __obj.updateDynamic("onRefresh")(js.Any.fromFunction1(onRefresh))
    if (onTerminated != null) __obj.updateDynamic("onTerminated")(js.Any.fromFunction0(onTerminated))
    __obj.asInstanceOf[SubscriptionDelegate]
  }
}

