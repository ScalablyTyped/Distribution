package typings
package sipDotJsLib.typesTransactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionUser extends js.Object {
  /**
    * Logger factory.
    */
  var loggerFactory: sipDotJsLib.typesLoggerDashFactoryMod.LoggerFactory
  /**
    * Callback for notification of transaction state changes.
    * 
    * Not called when transaction is constructed, so there is
    * no notification of entering the initial transaction state.
    * Otherwise, called once for each transaction state change.
    * State changes adhere to the following RFCs.
    * https://tools.ietf.org/html/rfc3261#section-17
    * https://tools.ietf.org/html/rfc6026
    */
  var onStateChange: js.UndefOr[js.Function1[/* newState */ TransactionState, scala.Unit]] = js.undefined
  /**
    * Callback for notification of a transport error.
    *
    * If a fatal transport error is reported by the transport layer
    * (generally, due to fatal ICMP errors in UDP or connection failures in
    * TCP), the condition MUST be treated as a 503 (Service Unavailable)
    * status code.
    * https://tools.ietf.org/html/rfc3261#section-8.1.3.1
    * https://tools.ietf.org/html/rfc3261#section-17.1.4
    * https://tools.ietf.org/html/rfc3261#section-17.2.4
    * https://tools.ietf.org/html/rfc6026
    */
  var onTransportError: js.UndefOr[
    js.Function1[/* error */ sipDotJsLib.typesExceptionsMod.ExceptionsNs.TransportError, scala.Unit]
  ] = js.undefined
}

object TransactionUser {
  @scala.inline
  def apply(
    loggerFactory: sipDotJsLib.typesLoggerDashFactoryMod.LoggerFactory,
    onStateChange: /* newState */ TransactionState => scala.Unit = null,
    onTransportError: /* error */ sipDotJsLib.typesExceptionsMod.ExceptionsNs.TransportError => scala.Unit = null
  ): TransactionUser = {
    val __obj = js.Dynamic.literal(loggerFactory = loggerFactory)
    if (onStateChange != null) __obj.updateDynamic("onStateChange")(js.Any.fromFunction1(onStateChange))
    if (onTransportError != null) __obj.updateDynamic("onTransportError")(js.Any.fromFunction1(onTransportError))
    __obj.asInstanceOf[TransactionUser]
  }
}

