package typings.sipDotJs.libApiSessionMod

import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.Anon_SessionDescriptionHandlerModifiers
import typings.sipDotJs.libApiEmitterMod.Emitter
import typings.sipDotJs.libApiInviterMod.Inviter
import typings.sipDotJs.libApiReferrerMod.Referrer
import typings.sipDotJs.libApiSessionDashDelegateMod.SessionDelegate
import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.BodyAndContentType
import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier
import typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
import typings.sipDotJs.libApiSessionDashInviteDashOptionsMod.SessionInviteOptions
import typings.sipDotJs.libApiSessionDashOptionsMod.SessionOptions
import typings.sipDotJs.libApiSessionDashStateMod.SessionState
import typings.sipDotJs.libApiUserDashAgentMod.UserAgent
import typings.sipDotJs.libConstantsMod.CNs.supported
import typings.sipDotJs.libCoreMessagesBodyMod.Body
import typings.sipDotJs.libCoreMessagesMethodsAckMod.IncomingAckRequest
import typings.sipDotJs.libCoreMessagesMethodsByeMod.IncomingByeRequest
import typings.sipDotJs.libCoreMessagesMethodsByeMod.OutgoingByeRequest
import typings.sipDotJs.libCoreMessagesMethodsInfoMod.IncomingInfoRequest
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.AckableIncomingResponseWithSession
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.IncomingInviteRequest
import typings.sipDotJs.libCoreMessagesMethodsInviteMod.OutgoingInviteRequest
import typings.sipDotJs.libCoreMessagesMethodsNotifyMod.IncomingNotifyRequest
import typings.sipDotJs.libCoreMessagesMethodsPrackMod.IncomingPrackRequest
import typings.sipDotJs.libCoreMessagesMethodsReferMod.IncomingReferRequest
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.OutgoingRequestDelegate
import typings.sipDotJs.libCoreMessagesOutgoingDashRequestMod.RequestOptions
import typings.sipDotJs.libCoreMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libCoreMod.NameAddrHeader
import typings.sipDotJs.libEnumsMod.SessionStatus
import typings.sipDotJs.libEnumsMod.TypeStrings
import typings.sipDotJs.sipDotJsStrings.`SessionDescriptionHandler-created`
import typings.sipDotJs.sipDotJsStrings.directionChanged
import typings.sipDotJs.sipDotJsStrings.trackAdded
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/api/session", "Session")
@js.native
abstract class Session protected () extends EventEmitter {
  /**
    * Constructor.
    * @param userAgent - User agent. See {@link UserAgent} for details.
    * @internal
    */
  protected def this(userAgent: UserAgent) = this()
  protected def this(userAgent: UserAgent, options: SessionOptions) = this()
  var _sessionDescriptionHandler: js.Any = js.native
  var _state: js.Any = js.native
  var _stateEventEmitter: js.Any = js.native
  /** @internal */
  var assertedIdentity: js.UndefOr[NameAddrHeader] = js.native
  /** @internal */
  var body: js.UndefOr[BodyAndContentType | String] = js.native
  /** @internal */
  var contact: js.UndefOr[String] = js.native
  /** @internal */
  var contentType: js.UndefOr[String] = js.native
  /**
    * Property reserved for use by instance owner.
    * @defaultValue `undefined`
    */
  var data: js.UndefOr[js.Any] = js.native
  /**
    * The session delegate.
    * @defaultValue `undefined`
    */
  var delegate: js.UndefOr[SessionDelegate] = js.native
  /**
    * The confirmed session dialog.
    */
  var dialog: js.UndefOr[typings.sipDotJs.libCoreSessionSessionMod.Session] = js.native
  /** @internal */
  var earlySdp: js.UndefOr[String] = js.native
  /** Terminated time. */
  /** @internal */
  var endTime: js.UndefOr[Date] = js.native
  /** @internal */
  var expiresTimer: js.Any = js.native
  /** @internal */
  var fromTag: js.UndefOr[String] = js.native
  /** @internal */
  var id: js.UndefOr[String] = js.native
  /** True if an error caused session termination. */
  /** @internal */
  var isFailed: Boolean = js.native
  /** @internal */
  var localHold: Boolean = js.native
  /** @internal */
  var localIdentity: NameAddrHeader = js.native
  /** @internal */
  var logger: Logger = js.native
  /** @internal */
  var method: String = js.native
  /** @internal */
  var onInfo: js.UndefOr[js.Function1[/* request */ IncomingRequestMessage, Unit]] = js.native
  /** @internal */
  var passedOptions: js.Any = js.native
  var pendingReinvite: js.Any = js.native
  /** @internal */
  var referral: js.UndefOr[Inviter] = js.native
  /** @internal */
  var referrer: js.UndefOr[Referrer] = js.native
  /** @internal */
  var rel100: supported = js.native
  /** @internal */
  var remoteIdentity: NameAddrHeader = js.native
  /** @internal */
  var renderbody: js.UndefOr[String] = js.native
  /** @internal */
  var rendertype: js.UndefOr[String] = js.native
  /** @internal */
  var replacee: js.UndefOr[Session] = js.native
  /**
    * Session description handler.
    */
  val sessionDescriptionHandler: js.UndefOr[SessionDescriptionHandler] = js.native
  /** @internal */
  var sessionDescriptionHandlerModifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
  /** @internal */
  var sessionDescriptionHandlerOptions: js.UndefOr[SessionDescriptionHandlerOptions] = js.native
  /** Accepted time. */
  /** @internal */
  var startTime: js.UndefOr[Date] = js.native
  /**
    * Session state.
    */
  val state: SessionState = js.native
  /**
    * Session state change emitter.
    */
  val stateChange: Emitter[SessionState] = js.native
  /** DEPRECATED: Session status */
  /** @internal */
  var status: SessionStatus = js.native
  var tones: js.Any = js.native
  /** @internal */
  var `type`: TypeStrings = js.native
  /** @internal */
  var userAgent: UserAgent = js.native
  /** @internal */
  var userNoAnswerTimer: js.Any = js.native
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
  /**
    * Send BYE.
    * @param delegate - Request delegate.
    * @param options - Request options bucket.
    * @internal
    */
  def bye(): js.Promise[OutgoingByeRequest] = js.native
  def bye(delegate: OutgoingRequestDelegate): js.Promise[OutgoingByeRequest] = js.native
  def bye(delegate: OutgoingRequestDelegate, options: RequestOptions): js.Promise[OutgoingByeRequest] = js.native
  /**
    * Called to cleanup session after terminated.
    * @internal
    */
  def close(): Unit = js.native
  /**
    * @deprecated Legacy state transition.
    * @internal
    */
  @JSName("emit")
  def emit_SessionDescriptionHandlercreated(event: `SessionDescriptionHandler-created`, sessionDescriptionHandler: SessionDescriptionHandler): Boolean = js.native
  @JSName("emit")
  def emit_directionChanged(event: directionChanged): Boolean = js.native
  /**
    * @deprecated Legacy state transition.
    * @internal
    */
  @JSName("emit")
  def emit_trackAdded(event: trackAdded): Boolean = js.native
  /**
    * Generate an offer or answer for a response to an INVITE request.
    * If a remote offer was provided in the request, set the remote
    * description and get a local answer. If a remote offer was not
    * provided, generates a local offer.
    * @internal
    */
  /* protected */ def generateResponseOfferAnswer(request: IncomingInviteRequest, options: Anon_SessionDescriptionHandlerModifiers): js.Promise[js.UndefOr[Body]] = js.native
  /**
    * Generate an offer or answer for a response to an INVITE request
    * when a dialog (early or otherwise) has already been established.
    * This method may NOT be called if a dialog has yet to be established.
    * @internal
    */
  /* protected */ def generateResponseOfferAnswerInDialog(options: Anon_SessionDescriptionHandlerModifiers): js.Promise[js.UndefOr[Body]] = js.native
  /**
    * Get local offer.
    * @internal
    */
  /* protected */ def getOffer(options: Anon_SessionDescriptionHandlerModifiers): js.Promise[Body] = js.native
  /**
    * Send INFO.
    * @param delegate - Request delegate.
    * @param options - Request options bucket.
    * @internal
    */
  def info(): js.Promise[OutgoingByeRequest] = js.native
  def info(delegate: OutgoingRequestDelegate): js.Promise[OutgoingByeRequest] = js.native
  def info(delegate: OutgoingRequestDelegate, options: RequestOptions): js.Promise[OutgoingByeRequest] = js.native
  /**
    * Renegotiate the session. Sends a re-INVITE.
    * @param options - Options bucket.
    */
  def invite(): js.Promise[OutgoingInviteRequest] = js.native
  def invite(options: SessionInviteOptions): js.Promise[OutgoingInviteRequest] = js.native
  /**
    * Handle in dialog ACK request.
    * @internal
    */
  /* protected */ def onAckRequest(request: IncomingAckRequest): Unit = js.native
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
  /**
    * @deprecated Legacy state transition.
    * @internal
    */
  @JSName("on")
  def on_SessionDescriptionHandlercreated(
    event: `SessionDescriptionHandler-created`,
    listener: js.Function1[/* sessionDescriptionHandler */ SessionDescriptionHandler, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_directionChanged(event: directionChanged, listener: js.Function0[Unit]): this.type = js.native
  /**
    * @deprecated Legacy state transition.
    * @internal
    */
  @JSName("on")
  def on_trackAdded(event: trackAdded, listener: js.Function0[Unit]): this.type = js.native
  /**
    * Send REFER.
    * @param referrer - Referrer.
    * @param delegate - Request delegate.
    * @param options - Request options bucket.
    * @internal
    */
  def refer(referrer: Referrer): js.Promise[OutgoingByeRequest] = js.native
  def refer(referrer: Referrer, delegate: OutgoingRequestDelegate): js.Promise[OutgoingByeRequest] = js.native
  def refer(referrer: Referrer, delegate: OutgoingRequestDelegate, options: RequestOptions): js.Promise[OutgoingByeRequest] = js.native
  /**
    * Rollback local/remote offer.
    * @internal
    */
  /* protected */ def rollbackOffer(): js.Promise[Unit] = js.native
  /**
    * Session description handler factory.
    */
  def sessionDescriptionHandlerFactory(session: Session): SessionDescriptionHandler = js.native
  def sessionDescriptionHandlerFactory(session: Session, options: js.Object): SessionDescriptionHandler = js.native
  /**
    * Set remote answer.
    * @internal
    */
  /* protected */ def setAnswer(answer: Body, options: Anon_SessionDescriptionHandlerModifiers): js.Promise[Unit] = js.native
  /**
    * Set remote offer and get local answer.
    * @internal
    */
  /* protected */ def setOfferAndGetAnswer(offer: Body, options: Anon_SessionDescriptionHandlerModifiers): js.Promise[Body] = js.native
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
    * Transition session state.
    * @internal
    */
  /* protected */ def stateTransition(newState: SessionState): Unit = js.native
}

/* static members */
@JSImport("sip.js/lib/api/session", "Session")
@js.native
object Session extends js.Object {
  /** @internal */
  val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SessionStatus */ js.Any = js.native
}

