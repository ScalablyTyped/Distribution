package typings.socketclusterServer

import org.scalablytyped.runtime.StringDictionary
import typings.agSimpleBroker.mod.SimpleExchange
import typings.jsonwebtoken.mod.SignOptions
import typings.node.httpMod.IncomingMessage
import typings.scErrors.mod.SocketProtocolErrorStatuses_
import typings.scErrors.mod.SocketProtocolIgnoreStatuses_
import typings.socketclusterServer.anon.Binary
import typings.socketclusterServer.anon.Message
import typings.socketclusterServer.anon.RejectOnFailedDelivery
import typings.socketclusterServer.anon.SignedAuthToken
import typings.socketclusterServer.socketclusterServerStrings.authStateChange
import typings.socketclusterServer.socketclusterServerStrings.authTokenSigned
import typings.socketclusterServer.socketclusterServerStrings.authenticate
import typings.socketclusterServer.socketclusterServerStrings.authenticated
import typings.socketclusterServer.socketclusterServerStrings.badAuthToken
import typings.socketclusterServer.socketclusterServerStrings.close
import typings.socketclusterServer.socketclusterServerStrings.closed
import typings.socketclusterServer.socketclusterServerStrings.connect
import typings.socketclusterServer.socketclusterServerStrings.connectAbort
import typings.socketclusterServer.socketclusterServerStrings.connecting
import typings.socketclusterServer.socketclusterServerStrings.deauthenticate
import typings.socketclusterServer.socketclusterServerStrings.disconnect
import typings.socketclusterServer.socketclusterServerStrings.error
import typings.socketclusterServer.socketclusterServerStrings.message
import typings.socketclusterServer.socketclusterServerStrings.open
import typings.socketclusterServer.socketclusterServerStrings.raw
import typings.socketclusterServer.socketclusterServerStrings.subscribe
import typings.socketclusterServer.socketclusterServerStrings.unauthenticated
import typings.socketclusterServer.socketclusterServerStrings.unsubscribe
import typings.std.Error
import typings.writableConsumableStream.consumerMod.ConsumerStats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serversocketMod {
  
  @JSImport("socketcluster-server/serversocket", JSImport.Namespace)
  @js.native
  class ^ protected () extends AGServerSocket {
    def this(
      id: String,
      server: typings.socketclusterServer.serverMod.^,
      socket: typings.ws.mod.^,
      protocolVersion: Double
    ) = this()
  }
  
  @js.native
  trait AGServerSocket
    extends typings.asyncStreamEmitter.mod.^[js.Any] {
    
    val AUTHENTICATED: authenticated = js.native
    
    val CLOSED: closed = js.native
    
    val CONNECTING: connecting = js.native
    
    val OPEN: open = js.native
    
    val UNAUTHENTICATED: unauthenticated = js.native
    
    var authState: authenticated | unauthenticated = js.native
    
    var authToken: js.UndefOr[AuthToken] = js.native
    
    var batchInterval: Double = js.native
    
    var batchOnHandshake: Boolean = js.native
    
    var batchOnHandshakeDuration: Double = js.native
    
    def cancelBatch(): Unit = js.native
    
    def cancelBatching(): Unit = js.native
    
    var channelSubscriptions: StringDictionary[Boolean] = js.native
    
    var channelSubscriptionsCount: Double = js.native
    
    var cloneData: Boolean = js.native
    
    def closeAllMiddlewares(): Unit = js.native
    
    def closeAllProcedures(): Unit = js.native
    
    def closeAllReceivers(): Unit = js.native
    
    def closeAllStreams(): Unit = js.native
    
    def closeIO(): Unit = js.native
    
    def closeInput(): Unit = js.native
    
    def closeOutput(): Unit = js.native
    
    def closeProcedure(procedureName: String): Unit = js.native
    
    def closeReceiver(receiverName: String): Unit = js.native
    
    def deauthenticate(): js.Promise[Unit] = js.native
    def deauthenticate(options: RejectOnFailedDelivery): js.Promise[Unit] = js.native
    
    def deauthenticateSelf(): Unit = js.native
    
    def decode(message: js.Any): js.Any = js.native
    
    def disconnect(): Unit = js.native
    def disconnect(code: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
    def disconnect(code: Double): Unit = js.native
    def disconnect(code: Double, reason: String): Unit = js.native
    
    def emitError(error: Error): Unit = js.native
    
    @JSName("emit")
    def emit_authStateChange(eventName: authStateChange): typings.consumableStream.mod.^[StateChangeData] = js.native
    @JSName("emit")
    def emit_authStateChange(eventName: authStateChange, data: StateChangeData): Unit = js.native
    @JSName("emit")
    def emit_authTokenSigned(eventName: authTokenSigned): typings.consumableStream.mod.^[SignedAuthToken] = js.native
    @JSName("emit")
    def emit_authTokenSigned(eventName: authTokenSigned, data: SignedAuthToken): Unit = js.native
    @JSName("emit")
    def emit_authenticate(eventName: authenticate): typings.consumableStream.mod.^[AuthenticateData] = js.native
    @JSName("emit")
    def emit_authenticate(eventName: authenticate, data: AuthenticateData): Unit = js.native
    @JSName("emit")
    def emit_badAuthToken(eventName: badAuthToken): typings.consumableStream.mod.^[BadAuthTokenData] = js.native
    @JSName("emit")
    def emit_badAuthToken(eventName: badAuthToken, data: BadAuthTokenData): Unit = js.native
    @JSName("emit")
    def emit_close(eventName: close): typings.consumableStream.mod.^[CloseData] = js.native
    @JSName("emit")
    def emit_close(eventName: close, data: CloseData): Unit = js.native
    @JSName("emit")
    def emit_connect(eventName: connect): typings.consumableStream.mod.^[ConnectData] = js.native
    @JSName("emit")
    def emit_connect(eventName: connect, data: ConnectData): Unit = js.native
    @JSName("emit")
    def emit_connectAbort(eventName: connectAbort): typings.consumableStream.mod.^[ConnectAbortData] = js.native
    @JSName("emit")
    def emit_connectAbort(eventName: connectAbort, data: ConnectAbortData): Unit = js.native
    @JSName("emit")
    def emit_deauthenticate(eventName: deauthenticate): typings.consumableStream.mod.^[DeauthenticateData] = js.native
    @JSName("emit")
    def emit_deauthenticate(eventName: deauthenticate, data: DeauthenticateData): Unit = js.native
    @JSName("emit")
    def emit_disconnect(eventName: disconnect): typings.consumableStream.mod.^[DisconnectData] = js.native
    @JSName("emit")
    def emit_disconnect(eventName: disconnect, data: DisconnectData): Unit = js.native
    @JSName("emit")
    def emit_error(eventName: error): typings.consumableStream.mod.^[typings.socketclusterServer.anon.Error] = js.native
    @JSName("emit")
    def emit_error(eventName: error, data: typings.socketclusterServer.anon.Error): Unit = js.native
    @JSName("emit")
    def emit_message(eventName: message): typings.consumableStream.mod.^[Message] = js.native
    @JSName("emit")
    def emit_message(eventName: message, data: Message): Unit = js.native
    @JSName("emit")
    def emit_raw(eventName: raw): typings.consumableStream.mod.^[Message] = js.native
    @JSName("emit")
    def emit_raw(eventName: raw, data: Message): Unit = js.native
    @JSName("emit")
    def emit_subscribe(eventName: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
    @JSName("emit")
    def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
    @JSName("emit")
    def emit_unsubscribe(eventName: unsubscribe): typings.consumableStream.mod.^[UnsubscribeData] = js.native
    @JSName("emit")
    def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
    
    def encode(`object`: js.Any): js.Any = js.native
    
    val errorStatuses: SocketProtocolErrorStatuses_ = js.native
    
    var exchange: SimpleExchange = js.native
    
    def flushBatch(): Unit = js.native
    
    var forwardedForAddress: js.UndefOr[String] = js.native
    
    def getAllProceduresBackpressure(): Double = js.native
    
    def getAllProceduresConsumerStatsList(): js.Array[ConsumerStats] = js.native
    
    def getAllReceiversBackpressure(): Double = js.native
    
    def getAllReceiversConsumerStatsList(): js.Array[ConsumerStats] = js.native
    
    def getAuthToken(): AuthToken = js.native
    
    def getBackpressure(): Double = js.native
    
    def getBytesReceived(): Double = js.native
    
    def getInboundBackpressure(): Double = js.native
    
    def getOutboundBackpressure(): Double = js.native
    
    def getProcedureBackpressure(procedureName: String): Double = js.native
    
    def getProcedureConsumerBackpressure(consumerId: Double): Double = js.native
    
    def getProcedureConsumerStats(consumerId: Double): ConsumerStats = js.native
    
    def getProcedureConsumerStatsList(procedureName: String): js.Array[ConsumerStats] = js.native
    
    def getReceiverBackpressure(receiverName: String): Double = js.native
    
    def getReceiverConsumerBackpressure(consumerId: Double): Double = js.native
    
    def getReceiverConsumerStats(consumerId: Double): ConsumerStats = js.native
    
    def getReceiverConsumerStatsList(receiverName: String): js.Array[ConsumerStats] = js.native
    
    def getState(): connecting | open | closed = js.native
    
    def hasAnyProcedureConsumer(consumerId: Double): Boolean = js.native
    
    def hasAnyReceiverConsumer(consumerId: Double): Boolean = js.native
    
    def hasProcedureConsumer(procedureName: String, consumerId: Double): Boolean = js.native
    
    def hasReceiverConsumer(receiverName: String, consumerId: Double): Boolean = js.native
    
    var id: String = js.native
    
    val ignoreStatuses: SocketProtocolIgnoreStatuses_ = js.native
    
    var inboundMessageStream: typings.writableConsumableStream.mod.^[_] = js.native
    
    var inboundProcessedMessageCount: Double = js.native
    
    var inboundReceivedMessageCount: Double = js.native
    
    def invoke(event: String, data: js.Any, options: js.Any): js.Promise[_] = js.native
    
    def isAuthTokenExpired(token: AuthToken): Boolean = js.native
    
    var isBatching: Boolean = js.native
    
    var isBufferingBatch: Boolean = js.native
    
    def isSubscribed(channel: String): Boolean = js.native
    
    def kickOut(): js.Any = js.native
    def kickOut(channel: js.UndefOr[scala.Nothing], message: String): js.Any = js.native
    def kickOut(channel: String): js.Any = js.native
    def kickOut(channel: String, message: String): js.Any = js.native
    
    def killAllMiddlewares(): Unit = js.native
    
    def killAllProcedures(): Unit = js.native
    
    def killAllReceivers(): Unit = js.native
    
    def killAllStreams(): Unit = js.native
    
    def killIO(): Unit = js.native
    
    def killInput(): Unit = js.native
    
    def killOutput(): Unit = js.native
    
    def killProcedure(procedureName: String): Unit = js.native
    
    def killProcedureConsumer(consumerId: Double): Unit = js.native
    
    def killReceiver(receiverName: String): Unit = js.native
    
    def killReceiverConsumer(consumerId: Double): Unit = js.native
    
    var middlewareHandshakeStream: typings.writableConsumableStream.mod.^[_] = js.native
    
    var middlewareInboundRawStream: typings.writableConsumableStream.mod.^[_] = js.native
    
    var middlewareInboundStream: typings.writableConsumableStream.mod.^[_] = js.native
    
    var middlewareOutboundStream: typings.writableConsumableStream.mod.^[_] = js.native
    
    var outboundPacketStream: typings.writableConsumableStream.mod.^[_] = js.native
    
    var outboundPreparedMessageCount: Double = js.native
    
    var outboundSentMessageCount: Double = js.native
    
    def procedure(procedureName: String): typings.streamDemux.demuxedConsumableStreamMod.^[_] = js.native
    
    var protocolVersion: Double = js.native
    
    def receiver(receiverName: String): typings.streamDemux.demuxedConsumableStreamMod.^[_] = js.native
    
    var remoteAddress: String = js.native
    
    var remoteFamily: String = js.native
    
    var remotePort: Double = js.native
    
    var request: IncomingMessage = js.native
    
    def send(data: js.Any, options: Binary): Unit = js.native
    
    def sendObject(`object`: js.Any): Unit = js.native
    
    def serializeObject(`object`: js.Any): js.Any = js.native
    
    var server: typings.socketclusterServer.serverMod.^ = js.native
    
    def setAuthToken(data: AuthToken): js.Promise[Unit] = js.native
    def setAuthToken(data: AuthToken, options: AuthTokenOptions): js.Promise[Unit] = js.native
    
    var signedAuthToken: js.UndefOr[String] = js.native
    
    var socket: typings.ws.mod.^ = js.native
    
    def startBatch(): Unit = js.native
    
    def startBatching(): Unit = js.native
    
    var state: connecting | open | closed = js.native
    
    def stopBatching(): Unit = js.native
    
    def subscriptions(): js.Array[String] = js.native
    
    def terminate(): Unit = js.native
    
    def transmit(event: String, data: js.Any, options: js.Any): js.Promise[Unit] = js.native
    
    @JSName("triggerAuthenticationEvents")
    def triggerAuthenticationEvents_authenticated(oldAuthState: authenticated): Unit = js.native
    @JSName("triggerAuthenticationEvents")
    def triggerAuthenticationEvents_unauthenticated(oldAuthState: unauthenticated): Unit = js.native
  }
  
  type AuthToken = StringDictionary[js.Any]
  
  @js.native
  trait AuthTokenOptions extends SignOptions {
    
    var rejectOnFailedDelivery: js.UndefOr[Boolean] = js.native
  }
  object AuthTokenOptions {
    
    @scala.inline
    def apply(): AuthTokenOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthTokenOptions]
    }
    
    @scala.inline
    implicit class AuthTokenOptionsMutableBuilder[Self <: AuthTokenOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRejectOnFailedDelivery(value: Boolean): Self = StObject.set(x, "rejectOnFailedDelivery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectOnFailedDeliveryUndefined: Self = StObject.set(x, "rejectOnFailedDelivery", js.undefined)
    }
  }
  
  @js.native
  trait AuthenticateData extends StObject {
    
    var authToken: js.UndefOr[AuthToken] = js.native
  }
  object AuthenticateData {
    
    @scala.inline
    def apply(): AuthenticateData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AuthenticateData]
    }
    
    @scala.inline
    implicit class AuthenticateDataMutableBuilder[Self <: AuthenticateData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
    }
  }
  
  @js.native
  trait BadAuthTokenData extends StObject {
    
    var authError: Error = js.native
    
    var signedAuthToken: String = js.native
  }
  object BadAuthTokenData {
    
    @scala.inline
    def apply(authError: Error, signedAuthToken: String): BadAuthTokenData = {
      val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadAuthTokenData]
    }
    
    @scala.inline
    implicit class BadAuthTokenDataMutableBuilder[Self <: BadAuthTokenData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthError(value: Error): Self = StObject.set(x, "authError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignedAuthToken(value: String): Self = StObject.set(x, "signedAuthToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CloseData extends StObject {
    
    var code: Double = js.native
    
    var reason: String = js.native
  }
  object CloseData {
    
    @scala.inline
    def apply(code: Double, reason: String): CloseData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloseData]
    }
    
    @scala.inline
    implicit class CloseDataMutableBuilder[Self <: CloseData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConnectAbortData extends StObject {
    
    var code: Double = js.native
    
    var reason: String = js.native
  }
  object ConnectAbortData {
    
    @scala.inline
    def apply(code: Double, reason: String): ConnectAbortData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectAbortData]
    }
    
    @scala.inline
    implicit class ConnectAbortDataMutableBuilder[Self <: ConnectAbortData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConnectData extends StObject {
    
    var authError: js.UndefOr[Error] = js.native
    
    var id: String = js.native
    
    var isAuthenticated: Boolean = js.native
    
    var pingTimeout: Double = js.native
  }
  object ConnectData {
    
    @scala.inline
    def apply(id: String, isAuthenticated: Boolean, pingTimeout: Double): ConnectData = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectData]
    }
    
    @scala.inline
    implicit class ConnectDataMutableBuilder[Self <: ConnectData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthError(value: Error): Self = StObject.set(x, "authError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthErrorUndefined: Self = StObject.set(x, "authError", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAuthenticated(value: Boolean): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeauthenticateData extends StObject {
    
    var oldAuthToken: js.UndefOr[AuthToken] = js.native
  }
  object DeauthenticateData {
    
    @scala.inline
    def apply(): DeauthenticateData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeauthenticateData]
    }
    
    @scala.inline
    implicit class DeauthenticateDataMutableBuilder[Self <: DeauthenticateData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOldAuthToken(value: AuthToken): Self = StObject.set(x, "oldAuthToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldAuthTokenUndefined: Self = StObject.set(x, "oldAuthToken", js.undefined)
    }
  }
  
  @js.native
  trait DisconnectData extends StObject {
    
    var code: Double = js.native
    
    var reason: String = js.native
  }
  object DisconnectData {
    
    @scala.inline
    def apply(code: Double, reason: String): DisconnectData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisconnectData]
    }
    
    @scala.inline
    implicit class DisconnectDataMutableBuilder[Self <: DisconnectData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StateChangeData extends StObject {
    
    var authToken: js.UndefOr[AuthToken] = js.native
    
    var newState: authenticated | unauthenticated = js.native
    
    var oldState: authenticated | unauthenticated = js.native
  }
  object StateChangeData {
    
    @scala.inline
    def apply(newState: authenticated | unauthenticated, oldState: authenticated | unauthenticated): StateChangeData = {
      val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateChangeData]
    }
    
    @scala.inline
    implicit class StateChangeDataMutableBuilder[Self <: StateChangeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTokenUndefined: Self = StObject.set(x, "authToken", js.undefined)
      
      @scala.inline
      def setNewState(value: authenticated | unauthenticated): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldState(value: authenticated | unauthenticated): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubscribeData extends StObject {
    
    var channel: String = js.native
    
    var subscriptionOptions: SubscriptionOptions = js.native
  }
  object SubscribeData {
    
    @scala.inline
    def apply(channel: String, subscriptionOptions: SubscriptionOptions): SubscribeData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeData]
    }
    
    @scala.inline
    implicit class SubscribeDataMutableBuilder[Self <: SubscribeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubscriptionOptions(value: SubscriptionOptions): Self = StObject.set(x, "subscriptionOptions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SubscriptionOptions extends StObject {
    
    var channel: String = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var waitForAuth: js.UndefOr[Boolean] = js.native
  }
  object SubscriptionOptions {
    
    @scala.inline
    def apply(channel: String): SubscriptionOptions = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionOptions]
    }
    
    @scala.inline
    implicit class SubscriptionOptionsMutableBuilder[Self <: SubscriptionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setWaitForAuth(value: Boolean): Self = StObject.set(x, "waitForAuth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForAuthUndefined: Self = StObject.set(x, "waitForAuth", js.undefined)
    }
  }
  
  @js.native
  trait UnsubscribeData extends StObject {
    
    var channel: String = js.native
  }
  object UnsubscribeData {
    
    @scala.inline
    def apply(channel: String): UnsubscribeData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsubscribeData]
    }
    
    @scala.inline
    implicit class UnsubscribeDataMutableBuilder[Self <: UnsubscribeData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    }
  }
}
