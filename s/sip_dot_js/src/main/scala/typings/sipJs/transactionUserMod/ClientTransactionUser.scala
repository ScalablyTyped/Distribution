package typings.sipJs.transactionUserMod

import typings.sipJs.logMod.LoggerFactory
import typings.sipJs.messagesMod.IncomingResponseMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  var onRequestTimeout: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Callback for delegation of valid response handling.
    *
    * Valid responses are passed up to the TU from the client transaction.
    * https://tools.ietf.org/html/rfc3261#section-17.1
    */
  var receiveResponse: js.UndefOr[js.Function1[/* response */ IncomingResponseMessage, Unit]] = js.native
}
object ClientTransactionUser {
  
  @scala.inline
  def apply(loggerFactory: LoggerFactory): ClientTransactionUser = {
    val __obj = js.Dynamic.literal(loggerFactory = loggerFactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientTransactionUser]
  }
  
  @scala.inline
  implicit class ClientTransactionUserOps[Self <: ClientTransactionUser] (val x: Self) extends AnyVal {
    
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
    def setOnRequestTimeout(value: () => Unit): Self = this.set("onRequestTimeout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnRequestTimeout: Self = this.set("onRequestTimeout", js.undefined)
    
    @scala.inline
    def setReceiveResponse(value: /* response */ IncomingResponseMessage => Unit): Self = this.set("receiveResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteReceiveResponse: Self = this.set("receiveResponse", js.undefined)
  }
}
