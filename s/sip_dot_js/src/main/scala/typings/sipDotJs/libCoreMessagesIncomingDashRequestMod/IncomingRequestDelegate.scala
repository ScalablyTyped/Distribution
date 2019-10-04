package typings.sipDotJs.libCoreMessagesIncomingDashRequestMod

import typings.sipDotJs.libCoreExceptionsMod.TransportError
import typings.sipDotJs.libCoreMessagesIncomingDashRequestDashMessageMod.IncomingRequestMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingRequestDelegate extends js.Object {
  /**
    * Receive CANCEL request.
    * https://tools.ietf.org/html/rfc3261#section-9.2
    * Note: Currently CANCEL is being handled as a special case.
    * No UAS is created to handle the CANCEL and the response to
    * it CANCEL is being handled statelessly by the user agent core.
    * As such, there is currently no way to externally impact the
    * response to the a CANCEL request and thus the method here is
    * receiving a "message" (as apposed to a "uas").
    * @param message - Incoming CANCEL request message.
    */
  var onCancel: js.UndefOr[js.Function1[/* message */ IncomingRequestMessage, Unit]] = js.undefined
  /**
    * A transport error occurred attempted to send a response.
    * @param error - Transport error.
    */
  var onTransportError: js.UndefOr[js.Function1[/* error */ TransportError, Unit]] = js.undefined
}

object IncomingRequestDelegate {
  @scala.inline
  def apply(
    onCancel: /* message */ IncomingRequestMessage => Unit = null,
    onTransportError: /* error */ TransportError => Unit = null
  ): IncomingRequestDelegate = {
    val __obj = js.Dynamic.literal()
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1(onCancel))
    if (onTransportError != null) __obj.updateDynamic("onTransportError")(js.Any.fromFunction1(onTransportError))
    __obj.asInstanceOf[IncomingRequestDelegate]
  }
}

