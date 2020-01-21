package typings.sipJs.mod

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.TopLevel
import typings.sipJs.messagesMod.IncomingRequestMessage
import typings.sipJs.messagesMod.OutgoingRequestMessage
import typings.sipJs.transactionUserMod.ClientTransactionUser
import typings.sipJs.transactionUserMod.ServerTransactionUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "Transactions")
@js.native
object Transactions extends js.Object {
  @js.native
  class InviteClientTransaction protected ()
    extends typings.sipJs.transactionsMod.InviteClientTransaction {
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
    def this(
      request: OutgoingRequestMessage,
      transport: typings.sipJs.coreTransportMod.Transport,
      user: ClientTransactionUser
    ) = this()
  }
  
  @js.native
  class InviteServerTransaction protected ()
    extends typings.sipJs.transactionsMod.InviteServerTransaction {
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
    def this(
      request: IncomingRequestMessage,
      transport: typings.sipJs.coreTransportMod.Transport,
      user: ServerTransactionUser
    ) = this()
  }
  
  @js.native
  class NonInviteClientTransaction protected ()
    extends typings.sipJs.transactionsMod.NonInviteClientTransaction {
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
    def this(
      request: OutgoingRequestMessage,
      transport: typings.sipJs.coreTransportMod.Transport,
      user: ClientTransactionUser
    ) = this()
  }
  
  @js.native
  class NonInviteServerTransaction protected ()
    extends typings.sipJs.transactionsMod.NonInviteServerTransaction {
    /**
      * Constructor.
      * After construction the transaction will be in the "trying": state and the transaction
      * `id` will equal the branch parameter set in the Via header of the incoming request.
      * https://tools.ietf.org/html/rfc3261#section-17.2.2
      * @param request - Incoming Non-INVITE request from the transport.
      * @param transport - The transport.
      * @param user - The transaction user.
      */
    def this(
      request: IncomingRequestMessage,
      transport: typings.sipJs.coreTransportMod.Transport,
      user: ServerTransactionUser
    ) = this()
  }
  
  @js.native
  object InviteClientTransaction
    extends TopLevel[
          Instantiable3[
            /* request */ OutgoingRequestMessage, 
            /* transport */ typings.sipJs.coreTransportMod.Transport, 
            /* user */ ClientTransactionUser, 
            typings.sipJs.transactionsMod.InviteClientTransaction
          ]
        ]
  
  @js.native
  object InviteServerTransaction
    extends TopLevel[
          Instantiable3[
            /* request */ IncomingRequestMessage, 
            /* transport */ typings.sipJs.coreTransportMod.Transport, 
            /* user */ ServerTransactionUser, 
            typings.sipJs.transactionsMod.InviteServerTransaction
          ]
        ]
  
  @js.native
  object NonInviteClientTransaction
    extends TopLevel[
          Instantiable3[
            /* request */ OutgoingRequestMessage, 
            /* transport */ typings.sipJs.coreTransportMod.Transport, 
            /* user */ ClientTransactionUser, 
            typings.sipJs.transactionsMod.NonInviteClientTransaction
          ]
        ]
  
  @js.native
  object NonInviteServerTransaction
    extends TopLevel[
          Instantiable3[
            /* request */ IncomingRequestMessage, 
            /* transport */ typings.sipJs.coreTransportMod.Transport, 
            /* user */ ServerTransactionUser, 
            typings.sipJs.transactionsMod.NonInviteServerTransaction
          ]
        ]
  
}

