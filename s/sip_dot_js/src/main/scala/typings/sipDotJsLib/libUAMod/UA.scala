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
  var checkAuthenticationFactory: js.Any = js.native
  var configuration: sipDotJsLib.libUAMod.UANs.Options = js.native
  var contact: sipDotJsLib.Anon_Options = js.native
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
  var logger: sipDotJsLib.libCoreMod.Logger = js.native
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
  var registerContext: js.Any = js.native
  var sessions: org.scalablytyped.runtime.StringDictionary[
    sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext
  ] = js.native
  /**
    * Helper function. Sets transport listeners
    */
  var setTransportListeners: js.Any = js.native
  var status: sipDotJsLib.libEnumsMod.UAStatus = js.native
  var subscriptions: org.scalablytyped.runtime.StringDictionary[sipDotJsLib.libSubscriptionMod.Subscription] = js.native
  var transport: sipDotJsLib.libCoreMod.Transport = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  /** Unload listener. */
  var unloadListener: js.Any = js.native
  var userAgentCore: sipDotJsLib.libCoreMod.UserAgentCore = js.native
  /**
    * Get the session to which the request belongs to, if any.
    * @param {SIP.IncomingRequest} request.
    * @returns {SIP.OutgoingSession|SIP.IncomingSession|undefined}
    */
  def findSession(request: sipDotJsLib.libCoreMod.IncomingRequestMessage): js.UndefOr[
    sipDotJsLib.libSessionMod.InviteClientContext | sipDotJsLib.libSessionMod.InviteServerContext
  ] = js.native
  def getLogger(category: java.lang.String): sipDotJsLib.libCoreMod.Logger = js.native
  def getLogger(category: java.lang.String, label: java.lang.String): sipDotJsLib.libCoreMod.Logger = js.native
  def getLoggerFactory(): sipDotJsLib.libCoreMod.LoggerFactory = js.native
  def getSupportedResponseOptions(): js.Array[java.lang.String] = js.native
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
  def invite(target: sipDotJsLib.libCoreMod.URI): sipDotJsLib.libSessionMod.InviteClientContext = js.native
  def invite(
    target: sipDotJsLib.libCoreMod.URI,
    options: sipDotJsLib.libSessionMod.InviteClientContextNs.Options
  ): sipDotJsLib.libSessionMod.InviteClientContext = js.native
  def invite(
    target: sipDotJsLib.libCoreMod.URI,
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
  def message(target: sipDotJsLib.libCoreMod.URI, body: java.lang.String): sipDotJsLib.libClientContextMod.ClientContext = js.native
  def message(target: sipDotJsLib.libCoreMod.URI, body: java.lang.String, options: js.Any): sipDotJsLib.libClientContextMod.ClientContext = js.native
  /**
    * Normalize a string into a valid SIP request URI
    *
    * @param {String} target
    *
    * @returns {SIP.URI|undefined}
    */
  def normalizeTarget(target: java.lang.String): js.UndefOr[sipDotJsLib.libCoreMod.URI] = js.native
  def normalizeTarget(target: sipDotJsLib.libCoreMod.URI): js.UndefOr[sipDotJsLib.libCoreMod.URI] = js.native
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
  def on_notify(
    name: sipDotJsLib.sipDotJsLibStrings.notify,
    callback: js.Function1[/* request */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_outOfDialogReferRequested(
    name: sipDotJsLib.sipDotJsLibStrings.outOfDialogReferRequested,
    callback: js.Function1[/* context */ sipDotJsLib.libReferContextMod.ReferServerContext, scala.Unit]
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
  def on_subscribe(
    name: sipDotJsLib.sipDotJsLibStrings.subscribe,
    callback: js.Function1[
      /* subscribe */ sipDotJsLib.libCoreMessagesMethodsSubscribeMod.IncomingSubscribeRequest, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_transportCreated(
    name: sipDotJsLib.sipDotJsLibStrings.transportCreated,
    callback: js.Function1[/* transport */ sipDotJsLib.libCoreMod.Transport, scala.Unit]
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
    target: sipDotJsLib.libCoreMod.URI,
    event: java.lang.String,
    body: java.lang.String,
    options: js.Any
  ): sipDotJsLib.libPublishContextMod.PublishContext = js.native
  def register(): this.type = js.native
  def register(options: js.Any): this.type = js.native
  def request(method: java.lang.String, target: java.lang.String): sipDotJsLib.libClientContextMod.ClientContext = js.native
  def request(method: java.lang.String, target: java.lang.String, options: js.Any): sipDotJsLib.libClientContextMod.ClientContext = js.native
  def request(method: java.lang.String, target: sipDotJsLib.libCoreMod.URI): sipDotJsLib.libClientContextMod.ClientContext = js.native
  def request(method: java.lang.String, target: sipDotJsLib.libCoreMod.URI, options: js.Any): sipDotJsLib.libClientContextMod.ClientContext = js.native
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
  def subscribe(target: sipDotJsLib.libCoreMod.URI, event: java.lang.String, options: js.Any): sipDotJsLib.libSubscriptionMod.Subscription = js.native
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

