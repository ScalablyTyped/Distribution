package typings
package sipDotJsLib.libUAMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/UA", "UA")
@js.native
class UA ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(configuration: sipDotJsLib.libUAMod.UANs.Options) = this()
  var applicants: org.scalablytyped.runtime.StringDictionary[sipDotJsLib.libSessionMod.InviteClientContext] = js.native
  var cache: js.Any = js.native
  var checkAuthenticationFactory: js.Any = js.native
  var configuration: sipDotJsLib.libUAMod.UANs.Options = js.native
  var contact: sipDotJsLib.Anon_Options = js.native
  var data: js.Any = js.native
  var dialogs: org.scalablytyped.runtime.StringDictionary[sipDotJsLib.libDialogsMod.Dialog] = js.native
  var earlySubscriptions: org.scalablytyped.runtime.StringDictionary[sipDotJsLib.libSubscriptionMod.Subscription] = js.native
  var environListener: js.Any = js.native
  var error: js.Any = js.native
  /**
    * Get the dialog to which the request belongs to, if any.
    * @param {SIP.IncomingRequest}
    * @returns {SIP.Dialog|undefined}
    */
  var findDialog: js.Any = js.native
  /**
    * Get the subscription which has not been confirmed to which the request belongs to, if any
    * @param {SIP.IncomingRequest}
    * @returns {SIP.Subscription|undefined}
    */
  var findEarlySubscription: js.Any = js.native
  /**
    * Configuration checker.
    * @return {Boolean}
    */
  var getConfigurationCheck: js.Any = js.native
  var getCredentials: js.Any = js.native
  val ictTransactionsCount: scala.Double = js.native
  val istTransactionsCount: scala.Double = js.native
  /**
    * Configuration load.
    * returns {void}
    */
  var loadConfig: js.Any = js.native
  var log: js.Any = js.native
  var logger: sipDotJsLib.libLoggerFactoryMod.Logger = js.native
  val nictTransactionsCount: scala.Double = js.native
  val nistTransactionsCount: scala.Double = js.native
  /**
    * Transport connection event.
    * @event
    * @param {SIP.Transport} transport.
    */
  var onTransportConnected: js.Any = js.native
  var onTransportError: js.Any = js.native
  /**
    * Handle SIP message received from the transport.
    * @param messageString The message.
    */
  var onTransportReceiveMsg: js.Any = js.native
  var publishers: org.scalablytyped.runtime.StringDictionary[sipDotJsLib.libPublishContextMod.PublishContext] = js.native
  /**
    * Request reception
    * @private
    * @param {SIP.IncomingRequest} request.
    */
  var receiveRequest: js.Any = js.native
  var receiveRequestFromTransport: js.Any = js.native
  var receiveResponseFromTransport: js.Any = js.native
  var registerContext: js.Any = js.native
  var saveCredentials: js.Any = js.native
  var sessions: org.scalablytyped.runtime.StringDictionary[
    sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext
  ] = js.native
  /**
    * Helper function. Sets transport listeners
    */
  var setTransportListeners: js.Any = js.native
  var status: sipDotJsLib.libEnumsMod.UAStatus = js.native
  var subscriptions: org.scalablytyped.runtime.StringDictionary[sipDotJsLib.libSubscriptionMod.Subscription] = js.native
  var transactions: sipDotJsLib.Anon_Ict = js.native
  val transactionsCount: scala.Double = js.native
  var transport: js.UndefOr[sipDotJsLib.libTransportMod.Transport] = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  def destroyTransaction(transaction: sipDotJsLib.libTransactionsMod.InviteClientTransaction): scala.Unit = js.native
  def destroyTransaction(transaction: sipDotJsLib.libTransactionsMod.InviteServerTransaction): scala.Unit = js.native
  /**
    * destroy Transaction
    * @param {SIP.Transaction} transaction.
    */
  def destroyTransaction(transaction: sipDotJsLib.libTransactionsMod.NonInviteClientTransaction): scala.Unit = js.native
  def destroyTransaction(transaction: sipDotJsLib.libTransactionsMod.NonInviteServerTransaction): scala.Unit = js.native
  /**
    * Get the session to which the request belongs to, if any.
    * @param {SIP.IncomingRequest} request.
    * @returns {SIP.OutgoingSession|SIP.IncomingSession|undefined}
    */
  def findSession(request: sipDotJsLib.libSIPMessageMod.IncomingRequest): js.UndefOr[
    sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext
  ] = js.native
  def getLogger(category: java.lang.String): sipDotJsLib.libLoggerFactoryMod.Logger = js.native
  def getLogger(category: java.lang.String, label: java.lang.String): sipDotJsLib.libLoggerFactoryMod.Logger = js.native
  def getLoggerFactory(): sipDotJsLib.libLoggerFactoryMod.LoggerFactory = js.native
  /**
    * Make an outgoing call.
    *
    * @param {String} target
    * @param {Object} views
    * @param {Object} [options.media] gets passed to SIP.sessionDescriptionHandler.getDescription as mediaHint
    *
    * @throws {TypeError}
    *
    */
  def invite(target: java.lang.String): sipDotJsLib.libSessionMod.InviteClientContext = js.native
  def invite(target: java.lang.String, options: sipDotJsLib.libSessionMod.InviteClientContextNs.Options): sipDotJsLib.libSessionMod.InviteClientContext = js.native
  def invite(
    target: java.lang.String,
    options: sipDotJsLib.libSessionMod.InviteClientContextNs.Options,
    modifiers: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): sipDotJsLib.libSessionMod.InviteClientContext = js.native
  def invite(target: sipDotJsLib.libURIMod.URI): sipDotJsLib.libSessionMod.InviteClientContext = js.native
  def invite(
    target: sipDotJsLib.libURIMod.URI,
    options: sipDotJsLib.libSessionMod.InviteClientContextNs.Options
  ): sipDotJsLib.libSessionMod.InviteClientContext = js.native
  def invite(
    target: sipDotJsLib.libURIMod.URI,
    options: sipDotJsLib.libSessionMod.InviteClientContextNs.Options,
    modifiers: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): sipDotJsLib.libSessionMod.InviteClientContext = js.native
  def isRegistered(): scala.Boolean = js.native
  /**
    * Send a message.
    *
    * @param {String} target
    * @param {String} body
    * @param {Object} [options]
    *
    * @throws {TypeError}
    */
  def message(target: java.lang.String, body: java.lang.String): sipDotJsLib.libClientContextMod.ClientContext = js.native
  def message(target: java.lang.String, body: java.lang.String, options: js.Any): sipDotJsLib.libClientContextMod.ClientContext = js.native
  def message(target: sipDotJsLib.libURIMod.URI, body: java.lang.String): sipDotJsLib.libClientContextMod.ClientContext = js.native
  def message(target: sipDotJsLib.libURIMod.URI, body: java.lang.String, options: js.Any): sipDotJsLib.libClientContextMod.ClientContext = js.native
  def newTransaction(transaction: sipDotJsLib.libTransactionsMod.InviteClientTransaction): scala.Unit = js.native
  def newTransaction(transaction: sipDotJsLib.libTransactionsMod.InviteServerTransaction): scala.Unit = js.native
  /**
    * new Transaction
    * @private
    * @param {SIP.Transaction} transaction.
    */
  def newTransaction(transaction: sipDotJsLib.libTransactionsMod.NonInviteClientTransaction): scala.Unit = js.native
  def newTransaction(transaction: sipDotJsLib.libTransactionsMod.NonInviteServerTransaction): scala.Unit = js.native
  /**
    * Normalize a string into a valid SIP request URI
    *
    * @param {String} target
    *
    * @returns {SIP.URI|undefined}
    */
  def normalizeTarget(target: java.lang.String): js.UndefOr[sipDotJsLib.libURIMod.URI] = js.native
  def normalizeTarget(target: sipDotJsLib.libURIMod.URI): js.UndefOr[sipDotJsLib.libURIMod.URI] = js.native
  @JSName("on")
  def on_invite(
    name: sipDotJsLib.sipDotJsLibStrings.invite,
    callback: js.Function1[/* session */ sipDotJsLib.libSessionMod.InviteServerContext, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_inviteSent(
    name: sipDotJsLib.sipDotJsLibStrings.inviteSent,
    callback: js.Function1[/* session */ sipDotJsLib.libSessionMod.InviteClientContext, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    name: sipDotJsLib.sipDotJsLibStrings.message,
    callback: js.Function1[/* message */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_newTransaction(
    name: sipDotJsLib.sipDotJsLibStrings.newTransaction,
    callback: js.Function1[/* transaction */ sipDotJsLib.libTransactionsMod.Transaction, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_notify(
    name: sipDotJsLib.sipDotJsLibStrings.notify,
    callback: js.Function1[/* request */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_outOfDialogReferRequested(
    name: sipDotJsLib.sipDotJsLibStrings.outOfDialogReferRequested,
    callback: js.Function1[/* context */ sipDotJsLib.libSessionMod.ReferServerContext, scala.Unit]
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
    callback: js.Function1[/* transaction */ sipDotJsLib.libTransactionsMod.Transaction, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_transportCreated(
    name: sipDotJsLib.sipDotJsLibStrings.transportCreated,
    callback: js.Function1[/* transport */ sipDotJsLib.libTransportMod.Transport, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unregistered(
    name: sipDotJsLib.sipDotJsLibStrings.unregistered,
    callback: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[js.Any], scala.Unit]
  ): this.type = js.native
  /**
    * Send PUBLISH Event State Publication (RFC3903)
    *
    * @param {String} target
    * @param {String} event
    * @param {String} body
    * @param {Object} [options]
    *
    * @throws {SIP.Exceptions.MethodParameterError}
    */
  def publish(target: java.lang.String, event: java.lang.String, body: java.lang.String, options: js.Any): sipDotJsLib.libPublishContextMod.PublishContext = js.native
  def publish(
    target: sipDotJsLib.libURIMod.URI,
    event: java.lang.String,
    body: java.lang.String,
    options: js.Any
  ): sipDotJsLib.libPublishContextMod.PublishContext = js.native
  def register(): this.type = js.native
  def register(options: js.Any): this.type = js.native
  def request(method: java.lang.String, target: java.lang.String): sipDotJsLib.libClientContextMod.ClientContext = js.native
  def request(method: java.lang.String, target: java.lang.String, options: js.Any): sipDotJsLib.libClientContextMod.ClientContext = js.native
  def request(method: java.lang.String, target: sipDotJsLib.libURIMod.URI): sipDotJsLib.libClientContextMod.ClientContext = js.native
  def request(method: java.lang.String, target: sipDotJsLib.libURIMod.URI, options: js.Any): sipDotJsLib.libClientContextMod.ClientContext = js.native
  /**
    * Connect to the WS server if status = STATUS_INIT.
    * Resume UA after being closed.
    *
    */
  def start(): this.type = js.native
  /**
    * Gracefully close.
    */
  def stop(): this.type = js.native
  def subscribe(target: java.lang.String, event: java.lang.String, options: js.Any): sipDotJsLib.libSubscriptionMod.Subscription = js.native
  def subscribe(target: sipDotJsLib.libURIMod.URI, event: java.lang.String, options: js.Any): sipDotJsLib.libSubscriptionMod.Subscription = js.native
  /**
    * Unregister.
    *
    * @param {Boolean} [all] unregister all user bindings.
    *
    */
  def unregister(): this.type = js.native
  def unregister(options: js.Any): this.type = js.native
}

/* static members */
@JSImport("sip.js/lib/UA", "UA")
@js.native
object UA extends js.Object {
  val C: sipDotJsLib.Anon_ACCEPTEDBODYTYPES = js.native
}

