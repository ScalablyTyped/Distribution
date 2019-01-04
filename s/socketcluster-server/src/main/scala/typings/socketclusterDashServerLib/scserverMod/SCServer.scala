package typings
package socketclusterDashServerLib.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCServer
  extends nodeLib.eventsMod.EventEmitter {
  val MIDDLEWARE_AUTHENTICATE: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticate = js.native
  val MIDDLEWARE_EMIT: socketclusterDashServerLib.socketclusterDashServerLibStrings.emit = js.native
  val MIDDLEWARE_HANDSHAKE_SC: socketclusterDashServerLib.socketclusterDashServerLibStrings.handshakeSC = js.native
  val MIDDLEWARE_HANDSHAKE_WS: socketclusterDashServerLib.socketclusterDashServerLibStrings.handshakeWS = js.native
  val MIDDLEWARE_PUBLISH_IN: socketclusterDashServerLib.socketclusterDashServerLibStrings.publishIn = js.native
  val MIDDLEWARE_PUBLISH_OUT: socketclusterDashServerLib.socketclusterDashServerLibStrings.publishOut = js.native
  val MIDDLEWARE_SUBSCRIBE: socketclusterDashServerLib.socketclusterDashServerLibStrings.subscribe = js.native
  var clients: org.scalablytyped.runtime.StringDictionary[socketclusterDashServerLib.scserversocketMod.namespaced] = js.native
  var clientsCount: scala.Double = js.native
  var exchange: scDashBrokerDashClusterLib.scDashBrokerDashClusterMod.SCExchange = js.native
  var options: socketclusterDashServerLib.scserverMod.SCServerNs.SCServerOptions = js.native
  var pendingClients: org.scalablytyped.runtime.StringDictionary[socketclusterDashServerLib.scserversocketMod.namespaced] = js.native
  var pendingClientsCount: scala.Double = js.native
  @JSName("addMiddleware")
  def addMiddleware_authenticate(
    `type`: socketclusterDashServerLib.socketclusterDashServerLibStrings.authenticate,
    middlewareFn: js.Function2[
      /* req */ socketclusterDashServerLib.scserverMod.SCServerNs.AuthenticateRequest, 
      /* next */ socketclusterDashServerLib.scserverMod.SCServerNs.nextAuthenticateMiddlewareFunction, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_emit(
    `type`: socketclusterDashServerLib.socketclusterDashServerLibStrings.emit,
    middlewareFn: js.Function2[
      /* req */ socketclusterDashServerLib.scserverMod.SCServerNs.EmitRequest, 
      /* next */ socketclusterDashServerLib.scserverMod.SCServerNs.nextMiddlewareFunction, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_handshakeSC(
    `type`: socketclusterDashServerLib.socketclusterDashServerLibStrings.handshakeSC,
    middlewareFn: js.Function2[
      /* req */ socketclusterDashServerLib.scserverMod.SCServerNs.HandshakeSCRequest, 
      /* next */ socketclusterDashServerLib.scserverMod.SCServerNs.nextHandshakeSCMiddlewareFunction, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_handshakeWS(
    `type`: socketclusterDashServerLib.socketclusterDashServerLibStrings.handshakeWS,
    middlewareFn: js.Function2[
      /* req */ nodeLib.httpMod.IncomingMessage, 
      /* next */ socketclusterDashServerLib.scserverMod.SCServerNs.nextMiddlewareFunction, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_publishIn(
    `type`: socketclusterDashServerLib.socketclusterDashServerLibStrings.publishIn,
    middlewareFn: js.Function2[
      /* req */ socketclusterDashServerLib.scserverMod.SCServerNs.PublishInRequest, 
      /* next */ socketclusterDashServerLib.scserverMod.SCServerNs.nextMiddlewareFunction, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_publishOut(
    `type`: socketclusterDashServerLib.socketclusterDashServerLibStrings.publishOut,
    middlewareFn: js.Function2[
      /* req */ socketclusterDashServerLib.scserverMod.SCServerNs.PublishOutRequest, 
      /* next */ socketclusterDashServerLib.scserverMod.SCServerNs.nextMiddlewareFunction, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("addMiddleware")
  def addMiddleware_subscribe(
    `type`: socketclusterDashServerLib.socketclusterDashServerLibStrings.subscribe,
    middlewareFn: js.Function2[
      /* req */ socketclusterDashServerLib.scserverMod.SCServerNs.SubscribeRequest, 
      /* next */ socketclusterDashServerLib.scserverMod.SCServerNs.nextMiddlewareFunction, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_badSocketAuthToken(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.badSocketAuthToken,
    listener: socketclusterDashServerLib.scserverMod.SCServerNs.badSocketAuthTokenListenerFunction
  ): this.type = js.native
  @JSName("on")
  def on_closure(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.closure,
    listener: socketclusterDashServerLib.scserverMod.SCServerNs.disconnectionListenerFunction
  ): this.type = js.native
  @JSName("on")
  def on_connection(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.connection,
    listener: socketclusterDashServerLib.scserverMod.SCServerNs.connectionListenerFunction
  ): this.type = js.native
  @JSName("on")
  def on_connectionAbort(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.connectionAbort,
    listener: socketclusterDashServerLib.scserverMod.SCServerNs.disconnectionListenerFunction
  ): this.type = js.native
  @JSName("on")
  def on_disconnection(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.disconnection,
    listener: socketclusterDashServerLib.scserverMod.SCServerNs.disconnectionListenerFunction
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.error,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_handshake(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.handshake,
    listener: socketclusterDashServerLib.scserverMod.SCServerNs.handshakeListenerFunction
  ): this.type = js.native
  @JSName("on")
  def on_ready(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.ready,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_subscription(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.subscription,
    listener: socketclusterDashServerLib.scserverMod.SCServerNs.subscriptionListenerFunction
  ): this.type = js.native
  @JSName("on")
  def on_unsubscription(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.unsubscription,
    listener: socketclusterDashServerLib.scserverMod.SCServerNs.unsubscriptionListenerFunction
  ): this.type = js.native
  @JSName("on")
  def on_warning(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.warning,
    listener: js.Function1[/* error */ nodeLib.Error, scala.Unit]
  ): this.type = js.native
  def setAuthEngine(authEngine: scDashAuthLib.scDashAuthMod.SCAuthEngine): scala.Unit = js.native
  def setCodecEngine(codecEngine: socketclusterDashServerLib.scserverMod.SCServerNs.SCCodecEngine): scala.Unit = js.native
}

