package typings.sipDotJs.libCoreTransactionsTransactionDashUserMod

import typings.sipDotJs.libCoreExceptionsMod.TransportError
import typings.sipDotJs.libCoreLogMod.LoggerFactory
import typings.sipDotJs.libCoreMessagesMod.IncomingResponseMessage
import typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientTransactionUser extends TransactionUser {
  /**
    * Callback for request timeout error.
    *
    * When a timeout error is received from the transaction layer, it MUST be
    * treated as if a 408 (Request Timeout) status code has been received.
    * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
    * TU MUST be informed of a timeout.
    * https://tools.ietf.org/html/rfc3261#section-17.1.2.2
    */
  var onRequestTimeout: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Callback for delegation of valid response handling.
    *
    * Valid responses are passed up to the TU from the client transaction.
    * https://tools.ietf.org/html/rfc3261#section-17.1
    */
  var receiveResponse: js.UndefOr[js.Function1[/* response */ IncomingResponseMessage, Unit]] = js.undefined
}

object ClientTransactionUser {
  @scala.inline
  def apply(
    loggerFactory: LoggerFactory,
    onRequestTimeout: () => Unit = null,
    onStateChange: /* newState */ TransactionState => Unit = null,
    onTransportError: /* error */ TransportError => Unit = null,
    receiveResponse: /* response */ IncomingResponseMessage => Unit = null
  ): ClientTransactionUser = {
    val __obj = js.Dynamic.literal(loggerFactory = loggerFactory)
    if (onRequestTimeout != null) __obj.updateDynamic("onRequestTimeout")(js.Any.fromFunction0(onRequestTimeout))
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (onTransportError != null) __obj.updateDynamic("onTransportError")(js.Any.fromFunction1(onTransportError))
    if (receiveResponse != null) __obj.updateDynamic("receiveResponse")(js.Any.fromFunction1(receiveResponse))
    __obj.asInstanceOf[ClientTransactionUser]
  }
}

