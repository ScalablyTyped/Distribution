package typings
package sipDotJsLib.libCoreMessagesOutgoingDashRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingRequestDelegate extends js.Object {
  /**
    * Received a 2xx positive final response to this request.
    * @param response Incoming response.
    */
  var onAccept: js.UndefOr[
    js.Function1[
      /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Received a 1xx provisional response to this request. Excluding 100 responses.
    * @param response Incoming response.
    */
  var onProgress: js.UndefOr[
    js.Function1[
      /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Received a 3xx negative final response to this request.
    * @param response Incoming response.
    */
  var onRedirect: js.UndefOr[
    js.Function1[
      /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Received a 4xx, 5xx, or 6xx negative final response to this request.
    * @param response Incoming response.
    */
  var onReject: js.UndefOr[
    js.Function1[
      /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse, 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * Received a 100 provisional response.
    * @param response Incoming response.
    */
  var onTrying: js.UndefOr[
    js.Function1[
      /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse, 
      scala.Unit
    ]
  ] = js.undefined
}

object OutgoingRequestDelegate {
  @scala.inline
  def apply(
    onAccept: /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse => scala.Unit = null,
    onProgress: /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse => scala.Unit = null,
    onRedirect: /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse => scala.Unit = null,
    onReject: /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse => scala.Unit = null,
    onTrying: /* response */ sipDotJsLib.libCoreMessagesIncomingDashResponseMod.IncomingResponse => scala.Unit = null
  ): OutgoingRequestDelegate = {
    val __obj = js.Dynamic.literal()
    if (onAccept != null) __obj.updateDynamic("onAccept")(js.Any.fromFunction1(onAccept))
    if (onProgress != null) __obj.updateDynamic("onProgress")(js.Any.fromFunction1(onProgress))
    if (onRedirect != null) __obj.updateDynamic("onRedirect")(js.Any.fromFunction1(onRedirect))
    if (onReject != null) __obj.updateDynamic("onReject")(js.Any.fromFunction1(onReject))
    if (onTrying != null) __obj.updateDynamic("onTrying")(js.Any.fromFunction1(onTrying))
    __obj.asInstanceOf[OutgoingRequestDelegate]
  }
}

