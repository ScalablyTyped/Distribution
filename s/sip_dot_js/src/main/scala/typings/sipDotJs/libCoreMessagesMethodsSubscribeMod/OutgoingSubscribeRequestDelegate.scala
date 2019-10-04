package typings.sipDotJs.libCoreMessagesMethodsSubscribeMod

import typings.sipDotJs.libCoreMessagesIncomingDashResponseMod.IncomingResponse
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingSubscribeRequestDelegate extends OutgoingRequestDelegate {
  /**
    * Received the initial subscription creating NOTIFY in response to this request.
    * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
    * @param request - Incoming NOTIFY request (including a Subscription).
    */
  var onNotify: js.UndefOr[js.Function1[/* request */ IncomingRequestWithSubscription, Unit]] = js.undefined
  /**
    * Timed out waiting to receive the initial subscription creating NOTIFY in response to this request.
    * Called for out of dialog SUBSCRIBE requests only (not called for re-SUBSCRIBE requests).
    */
  var onNotifyTimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object OutgoingSubscribeRequestDelegate {
  @scala.inline
  def apply(
    onAccept: /* response */ IncomingResponse => Unit = null,
    onNotify: /* request */ IncomingRequestWithSubscription => Unit = null,
    onNotifyTimeout: () => Unit = null,
    onProgress: /* response */ IncomingResponse => Unit = null,
    onRedirect: /* response */ IncomingResponse => Unit = null,
    onReject: /* response */ IncomingResponse => Unit = null,
    onTrying: /* response */ IncomingResponse => Unit = null
  ): OutgoingSubscribeRequestDelegate = {
    val __obj = js.Dynamic.literal()
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1(onAccept))
    if (onNotify != null) __obj.updateDynamic("onNotify")(js.Any.fromFunction1(onNotify))
    if (onNotifyTimeout != null) __obj.updateDynamic("onNotifyTimeout")(js.Any.fromFunction0(onNotifyTimeout))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRedirect != null) __obj.updateDynamic("onRedirect")(js.Any.fromFunction1(onRedirect))
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1(onReject))
    if (onTrying != null) __obj.updateDynamic("onTrying")(js.Any.fromFunction1(onTrying))
    __obj.asInstanceOf[OutgoingSubscribeRequestDelegate]
  }
}

