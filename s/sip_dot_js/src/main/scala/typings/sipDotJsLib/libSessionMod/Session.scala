package typings
package sipDotJsLib.libSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Session", "Session")
@js.native
abstract class Session protected ()
  extends nodeLib.eventsMod.EventEmitter {
  protected def this(sessionDescriptionHandlerFactory: sipDotJsLib.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactory) = this()
  var assertedIdentity: js.UndefOr[sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader] = js.native
  var body: js.Any = js.native
  var contact: js.UndefOr[java.lang.String] = js.native
  var contentType: java.lang.String = js.native
  var data: js.Any = js.native
  var earlySdp: js.UndefOr[java.lang.String] = js.native
  var endTime: js.UndefOr[stdLib.Date] = js.native
  var fromTag: js.UndefOr[java.lang.String] = js.native
  var hasAnswer: scala.Boolean = js.native
  var hasOffer: scala.Boolean = js.native
  var id: java.lang.String = js.native
  var localHold: scala.Boolean = js.native
  var localIdentity: sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader = js.native
  var logger: sipDotJsLib.libLoggerFactoryMod.Logger = js.native
  var method: java.lang.String = js.native
  var modifiers: js.UndefOr[
    js.Array[
      sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifier
    ]
  ] = js.native
  var onInfo: js.UndefOr[
    js.Function1[/* request */ sipDotJsLib.libSIPMessageMod.IncomingRequest, scala.Unit]
  ] = js.native
  var passedOptions: js.Any = js.native
  var pendingReinvite: js.Any = js.native
  var referContext: js.Any = js.native
  var rel100: java.lang.String = js.native
  var remoteIdentity: sipDotJsLib.libNameAddrHeaderMod.NameAddrHeader = js.native
  var renderbody: js.UndefOr[java.lang.String] = js.native
  var rendertype: js.UndefOr[java.lang.String] = js.native
  var replacee: js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  var session: js.UndefOr[sipDotJsLib.libCoreSessionSessionMod.Session] = js.native
  var sessionDescriptionHandler: js.UndefOr[sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler] = js.native
  @JSName("sessionDescriptionHandlerFactory")
  var sessionDescriptionHandlerFactory_Original: sipDotJsLib.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactory = js.native
  var sessionDescriptionHandlerOptions: js.Any = js.native
  var startTime: js.UndefOr[stdLib.Date] = js.native
  var status: sipDotJsLib.libEnumsMod.SessionStatus = js.native
  var timers: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var tones: js.Any = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  var ua: sipDotJsLib.libUAMod.UA = js.native
  /* protected */ def accepted(): this.type = js.native
  /* protected */ def accepted(response: java.lang.String): this.type = js.native
  /* protected */ def accepted(response: java.lang.String, cause: java.lang.String): this.type = js.native
  /* protected */ def accepted(response: sipDotJsLib.libSIPMessageMod.IncomingResponse): this.type = js.native
  /* protected */ def accepted(response: sipDotJsLib.libSIPMessageMod.IncomingResponse, cause: java.lang.String): this.type = js.native
  def bye(): this.type = js.native
  def bye(options: js.Any): this.type = js.native
  /* protected */ def canceled(): this.type = js.native
  def close(): this.type = js.native
  /* protected */ def connecting(request: sipDotJsLib.libSIPMessageMod.IncomingRequest): this.type = js.native
  def dtmf(tones: java.lang.String): this.type = js.native
  def dtmf(tones: java.lang.String, options: sipDotJsLib.libSessionMod.SessionNs.DtmfOptions): this.type = js.native
  def dtmf(tones: scala.Double): this.type = js.native
  def dtmf(tones: scala.Double, options: sipDotJsLib.libSessionMod.SessionNs.DtmfOptions): this.type = js.native
  /* protected */ def errorListener(args: js.Any*): scala.Unit = js.native
  /* protected */ def failed(response: js.UndefOr[scala.Nothing], cause: java.lang.String): this.type = js.native
  /* protected */ def failed(response: sipDotJsLib.libSIPMessageMod.IncomingRequest, cause: java.lang.String): this.type = js.native
  /* protected */ def failed(response: sipDotJsLib.libSIPMessageMod.IncomingResponse, cause: java.lang.String): this.type = js.native
  def hold(): scala.Unit = js.native
  def hold(options: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions): scala.Unit = js.native
  def hold(
    options: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): scala.Unit = js.native
  def on(
    event: sipDotJsLib.sipDotJsLibStrings.referInviteSent | sipDotJsLib.sipDotJsLibStrings.referProgress | sipDotJsLib.sipDotJsLibStrings.referAccepted | sipDotJsLib.sipDotJsLibStrings.referRejected | sipDotJsLib.sipDotJsLibStrings.referRequestProgress | sipDotJsLib.sipDotJsLibStrings.referRequestAccepted | sipDotJsLib.sipDotJsLibStrings.referRequestRejected | sipDotJsLib.sipDotJsLibStrings.reinvite | sipDotJsLib.sipDotJsLibStrings.reinviteAccepted | sipDotJsLib.sipDotJsLibStrings.reinviteFailed | sipDotJsLib.sipDotJsLibStrings.replaced,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  /* protected */ def onAck(incomingRequest: sipDotJsLib.libCoreMessagesMethodsAckMod.IncomingAckRequest): scala.Unit = js.native
  def onDialogError(response: sipDotJsLib.libSIPMessageMod.IncomingResponse): scala.Unit = js.native
  def onRequestTimeout(): scala.Unit = js.native
  def onTransportError(): scala.Unit = js.native
  @JSName("on")
  def `on_SessionDescriptionHandler-created`(
    event: sipDotJsLib.sipDotJsLibStrings.`SessionDescriptionHandler-created`,
    listener: js.Function1[
      /* sessionDescriptionHandler */ sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_accepted(
    event: sipDotJsLib.sipDotJsLibStrings.accepted,
    listener: js.Function2[
      /* response */ js.Any, 
      /* cause */ sipDotJsLib.libConstantsMod.CNs.causes, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_ack(
    event: sipDotJsLib.sipDotJsLibStrings.ack,
    listener: js.Function1[/* request */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_bye(
    event: sipDotJsLib.sipDotJsLibStrings.bye,
    listener: js.Function1[/* request */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_cancel(event: sipDotJsLib.sipDotJsLibStrings.cancel, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_confirmed(
    event: sipDotJsLib.sipDotJsLibStrings.confirmed,
    listener: js.Function1[/* request */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connecting(
    event: sipDotJsLib.sipDotJsLibStrings.connecting,
    listener: js.Function1[/* request */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_dialog(
    event: sipDotJsLib.sipDotJsLibStrings.dialog,
    listener: js.Function1[/* dialog */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_directionChanged(event: sipDotJsLib.sipDotJsLibStrings.directionChanged, listener: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_dtmf(
    event: sipDotJsLib.sipDotJsLibStrings.dtmf,
    listener: js.Function2[
      /* request */ sipDotJsLib.libSIPMessageMod.IncomingRequest | sipDotJsLib.libSIPMessageMod.OutgoingRequest, 
      /* dtmf */ sipDotJsLib.libSessionDTMFMod.DTMF, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_failed(
    event: sipDotJsLib.sipDotJsLibStrings.failed,
    listener: js.Function2[
      /* response */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.libConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_notify(
    event: sipDotJsLib.sipDotJsLibStrings.notify,
    listener: js.Function1[/* request */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_progress(
    event: sipDotJsLib.sipDotJsLibStrings.progress,
    listener: js.Function2[/* response */ java.lang.String, /* reasonPhrase */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referRequested(
    event: sipDotJsLib.sipDotJsLibStrings.referRequested,
    listener: js.Function1[/* context */ sipDotJsLib.libReferContextMod.ReferServerContext, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rejected(
    event: sipDotJsLib.sipDotJsLibStrings.rejected,
    listener: js.Function2[
      /* response */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.libConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_renegotiationError(
    event: sipDotJsLib.sipDotJsLibStrings.renegotiationError,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_terminated(
    event: sipDotJsLib.sipDotJsLibStrings.terminated,
    listener: js.Function2[
      /* message */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.libConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_trackAdded(event: sipDotJsLib.sipDotJsLibStrings.trackAdded, listener: js.Function0[scala.Unit]): this.type = js.native
  /* protected */ def receiveReinvite(incomingRequest: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest): scala.Unit = js.native
  /* protected */ def receiveRequest(incomingRequest: sipDotJsLib.libCoreMessagesIncomingDashRequestMod.IncomingRequest): scala.Unit = js.native
  def refer(target: java.lang.String): sipDotJsLib.libReferContextMod.ReferClientContext = js.native
  def refer(target: java.lang.String, options: js.Any): sipDotJsLib.libReferContextMod.ReferClientContext = js.native
  def refer(target: InviteClientContext): sipDotJsLib.libReferContextMod.ReferClientContext = js.native
  def refer(target: InviteClientContext, options: js.Any): sipDotJsLib.libReferContextMod.ReferClientContext = js.native
  def refer(target: InviteServerContext): sipDotJsLib.libReferContextMod.ReferClientContext = js.native
  def refer(target: InviteServerContext, options: js.Any): sipDotJsLib.libReferContextMod.ReferClientContext = js.native
  def reinvite(): scala.Unit = js.native
  def reinvite(options: js.Any): scala.Unit = js.native
  def reinvite(
    options: js.Any,
    modifiers: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): scala.Unit = js.native
  /* protected */ def rejected(response: sipDotJsLib.libSIPMessageMod.IncomingRequest, cause: java.lang.String): this.type = js.native
  /* protected */ def rejected(response: sipDotJsLib.libSIPMessageMod.IncomingResponse, cause: java.lang.String): this.type = js.native
  /* protected */ def sendReinvite(): scala.Unit = js.native
  /* protected */ def sendReinvite(options: js.Any): scala.Unit = js.native
  /**
    * Sends in dialog request.
    * @param method Request method.
    * @param options Options bucket.
    */
  def sendRequest(method: java.lang.String): this.type = js.native
  def sendRequest(method: java.lang.String, options: js.Any): this.type = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteClientContext): sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(
    session: InviteClientContext,
    options: sipDotJsLib.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactoryOptions
  ): sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(session: InviteServerContext): sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
  /* protected */ def sessionDescriptionHandlerFactory(
    session: InviteServerContext,
    options: sipDotJsLib.libSessionDashDescriptionDashHandlerDashFactoryMod.SessionDescriptionHandlerFactoryOptions
  ): sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler = js.native
  def terminate(): this.type = js.native
  def terminate(options: js.Any): this.type = js.native
  /* protected */ def terminated(): this.type = js.native
  /* protected */ def terminated(message: sipDotJsLib.libSIPMessageMod.IncomingRequest): this.type = js.native
  /* protected */ def terminated(message: sipDotJsLib.libSIPMessageMod.IncomingRequest, cause: java.lang.String): this.type = js.native
  /* protected */ def terminated(message: sipDotJsLib.libSIPMessageMod.IncomingResponse): this.type = js.native
  /* protected */ def terminated(message: sipDotJsLib.libSIPMessageMod.IncomingResponse, cause: java.lang.String): this.type = js.native
  def unhold(): scala.Unit = js.native
  def unhold(options: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions): scala.Unit = js.native
  def unhold(
    options: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): scala.Unit = js.native
}

/* static members */
@JSImport("sip.js/lib/Session", "Session")
@js.native
object Session extends js.Object {
  val C: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof SessionStatus */ js.Any = js.native
}

