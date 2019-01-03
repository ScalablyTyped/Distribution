package typings
package sipDotJsLib.typesUaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/ua", "UA")
@js.native
class UA protected ()
  extends sipDotJsLib.typesEventDashEmitterMod.EventEmitter {
  def this(options: sipDotJsLib.typesUaMod.UANs.Options) = this()
  var contact: js.Any = js.native
   // TODO: Should be "trasnport" type
  var sessions: js.Array[sipDotJsLib.typesSessionMod.Session] = js.native
   // TODO: Fix this
  var transport: js.Any = js.native
  def invite(target: sipDotJsLib.typesUriMod.URI): sipDotJsLib.typesSessionMod.InviteClientContext = js.native
  def invite(
    target: sipDotJsLib.typesUriMod.URI,
    options: sipDotJsLib.typesSessionMod.InviteClientContextNs.Options
  ): sipDotJsLib.typesSessionMod.InviteClientContext = js.native
  def invite(
    target: sipDotJsLib.typesUriMod.URI,
    options: sipDotJsLib.typesSessionMod.InviteClientContextNs.Options,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): sipDotJsLib.typesSessionMod.InviteClientContext = js.native
  def isRegistered(): scala.Boolean = js.native
  def message(target: sipDotJsLib.typesUriMod.URI, body: java.lang.String): js.Any = js.native
  def message(target: sipDotJsLib.typesUriMod.URI, body: java.lang.String, options: js.Any): js.Any = js.native
  @JSName("on")
  def on_invite(
    name: sipDotJsLib.sipDotJsLibStrings.invite,
    callback: js.Function1[/* session */ sipDotJsLib.typesMod.InviteServerContext, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_inviteSent(
    name: sipDotJsLib.sipDotJsLibStrings.inviteSent,
    callback: js.Function1[/* session */ sipDotJsLib.typesSessionMod.InviteClientContext, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_message(
    name: sipDotJsLib.sipDotJsLibStrings.message,
    callback: js.Function1[/* message */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_newTransaction(
    name: sipDotJsLib.sipDotJsLibStrings.newTransaction,
    callback: js.Function1[/* transaction */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_notify(
    name: sipDotJsLib.sipDotJsLibStrings.notify,
    callback: js.Function1[/* request */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_outOfDialogReferRequested(
    name: sipDotJsLib.sipDotJsLibStrings.outOfDialogReferRequested,
    callback: js.Function1[/* context */ sipDotJsLib.typesMod.ReferServerContext, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_registered(
    name: sipDotJsLib.sipDotJsLibStrings.registered,
    callback: js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_registrationFailed(
    name: sipDotJsLib.sipDotJsLibStrings.registrationFailed,
    callback: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_transactionDestroyed(
    name: sipDotJsLib.sipDotJsLibStrings.transactionDestroyed,
    callback: js.Function1[/* transaction */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_transportCreated(
    name: sipDotJsLib.sipDotJsLibStrings.transportCreated,
    callback: js.Function1[/* transport */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_unregistered(
    name: sipDotJsLib.sipDotJsLibStrings.unregistered,
    callback: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def register(): UA = js.native
  def register(options: js.Any): UA = js.native
  def request(method: java.lang.String, target: sipDotJsLib.typesUriMod.URI): js.Any = js.native
  def request(method: java.lang.String, target: sipDotJsLib.typesUriMod.URI, options: js.Any): js.Any = js.native
  def start(): UA = js.native
  def stop(): UA = js.native
   //Returns a SIP.ClientContext
  def subscribe(target: sipDotJsLib.typesUriMod.URI, eventPackage: java.lang.String): js.Any = js.native
  def subscribe(target: sipDotJsLib.typesUriMod.URI, eventPackage: java.lang.String, options: js.Any): js.Any = js.native
  def unregister(): UA = js.native
  def unregister(options: js.Any): UA = js.native
}

