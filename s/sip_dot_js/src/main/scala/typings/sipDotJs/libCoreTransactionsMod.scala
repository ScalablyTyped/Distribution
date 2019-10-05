package typings.sipDotJs

import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ClientTransactionUser
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.TransactionUser
import typings.sipDotJs.libCoreTransportMod.Transport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions", JSImport.Namespace)
@js.native
object libCoreTransactionsMod extends js.Object {
  @js.native
  abstract class ClientTransaction protected ()
    extends typings.sipDotJs.libCoreTransactionsClientDashTransactionMod.ClientTransaction {
    protected def this(
      _request: OutgoingRequestMessage,
      transport: Transport,
      user: ClientTransactionUser,
      state: TransactionState,
      loggerCategory: String
    ) = this()
  }
  
  @js.native
  class InviteClientTransaction protected ()
    extends typings.sipDotJs.libCoreTransactionsInviteDashClientDashTransactionMod.InviteClientTransaction {
    /**
      * Constructor.
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.1
      * @param request - The outgoing INVITE request.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(request: OutgoingRequestMessage, transport: Transport, user: ClientTransactionUser) = this()
  }
  
  @js.native
  class InviteServerTransaction protected ()
    extends typings.sipDotJs.libCoreTransactionsInviteDashServerDashTransactionMod.InviteServerTransaction {
    /**
      * Constructor.
      * Upon construction, a "100 Trying" reply will be immediately sent.
      * After construction the transaction will be in the "proceeding" state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.1
      * @param request - Incoming INVITE request from the transport.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(request: IncomingRequestMessage, transport: Transport, user: ServerTransactionUser) = this()
  }
  
  @js.native
  class NonInviteClientTransaction protected ()
    extends typings.sipDotJs.libCoreTransactionsNonDashInviteDashClientDashTransactionMod.NonInviteClientTransaction {
    /**
      * Constructor
      * Upon construction, the outgoing request's Via header is updated by calling `setViaHeader`.
      * Then `toString` is called on the outgoing request and the message is sent via the transport.
      * After construction the transaction will be in the "calling" state and the transaction id
      * will equal the branch parameter set in the Via header of the outgoing request.
      * https://tools.ietf.org/html/rfc3261#section-17.1.2
      * @param request - The outgoing Non-INVITE request.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(request: OutgoingRequestMessage, transport: Transport, user: ClientTransactionUser) = this()
  }
  
  @js.native
  class NonInviteServerTransaction protected ()
    extends typings.sipDotJs.libCoreTransactionsNonDashInviteDashServerDashTransactionMod.NonInviteServerTransaction {
    /**
      * Constructor.
      * After construction the transaction will be in the "trying": state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.2
      * @param request - Incoming Non-INVITE request from the transport.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(request: IncomingRequestMessage, transport: Transport, user: ServerTransactionUser) = this()
  }
  
  @js.native
  abstract class ServerTransaction protected ()
    extends typings.sipDotJs.libCoreTransactionsServerDashTransactionMod.ServerTransaction {
    protected def this(
      _request: IncomingRequestMessage,
      transport: Transport,
      user: ServerTransactionUser,
      state: TransactionState,
      loggerCategory: String
    ) = this()
  }
  
  @js.native
  abstract class Transaction protected ()
    extends typings.sipDotJs.libCoreTransactionsTransactionMod.Transaction {
    protected def this(
      _transport: Transport,
      _user: TransactionUser,
      _id: String,
      _state: TransactionState,
      loggerCategory: String
    ) = this()
  }
  
  /* static members */
  @js.native
  object ClientTransaction extends js.Object {
    var makeId: js.Any = js.native
  }
  
  @js.native
  object TransactionState extends js.Object {
    /* "Accepted" */ val Accepted: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Accepted with String = js.native
    /* "Calling" */ val Calling: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Calling with String = js.native
    /* "Completed" */ val Completed: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Completed with String = js.native
    /* "Confirmed" */ val Confirmed: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Confirmed with String = js.native
    /* "Proceeding" */ val Proceeding: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Proceeding with String = js.native
    /* "Terminated" */ val Terminated: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Terminated with String = js.native
    /* "Trying" */ val Trying: typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState.Trying with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.sipDotJs.libCoreTransactionsTransactionDashStateMod.TransactionState with String
      ] = js.native
  }
  
}

