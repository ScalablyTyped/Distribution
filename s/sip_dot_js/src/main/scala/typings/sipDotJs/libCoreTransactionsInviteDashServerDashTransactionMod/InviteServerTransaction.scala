package typings.sipDotJs.libCoreTransactionsInviteDashServerDashTransactionMod

import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreTransactionsServerDashTransactionMod.ServerTransaction
import typings.sipDotJs.libCoreTransactionsTransactionDashUserMod.ServerTransactionUser
import typings.sipDotJs.libCoreTransportMod.Transport
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/transactions/invite-server-transaction", "InviteServerTransaction")
@js.native
class InviteServerTransaction protected () extends ServerTransaction {
  /**
    * Constructor.
    * Upon construction, a "100 Trying" reply will be immediately sent.
    * After construction the transaction will be in the "proceeding" state and the transaction
    * `id` will equal the branch parameter set in the Via header of the incoming request.
    * https://tools.ietf.org/html/rfc3261#section-17.2.1
    * @param request Incoming INVITE request from the transport.
    * @param transport The transport.
    * @param user The transaction user.
    */
  def this(request: IncomingRequestMessage, transport: Transport, user: ServerTransactionUser) = this()
  var H: js.Any = js.native
  var I: js.Any = js.native
  var L: js.Any = js.native
  var lastFinalResponse: js.Any = js.native
  var lastProvisionalResponse: js.Any = js.native
  /**
    * FIXME: This should not be here. It should be in the UAS.
    *
    * If the UAS desires an extended period of time to answer the INVITE,
    * it will need to ask for an "extension" in order to prevent proxies
    * from canceling the transaction.  A proxy has the option of canceling
    * a transaction when there is a gap of 3 minutes between responses in a
    * transaction.  To prevent cancellation, the UAS MUST send a non-100
    * provisional response at every minute, to handle the possibility of
    * lost provisional responses.
    *
    *   An INVITE transaction can go on for extended durations when the
    *   user is placed on hold, or when interworking with PSTN systems
    *   which allow communications to take place without answering the
    *   call.  The latter is common in Interactive Voice Response (IVR)
    *   systems.
    * https://tools.ietf.org/html/rfc3261#section-13.3.1.1
    */
  var progressExtensionTimer: js.Any = js.native
  /**
    * FIXME: UAS Provisional Retransmission Timer. See RFC 3261 Section 13.3.1.1
    * This is in the wrong place. This is not a transaction level thing. It's a UAS level thing.
    */
  var startProgressExtensionTimer: js.Any = js.native
  /**
    * Execute a state transition.
    * @param newState New state.
    */
  var stateTransition: js.Any = js.native
  /**
    * FIXME: UAS Provisional Retransmission Timer id. See RFC 3261 Section 13.3.1.1
    * This is in the wrong place. This is not a transaction level thing. It's a UAS level thing.
    */
  var stopProgressExtensionTimer: js.Any = js.native
  /**
    * While in the "Proceeding" state, if the TU passes a response with status code
    * from 300 to 699 to the server transaction, the response MUST be passed to the
    * transport layer for transmission, and the state machine MUST enter the "Completed" state.
    * For unreliable transports, timer G is set to fire in T1 seconds, and is not set to fire for
    * reliable transports. If timer G fires, the response is passed to the transport layer once
    * more for retransmission, and timer G is set to fire in MIN(2*T1, T2) seconds. From then on,
    * when timer G fires, the response is passed to the transport again for transmission, and
    * timer G is reset with a value that doubles, unless that value exceeds T2, in which case
    * it is reset with the value of T2.
    * https://tools.ietf.org/html/rfc3261#section-17.2.1
    */
  var timer_G: js.Any = js.native
  /**
    * If timer H fires while in the "Completed" state, it implies that the ACK was never received.
    * In this case, the server transaction MUST transition to the "Terminated" state, and MUST
    * indicate to the TU that a transaction failure has occurred.
    * https://tools.ietf.org/html/rfc3261#section-17.2.1
    */
  var timer_H: js.Any = js.native
  /**
    * Once timer I fires, the server MUST transition to the "Terminated" state.
    * https://tools.ietf.org/html/rfc3261#section-17.2.1
    */
  var timer_I: js.Any = js.native
  /**
    * When Timer L fires and the state machine is in the "Accepted" state, the machine MUST
    * transition to the "Terminated" state. Once the transaction is in the "Terminated" state,
    * it MUST be destroyed immediately. Timer L reflects the amount of time the server
    * transaction could receive 2xx responses for retransmission from the
    * TU while it is waiting to receive an ACK.
    * https://tools.ietf.org/html/rfc6026#section-7.1
    * https://tools.ietf.org/html/rfc6026#section-8.7
    */
  var timer_L: js.Any = js.native
  /**
    * First, the procedures in [4] are followed, which attempt to deliver the response to a backup.
    * If those should all fail, based on the definition of failure in [4], the server transaction SHOULD
    * inform the TU that a failure has occurred, and MUST remain in the current state.
    * https://tools.ietf.org/html/rfc6026#section-8.8
    */
  /* protected */ def onTransportError(error: Error): Unit = js.native
  /**
    * Retransmit the last 2xx response. This is a noop if not in the "accepted" state.
    */
  def retransmitAcceptedResponse(): Unit = js.native
}

