package typings.sipDotJs.libApiReferrerDashDelegateMod

import typings.sipDotJs.libApiNotificationMod.Notification
import typings.sipDotJs.libCoreMessagesIncomingDashResponseMod.IncomingResponse
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferrerDelegate extends OutgoingRequestDelegate {
  def onNotify(notification: Notification): Unit
}

object ReferrerDelegate {
  @scala.inline
  def apply(
    onNotify: Notification => Unit,
    onAccept: /* response */ IncomingResponse => Unit = null,
    onProgress: /* response */ IncomingResponse => Unit = null,
    onRedirect: /* response */ IncomingResponse => Unit = null,
    onReject: /* response */ IncomingResponse => Unit = null,
    onTrying: /* response */ IncomingResponse => Unit = null
  ): ReferrerDelegate = {
    val __obj = js.Dynamic.literal(onNotify = js.Any.fromFunction1(onNotify))
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1(onAccept))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRedirect != null) __obj.updateDynamic("onRedirect")(js.Any.fromFunction1(onRedirect))
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1(onReject))
    if (onTrying != null) __obj.updateDynamic("onTrying")(js.Any.fromFunction1(onTrying))
    __obj.asInstanceOf[ReferrerDelegate]
  }
}

