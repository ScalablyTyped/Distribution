package typings.socketclusterServer.scserversocketMod

import typings.componentEmitter.mod.Emitter
import typings.jsonwebtoken.mod.SignOptions
import typings.node.httpMod.IncomingMessage
import typings.scBrokerCluster.mod.SCExchange
import typings.socketclusterServer.AnonBatch
import typings.socketclusterServer.AnonBinary
import typings.socketclusterServer.scserverMod.AuthToken
import typings.socketclusterServer.socketclusterServerStrings.authStateChange
import typings.socketclusterServer.socketclusterServerStrings.authenticate
import typings.socketclusterServer.socketclusterServerStrings.authenticated
import typings.socketclusterServer.socketclusterServerStrings.close
import typings.socketclusterServer.socketclusterServerStrings.closed
import typings.socketclusterServer.socketclusterServerStrings.connectAbort
import typings.socketclusterServer.socketclusterServerStrings.connecting
import typings.socketclusterServer.socketclusterServerStrings.deauthenticate
import typings.socketclusterServer.socketclusterServerStrings.disconnect
import typings.socketclusterServer.socketclusterServerStrings.error
import typings.socketclusterServer.socketclusterServerStrings.message
import typings.socketclusterServer.socketclusterServerStrings.open
import typings.socketclusterServer.socketclusterServerStrings.raw
import typings.socketclusterServer.socketclusterServerStrings.unauthenticated
import typings.std.Error
import typings.ws.mod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCServerSocket extends Emitter {
  val AUTHENTICATED: authenticated = js.native
  val CLOSED: closed = js.native
  val CONNECTING: connecting = js.native
  val OPEN: open = js.native
  val UNAUTHENTICATED: unauthenticated = js.native
  var authState: authenticated | unauthenticated = js.native
  var authToken: js.UndefOr[AuthToken] = js.native
  var exchange: SCExchange = js.native
  var id: String = js.native
  var remoteAddress: String = js.native
  var remoteFamily: String = js.native
  var remotePort: Double = js.native
  var request: IncomingMessage = js.native
  var state: connecting | open | closed = js.native
  def deauthenticate(): Unit = js.native
  def deauthenticate(callback: EmitCallback): Unit = js.native
  def deauthenticateSelf(): Unit = js.native
  def decode(message: js.Any): js.Any = js.native
  def destroy(): Unit = js.native
  def destroy(code: Double): Unit = js.native
  def destroy(code: Double, data: js.Any): Unit = js.native
  def disconnect(): Unit = js.native
  def disconnect(code: Double): Unit = js.native
  def disconnect(code: Double, data: js.Any): Unit = js.native
  def emit(event: String, data: js.Any): Unit = js.native
  def emit(event: String, data: js.Any, callback: EmitCallback): Unit = js.native
  def emit(event: String, data: js.Any, callback: EmitCallback, options: EmitOptions): Unit = js.native
  def encode(`object`: js.Any): js.Any = js.native
  def getAuthToken(): AuthToken = js.native
  def getBytesReceived(): Double = js.native
  def getState(): connecting | open | closed = js.native
  def isSubscribed(): Boolean = js.native
  def isSubscribed(channel: String): Boolean = js.native
  def kickOut(): Unit = js.native
  def kickOut(channel: String): Unit = js.native
  def kickOut(channel: String, message: String): Unit = js.native
  def kickOut(channel: String, message: String, callback: js.Function0[Unit]): Unit = js.native
  def off(event: String, listener: AnyFunction): this.type = js.native
  @JSName("off")
  def off_authStateChange(event: authStateChange): this.type = js.native
  @JSName("off")
  def off_authStateChange(event: authStateChange, listener: js.Function1[/* stateChangeData */ StateChangeData, Unit]): this.type = js.native
  @JSName("off")
  def off_authenticate(event: authenticate): this.type = js.native
  @JSName("off")
  def off_authenticate(event: authenticate, listener: js.Function1[/* authToken */ js.UndefOr[AuthToken], Unit]): this.type = js.native
  @JSName("off")
  def off_close(event: close): this.type = js.native
  @JSName("off")
  def off_close(event: close, listener: js.Function2[/* code */ Double, /* data */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("off")
  def off_connectAbort(event: connectAbort): this.type = js.native
  @JSName("off")
  def off_connectAbort(
    event: connectAbort,
    listener: js.Function2[/* code */ Double, /* data */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_deauthenticate(event: deauthenticate): this.type = js.native
  @JSName("off")
  def off_deauthenticate(event: deauthenticate, listener: js.Function1[/* oldToken */ js.UndefOr[AuthToken], Unit]): this.type = js.native
  @JSName("off")
  def off_disconnect(event: disconnect): this.type = js.native
  @JSName("off")
  def off_disconnect(event: disconnect, listener: js.Function2[/* code */ Double, /* data */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("off")
  def off_error(event: error): this.type = js.native
  @JSName("off")
  def off_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("off")
  def off_message(event: message): this.type = js.native
  @JSName("off")
  def off_message(event: message, listener: js.Function1[/* message */ Data, Unit]): this.type = js.native
  @JSName("off")
  def off_raw(event: raw): this.type = js.native
  @JSName("off")
  def off_raw(event: raw, listener: js.Function1[/* message */ Data, Unit]): this.type = js.native
  def on(event: String, listener: AnyFunction): this.type = js.native
  @JSName("on")
  def on_authStateChange(event: authStateChange, listener: js.Function1[/* stateChangeData */ StateChangeData, Unit]): this.type = js.native
  @JSName("on")
  def on_authenticate(event: authenticate, listener: js.Function1[/* authToken */ js.UndefOr[AuthToken], Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function2[/* code */ Double, /* data */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("on")
  def on_connectAbort(
    event: connectAbort,
    listener: js.Function2[/* code */ Double, /* data */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_deauthenticate(event: deauthenticate, listener: js.Function1[/* oldToken */ js.UndefOr[AuthToken], Unit]): this.type = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, listener: js.Function2[/* code */ Double, /* data */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* message */ Data, Unit]): this.type = js.native
  @JSName("on")
  def on_raw(event: raw, listener: js.Function1[/* message */ Data, Unit]): this.type = js.native
  def once(event: String, listener: AnyFunction): this.type = js.native
  @JSName("once")
  def once_authStateChange(event: authStateChange, listener: js.Function1[/* stateChangeData */ StateChangeData, Unit]): this.type = js.native
  @JSName("once")
  def once_authenticate(event: authenticate, listener: js.Function1[/* authToken */ js.UndefOr[AuthToken], Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function2[/* code */ Double, /* data */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("once")
  def once_connectAbort(
    event: connectAbort,
    listener: js.Function2[/* code */ Double, /* data */ js.UndefOr[js.Any], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_deauthenticate(event: deauthenticate, listener: js.Function1[/* oldToken */ js.UndefOr[AuthToken], Unit]): this.type = js.native
  @JSName("once")
  def once_disconnect(event: disconnect, listener: js.Function2[/* code */ Double, /* data */ js.UndefOr[js.Any], Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* error */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function1[/* message */ Data, Unit]): this.type = js.native
  @JSName("once")
  def once_raw(event: raw, listener: js.Function1[/* message */ Data, Unit]): this.type = js.native
  def send(data: js.Any, options: AnonBinary): Unit = js.native
  def sendObject(`object`: js.Any): Unit = js.native
  def sendObject(`object`: js.Any, options: AnonBatch): Unit = js.native
  def sendObjectBatch(`object`: js.Any): Unit = js.native
  def sendObjectSingle(`object`: js.Any): Unit = js.native
  def setAuthToken(data: AuthToken): Unit = js.native
  def setAuthToken(data: AuthToken, options: SignOptions): Unit = js.native
  def setAuthToken(data: AuthToken, options: SignOptions, callback: EmitCallback): Unit = js.native
  def subscriptions(): js.Array[String] = js.native
  def terminate(): Unit = js.native
  @JSName("triggerAuthenticationEvents")
  def triggerAuthenticationEvents_authenticated(oldState: authenticated): Unit = js.native
  @JSName("triggerAuthenticationEvents")
  def triggerAuthenticationEvents_unauthenticated(oldState: unauthenticated): Unit = js.native
}

