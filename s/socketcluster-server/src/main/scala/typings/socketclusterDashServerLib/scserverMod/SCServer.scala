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
  var clients: ScalablyTyped.runtime.StringDictionary[socketclusterDashServerLib.scserversocketMod.namespaced] = js.native
  var clientsCount: scala.Double = js.native
  var exchange: scDashBrokerDashClusterLib.scDashBrokerDashClusterMod.SCExchange = js.native
  var options: socketclusterDashServerLib.scserverMod.SCServerNs.SCServerOptions = js.native
  var pendingClients: ScalablyTyped.runtime.StringDictionary[socketclusterDashServerLib.scserversocketMod.namespaced] = js.native
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
  def on_connection(
    event: socketclusterDashServerLib.socketclusterDashServerLibStrings.connection,
    listener: socketclusterDashServerLib.scserverMod.SCServerNs.connectionListenerFunction
  ): this.type = js.native
  def setAuthEngine(authEngine: scDashAuthLib.scDashAuthMod.SCAuthEngine): scala.Unit = js.native
  def setCodecEngine(codecEngine: socketclusterDashServerLib.scserverMod.SCServerNs.SCCodecEngine): scala.Unit = js.native
}

