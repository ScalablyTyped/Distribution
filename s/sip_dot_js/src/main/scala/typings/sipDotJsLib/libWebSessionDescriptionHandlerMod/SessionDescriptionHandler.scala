package typings
package sipDotJsLib.libWebSessionDescriptionHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web/SessionDescriptionHandler", "SessionDescriptionHandler")
@js.native
class SessionDescriptionHandler protected ()
  extends nodeLib.eventsMod.EventEmitter
     with sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler {
  def this(logger: sipDotJsLib.libLoggerFactoryMod.Logger, observer: sipDotJsLib.libWebSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver, options: js.Any) = this()
  var C: js.Any = js.native
  var CONTENT_TYPE: js.Any = js.native
  var WebRTC: js.Any = js.native
  var acquire: js.Any = js.native
  var addDefaultIceCheckingTimeout: js.Any = js.native
  var addDefaultIceServers: js.Any = js.native
  var checkAndDefaultConstraints: js.Any = js.native
  var constraints: js.Any = js.native
  var createOfferOrAnswer: js.Any = js.native
  var createRTCSessionDescriptionInit: js.Any = js.native
  var direction: js.Any = js.native
  var dtmfSender: js.Any = js.native
  var hasBrowserGetSenderSupport: js.Any = js.native
  var hasBrowserTrackSupport: js.Any = js.native
  var hasOffer: js.Any = js.native
  var iceGatheringDeferred: js.Any = js.native
  var iceGatheringTimeout: js.Any = js.native
  var iceGatheringTimer: js.Any = js.native
  var initPeerConnection: js.Any = js.native
  var isIceGatheringComplete: js.Any = js.native
  var logger: js.Any = js.native
  var modifiers: js.Any = js.native
  var observer: js.Any = js.native
  var options: js.Any = js.native
  var peerConnection: stdLib.RTCPeerConnection = js.native
  var resetIceGatheringComplete: js.Any = js.native
  var setDirection: js.Any = js.native
  var shouldAcquireMedia: js.Any = js.native
  var triggerIceGatheringComplete: js.Any = js.native
  var `type`: sipDotJsLib.libEnumsMod.TypeStrings = js.native
  var waitForIceGatheringComplete: js.Any = js.native
  /* InferMemberOverrides */
  override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
  /* InferMemberOverrides */
  override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
  def getDescription(options: WebSessionDescriptionHandlerOptions): js.Promise[sipDotJsLib.libSessionDashDescriptionDashHandlerMod.BodyObj] = js.native
  def getDescription(
    options: WebSessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): js.Promise[sipDotJsLib.libSessionDashDescriptionDashHandlerMod.BodyObj] = js.native
  /**
    * Get the direction of the session description
    * @returns {String} direction of the description
    */
  def getDirection(): java.lang.String = js.native
  /* InferMemberOverrides */
  override def getMaxListeners(): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: java.lang.String): scala.Double = js.native
  /* InferMemberOverrides */
  override def listenerCount(`type`: js.Symbol): scala.Double = js.native
  /* InferMemberOverrides */
  override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_addStream(
    event: sipDotJsLib.sipDotJsLibStrings.addStream,
    listener: js.Function1[/* track */ stdLib.MediaStream, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_addTrack(
    event: sipDotJsLib.sipDotJsLibStrings.addTrack,
    listener: js.Function1[/* track */ stdLib.MediaStreamTrack, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_confirmed(
    event: sipDotJsLib.sipDotJsLibStrings.confirmed,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_getDescription(
    event: sipDotJsLib.sipDotJsLibStrings.getDescription,
    listener: js.Function1[/* description */ stdLib.RTCSessionDescriptionInit, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceCandidate(
    event: sipDotJsLib.sipDotJsLibStrings.iceCandidate,
    listener: js.Function1[/* candidate */ stdLib.RTCIceCandidate, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConectionClosed(
    event: sipDotJsLib.sipDotJsLibStrings.iceConectionClosed,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnection(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnection,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionChecking(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnectionChecking,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionCompleted(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnectionCompleted,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionConnected(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnectionConnected,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionDisconnected(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnectionDisconnected,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionFailed(
    event: sipDotJsLib.sipDotJsLibStrings.iceConnectionFailed,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceGathering(
    event: sipDotJsLib.sipDotJsLibStrings.iceGathering,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceGatheringComplete(
    event: sipDotJsLib.sipDotJsLibStrings.iceGatheringComplete,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_peerConnection-SetLocalDescriptionFailed`(
    event: sipDotJsLib.sipDotJsLibStrings.`peerConnection-SetLocalDescriptionFailed`,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_peerConnection-createAnswerFailed`(
    event: sipDotJsLib.sipDotJsLibStrings.`peerConnection-createAnswerFailed`,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_peerConnection-createOfferFailed`(
    event: sipDotJsLib.sipDotJsLibStrings.`peerConnection-createOfferFailed`,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def `on_peerConnection-setRemoteDescriptionFailed`(
    event: sipDotJsLib.sipDotJsLibStrings.`peerConnection-setRemoteDescriptionFailed`,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_setDescription(
    event: sipDotJsLib.sipDotJsLibStrings.setDescription,
    listener: js.Function1[/* description */ stdLib.RTCSessionDescriptionInit, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_setRemoteDescription(
    event: sipDotJsLib.sipDotJsLibStrings.setRemoteDescription,
    listener: js.Function1[/* receivers */ js.Array[stdLib.RTCRtpReceiver], scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userMedia(
    event: sipDotJsLib.sipDotJsLibStrings.userMedia,
    listener: js.Function1[/* streams */ stdLib.MediaStream, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userMediaFailed(
    event: sipDotJsLib.sipDotJsLibStrings.userMediaFailed,
    listener: js.Function1[/* error */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userMediaRequest(
    event: sipDotJsLib.sipDotJsLibStrings.userMediaRequest,
    listener: js.Function1[/* constraints */ stdLib.MediaStreamConstraints, scala.Unit]
  ): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  // Added in Node 6...
  /* InferMemberOverrides */
  override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: java.lang.String): this.type = js.native
  /* InferMemberOverrides */
  override def removeAllListeners(event: js.Symbol): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  /* InferMemberOverrides */
  override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
  def setDescription(sessionDescription: java.lang.String, options: WebSessionDescriptionHandlerOptions): js.Promise[scala.Unit] = js.native
  def setDescription(
    sessionDescription: java.lang.String,
    options: WebSessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): js.Promise[scala.Unit] = js.native
  /* InferMemberOverrides */
  override def setMaxListeners(n: scala.Double): this.type = js.native
}

/* static members */
@JSImport("sip.js/lib/Web/SessionDescriptionHandler", "SessionDescriptionHandler")
@js.native
object SessionDescriptionHandler extends js.Object {
  /**
    * @param {SIP.Session} session
    * @param {Object} [options]
    */
  def defaultFactory(session: sipDotJsLib.libSessionMod.InviteClientContext, options: js.Any): sipDotJsLib.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
  def defaultFactory(session: sipDotJsLib.libSessionMod.InviteServerContext, options: js.Any): sipDotJsLib.libWebSessionDescriptionHandlerMod.SessionDescriptionHandler = js.native
}

