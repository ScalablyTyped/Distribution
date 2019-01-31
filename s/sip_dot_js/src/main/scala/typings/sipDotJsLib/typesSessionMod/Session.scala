package typings
package sipDotJsLib.typesSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/session", "Session")
@js.native
abstract class Session ()
  extends nodeLib.eventsMod.EventEmitter {
  var assertedIdentity: js.UndefOr[sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
  var body: js.Any = js.native
  var contact: js.UndefOr[java.lang.String] = js.native
  var contentType: java.lang.String = js.native
  var data: js.Any = js.native
  var dialog: js.UndefOr[sipDotJsLib.typesDialogsMod.Dialog] = js.native
  var endTime: js.UndefOr[stdLib.Date] = js.native
  var id: java.lang.String = js.native
  var localHold: scala.Boolean = js.native
  var localIdentity: sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
  var logger: sipDotJsLib.typesLoggerDashFactoryMod.Logger = js.native
  var method: java.lang.String = js.native
  var remoteIdentity: sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader = js.native
  var replacee: js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  var sessionDescriptionHandler: js.UndefOr[sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler] = js.native
  var startTime: js.UndefOr[stdLib.Date] = js.native
  var status: sipDotJsLib.typesEnumsMod.SessionStatus = js.native
  // inheritted from (Server/ClientContext)
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  var ua: sipDotJsLib.typesUaMod.UA = js.native
  def bye(): this.type = js.native
  def bye(options: js.Any): this.type = js.native
  def close(): this.type = js.native
  @JSName("createDialog")
  def createDialog_UAC(
    message: sipDotJsLib.typesSipDashMessageMod.IncomingRequest,
    `type`: sipDotJsLib.sipDotJsLibStrings.UAC
  ): scala.Boolean = js.native
  @JSName("createDialog")
  def createDialog_UAC(
    message: sipDotJsLib.typesSipDashMessageMod.IncomingRequest,
    `type`: sipDotJsLib.sipDotJsLibStrings.UAC,
    early: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("createDialog")
  def createDialog_UAC(
    message: sipDotJsLib.typesSipDashMessageMod.IncomingResponse,
    `type`: sipDotJsLib.sipDotJsLibStrings.UAC
  ): scala.Boolean = js.native
  @JSName("createDialog")
  def createDialog_UAC(
    message: sipDotJsLib.typesSipDashMessageMod.IncomingResponse,
    `type`: sipDotJsLib.sipDotJsLibStrings.UAC,
    early: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("createDialog")
  def createDialog_UAS(
    message: sipDotJsLib.typesSipDashMessageMod.IncomingRequest,
    `type`: sipDotJsLib.sipDotJsLibStrings.UAS
  ): scala.Boolean = js.native
  @JSName("createDialog")
  def createDialog_UAS(
    message: sipDotJsLib.typesSipDashMessageMod.IncomingRequest,
    `type`: sipDotJsLib.sipDotJsLibStrings.UAS,
    early: scala.Boolean
  ): scala.Boolean = js.native
  @JSName("createDialog")
  def createDialog_UAS(
    message: sipDotJsLib.typesSipDashMessageMod.IncomingResponse,
    `type`: sipDotJsLib.sipDotJsLibStrings.UAS
  ): scala.Boolean = js.native
  @JSName("createDialog")
  def createDialog_UAS(
    message: sipDotJsLib.typesSipDashMessageMod.IncomingResponse,
    `type`: sipDotJsLib.sipDotJsLibStrings.UAS,
    early: scala.Boolean
  ): scala.Boolean = js.native
  def dtmf(tones: java.lang.String): this.type = js.native
  def dtmf(tones: java.lang.String, options: sipDotJsLib.typesSessionMod.SessionNs.DtmfOptions): this.type = js.native
  def dtmf(tones: scala.Double): this.type = js.native
  def dtmf(tones: scala.Double, options: sipDotJsLib.typesSessionMod.SessionNs.DtmfOptions): this.type = js.native
  def hold(): scala.Unit = js.native
  def hold(options: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions): scala.Unit = js.native
  def hold(
    options: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): scala.Unit = js.native
  def onDialogError(response: sipDotJsLib.typesSipDashMessageMod.IncomingResponse): scala.Unit = js.native
  def onRequestTimeout(): scala.Unit = js.native
  def onTransportError(): scala.Unit = js.native
  @JSName("on")
  def `on_SessionDescriptionHandler-created`(
    event: sipDotJsLib.sipDotJsLibStrings.`SessionDescriptionHandler-created`,
    listener: js.Function1[
      /* sessionDescriptionHandler */ sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_accepted(
    event: sipDotJsLib.sipDotJsLibStrings.accepted,
    listener: js.Function2[
      /* response */ js.Any, 
      /* cause */ sipDotJsLib.typesConstantsMod.CNs.causes, 
      scala.Unit
    ]
  ): this.type = js.native
   // TODO
  @JSName("on")
  def on_ack(
    event: sipDotJsLib.sipDotJsLibStrings.ack,
    listener: js.Function1[/* request */ js.Any, scala.Unit]
  ): this.type = js.native
   // TODO
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
      /* request */ sipDotJsLib.typesSipDashMessageMod.IncomingRequest | sipDotJsLib.typesSipDashMessageMod.OutgoingRequest, 
      /* dtmf */ sipDotJsLib.typesSessionDtmfMod.DTMF, 
      scala.Unit
    ]
  ): this.type = js.native
  //  TODO
  @JSName("on")
  def on_failed(
    event: sipDotJsLib.sipDotJsLibStrings.failed,
    listener: js.Function2[
      /* response */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.typesConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
   // TODO
  @JSName("on")
  def on_notify(
    event: sipDotJsLib.sipDotJsLibStrings.notify,
    listener: js.Function1[/* request */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_progress(
    event: sipDotJsLib.sipDotJsLibStrings.progress,
    listener: js.Function2[
      /* response */ sipDotJsLib.typesSipDashMessageMod.IncomingRequest, 
      /* reasonPhrase */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_referAccepted(
    event: sipDotJsLib.sipDotJsLibStrings.referAccepted,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referInviteSent(
    event: sipDotJsLib.sipDotJsLibStrings.referInviteSent,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referProgress(
    event: sipDotJsLib.sipDotJsLibStrings.referProgress,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referRejected(
    event: sipDotJsLib.sipDotJsLibStrings.referRejected,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referRequestAccepted(
    event: sipDotJsLib.sipDotJsLibStrings.referRequestAccepted,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referRequestProgress(
    event: sipDotJsLib.sipDotJsLibStrings.referRequestProgress,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referRequestRejected(
    event: sipDotJsLib.sipDotJsLibStrings.referRequestRejected,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_referRequested(
    event: sipDotJsLib.sipDotJsLibStrings.referRequested,
    listener: js.Function1[/* context */ ReferServerContext, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_reinvite(
    event: sipDotJsLib.sipDotJsLibStrings.reinvite,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_reinviteAccepted(
    event: sipDotJsLib.sipDotJsLibStrings.reinviteAccepted,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_reinviteFailed(
    event: sipDotJsLib.sipDotJsLibStrings.reinviteFailed,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_rejected(
    event: sipDotJsLib.sipDotJsLibStrings.rejected,
    listener: js.Function2[
      /* response */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.typesConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
   // TODO
  @JSName("on")
  def on_renegotiationError(
    event: sipDotJsLib.sipDotJsLibStrings.renegotiationError,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_replaced(
    event: sipDotJsLib.sipDotJsLibStrings.replaced,
    listener: js.Function1[/* session */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_terminated(
    event: sipDotJsLib.sipDotJsLibStrings.terminated,
    listener: js.Function2[
      /* message */ js.UndefOr[js.Any], 
      /* cause */ js.UndefOr[sipDotJsLib.typesConstantsMod.CNs.causes], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_trackAdded(event: sipDotJsLib.sipDotJsLibStrings.trackAdded, listener: js.Function0[scala.Unit]): this.type = js.native
  def receiveRequest(request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest): scala.Unit = js.native
  def refer(target: java.lang.String): ReferClientContext = js.native
  def refer(target: java.lang.String, options: js.Any): ReferClientContext = js.native
  def refer(target: InviteClientContext): ReferClientContext = js.native
  def refer(target: InviteClientContext, options: js.Any): ReferClientContext = js.native
  def refer(target: InviteServerContext): ReferClientContext = js.native
  def refer(target: InviteServerContext, options: js.Any): ReferClientContext = js.native
  def reinvite(): scala.Unit = js.native
  def reinvite(options: js.Any): scala.Unit = js.native
  def reinvite(
    options: js.Any,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): scala.Unit = js.native
  def sendRequest(method: java.lang.String, options: js.Any): this.type = js.native
  def terminate(): this.type = js.native
  def terminate(options: js.Any): this.type = js.native
  def unhold(): scala.Unit = js.native
  def unhold(options: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions): scala.Unit = js.native
  def unhold(
    options: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): scala.Unit = js.native
}

@JSImport("sip.js/types/session", "Session")
@js.native
object Session extends js.Object {
  val C: sipDotJsLib.typesEnumsMod.SessionStatus = js.native
}

