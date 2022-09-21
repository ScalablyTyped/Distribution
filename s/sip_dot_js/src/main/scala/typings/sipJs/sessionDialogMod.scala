package typings.sipJs

import typings.sipJs.bodyMod.Body
import typings.sipJs.dialogMod.Dialog
import typings.sipJs.dialogStateMod.DialogState
import typings.sipJs.inviteMod.OutgoingInviteRequest
import typings.sipJs.inviteMod.OutgoingInviteRequestDelegate
import typings.sipJs.messagesMod.IncomingRequestMessage
import typings.sipJs.messagesMod.IncomingResponseMessage
import typings.sipJs.messagesMod.OutgoingRequestMessage
import typings.sipJs.methodsAckMod.OutgoingAckRequest
import typings.sipJs.methodsByeMod.OutgoingByeRequest
import typings.sipJs.methodsInfoMod.OutgoingInfoRequest
import typings.sipJs.methodsMessageMod.OutgoingMessageRequest
import typings.sipJs.notifyMod.OutgoingNotifyRequest
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import typings.sipJs.prackMod.OutgoingPrackRequest
import typings.sipJs.reInviteUserAgentClientMod.ReInviteUserAgentClient
import typings.sipJs.reInviteUserAgentServerMod.ReInviteUserAgentServer
import typings.sipJs.referMod.OutgoingReferRequest
import typings.sipJs.sessionSessionDelegateMod.SessionDelegate
import typings.sipJs.sessionSessionMod.SessionState
import typings.sipJs.sessionSessionMod.SignalingState
import typings.sipJs.transactionsMod.InviteClientTransaction
import typings.sipJs.transactionsMod.InviteServerTransaction
import typings.sipJs.userAgentCoreMod.UserAgentCore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionDialogMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.sipJs.sessionSessionMod.Session because var conflicts: callId, id, localTag, localURI, remoteTag, remoteTarget, remoteURI. Inlined delegate, sessionState, signalingState, answer, offer, bye, bye, bye, bye, info, info, info, info, invite, invite, invite, invite, message, message, message, message, notify, notify, notify, notify, prack, prack, prack, prack, refer, refer, refer, refer */ @JSImport("sip.js/lib/core/dialogs/session-dialog", "SessionDialog")
  @js.native
  open class SessionDialog protected () extends Dialog {
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
    /* private */ var _answer: Any = js.native
    
    /** The current offer. Undefined unless signaling state HaveLocalOffer, HaveRemoteOffer, or Stable. */
    /* private */ var _offer: Any = js.native
    
    /** The rollback answer. Undefined unless signaling state HaveLocalOffer or HaveRemoteOffer. */
    /* private */ var _rollbackAnswer: Any = js.native
    
    /** The rollback offer. Undefined unless signaling state HaveLocalOffer or HaveRemoteOffer. */
    /* private */ var _rollbackOffer: Any = js.native
    
    /** The state of the offer/answer exchange. */
    /* private */ var _signalingState: Any = js.native
    
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
    
    /** True if processing an ACK to the initial transaction 2xx (UAS only). */
    /* private */ var ackProcessing: Any = js.native
    
    /** True if waiting for an ACK to the initial transaction 2xx (UAS only). */
    /* private */ var ackWait: Any = js.native
    
    /** The current answer. Undefined unless signaling state Stable. */
    def answer: js.UndefOr[Body] = js.native
    /** The current answer if signalingState is stable. Otherwise undefined. */
    @JSName("answer")
    val answer_FSessionDialog: js.UndefOr[Body] = js.native
    
    /**
      * Terminating a Session
      *
      * This section describes the procedures for terminating a session
      * established by SIP.  The state of the session and the state of the
      * dialog are very closely related.  When a session is initiated with an
      * INVITE, each 1xx or 2xx response from a distinct UAS creates a
      * dialog, and if that response completes the offer/answer exchange, it
      * also creates a session.  As a result, each session is "associated"
      * with a single dialog - the one which resulted in its creation.  If an
      * initial INVITE generates a non-2xx final response, that terminates
      * all sessions (if any) and all dialogs (if any) that were created
      * through responses to the request.  By virtue of completing the
      * transaction, a non-2xx final response also prevents further sessions
      * from being created as a result of the INVITE.  The BYE request is
      * used to terminate a specific session or attempted session.  In this
      * case, the specific session is the one with the peer UA on the other
      * side of the dialog.  When a BYE is received on a dialog, any session
      * associated with that dialog SHOULD terminate.  A UA MUST NOT send a
      * BYE outside of a dialog.  The caller's UA MAY send a BYE for either
      * confirmed or early dialogs, and the callee's UA MAY send a BYE on
      * confirmed dialogs, but MUST NOT send a BYE on early dialogs.
      *
      * However, the callee's UA MUST NOT send a BYE on a confirmed dialog
      * until it has received an ACK for its 2xx response or until the server
      * transaction times out.  If no SIP extensions have defined other
      * application layer states associated with the dialog, the BYE also
      * terminates the dialog.
      *
      * https://tools.ietf.org/html/rfc3261#section-15
      * FIXME: Make these proper Exceptions...
      * @param options - BYE options bucket.
      * @returns
      * Throws `Error` if callee's UA attempts a BYE on an early dialog.
      * Throws `Error` if callee's UA attempts a BYE on a confirmed dialog
      *                while it's waiting on the ACK for its 2xx response.
      */
    /**
      * Send a BYE request.
      * Terminating a session.
      * https://tools.ietf.org/html/rfc3261#section-15
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def bye(): OutgoingByeRequest = js.native
    def bye(delegate: Unit, options: RequestOptions): OutgoingByeRequest = js.native
    def bye(delegate: OutgoingRequestDelegate): OutgoingByeRequest = js.native
    def bye(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingByeRequest = js.native
    
    var delegate: js.UndefOr[SessionDelegate] = js.native
    
    /**
      * An INFO request can be associated with an Info Package (see
      * Section 5), or associated with a legacy INFO usage (see Section 2).
      *
      * The construction of the INFO request is the same as any other
      * non-target refresh request within an existing invite dialog usage as
      * described in Section 12.2 of RFC 3261.
      * https://tools.ietf.org/html/rfc6086#section-4.2.1
      * @param options - Options bucket.
      */
    /**
      * Send an INFO request.
      * Exchange information during a session.
      * https://tools.ietf.org/html/rfc6086#section-4.2.1
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def info(): OutgoingInfoRequest = js.native
    def info(delegate: Unit, options: RequestOptions): OutgoingInfoRequest = js.native
    def info(delegate: OutgoingRequestDelegate): OutgoingInfoRequest = js.native
    def info(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingInfoRequest = js.native
    
    /* private */ var initialTransaction: Any = js.native
    
    /**
      * Modifying an Existing Session
      *
      * A successful INVITE request (see Section 13) establishes both a
      * dialog between two user agents and a session using the offer-answer
      * model.  Section 12 explains how to modify an existing dialog using a
      * target refresh request (for example, changing the remote target URI
      * of the dialog).  This section describes how to modify the actual
      * session.  This modification can involve changing addresses or ports,
      * adding a media stream, deleting a media stream, and so on.  This is
      * accomplished by sending a new INVITE request within the same dialog
      * that established the session.  An INVITE request sent within an
      * existing dialog is known as a re-INVITE.
      *
      *    Note that a single re-INVITE can modify the dialog and the
      *    parameters of the session at the same time.
      *
      * Either the caller or callee can modify an existing session.
      * https://tools.ietf.org/html/rfc3261#section-14
      * @param options - Options bucket
      */
    /**
      * Send re-INVITE request.
      * Modifying a session.
      * https://tools.ietf.org/html/rfc3261#section-14.1
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def invite(): OutgoingInviteRequest = js.native
    def invite(delegate: Unit, options: RequestOptions): OutgoingInviteRequest = js.native
    def invite(delegate: OutgoingInviteRequestDelegate): OutgoingInviteRequest = js.native
    def invite(delegate: OutgoingInviteRequestDelegate, options: RequestOptions): OutgoingInviteRequest = js.native
    
    /** Retransmission timer for 2xx response which confirmed the dialog. */
    /* private */ var invite2xxTimer: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Send MESSAGE request.
      * Deliver a message during a session.
      * https://tools.ietf.org/html/rfc3428#section-4
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def message(): OutgoingMessageRequest = js.native
    def message(delegate: Unit, options: RequestOptions): OutgoingMessageRequest = js.native
    /**
      * A UAC MAY associate a MESSAGE request with an existing dialog.  If a
      * MESSAGE request is sent within a dialog, it is "associated" with any
      * media session or sessions associated with that dialog.
      * https://tools.ietf.org/html/rfc3428#section-4
      * @param options - Options bucket.
      */
    def message(delegate: OutgoingRequestDelegate): OutgoingMessageRequest = js.native
    def message(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingMessageRequest = js.native
    
    def notify(delegate: Unit, options: RequestOptions): OutgoingNotifyRequest = js.native
    def notify(delegate: OutgoingRequestDelegate): OutgoingNotifyRequest = js.native
    def notify(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingNotifyRequest = js.native
    
    /** The current offer. Undefined unless signaling state HaveLocalOffer, HaveRemoteOffer, of Stable. */
    def offer: js.UndefOr[Body] = js.native
    /** The current offer if signalingState is not initial or closed. Otherwise undefined. */
    @JSName("offer")
    val offer_FSessionDialog: js.UndefOr[Body] = js.native
    
    /**
      * Assuming the response is to be transmitted reliably, the UAC MUST
      * create a new request with method PRACK.  This request is sent within
      * the dialog associated with the provisional response (indeed, the
      * provisional response may have created the dialog).  PRACK requests
      * MAY contain bodies, which are interpreted according to their type and
      * disposition.
      * https://tools.ietf.org/html/rfc3262#section-4
      * @param options - Options bucket.
      */
    /**
      * Send PRACK request.
      * Acknowledge a reliable provisional response.
      * https://tools.ietf.org/html/rfc3262#section-4
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def prack(): OutgoingPrackRequest = js.native
    def prack(delegate: Unit, options: RequestOptions): OutgoingPrackRequest = js.native
    def prack(delegate: OutgoingRequestDelegate): OutgoingPrackRequest = js.native
    def prack(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingPrackRequest = js.native
    
    /** Re-confirm the dialog. Only matters if handling re-INVITE request. */
    def reConfirm(): Unit = js.native
    
    /**
      * REFER is a SIP request and is constructed as defined in [1].  A REFER
      * request MUST contain exactly one Refer-To header field value.
      * https://tools.ietf.org/html/rfc3515#section-2.4.1
      * @param options - Options bucket.
      */
    /**
      * Send REFER request.
      * Transfer a session.
      * https://tools.ietf.org/html/rfc3515#section-2.4.1
      * @param delegate - Request delegate.
      * @param options - Options bucket.
      */
    def refer(): OutgoingReferRequest = js.native
    def refer(delegate: Unit, options: RequestOptions): OutgoingReferRequest = js.native
    def refer(delegate: OutgoingRequestDelegate): OutgoingReferRequest = js.native
    def refer(delegate: OutgoingRequestDelegate, options: RequestOptions): OutgoingReferRequest = js.native
    
    var reinviteUserAgentClient: js.UndefOr[ReInviteUserAgentClient] = js.native
    
    var reinviteUserAgentServer: js.UndefOr[ReInviteUserAgentServer] = js.native
    
    /**
      * Guard against out of order reliable provisional responses and retransmissions.
      * Returns false if the response should be discarded, otherwise true.
      * @param message - Incoming response message within this dialog.
      */
    def reliableSequenceGuard(message: IncomingResponseMessage): Boolean = js.native
    
    /** The rseq of the last reliable response. */
    /* private */ var rseq: Any = js.native
    
    def sessionState: SessionState = js.native
    /** Session state. */
    @JSName("sessionState")
    val sessionState_FSessionDialog: SessionState = js.native
    
    /** The state of the offer/answer exchange. */
    def signalingState: SignalingState = js.native
    
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
    
    /** Current state of the offer/answer exchange. */
    @JSName("signalingState")
    val signalingState_FSessionDialog: SignalingState = js.native
    
    /* private */ var start2xxRetransmissionTimer: Any = js.native
    
    /* private */ var startReInvite2xxRetransmissionTimer: Any = js.native
  }
}
