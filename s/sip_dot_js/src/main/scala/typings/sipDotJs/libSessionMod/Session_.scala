package typings.sipDotJs.libSessionMod

import org.scalablytyped.runtime.StringDictionary
import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.libConstantsMod.C.causes
import typings.sipDotJs.libCoreMessagesIncomingDashRequestMod.IncomingRequest
import typings.sipDotJs.libCoreMessagesMethodsAckMod.IncomingAckRequest
import typings.sipDotJs.libCoreMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMod.IncomingResponseMessage
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libCoreMod.NameAddrHeader
import typings.sipDotJs.libCoreMod.OutgoingRequestMessage
import typings.sipDotJs.libEnumsMod.SessionStatus
import typings.sipDotJs.libEnumsMod.TypeStrings
import typings.sipDotJs.libReferContextMod.ReferClientContext
import typings.sipDotJs.libReferContextMod.ReferServerContext
import typings.sipDotJs.libSessionDTMFMod.DTMF
import typings.sipDotJs.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactory
import typings.sipDotJs.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactoryOptions
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions
import typings.sipDotJs.libSessionMod.Session.DtmfOptions
import typings.sipDotJs.libUAMod.UA
import typings.sipDotJs.sipDotJsStrings.`SessionDescriptionHandler-created`
import typings.sipDotJs.sipDotJsStrings.accepted
import typings.sipDotJs.sipDotJsStrings.ack_
import typings.sipDotJs.sipDotJsStrings.bye_
import typings.sipDotJs.sipDotJsStrings.cancel_
import typings.sipDotJs.sipDotJsStrings.confirmed
import typings.sipDotJs.sipDotJsStrings.connecting
import typings.sipDotJs.sipDotJsStrings.dialog
import typings.sipDotJs.sipDotJsStrings.directionChanged
import typings.sipDotJs.sipDotJsStrings.dtmf
import typings.sipDotJs.sipDotJsStrings.failed
import typings.sipDotJs.sipDotJsStrings.notify_
import typings.sipDotJs.sipDotJsStrings.progress
import typings.sipDotJs.sipDotJsStrings.referAccepted
import typings.sipDotJs.sipDotJsStrings.referInviteSent
import typings.sipDotJs.sipDotJsStrings.referProgress
import typings.sipDotJs.sipDotJsStrings.referRejected
import typings.sipDotJs.sipDotJsStrings.referRequestAccepted
import typings.sipDotJs.sipDotJsStrings.referRequestProgress
import typings.sipDotJs.sipDotJsStrings.referRequestRejected
import typings.sipDotJs.sipDotJsStrings.referRequested
import typings.sipDotJs.sipDotJsStrings.reinvite
import typings.sipDotJs.sipDotJsStrings.reinviteAccepted
import typings.sipDotJs.sipDotJsStrings.reinviteFailed
import typings.sipDotJs.sipDotJsStrings.rejected
import typings.sipDotJs.sipDotJsStrings.renegotiationError
import typings.sipDotJs.sipDotJsStrings.replaced
import typings.sipDotJs.sipDotJsStrings.terminated
import typings.sipDotJs.sipDotJsStrings.trackAdded
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Session", "Session")
@js.native
abstract class Session_ protected () extends EventEmitter {
  protected def this(sessionDescriptionHandlerFactory: SessionDescriptionHandlerFactory) = this()
  var assertedIdentity: js.UndefOr[NameAddrHeader] = js.native
  var body: js.Any = js.native
  var contact: js.UndefOr[String] = js.native
  var contentType: String = js.native
  var data: js.Any = js.native
  var earlySdp: js.UndefOr[String] = js.native
  var endTime: js.UndefOr[Date] = js.native
  var fromTag: js.UndefOr[String] = js.native
  var hasAnswer: Boolean = js.native
  var hasOffer: Boolean = js.native
  var id: String = js.native
  var localHold: Boolean = js.native
  var localIdentity: NameAddrHeader = js.native
  var logger: Logger = js.native
  var method: String = js.native
  var modifiers: js.UndefOr[js.Array[SessionDescriptionHandlerModifier]] = js.native
  var onInfo: js.UndefOr[js.Function1[/* request */ IncomingRequestMessage, Unit]] = js.native
  var passedOptions: js.Any = js.native
  var pendingReinvite: js.Any = js.native
  var referContext: js.Any = js.native
  var rel100: String = js.native
  var remoteIdentity: NameAddrHeader = js.native
  var renderbody: js.UndefOr[String] = js.native
  var rendertype: js.UndefOr[String] = js.native
  var replacee: js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  var session: js.UndefOr[typings.sipDotJs.libCoreSessionSessionMod.Session] = js.native
  var sessionDescriptionHandler: js.UndefOr[SessionDescriptionHandler] = js.native
  @JSName("sessionDescriptionHandlerFactory")
  var sessionDescriptionHandlerFactory_Original: SessionDescriptionHandlerFactory = js.native
  var sessionDescriptionHandlerOptions: js.Any = js.native
  var startTime: js.UndefOr[Date] = js.native
  var status: SessionStatus = js.native
  var timers: StringDictionary[js.Any] = js.native
  var tones: js.Any = js.native
  var `type`: TypeStrings = js.native
  var ua: UA = js.native
  /* protected */ def accepted(): this.type = js.native
  /* protected */ def accepted(response: String): this.type = js.native
  /* protected */ def accepted(response: String, cause: String): this.type = js.native
  /* protected */ def accepted(response: IncomingResponseMessage): this.type = js.native
  /* protected */ def accepted(response: IncomingResponseMessage, cause: String): this.type = js.native
  def bye(): this.type = js.native
  def bye(options: js.Any): this.type = js.native
  /* protected */ def canceled(): this.type = js.native
  def close(): this.type = js.native
  /* protected */ def connecting(request: IncomingRequestMessage): this.type = js.native
  def dtmf(tones: String): this.type = js.native
  def dtmf(tones: String, options: DtmfOptions): this.type = js.native
  def dtmf(tones: Double): this.type = js.native
  def dtmf(tones: Double, options: DtmfOptions): this.type = js.native
  /* protected */ def errorListener(args: js.Any*): Unit = js.native
  /* protected */ def failed(response: js.UndefOr[scala.Nothing], cause: String): this.type = js.native
  /* protected */ def failed(response: IncomingRequestMessage, cause: String): this.type = js.native
  /* protected */ def failed(response: IncomingResponseMessage, cause: String): this.type = js.native
  def hold(): Unit = js.native
  def hold(options: SessionDescriptionHandlerOptions): Unit = js.native
  def hold(options: SessionDescriptionHandlerOptions, modifiers: SessionDescriptionHandlerModifiers): Unit = js.native
  def on(
    event: referInviteSent | referProgress | referAccepted | referRejected | referRequestProgress | referRequestAccepted | referRequestRejected | reinvite | reinviteAccepted | reinviteFailed | replaced,
    listener: js.Function1[/* session */ this.type, Unit]
  ): this.type = js.native
  /* protected */ def onAck(incomingRequest: IncomingAckRequest): Unit = js.native
  def onDialogError(response: IncomingResponseMessage): Unit = js.native
  def onRequestTimeout(): Unit = js.native
  def onTransportError(): Unit = js.native
  @JSName("on")
  def on_SessionDescriptionHandlercreated(
    event: `SessionDescriptionHandler-created`,
    listener: js.Function1[/* sessionDescriptionHandler */ SessionDescriptionHandler, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_accepted(event: accepted, listener: js.Function2[/* response */ js.Any, /* cause */ causes, Unit]): this.type = js.native
  @JSName("on")
  def on_ack(event: ack_, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_bye(event: bye_, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_cancel(event: cancel_, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_confirmed(event: confirmed, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_connecting(event: connecting, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_dialog(event: dialog, listener: js.Function1[/* dialog */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_directionChanged(event: directionChanged, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_dtmf(
    event: dtmf,
    listener: js.Function2[/* request */ IncomingRequestMessage | OutgoingRequestMessage, /* dtmf */ DTMF, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_failed(
    event: failed,
    listener: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[causes], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_notify(event: notify_, listener: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_progress(
    event: progress,
    listener: js.Function2[
      /* response */ IncomingResponseMessage | String, 
      /* reasonPhrase */ js.UndefOr[js.Any], 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_referRequested(event: referRequested, listener: js.Function1[/* context */ ReferServerContext, Unit]): this.type = js.native
  @JSName("on")
  def on_rejected(
    event: rejected,
    listener: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[causes], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_renegotiationError(event: renegotiationError, listener: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_terminated(
    event: terminated,
    listener: js.Function2[/* message */ js.UndefOr[js.Any], /* cause */ js.UndefOr[causes], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_trackAdded(event: trackAdded, listener: js.Function0[Unit]): this.type = js.native
  /* protected */ def receiveReinvite(incomingRequest: IncomingRequest): Unit = js.native
  /* protected */ def receiveRequest(incomingRequest: IncomingRequest): Unit = js.native
  def refer(target: String): ReferClientContext = js.native
  def refer(target: String, options: js.Any): ReferClientContext = js.native
  def refer(target: InviteClientContext): ReferClientContext = js.native
  def refer(target: InviteClientContext, options: js.Any): ReferClientContext = js.native
  def refer(target: InviteServerContext): ReferClientContext = js.native
  def refer(target: InviteServerContext, options: js.Any): ReferClientContext = js.native
  def reinvite(): Unit = js.native
  def reinvite(options: js.Any): Unit = js.native
  def reinvite(options: js.Any, modifiers: SessionDescriptionHandlerModifiers): Unit = js.native
  /* protected */ def rejected(response: IncomingRequestMessage, cause: String): this.type = js.native
  /* protected */ def rejected(response: IncomingResponseMessage, cause: String): this.type = js.native
  /* protected */ def sendReinvite(): Unit = js.native
  /* protected */ def sendReinvite(options: js.Any): Unit = js.native
  /**
    * Sends in dialog request.
    * @param method Request method.
    * @param options Options bucket.
    */
  def sendRequest(method: String): this.type = js.native
  def sendRequest(method: String, options: js.Any): this.type = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteClientContext): SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteClientContext, options: SessionDescriptionHandlerFactoryOptions): SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteServerContext): SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteServerContext, options: SessionDescriptionHandlerFactoryOptions): SessionDescriptionHandler = js.native
  def terminate(): this.type = js.native
  def terminate(options: js.Any): this.type = js.native
  /* protected */ def terminated(): this.type = js.native
  /* protected */ def terminated(message: IncomingRequestMessage): this.type = js.native
  /* protected */ def terminated(message: IncomingRequestMessage, cause: String): this.type = js.native
  /* protected */ def terminated(message: IncomingResponseMessage): this.type = js.native
  /* protected */ def terminated(message: IncomingResponseMessage, cause: String): this.type = js.native
  def unhold(): Unit = js.native
  def unhold(options: SessionDescriptionHandlerOptions): Unit = js.native
  def unhold(options: SessionDescriptionHandlerOptions, modifiers: SessionDescriptionHandlerModifiers): Unit = js.native
}

