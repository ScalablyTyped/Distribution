package typings
package sipDotJsLib.typesUaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/ua", "UA")
@js.native
class UA protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(options: sipDotJsLib.typesUaMod.UANs.Options) = this()
  var applicants: org.scalablytyped.runtime.StringDictionary[sipDotJsLib.typesSessionMod.InviteClientContext] = js.native
  var configuration: sipDotJsLib.typesUaMod.UANs.Options = js.native
  var contact: sipDotJsLib.Anon_Options = js.native
  var data: js.Any = js.native
  var dialogs: org.scalablytyped.runtime.StringDictionary[sipDotJsLib.typesDialogsMod.Dialog] = js.native
  var earlySubscriptions: org.scalablytyped.runtime.StringDictionary[sipDotJsLib.typesSubscriptionMod.Subscription] = js.native
  var ictTransactionsCount: scala.Double = js.native
  var istTransactionsCount: scala.Double = js.native
  var logger: sipDotJsLib.typesLoggerDashFactoryMod.Logger = js.native
  var nictTransactionsCount: scala.Double = js.native
  var nistTransactionsCount: scala.Double = js.native
  var publishers: org.scalablytyped.runtime.StringDictionary[sipDotJsLib.typesPublishDashContextMod.PublishContext] = js.native
  var sessions: org.scalablytyped.runtime.StringDictionary[
    sipDotJsLib.typesSessionMod.InviteClientContext | sipDotJsLib.typesSessionMod.InviteServerContext
  ] = js.native
  var status: sipDotJsLib.typesEnumsMod.UAStatus = js.native
  var subscriptions: org.scalablytyped.runtime.StringDictionary[sipDotJsLib.typesSubscriptionMod.Subscription] = js.native
  var transactions: sipDotJsLib.Anon_Ict = js.native
  var transactionsCount: scala.Double = js.native
  var transport: js.UndefOr[sipDotJsLib.typesTransportMod.Transport] = js.native
  var `type`: sipDotJsLib.typesEnumsMod.TypeStrings = js.native
  def destroyTransaction(transaction: sipDotJsLib.typesTransactionsMod.InviteClientTransaction): scala.Unit = js.native
  def destroyTransaction(transaction: sipDotJsLib.typesTransactionsMod.InviteServerTransaction): scala.Unit = js.native
  def destroyTransaction(transaction: sipDotJsLib.typesTransactionsMod.NonInviteClientTransaction): scala.Unit = js.native
  def destroyTransaction(transaction: sipDotJsLib.typesTransactionsMod.NonInviteServerTransaction): scala.Unit = js.native
  def findSession(request: sipDotJsLib.typesSipDashMessageMod.IncomingRequest): js.UndefOr[
    sipDotJsLib.typesSessionMod.InviteClientContext | sipDotJsLib.typesSessionMod.InviteServerContext
  ] = js.native
  def getLogger(category: java.lang.String): sipDotJsLib.typesLoggerDashFactoryMod.Logger = js.native
  def getLogger(category: java.lang.String, label: java.lang.String): sipDotJsLib.typesLoggerDashFactoryMod.Logger = js.native
  def getLoggerFactory(): sipDotJsLib.typesLoggerDashFactoryMod.LoggerFactory = js.native
  def invite(target: java.lang.String): sipDotJsLib.typesSessionMod.InviteClientContext = js.native
  def invite(target: java.lang.String, options: sipDotJsLib.typesSessionMod.InviteClientContextNs.Options): sipDotJsLib.typesSessionMod.InviteClientContext = js.native
  def invite(
    target: java.lang.String,
    options: sipDotJsLib.typesSessionMod.InviteClientContextNs.Options,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): sipDotJsLib.typesSessionMod.InviteClientContext = js.native
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
  def message(target: java.lang.String, body: java.lang.String): sipDotJsLib.typesClientDashContextMod.ClientContext = js.native
  def message(target: java.lang.String, body: java.lang.String, options: js.Any): sipDotJsLib.typesClientDashContextMod.ClientContext = js.native
  def message(target: sipDotJsLib.typesUriMod.URI, body: java.lang.String): sipDotJsLib.typesClientDashContextMod.ClientContext = js.native
  def message(target: sipDotJsLib.typesUriMod.URI, body: java.lang.String, options: js.Any): sipDotJsLib.typesClientDashContextMod.ClientContext = js.native
  def newTransaction(transaction: sipDotJsLib.typesTransactionsMod.InviteClientTransaction): scala.Unit = js.native
  def newTransaction(transaction: sipDotJsLib.typesTransactionsMod.InviteServerTransaction): scala.Unit = js.native
  def newTransaction(transaction: sipDotJsLib.typesTransactionsMod.NonInviteClientTransaction): scala.Unit = js.native
  def newTransaction(transaction: sipDotJsLib.typesTransactionsMod.NonInviteServerTransaction): scala.Unit = js.native
  def normalizeTarget(target: java.lang.String): js.UndefOr[sipDotJsLib.typesUriMod.URI] = js.native
  def normalizeTarget(target: sipDotJsLib.typesUriMod.URI): js.UndefOr[sipDotJsLib.typesUriMod.URI] = js.native
  @JSName("on")
  def on_invite(
    name: sipDotJsLib.sipDotJsLibStrings.invite,
    callback: js.Function1[/* session */ sipDotJsLib.typesSessionMod.InviteServerContext, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_inviteSent(
    name: sipDotJsLib.sipDotJsLibStrings.inviteSent,
    callback: js.Function1[/* session */ sipDotJsLib.typesSessionMod.InviteClientContext, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    name: sipDotJsLib.sipDotJsLibStrings.message,
    callback: js.Function1[/* message */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_newTransaction(
    name: sipDotJsLib.sipDotJsLibStrings.newTransaction,
    callback: js.Function1[/* transaction */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_notify(
    name: sipDotJsLib.sipDotJsLibStrings.notify,
    callback: js.Function1[/* request */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_outOfDialogReferRequested(
    name: sipDotJsLib.sipDotJsLibStrings.outOfDialogReferRequested,
    callback: js.Function1[/* context */ sipDotJsLib.typesSessionMod.ReferServerContext, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_registered(
    name: sipDotJsLib.sipDotJsLibStrings.registered,
    callback: js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_registrationFailed(
    name: sipDotJsLib.sipDotJsLibStrings.registrationFailed,
    callback: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_transactionDestroyed(
    name: sipDotJsLib.sipDotJsLibStrings.transactionDestroyed,
    callback: js.Function1[/* transaction */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_transportCreated(
    name: sipDotJsLib.sipDotJsLibStrings.transportCreated,
    callback: js.Function1[/* transport */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unregistered(
    name: sipDotJsLib.sipDotJsLibStrings.unregistered,
    callback: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  def publish(target: java.lang.String, event: java.lang.String, body: java.lang.String): sipDotJsLib.typesPublishDashContextMod.PublishContext = js.native
  def publish(target: java.lang.String, event: java.lang.String, body: java.lang.String, options: js.Any): sipDotJsLib.typesPublishDashContextMod.PublishContext = js.native
  def register(): this.type = js.native
  def register(options: js.Any): this.type = js.native
  def request(method: java.lang.String, target: java.lang.String): sipDotJsLib.typesClientDashContextMod.ClientContext = js.native
  def request(method: java.lang.String, target: java.lang.String, options: js.Any): sipDotJsLib.typesClientDashContextMod.ClientContext = js.native
  def request(method: java.lang.String, target: sipDotJsLib.typesUriMod.URI): sipDotJsLib.typesClientDashContextMod.ClientContext = js.native
  def request(method: java.lang.String, target: sipDotJsLib.typesUriMod.URI, options: js.Any): sipDotJsLib.typesClientDashContextMod.ClientContext = js.native
  def start(): this.type = js.native
  def stop(): this.type = js.native
  def subscribe(target: java.lang.String, eventPackage: java.lang.String): sipDotJsLib.typesSubscriptionMod.Subscription = js.native
  def subscribe(target: java.lang.String, eventPackage: java.lang.String, options: js.Any): sipDotJsLib.typesSubscriptionMod.Subscription = js.native
  def subscribe(target: sipDotJsLib.typesUriMod.URI, eventPackage: java.lang.String): sipDotJsLib.typesSubscriptionMod.Subscription = js.native
  def subscribe(target: sipDotJsLib.typesUriMod.URI, eventPackage: java.lang.String, options: js.Any): sipDotJsLib.typesSubscriptionMod.Subscription = js.native
  def unregister(): this.type = js.native
  def unregister(options: js.Any): this.type = js.native
}

/* static members */
@JSImport("sip.js/types/ua", "UA")
@js.native
object UA extends js.Object {
  val C: js.Any = js.native
}

