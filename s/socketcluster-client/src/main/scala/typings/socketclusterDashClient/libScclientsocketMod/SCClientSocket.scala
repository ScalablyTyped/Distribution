package typings.socketclusterDashClient.libScclientsocketMod

import org.scalablytyped.runtime.StringDictionary
import typings.componentDashEmitter.componentDashEmitterMod.Emitter
import typings.scDashAuth.scDashAuthMod.SCAuthEngine
import typings.scDashChannel.scDashChannelMod.SCChannel
import typings.scDashChannel.scDashChannelMod.SCChannelOptions
import typings.scDashErrors.scDashErrorsMod.SocketProtocolErrorStatuses
import typings.scDashErrors.scDashErrorsMod.SocketProtocolIgnoreStatuses
import typings.socketclusterDashClient.socketclusterDashClientStrings.authStateChange
import typings.socketclusterDashClient.socketclusterDashClientStrings.authenticate
import typings.socketclusterDashClient.socketclusterDashClientStrings.authenticated
import typings.socketclusterDashClient.socketclusterDashClientStrings.close
import typings.socketclusterDashClient.socketclusterDashClientStrings.closed
import typings.socketclusterDashClient.socketclusterDashClientStrings.connect
import typings.socketclusterDashClient.socketclusterDashClientStrings.connectAbort
import typings.socketclusterDashClient.socketclusterDashClientStrings.connecting
import typings.socketclusterDashClient.socketclusterDashClientStrings.deauthenticate
import typings.socketclusterDashClient.socketclusterDashClientStrings.disconnect
import typings.socketclusterDashClient.socketclusterDashClientStrings.error
import typings.socketclusterDashClient.socketclusterDashClientStrings.kickOut
import typings.socketclusterDashClient.socketclusterDashClientStrings.message
import typings.socketclusterDashClient.socketclusterDashClientStrings.open
import typings.socketclusterDashClient.socketclusterDashClientStrings.pending
import typings.socketclusterDashClient.socketclusterDashClientStrings.raw
import typings.socketclusterDashClient.socketclusterDashClientStrings.removeAuthToken
import typings.socketclusterDashClient.socketclusterDashClientStrings.subscribe
import typings.socketclusterDashClient.socketclusterDashClientStrings.subscribeFail
import typings.socketclusterDashClient.socketclusterDashClientStrings.subscribeRequest
import typings.socketclusterDashClient.socketclusterDashClientStrings.subscribeStateChange
import typings.socketclusterDashClient.socketclusterDashClientStrings.unauthenticated
import typings.socketclusterDashClient.socketclusterDashClientStrings.unsubscribe
import typings.socketclusterDashServer.scserverMod.SCCodecEngine
import typings.std.Error
import typings.ws.wsMod.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCClientSocket extends Emitter {
  val AUTHENTICATED: authenticated = js.native
  val CLOSED: closed = js.native
  val CONNECTING: connecting = js.native
  val OPEN: open = js.native
  val PENDING: pending = js.native
  val UNAUTHENTICATED: unauthenticated = js.native
  var ackTimeout: Double = js.native
  var authEngine: SCAuthEngine = js.native
  var authState: AuthStates = js.native
  var authToken: js.Object | Null = js.native
  var authTokenName: String = js.native
  var channelPrefix: String | Null = js.native
  var channels: StringDictionary[SCChannel] = js.native
  var clientId: String = js.native
  var codecEngine: SCCodecEngine = js.native
  var connectAttempts: Double = js.native
  var connectTimeout: Double = js.native
  var disconnectOnUnload: Boolean = js.native
  val errorStatuses: SocketProtocolErrorStatuses = js.native
  var id: String = js.native
  val ignoreStatuses: SocketProtocolIgnoreStatuses = js.native
  var options: ClientOptions = js.native
  var pendingReconnect: Boolean = js.native
  var pendingReconnectTimeout: Double = js.native
  var pingTimeout: Double = js.native
  var pingTimeoutDisabled: Boolean = js.native
  var signedAuthToken: String | Null = js.native
  var state: States = js.native
  // Perform client-initiated authentication by providing an encrypted token string.
  def authenticate(signedAuthToken: String): Unit = js.native
  def authenticate(
    signedAuthToken: String,
    callback: js.Function2[/* err */ Error, /* authStatus */ AuthStatus, Unit]
  ): Unit = js.native
  def channel(channelName: String): SCChannel = js.native
  def channel(channelName: String, options: SCChannelOptions): SCChannel = js.native
  def connect(): Unit = js.native
  def deauthenticate(): Unit = js.native
  def deauthenticate(callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def decode(message: js.Any): js.Any = js.native
  def decodeBase64(encodedString: String): String = js.native
  def destroy(): Unit = js.native
  def destroy(code: Double): Unit = js.native
  def destroy(code: Double, data: String): Unit = js.native
  def destroy(code: Double, data: js.Object): Unit = js.native
  def destroyChannel(channelName: String): Unit = js.native
  def disconnect(): Unit = js.native
  def disconnect(code: Double): Unit = js.native
  def disconnect(code: Double, data: String): Unit = js.native
  def disconnect(code: Double, data: js.Object): Unit = js.native
  def emit(event: String, data: js.Any): Unit = js.native
  def emit(
    event: String,
    data: js.Any,
    callback: js.Function2[/* err */ Error, /* responseData */ js.Any, Unit]
  ): Unit = js.native
  def encode(`object`: js.Any): js.Any = js.native
  def encodeBase64(decodedString: String): String = js.native
  def getAuthToken(): js.Object | Null = js.native
  def getBytesReceived(): Double = js.native
  def getSignedAuthToken(): String | Null = js.native
  def getState(): States = js.native
  def isSubscribed(channelName: String): Boolean = js.native
  def isSubscribed(channelName: String, includePending: Boolean): Boolean = js.native
  def off(event: String, listener: AnyFunction): this.type = js.native
  @JSName("off")
  def off_authStateChange(event: authStateChange): this.type = js.native
  @JSName("off")
  def off_authStateChange(event: authStateChange, listener: js.Function1[/* stateChangeData */ AuthStateChangeData, Unit]): this.type = js.native
  @JSName("off")
  def off_authenticate(event: authenticate): this.type = js.native
  @JSName("off")
  def off_authenticate(event: authenticate, listener: js.Function1[/* signedAuthToken */ String | Null, Unit]): this.type = js.native
  @JSName("off")
  def off_close(event: close): this.type = js.native
  @JSName("off")
  def off_close(event: close, listener: js.Function2[/* code */ Double, /* data */ String | js.Object, Unit]): this.type = js.native
  @JSName("off")
  def off_connect(event: connect): this.type = js.native
  @JSName("off")
  def off_connect(
    event: connect,
    listener: js.Function2[/* status */ ConnectStatus, /* processSubscriptions */ js.Function0[Unit], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_connectAbort(event: connectAbort): this.type = js.native
  @JSName("off")
  def off_connectAbort(
    event: connectAbort,
    listener: js.Function2[/* code */ Double, /* data */ String | js.Object, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_connecting(event: connecting): this.type = js.native
  @JSName("off")
  def off_connecting(event: connecting, listener: js.Function0[Unit]): this.type = js.native
  @JSName("off")
  def off_deauthenticate(event: deauthenticate): this.type = js.native
  @JSName("off")
  def off_deauthenticate(event: deauthenticate, listener: js.Function1[/* oldSignedToken */ String | Null, Unit]): this.type = js.native
  @JSName("off")
  def off_disconnect(event: disconnect): this.type = js.native
  @JSName("off")
  def off_disconnect(event: disconnect, listener: js.Function2[/* code */ Double, /* data */ String | js.Object, Unit]): this.type = js.native
  @JSName("off")
  def off_error(event: error): this.type = js.native
  @JSName("off")
  def off_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("off")
  def off_kickOut(event: kickOut): this.type = js.native
  @JSName("off")
  def off_kickOut(event: kickOut, listener: js.Function2[/* message */ String, /* channelName */ String, Unit]): this.type = js.native
  @JSName("off")
  def off_message(event: message): this.type = js.native
  @JSName("off")
  def off_message(event: message, listener: js.Function1[/* message */ Data, Unit]): this.type = js.native
  @JSName("off")
  def off_raw(event: raw): this.type = js.native
  @JSName("off")
  def off_raw(event: raw, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  @JSName("off")
  def off_removeAuthToken(event: removeAuthToken): this.type = js.native
  @JSName("off")
  def off_removeAuthToken(event: removeAuthToken, listener: js.Function1[/* oldToken */ js.Object | Null, Unit]): this.type = js.native
  @JSName("off")
  def off_subscribe(event: subscribe): this.type = js.native
  @JSName("off")
  def off_subscribe(
    event: subscribe,
    listener: js.Function2[/* channelName */ String, /* subscriptionOptions */ SCChannelOptions, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_subscribeFail(event: subscribeFail): this.type = js.native
  @JSName("off")
  def off_subscribeFail(
    event: subscribeFail,
    listener: js.Function3[
      /* err */ Error, 
      /* channelName */ String, 
      /* subscriptionOptions */ SCChannelOptions, 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_subscribeRequest(event: subscribeRequest): this.type = js.native
  @JSName("off")
  def off_subscribeRequest(
    event: subscribeRequest,
    listener: js.Function2[/* channelName */ String, /* subscriptionOptions */ SCChannelOptions, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_subscribeStateChange(event: subscribeStateChange): this.type = js.native
  @JSName("off")
  def off_subscribeStateChange(
    event: subscribeStateChange,
    listener: js.Function1[/* stateChangeData */ SubscribeStateChangeData, Unit]
  ): this.type = js.native
  @JSName("off")
  def off_unsubscribe(event: unsubscribe): this.type = js.native
  @JSName("off")
  def off_unsubscribe(event: unsubscribe, listener: js.Function1[/* channelName */ String, Unit]): this.type = js.native
  def on(event: String, listener: AnyFunction): this.type = js.native
  @JSName("on")
  def on_authStateChange(event: authStateChange, listener: js.Function1[/* stateChangeData */ AuthStateChangeData, Unit]): this.type = js.native
  @JSName("on")
  def on_authenticate(event: authenticate, listener: js.Function1[/* signedAuthToken */ String | Null, Unit]): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function2[/* code */ Double, /* data */ String | js.Object, Unit]): this.type = js.native
  @JSName("on")
  def on_connect(
    event: connect,
    listener: js.Function2[/* status */ ConnectStatus, /* processSubscriptions */ js.Function0[Unit], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connectAbort(
    event: connectAbort,
    listener: js.Function2[/* code */ Double, /* data */ String | js.Object, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connecting(event: connecting, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_deauthenticate(event: deauthenticate, listener: js.Function1[/* oldSignedToken */ String | Null, Unit]): this.type = js.native
  @JSName("on")
  def on_disconnect(event: disconnect, listener: js.Function2[/* code */ Double, /* data */ String | js.Object, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_kickOut(event: kickOut, listener: js.Function2[/* message */ String, /* channelName */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function1[/* message */ Data, Unit]): this.type = js.native
  @JSName("on")
  def on_raw(event: raw, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_removeAuthToken(event: removeAuthToken, listener: js.Function1[/* oldToken */ js.Object | Null, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribe(
    event: subscribe,
    listener: js.Function2[/* channelName */ String, /* subscriptionOptions */ SCChannelOptions, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_subscribeFail(
    event: subscribeFail,
    listener: js.Function3[
      /* err */ Error, 
      /* channelName */ String, 
      /* subscriptionOptions */ SCChannelOptions, 
      Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_subscribeRequest(
    event: subscribeRequest,
    listener: js.Function2[/* channelName */ String, /* subscriptionOptions */ SCChannelOptions, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_subscribeStateChange(
    event: subscribeStateChange,
    listener: js.Function1[/* stateChangeData */ SubscribeStateChangeData, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unsubscribe(event: unsubscribe, listener: js.Function1[/* channelName */ String, Unit]): this.type = js.native
  def once(event: String, listener: AnyFunction): this.type = js.native
  @JSName("once")
  def once_authStateChange(event: authStateChange, listener: js.Function1[/* stateChangeData */ AuthStateChangeData, Unit]): this.type = js.native
  @JSName("once")
  def once_authenticate(event: authenticate, listener: js.Function1[/* signedAuthToken */ String | Null, Unit]): this.type = js.native
  @JSName("once")
  def once_close(event: close, listener: js.Function2[/* code */ Double, /* data */ String | js.Object, Unit]): this.type = js.native
  @JSName("once")
  def once_connect(
    event: connect,
    listener: js.Function2[/* status */ ConnectStatus, /* processSubscriptions */ js.Function0[Unit], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connectAbort(
    event: connectAbort,
    listener: js.Function2[/* code */ Double, /* data */ String | js.Object, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connecting(event: connecting, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_deauthenticate(event: deauthenticate, listener: js.Function1[/* oldSignedToken */ String | Null, Unit]): this.type = js.native
  @JSName("once")
  def once_disconnect(event: disconnect, listener: js.Function2[/* code */ Double, /* data */ String | js.Object, Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("once")
  def once_kickOut(event: kickOut, listener: js.Function2[/* message */ String, /* channelName */ String, Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function1[/* message */ Data, Unit]): this.type = js.native
  @JSName("once")
  def once_raw(event: raw, listener: js.Function1[/* data */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_removeAuthToken(event: removeAuthToken, listener: js.Function1[/* oldToken */ js.Object | Null, Unit]): this.type = js.native
  @JSName("once")
  def once_subscribe(
    event: subscribe,
    listener: js.Function2[/* channelName */ String, /* subscriptionOptions */ SCChannelOptions, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_subscribeFail(
    event: subscribeFail,
    listener: js.Function3[
      /* err */ Error, 
      /* channelName */ String, 
      /* subscriptionOptions */ SCChannelOptions, 
      Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_subscribeRequest(
    event: subscribeRequest,
    listener: js.Function2[/* channelName */ String, /* subscriptionOptions */ SCChannelOptions, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_subscribeStateChange(
    event: subscribeStateChange,
    listener: js.Function1[/* stateChangeData */ SubscribeStateChangeData, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_unsubscribe(event: unsubscribe, listener: js.Function1[/* channelName */ String, Unit]): this.type = js.native
  def open(): Unit = js.native
  def processPendingSubscriptions(): Unit = js.native
  def publish(channelName: String, data: js.Any): Unit = js.native
  def publish(
    channelName: String,
    data: js.Any,
    callback: js.Function2[/* err */ Error, /* ackData */ js.Any, Unit]
  ): Unit = js.native
  def reconnect(): Unit = js.native
  def reconnect(code: Double): Unit = js.native
  def reconnect(code: Double, data: String): Unit = js.native
  def reconnect(code: Double, data: js.Object): Unit = js.native
  def send(data: js.Any): Unit = js.native
  def subscribe(channelName: String): SCChannel = js.native
  def subscribe(channelName: String, options: SCChannelOptions): SCChannel = js.native
  def subscriptions(): js.Array[String] = js.native
  def subscriptions(includePending: Boolean): js.Array[String] = js.native
  def unsubscribe(channelName: String): Unit = js.native
  def unwatch(channelName: String): Unit = js.native
  def unwatch(channelName: String, handler: WatcherFunction): Unit = js.native
  def watch(channelName: String, handler: WatcherFunction): Unit = js.native
  def watchers(channelName: String): js.Array[WatcherFunction] = js.native
}

