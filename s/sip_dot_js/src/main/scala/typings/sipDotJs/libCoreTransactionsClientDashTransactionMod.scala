package typings.sipDotJs

import typings.sipDotJs.libCoreMessagesMod.IncomingResponseMessage
import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import typings.sipDotJs.libCoreTransactionsTransactionMod.Transaction
import typings.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions/client-transaction", JSImport.Namespace)
@js.native
object libCoreTransactionsClientDashTransactionMod extends js.Object {
  @js.native
  abstract class ClientTransaction protected () extends Transaction {
    protected def this(
      _request: OutgoingRequestMessage,
      transport: Transport,
      user: ClientTransactionUser,
      state: TransactionState,
      loggerCategory: String
    ) = this()
    var _request: js.Any = js.native
    /** The outgoing request the transaction handling. */
    val request: OutgoingRequestMessage = js.native
    var user: ClientTransactionUser = js.native
    /**
      * A 408 to non-INVITE will always arrive too late to be useful ([3]),
      * The client already has full knowledge of the timeout. The only
      * information this message would convey is whether or not the server
      * believed the transaction timed out. However, with the current design
      * of the NIT, a client cannot do anything with this knowledge. Thus,
      * the 408 is simply wasting network resources and contributes to the
      * response bombardment illustrated in [3].
      * https://tools.ietf.org/html/rfc4320#section-4.1
      */
    /* protected */ def onRequestTimeout(): Unit = js.native
    /**
      * Receive incoming responses from the transport which match this transaction.
      * Responses will be delivered to the transaction user as necessary.
      * @param response - The incoming response.
      */
    def receiveResponse(response: IncomingResponseMessage): Unit = js.native
  }
  
  /* static members */
  @js.native
  object ClientTransaction extends js.Object {
    var makeId: js.Any = js.native
  }
  
}

