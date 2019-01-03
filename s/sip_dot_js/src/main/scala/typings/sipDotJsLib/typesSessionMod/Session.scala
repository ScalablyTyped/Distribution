package typings
package sipDotJsLib.typesSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/session", "Session")
@js.native
class Session ()
  extends sipDotJsLib.typesEventDashEmitterMod.EventEmitter {
  var data: js.UndefOr[js.Any] = js.native
   // This is actually an any
  var endTime: js.UndefOr[stdLib.Date] = js.native
  var localIdentity: js.UndefOr[sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
  var method: js.UndefOr[java.lang.String] = js.native
  var remoteIdentity: js.UndefOr[sipDotJsLib.typesNameDashAddrDashHeaderMod.NameAddrHeader] = js.native
  var request: js.UndefOr[js.Any] = js.native
  var sessionDescriptionHandler: js.UndefOr[sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler] = js.native
  var startTime: js.UndefOr[stdLib.Date] = js.native
  var status: sipDotJsLib.typesSessionMod.SessionNs.C = js.native
  var ua: sipDotJsLib.typesUaMod.UA = js.native
  def bye(): Session = js.native
  def bye(options: js.Any): Session = js.native
  def dtmf(tone: java.lang.String): Session = js.native
  def hold(): scala.Unit = js.native
  def hold(options: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions): scala.Unit = js.native
  def hold(
    options: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): scala.Unit = js.native
  @JSName("on")
  def `on_SessionDescriptionHandler-created`(
    name: sipDotJsLib.sipDotJsLibStrings.`SessionDescriptionHandler-created`,
    callback: js.Function1[
      /* sessionDescriptionHandler */ sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_accepted(
    name: sipDotJsLib.sipDotJsLibStrings.accepted,
    callback: js.Function2[/* response */ js.Any, /* cause */ js.Any, scala.Unit]
  ): scala.Unit = js.native
   //TODO
  @JSName("on")
  def on_ack(name: sipDotJsLib.sipDotJsLibStrings.ack, callback: js.Function1[/* request */ js.Any, scala.Unit]): scala.Unit = js.native
   //TODO
  @JSName("on")
  def on_bye(name: sipDotJsLib.sipDotJsLibStrings.bye, callback: js.Function1[/* request */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_cancel(name: sipDotJsLib.sipDotJsLibStrings.cancel, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_confirmed(
    name: sipDotJsLib.sipDotJsLibStrings.confirmed,
    callback: js.Function1[/* request */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_connecting(
    name: sipDotJsLib.sipDotJsLibStrings.connecting,
    callback: js.Function1[/* request */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_dialog(
    name: sipDotJsLib.sipDotJsLibStrings.dialog,
    callback: js.Function1[/* dialog */ js.Any, scala.Unit]
  ): scala.Unit = js.native
   // TODO
  @JSName("on")
  def on_failed(
    name: sipDotJsLib.sipDotJsLibStrings.failed,
    callback: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
   //TODO
  @JSName("on")
  def on_notify(
    name: sipDotJsLib.sipDotJsLibStrings.notify,
    callback: js.Function1[/* request */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_referRequested(
    name: sipDotJsLib.sipDotJsLibStrings.referRequested,
    callback: js.Function1[/* context */ ReferServerContext, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_reinvite(
    name: sipDotJsLib.sipDotJsLibStrings.reinvite,
    callback: js.Function1[/* session */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_reinviteAccepted(
    name: sipDotJsLib.sipDotJsLibStrings.reinviteAccepted,
    callback: js.Function1[/* session */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_reinviteFailed(
    name: sipDotJsLib.sipDotJsLibStrings.reinviteFailed,
    callback: js.Function1[/* session */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_rejected(
    name: sipDotJsLib.sipDotJsLibStrings.rejected,
    callback: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
   // TODO
  @JSName("on")
  def on_renegotiationError(
    name: sipDotJsLib.sipDotJsLibStrings.renegotiationError,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_replaced(
    name: sipDotJsLib.sipDotJsLibStrings.replaced,
    callback: js.Function1[/* session */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_terminated(
    name: sipDotJsLib.sipDotJsLibStrings.terminated,
    callback: js.Function2[/* message */ js.UndefOr[js.Any], /* cause */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def refer(target: java.lang.String): js.Any = js.native
  def refer(target: java.lang.String, options: js.Any): js.Any = js.native
  def refer(target: Session): js.Any = js.native
  def refer(target: Session, options: js.Any): js.Any = js.native
  def reinvite(): js.Any = js.native
  def reinvite(options: js.Any): js.Any = js.native
  def reinvite(
    options: js.Any,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): js.Any = js.native
   // TODO: This should take a URI
  def terminate(): Session = js.native
  def terminate(options: js.Any): Session = js.native
  def unhold(): scala.Unit = js.native
  def unhold(options: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions): scala.Unit = js.native
  def unhold(
    options: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): scala.Unit = js.native
}

