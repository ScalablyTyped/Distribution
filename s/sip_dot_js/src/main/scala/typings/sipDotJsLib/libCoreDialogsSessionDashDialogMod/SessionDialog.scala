package typings
package sipDotJsLib.libCoreDialogsSessionDashDialogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Core/dialogs/session-dialog", "SessionDialog")
@js.native
class SessionDialog protected ()
  extends sipDotJsLib.libCoreDialogsDialogMod.Dialog
     with sipDotJsLib.libCoreSessionSessionMod.Session {
  def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteClientTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
  def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteServerTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState) = this()
  def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteClientTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState, delegate: sipDotJsLib.libCoreSessionSessionDashDelegateMod.SessionDelegate) = this()
  def this(initialTransaction: sipDotJsLib.libCoreTransactionsMod.InviteServerTransaction, core: sipDotJsLib.libCoreUserDashAgentDashCoreMod.UserAgentCore, state: sipDotJsLib.libCoreDialogsDialogDashStateMod.DialogState, delegate: sipDotJsLib.libCoreSessionSessionDashDelegateMod.SessionDelegate) = this()
  /** The current answer. Undefined unless signaling state Stable. */
  var _answer: js.Any = js.native
  /** The current offer. Undefined unless signaling state HaveLocalOffer, HaveRemoteOffer, of Stable. */
  var _offer: js.Any = js.native
  /** The state of the offer/answer exchange. */
  var _signalingState: js.Any = js.native
  /** True if waiting for an ACK to the initial transaction 2xx (UAS only). */
  var ackWait: js.Any = js.native
  /** Call Id. */
  /* InferMemberOverrides */
  override val callId: java.lang.String = js.native
  /** The session id. Equal to callId + localTag + remoteTag. */
  /* InferMemberOverrides */
  override val id: java.lang.String = js.native
  var initialTransaction: js.Any = js.native
  /** Retransmission timer for 2xx response which confirmed the dialog. */
  var invite2xxTimer: js.Any = js.native
  /** Local Tag. */
  /* InferMemberOverrides */
  override val localTag: java.lang.String = js.native
  /** Local URI. */
  /* InferMemberOverrides */
  override val localURI: sipDotJsLib.libURIMod.URI = js.native
  var logger: js.Any = js.native
  var reinviteUserAgentClient: js.UndefOr[
    sipDotJsLib.libCoreUserDashAgentsReDashInviteDashUserDashAgentDashClientMod.ReInviteUserAgentClient
  ] = js.native
  var reinviteUserAgentServer: js.UndefOr[
    sipDotJsLib.libCoreUserDashAgentsReDashInviteDashUserDashAgentDashServerMod.ReInviteUserAgentServer
  ] = js.native
  /** Remote Tag. */
  /* InferMemberOverrides */
  override val remoteTag: java.lang.String = js.native
  /** Remote Target. */
  /* InferMemberOverrides */
  override val remoteTarget: sipDotJsLib.libURIMod.URI = js.native
  /** Remote URI. */
  /* InferMemberOverrides */
  override val remoteURI: sipDotJsLib.libURIMod.URI = js.native
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
    * @param options ACK options bucket.
    */
  def ack(): sipDotJsLib.libCoreMessagesMethodsAckMod.OutgoingAckRequest = js.native
  def ack(options: sipDotJsLib.libCoreMessagesOutgoingDashRequestMod.RequestOptions): sipDotJsLib.libCoreMessagesMethodsAckMod.OutgoingAckRequest = js.native
  /** Destructor. */
  /* InferMemberOverrides */
  override def dispose(): scala.Unit = js.native
  /** Re-confirm the dialog. Only matters if handling re-INVITE request. */
  def reConfirm(): scala.Unit = js.native
  def reliableSequenceGuard(message: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Boolean = js.native
  def signalingStateTransition(message: OutgoingResponseBody): scala.Unit = js.native
  /**
    * Update the signaling state of the dialog.
    * @param message The message to base the update off of.
    */
  def signalingStateTransition(message: sipDotJsLib.libSIPMessageMod.IncomingRequest): scala.Unit = js.native
  def signalingStateTransition(message: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Unit = js.native
  def signalingStateTransition(message: sipDotJsLib.libSIPMessageMod.OutgoingRequest): scala.Unit = js.native
}

