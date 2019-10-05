package typings.sipDotJs.libUAMod

import org.scalablytyped.runtime.StringDictionary
import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.Anon_Options
import typings.sipDotJs.libClientContextMod.ClientContext
import typings.sipDotJs.libCoreMessagesMethodsSubscribeMod.IncomingSubscribeRequest
import typings.sipDotJs.libCoreMod.IncomingRequestMessage
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libCoreMod.LoggerFactory
import typings.sipDotJs.libCoreMod.Transport
import typings.sipDotJs.libCoreMod.URI
import typings.sipDotJs.libCoreMod.UserAgentCore
import typings.sipDotJs.libEnumsMod.TypeStrings
import typings.sipDotJs.libEnumsMod.UAStatus
import typings.sipDotJs.libPublishContextMod.PublishContext
import typings.sipDotJs.libReferContextMod.ReferServerContext
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipDotJs.libSessionMod.InviteClientContext
import typings.sipDotJs.libSessionMod.InviteServerContext
import typings.sipDotJs.libSubscriptionMod.Subscription
import typings.sipDotJs.libUAMod.UA.Options
import typings.sipDotJs.sipDotJsStrings.invite
import typings.sipDotJs.sipDotJsStrings.inviteSent
import typings.sipDotJs.sipDotJsStrings.message
import typings.sipDotJs.sipDotJsStrings.notify
import typings.sipDotJs.sipDotJsStrings.outOfDialogReferRequested
import typings.sipDotJs.sipDotJsStrings.registered
import typings.sipDotJs.sipDotJsStrings.registrationFailed
import typings.sipDotJs.sipDotJsStrings.subscribe
import typings.sipDotJs.sipDotJsStrings.transportCreated
import typings.sipDotJs.sipDotJsStrings.unregistered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/UA", "UA")
@js.native
class UA_ () extends EventEmitter {
  def this(configuration: Options) = this()
  var applicants: StringDictionary[InviteClientContext] = js.native
  var checkAuthenticationFactory: js.Any = js.native
  var configuration: Options = js.native
  var contact: Anon_Options = js.native
  var data: js.Any = js.native
  var error: js.Any = js.native
  /**
    * Configuration checker.
    * @return {Boolean}
    */
  var getConfigurationCheck: js.Any = js.native
  /**
    * Configuration load.
    * returns {void}
    */
  var loadConfig: js.Any = js.native
  var log: js.Any = js.native
  var logger: Logger = js.native
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
  var publishers: StringDictionary[PublishContext] = js.native
  var registerContext: js.Any = js.native
  var sessions: StringDictionary[InviteClientContext | InviteServerContext] = js.native
  /**
    * Helper function. Sets transport listeners
    */
  var setTransportListeners: js.Any = js.native
  var status: UAStatus = js.native
  var subscriptions: StringDictionary[Subscription] = js.native
  var transport: Transport = js.native
  var `type`: TypeStrings = js.native
  /** Unload listener. */
  var unloadListener: js.Any = js.native
  var userAgentCore: UserAgentCore = js.native
  /**
    * Get the session to which the request belongs to, if any.
    * @param {SIP.IncomingRequest} request.
    * @returns {SIP.OutgoingSession|SIP.IncomingSession|undefined}
    */
  def findSession(request: IncomingRequestMessage): js.UndefOr[InviteClientContext | InviteServerContext] = js.native
  def getLogger(category: String): Logger = js.native
  def getLogger(category: String, label: String): Logger = js.native
  def getLoggerFactory(): LoggerFactory = js.native
  def getSupportedResponseOptions(): js.Array[String] = js.native
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
  def invite(target: String): InviteClientContext = js.native
  def invite(target: String, options: typings.sipDotJs.libSessionMod.InviteClientContext.Options): InviteClientContext = js.native
  def invite(
    target: String,
    options: typings.sipDotJs.libSessionMod.InviteClientContext.Options,
    modifiers: SessionDescriptionHandlerModifiers
  ): InviteClientContext = js.native
  def invite(target: URI): InviteClientContext = js.native
  def invite(target: URI, options: typings.sipDotJs.libSessionMod.InviteClientContext.Options): InviteClientContext = js.native
  def invite(
    target: URI,
    options: typings.sipDotJs.libSessionMod.InviteClientContext.Options,
    modifiers: SessionDescriptionHandlerModifiers
  ): InviteClientContext = js.native
  def isRegistered(): Boolean = js.native
  /**
    * Send a message.
    *
    * @param {String} target
    * @param {String} body
    * @param {Object} [options]
    *
    * @throws {TypeError}
    */
  def message(target: String, body: String): ClientContext = js.native
  def message(target: String, body: String, options: js.Any): ClientContext = js.native
  def message(target: URI, body: String): ClientContext = js.native
  def message(target: URI, body: String, options: js.Any): ClientContext = js.native
  /**
    * Normalize a string into a valid SIP request URI
    *
    * @param {String} target
    *
    * @returns {SIP.URI|undefined}
    */
  def normalizeTarget(target: String): js.UndefOr[URI] = js.native
  def normalizeTarget(target: URI): js.UndefOr[URI] = js.native
  @JSName("on")
  def on_invite(name: invite, callback: js.Function1[/* session */ InviteServerContext, Unit]): this.type = js.native
  @JSName("on")
  def on_inviteSent(name: inviteSent, callback: js.Function1[/* session */ InviteClientContext, Unit]): this.type = js.native
  @JSName("on")
  def on_message(name: message, callback: js.Function1[/* message */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_notify(name: notify, callback: js.Function1[/* request */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_outOfDialogReferRequested(name: outOfDialogReferRequested, callback: js.Function1[/* context */ ReferServerContext, Unit]): this.type = js.native
  @JSName("on")
  def on_registered(name: registered, callback: js.Function1[/* response */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("on")
  def on_registrationFailed(
    name: registrationFailed,
    callback: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_subscribe(name: subscribe, callback: js.Function1[/* subscribe */ IncomingSubscribeRequest, Unit]): this.type = js.native
  @JSName("on")
  def on_transportCreated(name: transportCreated, callback: js.Function1[/* transport */ Transport, Unit]): this.type = js.native
  @JSName("on")
  def on_unregistered(
    name: unregistered,
    callback: js.Function2[/* response */ js.UndefOr[js.Any], /* cause */ js.UndefOr[js.Any], Unit]
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
  def publish(target: String, event: String, body: String, options: js.Any): PublishContext = js.native
  def publish(target: URI, event: String, body: String, options: js.Any): PublishContext = js.native
  def register(): this.type = js.native
  def register(options: js.Any): this.type = js.native
  def request(method: String, target: String): ClientContext = js.native
  def request(method: String, target: String, options: js.Any): ClientContext = js.native
  def request(method: String, target: URI): ClientContext = js.native
  def request(method: String, target: URI, options: js.Any): ClientContext = js.native
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
  def subscribe(target: String, event: String, options: js.Any): Subscription = js.native
  def subscribe(target: URI, event: String, options: js.Any): Subscription = js.native
  /**
    * Unregister.
    *
    * @param {Boolean} [all] unregister all user bindings.
    *
    */
  def unregister(): this.type = js.native
  def unregister(options: js.Any): this.type = js.native
}

