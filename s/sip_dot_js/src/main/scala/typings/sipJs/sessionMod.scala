package typings.sipJs

import typings.sipJs.anon.SessionDescriptionHandlerModifiers
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandler
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerModifier
import typings.sipJs.apiSessionDescriptionHandlerMod.SessionDescriptionHandlerOptions
import typings.sipJs.bodyMod.Body
import typings.sipJs.coreMod.Logger
import typings.sipJs.coreMod.NameAddrHeader
import typings.sipJs.coreMod.URI
import typings.sipJs.emitterMod.Emitter
import typings.sipJs.inviteMod.AckableIncomingResponseWithSession
import typings.sipJs.inviteMod.IncomingInviteRequest
import typings.sipJs.inviteMod.OutgoingInviteRequest
import typings.sipJs.inviterMod.Inviter
import typings.sipJs.inviterOptionsMod.InviterOptions
import typings.sipJs.methodsAckMod.IncomingAckRequest
import typings.sipJs.methodsByeMod.IncomingByeRequest
import typings.sipJs.methodsByeMod.OutgoingByeRequest
import typings.sipJs.methodsInfoMod.IncomingInfoRequest
import typings.sipJs.methodsInfoMod.OutgoingInfoRequest
import typings.sipJs.methodsMessageMod.IncomingMessageRequest
import typings.sipJs.methodsMessageMod.OutgoingMessageRequest
import typings.sipJs.notificationMod.Notification
import typings.sipJs.notifyMod.IncomingNotifyRequest
import typings.sipJs.outgoingRequestMod.OutgoingRequestDelegate
import typings.sipJs.outgoingRequestMod.RequestOptions
import typings.sipJs.prackMod.IncomingPrackRequest
import typings.sipJs.referMod.IncomingReferRequest
import typings.sipJs.referMod.OutgoingReferRequest
import typings.sipJs.sessionByeOptionsMod.SessionByeOptions
import typings.sipJs.sessionDelegateMod.SessionDelegate
import typings.sipJs.sessionDescriptionHandlerFactoryMod.SessionDescriptionHandlerFactory
import typings.sipJs.sessionInfoOptionsMod.SessionInfoOptions
import typings.sipJs.sessionInviteOptionsMod.SessionInviteOptions
import typings.sipJs.sessionMessageOptionsMod.SessionMessageOptions
import typings.sipJs.sessionOptionsMod.SessionOptions
import typings.sipJs.sessionReferOptionsMod.SessionReferOptions
import typings.sipJs.sessionStateMod.SessionState
import typings.sipJs.userAgentMod.UserAgent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sessionMod {
  
  @JSImport("sip.js/lib/api/session", "Session")
  @js.native
  abstract class Session protected () extends StObject {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @internal
      */
    /* protected */ def this(userAgent: UserAgent) = this()
    /* protected */ def this(userAgent: UserAgent, options: SessionOptions) = this()
    
    /** @internal */
    /* protected */ var _assertedIdentity: js.UndefOr[NameAddrHeader] = js.native
    
    /**
      * Send BYE.
      * @param delegate - Request delegate.
      * @param options - Request options bucket.
      * @internal
      */
    def _bye(): js.Promise[OutgoingByeRequest] = js.native
    def _bye(delegate: Unit, options: RequestOptions): js.Promise[OutgoingByeRequest] = js.native
    def _bye(delegate: OutgoingRequestDelegate): js.Promise[OutgoingByeRequest] = js.native
    def _bye(delegate: OutgoingRequestDelegate, options: RequestOptions): js.Promise[OutgoingByeRequest] = js.native
    
    /** @internal */
    var _contact: js.UndefOr[String] = js.native
    
    /** @internal */
    /* protected */ var _dialog: js.UndefOr[typings.sipJs.sessionSessionMod.Session] = js.native
    
    /** @internal */
    /* protected */ var _id: String = js.native
    
    /**
      * Send INFO.
      * @param delegate - Request delegate.
      * @param options - Request options bucket.
      * @internal
      */
    def _info(): js.Promise[OutgoingInfoRequest] = js.native
    def _info(delegate: Unit, options: RequestOptions): js.Promise[OutgoingInfoRequest] = js.native
    def _info(delegate: OutgoingRequestDelegate): js.Promise[OutgoingInfoRequest] = js.native
    def _info(delegate: OutgoingRequestDelegate, options: RequestOptions): js.Promise[OutgoingInfoRequest] = js.native
    
    /**
      * Send MESSAGE.
      * @param delegate - Request delegate.
      * @param options - Request options bucket.
      * @internal
      */
    def _message(): js.Promise[OutgoingMessageRequest] = js.native
    def _message(delegate: Unit, options: RequestOptions): js.Promise[OutgoingMessageRequest] = js.native
    def _message(delegate: OutgoingRequestDelegate): js.Promise[OutgoingMessageRequest] = js.native
    def _message(delegate: OutgoingRequestDelegate, options: RequestOptions): js.Promise[OutgoingMessageRequest] = js.native
    
    /**
      * Send REFER.
      * @param onNotify - Notification callback.
      * @param delegate - Request delegate.
      * @param options - Request options bucket.
      * @internal
      */
    def _refer(): js.Promise[OutgoingByeRequest] = js.native
    def _refer(onNotify: js.Function1[/* notification */ Notification, Unit]): js.Promise[OutgoingByeRequest] = js.native
    def _refer(
      onNotify: js.Function1[/* notification */ Notification, Unit],
      delegate: Unit,
      options: RequestOptions
    ): js.Promise[OutgoingByeRequest] = js.native
    def _refer(onNotify: js.Function1[/* notification */ Notification, Unit], delegate: OutgoingRequestDelegate): js.Promise[OutgoingByeRequest] = js.native
    def _refer(
      onNotify: js.Function1[/* notification */ Notification, Unit],
      delegate: OutgoingRequestDelegate,
      options: RequestOptions
    ): js.Promise[OutgoingByeRequest] = js.native
    def _refer(onNotify: Unit, delegate: Unit, options: RequestOptions): js.Promise[OutgoingByeRequest] = js.native
    def _refer(onNotify: Unit, delegate: OutgoingRequestDelegate): js.Promise[OutgoingByeRequest] = js.native
    def _refer(onNotify: Unit, delegate: OutgoingRequestDelegate, options: RequestOptions): js.Promise[OutgoingByeRequest] = js.native
    
    /** @internal */
    var _referral: js.UndefOr[Inviter] = js.native
    
    /** @internal */
    /* protected */ var _referralInviterOptions: js.UndefOr[InviterOptions] = js.native
    
    /** @internal */
    /* protected */ var _renderbody: js.UndefOr[String] = js.native
    
    /** @internal */
    /* protected */ var _rendertype: js.UndefOr[String] = js.native
    
    /** @internal */
    var _replacee: js.UndefOr[Session] = js.native
    
    /** Dialogs session description handler. */
    /* private */ var _sessionDescriptionHandler: Any = js.native
    
    /** SDH modifiers for the initial INVITE transaction. */
    /* private */ var _sessionDescriptionHandlerModifiers: Any = js.native
    
    /** SDH modifiers for re-INVITE transactions. */
    /* private */ var _sessionDescriptionHandlerModifiersReInvite: Any = js.native
    
    /** SDH options for the initial INVITE transaction. */
    /* private */ var _sessionDescriptionHandlerOptions: Any = js.native
    
    /** SDH options for re-NVITE transactions.*/
    /* private */ var _sessionDescriptionHandlerOptionsReInvite: Any = js.native
    
    /** Session state. */
    /* private */ var _state: Any = js.native
    
    /** Session state emitter. */
    /* private */ var _stateEventEmitter: Any = js.native
    
    /** User agent. */
    /* private */ var _userAgent: Any = js.native
    
    /**
      * Send ACK and then BYE. There are unrecoverable errors which can occur
      * while handling dialog forming and in-dialog INVITE responses and when
      * they occur we ACK the response and send a BYE.
      * Note that the BYE is sent in the dialog associated with the response
      * which is not necessarily `this.dialog`. And, accordingly, the
      * session state is not transitioned to terminated and session is not closed.
      * @param inviteResponse - The response causing the error.
      * @param statusCode - Status code for he reason phrase.
      * @param reasonPhrase - Reason phrase for the BYE.
      * @internal
      */
    /* protected */ def ackAndBye(response: AckableIncomingResponseWithSession): Unit = js.native
    /* protected */ def ackAndBye(response: AckableIncomingResponseWithSession, statusCode: Double): Unit = js.native
    /* protected */ def ackAndBye(response: AckableIncomingResponseWithSession, statusCode: Double, reasonPhrase: String): Unit = js.native
    /* protected */ def ackAndBye(response: AckableIncomingResponseWithSession, statusCode: Unit, reasonPhrase: String): Unit = js.native
    
    /**
      * The asserted identity of the remote user.
      */
    def assertedIdentity: js.UndefOr[NameAddrHeader] = js.native
    
    /**
      * End the {@link Session}. Sends a BYE.
      * @param options - Options bucket. See {@link SessionByeOptions} for details.
      */
    def bye(): js.Promise[OutgoingByeRequest] = js.native
    def bye(options: SessionByeOptions): js.Promise[OutgoingByeRequest] = js.native
    
    /* private */ var copyRequestOptions: Any = js.native
    
    /**
      * Property reserved for use by instance owner.
      * @defaultValue `undefined`
      */
    var data: Any = js.native
    
    /**
      * The session delegate.
      * @defaultValue `undefined`
      */
    var delegate: js.UndefOr[SessionDelegate] = js.native
    
    /**
      * The confirmed session dialog.
      */
    def dialog: js.UndefOr[typings.sipJs.sessionSessionMod.Session] = js.native
    
    /**
      * Destructor.
      */
    def dispose(): js.Promise[Unit] = js.native
    
    /**
      * Generate an offer or answer for a response to an INVITE request.
      * If a remote offer was provided in the request, set the remote
      * description and get a local answer. If a remote offer was not
      * provided, generates a local offer.
      * @internal
      */
    /* protected */ def generateResponseOfferAnswer(request: IncomingInviteRequest, options: SessionDescriptionHandlerModifiers): js.Promise[js.UndefOr[Body]] = js.native
    
    /**
      * Generate an offer or answer for a response to an INVITE request
      * when a dialog (early or otherwise) has already been established.
      * This method may NOT be called if a dialog has yet to be established.
      * @internal
      */
    /* protected */ def generateResponseOfferAnswerInDialog(options: SessionDescriptionHandlerModifiers): js.Promise[js.UndefOr[Body]] = js.native
    
    /**
      * Get local offer.
      * @internal
      */
    /* protected */ def getOffer(options: SessionDescriptionHandlerModifiers): js.Promise[Body] = js.native
    
    /* private */ var getReasonHeaderValue: Any = js.native
    
    /**
      * A unique identifier for this session.
      */
    def id: String = js.native
    
    /**
      * Share {@link Info} with peer. Sends an INFO.
      * @param options - Options bucket. See {@link SessionInfoOptions} for details.
      */
    def info(): js.Promise[OutgoingInfoRequest] = js.native
    def info(options: SessionInfoOptions): js.Promise[OutgoingInfoRequest] = js.native
    
    /**
      * Renegotiate the session. Sends a re-INVITE.
      * @param options - Options bucket. See {@link SessionInviteOptions} for details.
      */
    def invite(): js.Promise[OutgoingInviteRequest] = js.native
    def invite(options: SessionInviteOptions): js.Promise[OutgoingInviteRequest] = js.native
    
    /**
      * The identity of the local user.
      */
    val localIdentity: NameAddrHeader = js.native
    
    /**
      * Logger.
      */
    /* protected */ var logger: Logger = js.native
    
    /**
      * Deliver a {@link Message}. Sends a MESSAGE.
      * @param options - Options bucket. See {@link SessionMessageOptions} for details.
      */
    def message(): js.Promise[OutgoingMessageRequest] = js.native
    def message(options: SessionMessageOptions): js.Promise[OutgoingMessageRequest] = js.native
    
    /**
      * Handle in dialog ACK request.
      * @internal
      */
    /* protected */ def onAckRequest(request: IncomingAckRequest): js.Promise[Unit] = js.native
    
    /**
      * Handle in dialog BYE request.
      * @internal
      */
    /* protected */ def onByeRequest(request: IncomingByeRequest): Unit = js.native
    
    /**
      * Handle in dialog INFO request.
      * @internal
      */
    /* protected */ def onInfoRequest(request: IncomingInfoRequest): Unit = js.native
    
    /**
      * Handle in dialog INVITE request.
      * @internal
      */
    /* protected */ def onInviteRequest(request: IncomingInviteRequest): Unit = js.native
    
    /**
      * Handle in dialog MESSAGE request.
      * @internal
      */
    /* protected */ def onMessageRequest(request: IncomingMessageRequest): Unit = js.native
    
    /** If defined, NOTIFYs associated with a REFER subscription are delivered here. */
    /* private */ var onNotify: Any = js.native
    
    /**
      * Handle in dialog NOTIFY request.
      * @internal
      */
    /* protected */ def onNotifyRequest(request: IncomingNotifyRequest): Unit = js.native
    
    /**
      * Handle in dialog PRACK request.
      * @internal
      */
    /* protected */ def onPrackRequest(request: IncomingPrackRequest): Unit = js.native
    
    /**
      * Handle in dialog REFER request.
      * @internal
      */
    /* protected */ def onReferRequest(request: IncomingReferRequest): Unit = js.native
    
    /** True if there is an outgoing re-INVITE request outstanding. */
    /* private */ var pendingReinvite: Any = js.native
    
    /** True if there is an incoming re-INVITE ACK request outstanding. */
    /* private */ var pendingReinviteAck: Any = js.native
    
    /**
      * Proffer a {@link Referral}. Send a REFER.
      * @param referTo - The referral target. If a `Session`, a REFER w/Replaces is sent.
      * @param options - Options bucket. See {@link SessionReferOptions} for details.
      */
    def refer(referTo: URI): js.Promise[OutgoingReferRequest] = js.native
    def refer(referTo: URI, options: SessionReferOptions): js.Promise[OutgoingReferRequest] = js.native
    def refer(referTo: Session): js.Promise[OutgoingReferRequest] = js.native
    def refer(referTo: Session, options: SessionReferOptions): js.Promise[OutgoingReferRequest] = js.native
    
    /* private */ var referExtraHeaders: Any = js.native
    
    /* private */ var referToString: Any = js.native
    
    /**
      * The identity of the remote user.
      */
    val remoteIdentity: NameAddrHeader = js.native
    
    /**
      * The session being replace by this one.
      */
    def replacee: js.UndefOr[Session] = js.native
    
    /**
      * Rollback local/remote offer.
      * @internal
      */
    /* protected */ def rollbackOffer(): js.Promise[Unit] = js.native
    
    /**
      * Session description handler.
      * @remarks
      * If `this` is an instance of `Invitation`,
      * `sessionDescriptionHandler` will be defined when the session state changes to "established".
      * If `this` is an instance of `Inviter` and an offer was sent in the INVITE,
      * `sessionDescriptionHandler` will be defined when the session state changes to "establishing".
      * If `this` is an instance of `Inviter` and an offer was not sent in the INVITE,
      * `sessionDescriptionHandler` will be defined when the session state changes to "established".
      * Otherwise `undefined`.
      */
    def sessionDescriptionHandler: js.UndefOr[SessionDescriptionHandler] = js.native
    
    /**
      * Session description handler factory.
      */
    def sessionDescriptionHandlerFactory: SessionDescriptionHandlerFactory = js.native
    
    /**
      * SDH modifiers for the initial INVITE transaction.
      * @remarks
      * Used in all cases when handling the initial INVITE transaction as either UAC or UAS.
      * May be set directly at anytime.
      * May optionally be set via constructor option.
      * May optionally be set via options passed to Inviter.invite() or Invitation.accept().
      */
    def sessionDescriptionHandlerModifiers: js.Array[SessionDescriptionHandlerModifier] = js.native
    
    /**
      * SDH modifiers for re-INVITE transactions.
      * @remarks
      * Used in all cases when handling a re-INVITE transaction as either UAC or UAS.
      * May be set directly at anytime.
      * May optionally be set via constructor option.
      * May optionally be set via options passed to Session.invite().
      */
    def sessionDescriptionHandlerModifiersReInvite: js.Array[SessionDescriptionHandlerModifier] = js.native
    def sessionDescriptionHandlerModifiersReInvite_=(modifiers: js.Array[SessionDescriptionHandlerModifier]): Unit = js.native
    
    def sessionDescriptionHandlerModifiers_=(modifiers: js.Array[SessionDescriptionHandlerModifier]): Unit = js.native
    
    /**
      * SDH options for the initial INVITE transaction.
      * @remarks
      * Used in all cases when handling the initial INVITE transaction as either UAC or UAS.
      * May be set directly at anytime.
      * May optionally be set via constructor option.
      * May optionally be set via options passed to Inviter.invite() or Invitation.accept().
      */
    def sessionDescriptionHandlerOptions: SessionDescriptionHandlerOptions = js.native
    
    /**
      * SDH options for re-INVITE transactions.
      * @remarks
      * Used in all cases when handling a re-INVITE transaction as either UAC or UAS.
      * May be set directly at anytime.
      * May optionally be set via constructor option.
      * May optionally be set via options passed to Session.invite().
      */
    def sessionDescriptionHandlerOptionsReInvite: SessionDescriptionHandlerOptions = js.native
    def sessionDescriptionHandlerOptionsReInvite_=(options: SessionDescriptionHandlerOptions): Unit = js.native
    
    def sessionDescriptionHandlerOptions_=(options: SessionDescriptionHandlerOptions): Unit = js.native
    
    /**
      * Set remote answer.
      * @internal
      */
    /* protected */ def setAnswer(answer: Body, options: SessionDescriptionHandlerModifiers): js.Promise[Unit] = js.native
    
    /**
      * Set remote offer and get local answer.
      * @internal
      */
    /* protected */ def setOfferAndGetAnswer(offer: Body, options: SessionDescriptionHandlerModifiers): js.Promise[Body] = js.native
    
    /**
      * SDH for confirmed dialog.
      * @internal
      */
    /* protected */ def setSessionDescriptionHandler(sdh: SessionDescriptionHandler): Unit = js.native
    
    /**
      * SDH for confirmed dialog.
      * @internal
      */
    /* protected */ def setupSessionDescriptionHandler(): SessionDescriptionHandler = js.native
    
    /**
      * Session state.
      */
    def state: SessionState = js.native
    
    /**
      * Session state change emitter.
      */
    def stateChange: Emitter[SessionState] = js.native
    
    /**
      * Transition session state.
      * @internal
      */
    /* protected */ def stateTransition(newState: SessionState): Unit = js.native
    
    /**
      * The user agent.
      */
    def userAgent: UserAgent = js.native
  }
}
