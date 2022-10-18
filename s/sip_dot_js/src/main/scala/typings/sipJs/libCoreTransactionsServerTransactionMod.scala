package typings.sipJs

import typings.sipJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipJs.libCoreTransactionsTransactionMod.Transaction
import typings.sipJs.libCoreTransactionsTransactionStateMod.TransactionState
import typings.sipJs.libCoreTransactionsTransactionUserMod.ServerTransactionUser
import typings.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreTransactionsServerTransactionMod {
  
  /* note: abstract class */ @JSImport("sip.js/lib/core/transactions/server-transaction", "ServerTransaction")
  @js.native
  open class ServerTransaction protected () extends Transaction {
    /* protected */ def this(
      _request: IncomingRequestMessage,
      transport: Transport,
      user: ServerTransactionUser,
      state: TransactionState,
      loggerCategory: String
    ) = this()
    
    /* private */ var _request: Any = js.native
    
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
    
    /* protected */ var user: ServerTransactionUser = js.native
  }
}
