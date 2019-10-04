package typings.sipDotJs.libWebSessionDescriptionHandlerMod

import typings.events.eventsMod.EventEmitter
import typings.sipDotJs.libApiSessionMod.Session
import typings.sipDotJs.libCoreMod.Logger
import typings.sipDotJs.libEnumsMod.TypeStrings
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.BodyObj
import typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
import typings.sipDotJs.libSessionMod.InviteClientContext
import typings.sipDotJs.libSessionMod.InviteServerContext
import typings.sipDotJs.libWebSessionDescriptionHandlerObserverMod.SessionDescriptionHandlerObserver
import typings.sipDotJs.sipDotJsStrings.`peerConnection-SetLocalDescriptionFailed`
import typings.sipDotJs.sipDotJsStrings.`peerConnection-createAnswerFailed`
import typings.sipDotJs.sipDotJsStrings.`peerConnection-createOfferFailed`
import typings.sipDotJs.sipDotJsStrings.`peerConnection-setRemoteDescriptionFailed`
import typings.sipDotJs.sipDotJsStrings.addStream
import typings.sipDotJs.sipDotJsStrings.addTrack
import typings.sipDotJs.sipDotJsStrings.confirmed
import typings.sipDotJs.sipDotJsStrings.getDescription
import typings.sipDotJs.sipDotJsStrings.iceCandidate
import typings.sipDotJs.sipDotJsStrings.iceConectionClosed
import typings.sipDotJs.sipDotJsStrings.iceConnection
import typings.sipDotJs.sipDotJsStrings.iceConnectionChecking
import typings.sipDotJs.sipDotJsStrings.iceConnectionCompleted
import typings.sipDotJs.sipDotJsStrings.iceConnectionConnected
import typings.sipDotJs.sipDotJsStrings.iceConnectionDisconnected
import typings.sipDotJs.sipDotJsStrings.iceConnectionFailed
import typings.sipDotJs.sipDotJsStrings.iceGathering
import typings.sipDotJs.sipDotJsStrings.iceGatheringComplete
import typings.sipDotJs.sipDotJsStrings.setDescription
import typings.sipDotJs.sipDotJsStrings.setRemoteDescription
import typings.sipDotJs.sipDotJsStrings.userMedia
import typings.sipDotJs.sipDotJsStrings.userMediaFailed
import typings.sipDotJs.sipDotJsStrings.userMediaRequest
import typings.std.MediaStream
import typings.std.MediaStreamConstraints
import typings.std.MediaStreamTrack
import typings.std.RTCIceCandidate
import typings.std.RTCPeerConnection
import typings.std.RTCRtpReceiver
import typings.std.RTCSessionDescriptionInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/Web/SessionDescriptionHandler", "SessionDescriptionHandler")
@js.native
class SessionDescriptionHandler protected ()
  extends EventEmitter
     with typings.sipDotJs.libSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler {
  def this(logger: Logger, observer: SessionDescriptionHandlerObserver, options: js.Any) = this()
  var C: js.Any = js.native
  var CONTENT_TYPE: js.Any = js.native
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
  var peerConnection: RTCPeerConnection = js.native
  var resetIceGatheringComplete: js.Any = js.native
  var setDirection: js.Any = js.native
  var shouldAcquireMedia: js.Any = js.native
  var triggerIceGatheringComplete: js.Any = js.native
  var `type`: TypeStrings = js.native
  var waitForIceGatheringComplete: js.Any = js.native
  def getDescription(options: WebSessionDescriptionHandlerOptions): js.Promise[BodyObj] = js.native
  def getDescription(options: WebSessionDescriptionHandlerOptions, modifiers: SessionDescriptionHandlerModifiers): js.Promise[BodyObj] = js.native
  /**
    * Get the direction of the session description
    * @returns {String} direction of the description
    */
  def getDirection(): String = js.native
  /* protected */ def getMediaStream(constraints: MediaStreamConstraints): js.Promise[MediaStream] = js.native
  @JSName("on")
  def on_addStream(event: addStream, listener: js.Function1[/* track */ MediaStream, Unit]): this.type = js.native
  @JSName("on")
  def on_addTrack(event: addTrack, listener: js.Function1[/* track */ MediaStreamTrack, Unit]): this.type = js.native
  @JSName("on")
  def on_confirmed(event: confirmed, listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_getDescription(event: getDescription, listener: js.Function1[/* description */ RTCSessionDescriptionInit, Unit]): this.type = js.native
  @JSName("on")
  def on_iceCandidate(event: iceCandidate, listener: js.Function1[/* candidate */ RTCIceCandidate, Unit]): this.type = js.native
  @JSName("on")
  def on_iceConectionClosed(event: iceConectionClosed, listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_iceConnection(event: iceConnection, listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_iceConnectionChecking(
    event: iceConnectionChecking,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionCompleted(
    event: iceConnectionCompleted,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionConnected(
    event: iceConnectionConnected,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionDisconnected(
    event: iceConnectionDisconnected,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceConnectionFailed(
    event: iceConnectionFailed,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_iceGathering(event: iceGathering, listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]): this.type = js.native
  @JSName("on")
  def on_iceGatheringComplete(
    event: iceGatheringComplete,
    listener: js.Function1[/* sessionDescriptionHandler */ this.type, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_peerConnectionSetLocalDescriptionFailed(
    event: `peerConnection-SetLocalDescriptionFailed`,
    listener: js.Function1[/* error */ js.Any, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_peerConnectioncreateAnswerFailed(event: `peerConnection-createAnswerFailed`, listener: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_peerConnectioncreateOfferFailed(event: `peerConnection-createOfferFailed`, listener: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_peerConnectionsetRemoteDescriptionFailed(
    event: `peerConnection-setRemoteDescriptionFailed`,
    listener: js.Function1[/* error */ js.Any, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_setDescription(event: setDescription, listener: js.Function1[/* description */ RTCSessionDescriptionInit, Unit]): this.type = js.native
  @JSName("on")
  def on_setRemoteDescription(
    event: setRemoteDescription,
    listener: js.Function1[/* receivers */ js.Array[RTCRtpReceiver], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_userMedia(event: userMedia, listener: js.Function1[/* streams */ MediaStream, Unit]): this.type = js.native
  @JSName("on")
  def on_userMediaFailed(event: userMediaFailed, listener: js.Function1[/* error */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_userMediaRequest(event: userMediaRequest, listener: js.Function1[/* constraints */ MediaStreamConstraints, Unit]): this.type = js.native
  def setDescription(sessionDescription: String, options: WebSessionDescriptionHandlerOptions): js.Promise[Unit] = js.native
  def setDescription(
    sessionDescription: String,
    options: WebSessionDescriptionHandlerOptions,
    modifiers: SessionDescriptionHandlerModifiers
  ): js.Promise[Unit] = js.native
}

/* static members */
@JSImport("sip.js/lib/Web/SessionDescriptionHandler", "SessionDescriptionHandler")
@js.native
object SessionDescriptionHandler extends js.Object {
  def defaultFactory(session: Session, options: js.Any): SessionDescriptionHandler = js.native
  /**
    * @param {SIP.Session} session
    * @param {Object} [options]
    */
  def defaultFactory(session: InviteClientContext, options: js.Any): SessionDescriptionHandler = js.native
  def defaultFactory(session: InviteServerContext, options: js.Any): SessionDescriptionHandler = js.native
}

