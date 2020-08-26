package typings.sipJs.transactionUserMod

import typings.sipJs.coreExceptionsMod.TransportError
import typings.sipJs.logMod.LoggerFactory
import typings.sipJs.transactionStateMod.TransactionState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransactionUser extends js.Object {
  /**
    * Logger factory.
    */
  var loggerFactory: LoggerFactory = js.native
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
  var onStateChange: js.UndefOr[js.Function1[/* newState */ TransactionState, Unit]] = js.native
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
  var onTransportError: js.UndefOr[js.Function1[/* error */ TransportError, Unit]] = js.native
}

object TransactionUser {
  @scala.inline
  def apply(loggerFactory: LoggerFactory): TransactionUser = {
    val __obj = js.Dynamic.literal(loggerFactory = loggerFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionUser]
  }
  @scala.inline
  implicit class TransactionUserOps[Self <: TransactionUser] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoggerFactory(value: LoggerFactory): Self = this.set("loggerFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnStateChange(value: /* newState */ TransactionState => Unit): Self = this.set("onStateChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStateChange: Self = this.set("onStateChange", js.undefined)
    @scala.inline
    def setOnTransportError(value: /* error */ TransportError => Unit): Self = this.set("onTransportError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTransportError: Self = this.set("onTransportError", js.undefined)
  }
  
}

