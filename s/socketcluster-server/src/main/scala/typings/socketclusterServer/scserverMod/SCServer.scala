package typings.socketclusterServer.scserverMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.httpMod.IncomingMessage
import typings.scAuth.mod.SCAuthEngine
import typings.scBrokerCluster.mod.Client
import typings.scBrokerCluster.mod.SCExchange
import typings.socketclusterServer.socketclusterServerStrings.authenticate
import typings.socketclusterServer.socketclusterServerStrings.badSocketAuthToken
import typings.socketclusterServer.socketclusterServerStrings.closure
import typings.socketclusterServer.socketclusterServerStrings.connection
import typings.socketclusterServer.socketclusterServerStrings.connectionAbort
import typings.socketclusterServer.socketclusterServerStrings.disconnection
import typings.socketclusterServer.socketclusterServerStrings.emit
import typings.socketclusterServer.socketclusterServerStrings.error
import typings.socketclusterServer.socketclusterServerStrings.handshake
import typings.socketclusterServer.socketclusterServerStrings.handshakeSC
import typings.socketclusterServer.socketclusterServerStrings.handshakeWS
import typings.socketclusterServer.socketclusterServerStrings.publishIn
import typings.socketclusterServer.socketclusterServerStrings.publishOut
import typings.socketclusterServer.socketclusterServerStrings.ready
import typings.socketclusterServer.socketclusterServerStrings.subscribe
import typings.socketclusterServer.socketclusterServerStrings.subscription
import typings.socketclusterServer.socketclusterServerStrings.unsubscription
import typings.socketclusterServer.socketclusterServerStrings.warning
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCServer extends EventEmitter {
  val MIDDLEWARE_AUTHENTICATE: authenticate = js.native
  val MIDDLEWARE_EMIT: emit = js.native
  val MIDDLEWARE_HANDSHAKE_SC: handshakeSC = js.native
  val MIDDLEWARE_HANDSHAKE_WS: handshakeWS = js.native
  val MIDDLEWARE_PUBLISH_IN: publishIn = js.native
  val MIDDLEWARE_PUBLISH_OUT: publishOut = js.native
  val MIDDLEWARE_SUBSCRIBE: subscribe = js.native
  var auth: SCAuthEngine = js.native
  var brokerEngine: Client = js.native
  var clients: StringDictionary[typings.socketclusterServer.scserversocketMod.^] = js.native
  var clientsCount: Double = js.native
  var codec: SCCodecEngine = js.native
  var exchange: SCExchange = js.native
  var options: SCServerOptions = js.native
  var pendingClients: StringDictionary[typings.socketclusterServer.scserversocketMod.^] = js.native
  var pendingClientsCount: Double = js.native
  @JSName("addMiddleware")
  def addMiddleware_authenticate(
    `type`: authenticate,
    middlewareFn: js.Function2[/* req */ AuthenticateRequest, /* next */ nextAuthenticateMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_emit(
    `type`: emit,
    middlewareFn: js.Function2[/* req */ EmitRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_handshakeSC(
    `type`: handshakeSC,
    middlewareFn: js.Function2[/* req */ HandshakeSCRequest, /* next */ nextHandshakeSCMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_handshakeWS(
    `type`: handshakeWS,
    middlewareFn: js.Function2[/* req */ IncomingMessage, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_publishIn(
    `type`: publishIn,
    middlewareFn: js.Function2[/* req */ PublishInRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_publishOut(
    `type`: publishOut,
    middlewareFn: js.Function2[/* req */ PublishOutRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_subscribe(
    `type`: subscribe,
    middlewareFn: js.Function2[/* req */ SubscribeRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  def close(): Unit = js.native
  def close(cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def generateId(): String = js.native
  def getPath(): String = js.native
  def isAuthTokenExpired(token: AuthToken): Boolean = js.native
  @JSName("on")
  def on_badSocketAuthToken(event: badSocketAuthToken, listener: badSocketAuthTokenListenerFunction): this.type = js.native
  @JSName("on")
  def on_closure(event: closure, listener: disconnectionListenerFunction): this.type = js.native
  @JSName("on")
  def on_connection(event: connection, listener: connectionListenerFunction): this.type = js.native
  @JSName("on")
  def on_connectionAbort(event: connectionAbort, listener: disconnectionListenerFunction): this.type = js.native
  @JSName("on")
  def on_disconnection(event: disconnection, listener: disconnectionListenerFunction): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_handshake(event: handshake, listener: handshakeListenerFunction): this.type = js.native
  @JSName("on")
  def on_ready(event: ready, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_subscription(event: subscription, listener: subscriptionListenerFunction): this.type = js.native
  @JSName("on")
  def on_unsubscription(event: unsubscription, listener: unsubscriptionListenerFunction): this.type = js.native
  @JSName("on")
  def on_warning(event: warning, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_authenticate(
    `type`: authenticate,
    middlewareFn: js.Function2[/* req */ AuthenticateRequest, /* next */ nextAuthenticateMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_emit(
    `type`: emit,
    middlewareFn: js.Function2[/* req */ EmitRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_handshakeSC(
    `type`: handshakeSC,
    middlewareFn: js.Function2[/* req */ HandshakeSCRequest, /* next */ nextHandshakeSCMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_handshakeWS(
    `type`: handshakeWS,
    middlewareFn: js.Function2[/* req */ IncomingMessage, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_publishIn(
    `type`: publishIn,
    middlewareFn: js.Function2[/* req */ PublishInRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_publishOut(
    `type`: publishOut,
    middlewareFn: js.Function2[/* req */ PublishOutRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  @JSName("removeMiddleware")
  def removeMiddleware_subscribe(
    `type`: subscribe,
    middlewareFn: js.Function2[/* req */ SubscribeRequest, /* next */ nextMiddlewareFunction, Unit]
  ): Unit = js.native
  def setAuthEngine(authEngine: SCAuthEngine): Unit = js.native
  def setCodecEngine(codecEngine: SCCodecEngine): Unit = js.native
  def verifyHandshake(info: VerifyHandshakeInfo, cb: verifyHandshakeFunction): Unit = js.native
  def verifyInboundEvent(
    socket: typings.socketclusterServer.scserversocketMod.^,
    eventName: String,
    eventData: js.Any,
    cb: js.Function3[/* err */ Error, /* eventData */ js.Any, /* ackData */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def verifyOutboundEvent(
    socket: typings.socketclusterServer.scserversocketMod.^,
    eventName: String,
    eventData: js.Any,
    options: js.Object,
    cb: js.Function2[/* err */ Error | Null, /* eventData */ js.Any, Unit]
  ): Unit = js.native
  def verifyOutboundEvent(
    socket: typings.socketclusterServer.scserversocketMod.^,
    eventName: String,
    eventData: js.Any,
    options: Null,
    cb: js.Function2[/* err */ Error | Null, /* eventData */ js.Any, Unit]
  ): Unit = js.native
}

