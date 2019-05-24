package typings
package sipDotJsLib.libCoreMessagesMethodsInviteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingInviteRequestDelegate
  extends sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate {
  /**
    * Received a 2xx positive final response to this request.
    * @param response Incoming response (including a confirmed Session).
    */
  @JSName("onAccept")
  var onAccept_OutgoingInviteRequestDelegate: js.UndefOr[js.Function1[/* response */ AckableIncomingResponseWithSession, scala.Unit]] = js.undefined
  /**
    * Received a 1xx provisional response to this request. Excluding 100 responses.
    * @param response Incoming response (including an early Session).
    */
  @JSName("onProgress")
  var onProgress_OutgoingInviteRequestDelegate: js.UndefOr[js.Function1[/* response */ PrackableIncomingResponseWithSession, scala.Unit]] = js.undefined
}

object OutgoingInviteRequestDelegate {
  @scala.inline
  def apply(
    onAccept: /* response */ AckableIncomingResponseWithSession => scala.Unit = null,
    onProgress: /* response */ PrackableIncomingResponseWithSession => scala.Unit = null,
    onRedirect: /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse => scala.Unit = null,
    onReject: /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse => scala.Unit = null,
    onTrying: /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse => scala.Unit = null
  ): OutgoingInviteRequestDelegate = {
    val __obj = js.Dynamic.literal()
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1(onAccept))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRedirect != null) __obj.updateDynamic("onRedirect")(js.Any.fromFunction1(onRedirect))
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1(onReject))
    if (onTrying != null) __obj.updateDynamic("onTrying")(js.Any.fromFunction1(onTrying))
    __obj.asInstanceOf[OutgoingInviteRequestDelegate]
  }
}

