package typings.socketclusterServer.serversocketMod

import org.scalablytyped.runtime.StringDictionary
import typings.asyncStreamEmitter.mod.AsyncStreamEmitter
import typings.node.httpMod.IncomingMessage
import typings.scErrors.mod.SocketProtocolErrorStatuses_
import typings.scErrors.mod.SocketProtocolIgnoreStatuses_
import typings.socketclusterServer.AnonBinary
import typings.socketclusterServer.AnonError
import typings.socketclusterServer.AnonMessage
import typings.socketclusterServer.AnonRejectOnFailedDelivery
import typings.socketclusterServer.AnonSignedAuthToken
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AGServerSocket
  extends AsyncStreamEmitter[js.Any] {
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
  var channelSubscriptions: StringDictionary[Boolean] = js.native
  var channelSubscriptionsCount: Double = js.native
  var cloneData: Boolean = js.native
  val errorStatuses: SocketProtocolErrorStatuses_ = js.native
  var exchange: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AGSimpleBroker.SimpleExchange */ js.Any = js.native
  var forwardedForAddress: js.UndefOr[String] = js.native
  var id: String = js.native
  val ignoreStatuses: SocketProtocolIgnoreStatuses_ = js.native
  var inboundMessageStream: typings.writableConsumableStream.mod.^[_] = js.native
  var inboundProcessedMessageCount: Double = js.native
  var inboundReceivedMessageCount: Double = js.native
  var isBatching: Boolean = js.native
  var isBufferingBatch: Boolean = js.native
  var middlewareHandshakeStream: typings.writableConsumableStream.mod.^[_] = js.native
  var middlewareInboundRawStream: typings.writableConsumableStream.mod.^[_] = js.native
  var middlewareInboundStream: typings.writableConsumableStream.mod.^[_] = js.native
  var middlewareOutboundStream: typings.writableConsumableStream.mod.^[_] = js.native
  var outboundPacketStream: typings.writableConsumableStream.mod.^[_] = js.native
  var outboundPreparedMessageCount: Double = js.native
  var outboundSentMessageCount: Double = js.native
  var protocolVersion: Double = js.native
  var remoteAddress: String = js.native
  var remoteFamily: String = js.native
  var remotePort: Double = js.native
  var request: IncomingMessage = js.native
  var server: typings.socketclusterServer.serverMod.^ = js.native
  var signedAuthToken: js.UndefOr[String] = js.native
  var socket: typings.ws.mod.^ = js.native
  var state: connecting | open | closed = js.native
  def cancelBatch(): Unit = js.native
  def cancelBatching(): Unit = js.native
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
  def deauthenticate(options: AnonRejectOnFailedDelivery): js.Promise[Unit] = js.native
  def deauthenticateSelf(): Unit = js.native
  def decode(message: js.Any): js.Any = js.native
  def disconnect(): Unit = js.native
  def disconnect(code: Double): Unit = js.native
  def disconnect(code: Double, reason: String): Unit = js.native
  def emitError(error: Error): Unit = js.native
  @JSName("emit")
  def emit_authStateChange(eventName: authStateChange): typings.consumableStream.mod.^[StateChangeData] = js.native
  @JSName("emit")
  def emit_authStateChange(eventName: authStateChange, data: StateChangeData): Unit = js.native
  @JSName("emit")
  def emit_authTokenSigned(eventName: authTokenSigned): typings.consumableStream.mod.^[AnonSignedAuthToken] = js.native
  @JSName("emit")
  def emit_authTokenSigned(eventName: authTokenSigned, data: AnonSignedAuthToken): Unit = js.native
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
  def emit_error(eventName: error): typings.consumableStream.mod.^[AnonError] = js.native
  @JSName("emit")
  def emit_error(eventName: error, data: AnonError): Unit = js.native
  @JSName("emit")
  def emit_message(eventName: message): typings.consumableStream.mod.^[AnonMessage] = js.native
  @JSName("emit")
  def emit_message(eventName: message, data: AnonMessage): Unit = js.native
  @JSName("emit")
  def emit_raw(eventName: raw): typings.consumableStream.mod.^[AnonMessage] = js.native
  @JSName("emit")
  def emit_raw(eventName: raw, data: AnonMessage): Unit = js.native
  @JSName("emit")
  def emit_subscribe(eventName: subscribe): typings.consumableStream.mod.^[SubscribeData] = js.native
  @JSName("emit")
  def emit_subscribe(eventName: subscribe, data: SubscribeData): Unit = js.native
  @JSName("emit")
  def emit_unsubscribe(eventName: unsubscribe): typings.consumableStream.mod.^[UnsubscribeData] = js.native
  @JSName("emit")
  def emit_unsubscribe(eventName: unsubscribe, data: UnsubscribeData): Unit = js.native
  def encode(`object`: js.Any): js.Any = js.native
  def flushBatch(): Unit = js.native
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
  def invoke(event: String, data: js.Any, options: js.Any): js.Promise[_] = js.native
  def isAuthTokenExpired(token: AuthToken): Boolean = js.native
  def isSubscribed(channel: String): Boolean = js.native
  def kickOut(): js.Any = js.native
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
  def procedure(procedureName: String): typings.streamDemux.demuxedConsumableStreamMod.^[_] = js.native
  def receiver(receiverName: String): typings.streamDemux.demuxedConsumableStreamMod.^[_] = js.native
  def send(data: js.Any, options: AnonBinary): Unit = js.native
  def sendObject(`object`: js.Any): Unit = js.native
  def serializeObject(`object`: js.Any): js.Any = js.native
  def setAuthToken(data: AuthToken): js.Promise[Unit] = js.native
  def setAuthToken(data: AuthToken, options: AuthTokenOptions): js.Promise[Unit] = js.native
  def startBatch(): Unit = js.native
  def startBatching(): Unit = js.native
  def stopBatching(): Unit = js.native
  def subscriptions(): js.Array[String] = js.native
  def terminate(): Unit = js.native
  def transmit(event: String, data: js.Any, options: js.Any): js.Promise[Unit] = js.native
  @JSName("triggerAuthenticationEvents")
  def triggerAuthenticationEvents_authenticated(oldAuthState: authenticated): Unit = js.native
  @JSName("triggerAuthenticationEvents")
  def triggerAuthenticationEvents_unauthenticated(oldAuthState: unauthenticated): Unit = js.native
}

