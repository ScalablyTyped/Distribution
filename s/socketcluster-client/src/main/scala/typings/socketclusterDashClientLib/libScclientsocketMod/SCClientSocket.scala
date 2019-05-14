package typings
package socketclusterDashClientLib.libScclientsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SCClientSocket
  extends componentDashEmitterLib.componentDashEmitterMod.Emitter {
  val AUTHENTICATED: socketclusterDashClientLib.socketclusterDashClientLibStrings.authenticated = js.native
  val CLOSED: socketclusterDashClientLib.socketclusterDashClientLibStrings.closed = js.native
  val CONNECTING: socketclusterDashClientLib.socketclusterDashClientLibStrings.connecting = js.native
  val OPEN: socketclusterDashClientLib.socketclusterDashClientLibStrings.open = js.native
  val PENDING: socketclusterDashClientLib.socketclusterDashClientLibStrings.pending = js.native
  val UNAUTHENTICATED: socketclusterDashClientLib.socketclusterDashClientLibStrings.unauthenticated = js.native
  var ackTimeout: scala.Double = js.native
  var authEngine: scDashAuthLib.scDashAuthMod.SCAuthEngine = js.native
  var authState: AuthStates = js.native
  var authToken: js.Object | scala.Null = js.native
  var authTokenName: java.lang.String = js.native
  var channelPrefix: java.lang.String | scala.Null = js.native
  var channels: org.scalablytyped.runtime.StringDictionary[scDashChannelLib.scDashChannelMod.SCChannel] = js.native
  var clientId: java.lang.String = js.native
  var codecEngine: socketclusterDashServerLib.scserverMod.SCCodecEngine = js.native
  var connectAttempts: scala.Double = js.native
  var connectTimeout: scala.Double = js.native
  var disconnectOnUnload: scala.Boolean = js.native
  val errorStatuses: scDashErrorsLib.scDashErrorsMod.SocketProtocolErrorStatuses = js.native
  var id: java.lang.String = js.native
  val ignoreStatuses: scDashErrorsLib.scDashErrorsMod.SocketProtocolIgnoreStatuses = js.native
  var options: ClientOptions = js.native
  var pendingReconnect: scala.Boolean = js.native
  var pendingReconnectTimeout: scala.Double = js.native
  var pingTimeout: scala.Double = js.native
  var pingTimeoutDisabled: scala.Boolean = js.native
  var signedAuthToken: java.lang.String | scala.Null = js.native
  var state: States = js.native
  // Perform client-initiated authentication by providing an encrypted token string.
  def authenticate(signedAuthToken: java.lang.String): scala.Unit = js.native
  def authenticate(
    signedAuthToken: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* authStatus */ AuthStatus, scala.Unit]
  ): scala.Unit = js.native
  def channel(channelName: java.lang.String): scDashChannelLib.scDashChannelMod.SCChannel = js.native
  def channel(channelName: java.lang.String, options: scDashChannelLib.scDashChannelMod.SCChannelOptions): scDashChannelLib.scDashChannelMod.SCChannel = js.native
  def connect(): scala.Unit = js.native
  def deauthenticate(): scala.Unit = js.native
  def deauthenticate(callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def decode(message: js.Any): js.Any = js.native
  def decodeBase64(encodedString: java.lang.String): java.lang.String = js.native
  def destroy(): scala.Unit = js.native
  def destroy(code: scala.Double): scala.Unit = js.native
  def destroy(code: scala.Double, data: java.lang.String): scala.Unit = js.native
  def destroy(code: scala.Double, data: js.Object): scala.Unit = js.native
  def destroyChannel(channelName: java.lang.String): scala.Unit = js.native
  def disconnect(): scala.Unit = js.native
  def disconnect(code: scala.Double): scala.Unit = js.native
  def disconnect(code: scala.Double, data: java.lang.String): scala.Unit = js.native
  def disconnect(code: scala.Double, data: js.Object): scala.Unit = js.native
  def emit(event: java.lang.String, data: js.Any): scala.Unit = js.native
  def emit(
    event: java.lang.String,
    data: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* responseData */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def encode(`object`: js.Any): js.Any = js.native
  def encodeBase64(decodedString: java.lang.String): java.lang.String = js.native
  def getAuthToken(): js.Object | scala.Null = js.native
  def getBytesReceived(): scala.Double = js.native
  def getSignedAuthToken(): java.lang.String | scala.Null = js.native
  def getState(): States = js.native
  def isSubscribed(channelName: java.lang.String): scala.Boolean = js.native
  def isSubscribed(channelName: java.lang.String, includePending: scala.Boolean): scala.Boolean = js.native
  def off(event: java.lang.String, listener: AnyFunction): this.type = js.native
  @JSName("off")
  def off_authStateChange(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.authStateChange): this.type = js.native
  @JSName("off")
  def off_authStateChange(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.authStateChange,
    listener: js.Function1[/* stateChangeData */ AuthStateChangeData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_authenticate(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.authenticate): this.type = js.native
  @JSName("off")
  def off_authenticate(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.authenticate,
    listener: js.Function1[/* signedAuthToken */ java.lang.String | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_close(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.close): this.type = js.native
  @JSName("off")
  def off_close(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* data */ java.lang.String | js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_connect(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connect): this.type = js.native
  @JSName("off")
  def off_connect(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connect,
    listener: js.Function2[
      /* status */ ConnectStatus, 
      /* processSubscriptions */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_connectAbort(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connectAbort): this.type = js.native
  @JSName("off")
  def off_connectAbort(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connectAbort,
    listener: js.Function2[/* code */ scala.Double, /* data */ java.lang.String | js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_connecting(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connecting): this.type = js.native
  @JSName("off")
  def off_connecting(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connecting,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_deauthenticate(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.deauthenticate): this.type = js.native
  @JSName("off")
  def off_deauthenticate(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.deauthenticate,
    listener: js.Function1[/* oldSignedToken */ java.lang.String | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_disconnect(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.disconnect): this.type = js.native
  @JSName("off")
  def off_disconnect(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.disconnect,
    listener: js.Function2[/* code */ scala.Double, /* data */ java.lang.String | js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_error(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.error): this.type = js.native
  @JSName("off")
  def off_error(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_kickOut(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.kickOut): this.type = js.native
  @JSName("off")
  def off_kickOut(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.kickOut,
    listener: js.Function2[/* message */ java.lang.String, /* channelName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_message(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.message): this.type = js.native
  @JSName("off")
  def off_message(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.message,
    listener: js.Function1[/* message */ wsLib.wsMod.Data, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_raw(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.raw): this.type = js.native
  @JSName("off")
  def off_raw(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.raw,
    listener: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_removeAuthToken(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.removeAuthToken): this.type = js.native
  @JSName("off")
  def off_removeAuthToken(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.removeAuthToken,
    listener: js.Function1[/* oldToken */ js.Object | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_subscribe(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribe): this.type = js.native
  @JSName("off")
  def off_subscribe(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribe,
    listener: js.Function2[
      /* channelName */ java.lang.String, 
      /* subscriptionOptions */ scDashChannelLib.scDashChannelMod.SCChannelOptions, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_subscribeFail(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeFail): this.type = js.native
  @JSName("off")
  def off_subscribeFail(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeFail,
    listener: js.Function3[
      /* err */ stdLib.Error, 
      /* channelName */ java.lang.String, 
      /* subscriptionOptions */ scDashChannelLib.scDashChannelMod.SCChannelOptions, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_subscribeRequest(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeRequest): this.type = js.native
  @JSName("off")
  def off_subscribeRequest(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeRequest,
    listener: js.Function2[
      /* channelName */ java.lang.String, 
      /* subscriptionOptions */ scDashChannelLib.scDashChannelMod.SCChannelOptions, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_subscribeStateChange(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeStateChange): this.type = js.native
  @JSName("off")
  def off_subscribeStateChange(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeStateChange,
    listener: js.Function1[/* stateChangeData */ SubscribeStateChangeData, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_unsubscribe(event: socketclusterDashClientLib.socketclusterDashClientLibStrings.unsubscribe): this.type = js.native
  @JSName("off")
  def off_unsubscribe(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.unsubscribe,
    listener: js.Function1[/* channelName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  def on(event: java.lang.String, listener: AnyFunction): this.type = js.native
  @JSName("on")
  def on_authStateChange(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.authStateChange,
    listener: js.Function1[/* stateChangeData */ AuthStateChangeData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_authenticate(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.authenticate,
    listener: js.Function1[/* signedAuthToken */ java.lang.String | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_close(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* data */ java.lang.String | js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connect(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connect,
    listener: js.Function2[
      /* status */ ConnectStatus, 
      /* processSubscriptions */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_connectAbort(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connectAbort,
    listener: js.Function2[/* code */ scala.Double, /* data */ java.lang.String | js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connecting(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connecting,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_deauthenticate(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.deauthenticate,
    listener: js.Function1[/* oldSignedToken */ java.lang.String | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_disconnect(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.disconnect,
    listener: js.Function2[/* code */ scala.Double, /* data */ java.lang.String | js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_error(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_kickOut(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.kickOut,
    listener: js.Function2[/* message */ java.lang.String, /* channelName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.message,
    listener: js.Function1[/* message */ wsLib.wsMod.Data, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_raw(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.raw,
    listener: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_removeAuthToken(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.removeAuthToken,
    listener: js.Function1[/* oldToken */ js.Object | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_subscribe(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribe,
    listener: js.Function2[
      /* channelName */ java.lang.String, 
      /* subscriptionOptions */ scDashChannelLib.scDashChannelMod.SCChannelOptions, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_subscribeFail(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeFail,
    listener: js.Function3[
      /* err */ stdLib.Error, 
      /* channelName */ java.lang.String, 
      /* subscriptionOptions */ scDashChannelLib.scDashChannelMod.SCChannelOptions, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_subscribeRequest(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeRequest,
    listener: js.Function2[
      /* channelName */ java.lang.String, 
      /* subscriptionOptions */ scDashChannelLib.scDashChannelMod.SCChannelOptions, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_subscribeStateChange(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeStateChange,
    listener: js.Function1[/* stateChangeData */ SubscribeStateChangeData, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unsubscribe(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.unsubscribe,
    listener: js.Function1[/* channelName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  def once(event: java.lang.String, listener: AnyFunction): this.type = js.native
  @JSName("once")
  def once_authStateChange(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.authStateChange,
    listener: js.Function1[/* stateChangeData */ AuthStateChangeData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_authenticate(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.authenticate,
    listener: js.Function1[/* signedAuthToken */ java.lang.String | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_close(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.close,
    listener: js.Function2[/* code */ scala.Double, /* data */ java.lang.String | js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connect(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connect,
    listener: js.Function2[
      /* status */ ConnectStatus, 
      /* processSubscriptions */ js.Function0[scala.Unit], 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_connectAbort(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connectAbort,
    listener: js.Function2[/* code */ scala.Double, /* data */ java.lang.String | js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connecting(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.connecting,
    listener: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_deauthenticate(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.deauthenticate,
    listener: js.Function1[/* oldSignedToken */ java.lang.String | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_disconnect(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.disconnect,
    listener: js.Function2[/* code */ scala.Double, /* data */ java.lang.String | js.Object, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_error(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.error,
    listener: js.Function1[/* err */ stdLib.Error, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_kickOut(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.kickOut,
    listener: js.Function2[/* message */ java.lang.String, /* channelName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_message(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.message,
    listener: js.Function1[/* message */ wsLib.wsMod.Data, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_raw(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.raw,
    listener: js.Function1[/* data */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_removeAuthToken(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.removeAuthToken,
    listener: js.Function1[/* oldToken */ js.Object | scala.Null, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_subscribe(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribe,
    listener: js.Function2[
      /* channelName */ java.lang.String, 
      /* subscriptionOptions */ scDashChannelLib.scDashChannelMod.SCChannelOptions, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_subscribeFail(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeFail,
    listener: js.Function3[
      /* err */ stdLib.Error, 
      /* channelName */ java.lang.String, 
      /* subscriptionOptions */ scDashChannelLib.scDashChannelMod.SCChannelOptions, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_subscribeRequest(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeRequest,
    listener: js.Function2[
      /* channelName */ java.lang.String, 
      /* subscriptionOptions */ scDashChannelLib.scDashChannelMod.SCChannelOptions, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_subscribeStateChange(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.subscribeStateChange,
    listener: js.Function1[/* stateChangeData */ SubscribeStateChangeData, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_unsubscribe(
    event: socketclusterDashClientLib.socketclusterDashClientLibStrings.unsubscribe,
    listener: js.Function1[/* channelName */ java.lang.String, scala.Unit]
  ): this.type = js.native
  def open(): scala.Unit = js.native
  def processPendingSubscriptions(): scala.Unit = js.native
  def publish(channelName: java.lang.String, data: js.Any): scala.Unit = js.native
  def publish(
    channelName: java.lang.String,
    data: js.Any,
    callback: js.Function2[/* err */ stdLib.Error, /* ackData */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def reconnect(): scala.Unit = js.native
  def reconnect(code: scala.Double): scala.Unit = js.native
  def reconnect(code: scala.Double, data: java.lang.String): scala.Unit = js.native
  def reconnect(code: scala.Double, data: js.Object): scala.Unit = js.native
  def send(data: js.Any): scala.Unit = js.native
  def subscribe(channelName: java.lang.String): scDashChannelLib.scDashChannelMod.SCChannel = js.native
  def subscribe(channelName: java.lang.String, options: scDashChannelLib.scDashChannelMod.SCChannelOptions): scDashChannelLib.scDashChannelMod.SCChannel = js.native
  def subscriptions(): js.Array[java.lang.String] = js.native
  def subscriptions(includePending: scala.Boolean): js.Array[java.lang.String] = js.native
  def unsubscribe(channelName: java.lang.String): scala.Unit = js.native
  def unwatch(channelName: java.lang.String): scala.Unit = js.native
  def unwatch(channelName: java.lang.String, handler: WatcherFunction): scala.Unit = js.native
  def watch(channelName: java.lang.String, handler: WatcherFunction): scala.Unit = js.native
  def watchers(channelName: java.lang.String): js.Array[WatcherFunction] = js.native
}

