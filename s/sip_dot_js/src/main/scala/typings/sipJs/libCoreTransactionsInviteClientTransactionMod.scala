package typings.sipJs

import typings.sipJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipJs.libCoreTransactionsClientTransactionMod.ClientTransaction
import typings.sipJs.libCoreTransactionsTransactionUserMod.ClientTransactionUser
import typings.sipJs.libCoreTransportMod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreTransactionsInviteClientTransactionMod {
  
  @JSImport("sip.js/lib/core/transactions/invite-client-transaction", "InviteClientTransaction")
  @js.native
  open class InviteClientTransaction protected () extends ClientTransaction {
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
    
    /* private */ var B: Any = js.native
    
    /* private */ var D: Any = js.native
    
    /* private */ var M: Any = js.native
    
    /* private */ var ack: Any = js.native
    
    /**
      * ACK a 2xx final response.
      *
      * The transaction includes the ACK only if the final response was not a 2xx response (the
      * transaction will generate and send the ACK to the transport automagically). If the
      * final response was a 2xx, the ACK is not considered part of the transaction (the
      * transaction user needs to generate and send the ACK).
      *
      * This library is not strictly RFC compliant with regard to ACK handling for 2xx final
      * responses. Specifically, retransmissions of ACKs to a 2xx final responses is handled
      * by the transaction layer (instead of the UAC core). The "standard" approach is for
      * the UAC core to receive all 2xx responses and manage sending ACK retransmissions to
      * the transport directly. Herein the transaction layer manages sending ACKs to 2xx responses
      * and any retransmissions of those ACKs as needed.
      *
      * @param ack - The outgoing ACK request.
      */
    def ackResponse(ack: OutgoingRequestMessage): Unit = js.native
    
    /**
      * Map of 2xx to-tag to ACK.
      * If value is not undefined, value is the ACK which was sent.
      * If key exists but value is undefined, a 2xx was received but the ACK not yet sent.
      * Otherwise, a 2xx was not (yet) received for this transaction.
      */
    /* private */ var ackRetransmissionCache: Any = js.native
    
    /**
      * Execute a state transition.
      * @param newState - New state.
      */
    /* private */ var stateTransition: Any = js.native
    
    /**
      * When timer A fires, the client transaction MUST retransmit the
      * request by passing it to the transport layer, and MUST reset the
      * timer with a value of 2*T1.
      * When timer A fires 2*T1 seconds later, the request MUST be
      * retransmitted again (assuming the client transaction is still in this
      * state). This process MUST continue so that the request is
      * retransmitted with intervals that double after each transmission.
      * These retransmissions SHOULD only be done while the client
      * transaction is in the "Calling" state.
      * https://tools.ietf.org/html/rfc3261#section-17.1.1.2
      */
    /* private */ var timerA: Any = js.native
    
    /**
      * If the client transaction is still in the "Calling" state when timer
      * B fires, the client transaction SHOULD inform the TU that a timeout
      * has occurred.  The client transaction MUST NOT generate an ACK.
      * https://tools.ietf.org/html/rfc3261#section-17.1.1.2
      */
    /* private */ var timerB: Any = js.native
    
    /**
      * If Timer D fires while the client transaction is in the "Completed" state,
      * the client transaction MUST move to the "Terminated" state.
      * https://tools.ietf.org/html/rfc6026#section-8.4
      */
    /* private */ var timerD: Any = js.native
    
    /**
      * If Timer M fires while the client transaction is in the "Accepted"
      * state, the client transaction MUST move to the "Terminated" state.
      * https://tools.ietf.org/html/rfc6026#section-8.4
      */
    /* private */ var timerM: Any = js.native
  }
}
