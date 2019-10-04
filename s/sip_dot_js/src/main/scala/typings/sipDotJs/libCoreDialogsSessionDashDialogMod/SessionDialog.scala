package typings.sipDotJs.libCoreDialogsSessionDashDialogMod

import typings.sipDotJs.libCoreDialogsDialogDashStateMod.DialogState
import typings.sipDotJs.libCoreDialogsDialogMod.Dialog
import typings.sipDotJs.libCoreMessagesBodyMod.Body
import typings.sipDotJs.libCoreMessagesMethodsAckMod.OutgoingAckRequest
import typings.sipDotJs.libCoreMessagesMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMessagesMod.IncomingResponseMessage
import typings.sipDotJs.libCoreMessagesMod.OutgoingRequestMessage
import typings.sipDotJs.libCoreMessagesMod.URI
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typings.sipDotJs.libCoreSessionSessionDashDelegateMod.SessionDelegate
import typings.sipDotJs.libCoreSessionSessionMod.Session
import typings.sipDotJs.libCoreTransactionsMod.InviteClientTransaction
import typings.sipDotJs.libCoreTransactionsMod.InviteServerTransaction
import typings.sipDotJs.libCoreUserDashAgentDashCoreMod.UserAgentCore
import typings.sipDotJs.libCoreUserDashAgentsReDashInviteDashUserDashAgentDashClientMod.ReInviteUserAgentClient
import typings.sipDotJs.libCoreUserDashAgentsReDashInviteDashUserDashAgentDashServerMod.ReInviteUserAgentServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/core/dialogs/session-dialog", "SessionDialog")
@js.native
class SessionDialog protected ()
  extends Dialog
     with Session {
  def this(initialTransaction: InviteClientTransaction, core: UserAgentCore, state: DialogState) = this()
  def this(initialTransaction: InviteServerTransaction, core: UserAgentCore, state: DialogState) = this()
  def this(
    initialTransaction: InviteClientTransaction,
    core: UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
  def this(
    initialTransaction: InviteServerTransaction,
    core: UserAgentCore,
    state: DialogState,
    delegate: SessionDelegate
  ) = this()
  /** The current answer. Undefined unless signaling state Stable. */
  var _answer: js.Any = js.native
  /** The current offer. Undefined unless signaling state HaveLocalOffer, HaveRemoteOffer, or Stable. */
  var _offer: js.Any = js.native
  /** The rollback answer. Undefined unless signaling state HaveLocalOffer or HaveRemoteOffer. */
  var _rollbackAnswer: js.Any = js.native
  /** The rollback offer. Undefined unless signaling state HaveLocalOffer or HaveRemoteOffer. */
  var _rollbackOffer: js.Any = js.native
  /** The state of the offer/answer exchange. */
  var _signalingState: js.Any = js.native
  /** True if waiting for an ACK to the initial transaction 2xx (UAS only). */
  var ackWait: js.Any = js.native
  /** Call Id. */
  /* InferMemberOverrides */
  override val callId: String = js.native
  /** The session id. Equal to callId + localTag + remoteTag. */
  /* InferMemberOverrides */
  override val id: String = js.native
  var initialTransaction: js.Any = js.native
  /** Retransmission timer for 2xx response which confirmed the dialog. */
  var invite2xxTimer: js.Any = js.native
  /** Local Tag. */
  /* InferMemberOverrides */
  override val localTag: String = js.native
  /** Local URI. */
  /* InferMemberOverrides */
  override val localURI: URI = js.native
  var logger: js.Any = js.native
  var reinviteUserAgentClient: js.UndefOr[ReInviteUserAgentClient] = js.native
  var reinviteUserAgentServer: js.UndefOr[ReInviteUserAgentServer] = js.native
  /** Remote Tag. */
  /* InferMemberOverrides */
  override val remoteTag: String = js.native
  /** Remote Target. */
  /* InferMemberOverrides */
  override val remoteTarget: URI = js.native
  /** Remote URI. */
  /* InferMemberOverrides */
  override val remoteURI: URI = js.native
  /** The rseq of the last reliable response. */
  var rseq: js.Any = js.native
  var start2xxRetransmissionTimer: js.Any = js.native
  var startReInvite2xxRetransmissionTimer: js.Any = js.native
  /**
    * The UAC core MUST generate an ACK request for each 2xx received from
    * the transaction layer.  The header fields of the ACK are constructed
    * in the same way as for any request sent within a dialog (see Section
    * 12) with the exception of the CSeq and the header fields related to
    * authentication.  The sequence number of the CSeq header field MUST be
    * the same as the INVITE being acknowledged, but the CSeq method MUST
    * be ACK.  The ACK MUST contain the same credentials as the INVITE.  If
    * the 2xx contains an offer (based on the rules above), the ACK MUST
    * carry an answer in its body.  If the offer in the 2xx response is not
    * acceptable, the UAC core MUST generate a valid answer in the ACK and
    * then send a BYE immediately.
    * https://tools.ietf.org/html/rfc3261#section-13.2.2.4
    * @param options - ACK options bucket.
    */
  def ack(): OutgoingAckRequest = js.native
  def ack(options: RequestOptions): OutgoingAckRequest = js.native
  /** Destructor. */
  /* InferMemberOverrides */
  override def dispose(): Unit = js.native
  /** Re-confirm the dialog. Only matters if handling re-INVITE request. */
  def reConfirm(): Unit = js.native
  def reliableSequenceGuard(message: IncomingResponseMessage): Boolean = js.native
  /**
    * If not in a stable signaling state, rollback to prior stable signaling state.
    */
  def signalingStateRollback(): Unit = js.native
  def signalingStateTransition(message: Body): Unit = js.native
  /**
    * Update the signaling state of the dialog.
    * @param message - The message to base the update off of.
    */
  def signalingStateTransition(message: IncomingRequestMessage): Unit = js.native
  def signalingStateTransition(message: IncomingResponseMessage): Unit = js.native
  def signalingStateTransition(message: OutgoingRequestMessage): Unit = js.native
}

