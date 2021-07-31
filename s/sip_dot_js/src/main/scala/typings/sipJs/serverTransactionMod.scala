package typings.sipJs

import typings.sipJs.coreTransportMod.Transport
import typings.sipJs.messagesMod.IncomingRequestMessage
import typings.sipJs.transactionMod.Transaction
import typings.sipJs.transactionStateMod.TransactionState
import typings.sipJs.transactionUserMod.ServerTransactionUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverTransactionMod {
  
  @JSImport("sip.js/lib/core/transactions/server-transaction", "ServerTransaction")
  @js.native
  abstract class ServerTransaction protected () extends Transaction {
    protected def this(
      _request: IncomingRequestMessage,
      transport: Transport,
      user: ServerTransactionUser,
      state: TransactionState,
      loggerCategory: String
    ) = this()
    
    var _request: js.Any = js.native
    
    /**
      * Receive incoming requests from the transport which match this transaction.
      * @param request - The incoming request.
      */
    def receiveRequest(request: IncomingRequestMessage): Unit = js.native
    
    /**
      * Receive outgoing responses to this request from the transaction user.
      * Responses will be delivered to the transport as necessary.
      * @param statusCode - Response status code.
      * @param response - Response.
      */
    def receiveResponse(statusCode: Double, response: String): Unit = js.native
    
    /** The incoming request the transaction handling. */
    def request: IncomingRequestMessage = js.native
    
    var user: ServerTransactionUser = js.native
  }
}
