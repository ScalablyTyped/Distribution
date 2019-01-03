package typings
package sipDotJsLib.typesWebSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/Web/session-description-handler", "WebSessionDescriptionHandler")
@js.native
class WebSessionDescriptionHandler ()
  extends sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandler {
  def getDescription(options: WebSessionDescriptionHandlerOptions): js.Promise[sipDotJsLib.Anon_Body] = js.native
  def getDescription(
    options: WebSessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): js.Promise[sipDotJsLib.Anon_Body] = js.native
  @JSName("on")
  def on_addTrack(
    name: sipDotJsLib.sipDotJsLibStrings.addTrack,
    callback: js.Function1[/* track */ stdLib.MediaStreamTrack, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_confirmed(
    name: sipDotJsLib.sipDotJsLibStrings.confirmed,
    callback: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_getDescription(
    name: sipDotJsLib.sipDotJsLibStrings.getDescription,
    callback: js.Function1[/* description */ stdLib.RTCSessionDescriptionInit, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_iceCandidate(
    name: sipDotJsLib.sipDotJsLibStrings.iceCandidate,
    callback: js.Function1[/* candidate */ stdLib.RTCIceCandidate, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_iceConectionClosed(
    name: sipDotJsLib.sipDotJsLibStrings.iceConectionClosed,
    callback: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_iceConnection(
    name: sipDotJsLib.sipDotJsLibStrings.iceConnection,
    callback: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_iceConnectionChecking(
    name: sipDotJsLib.sipDotJsLibStrings.iceConnectionChecking,
    callback: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_iceConnectionCompleted(
    name: sipDotJsLib.sipDotJsLibStrings.iceConnectionCompleted,
    callback: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_iceConnectionConnected(
    name: sipDotJsLib.sipDotJsLibStrings.iceConnectionConnected,
    callback: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_iceConnectionDisconnected(
    name: sipDotJsLib.sipDotJsLibStrings.iceConnectionDisconnected,
    callback: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_iceConnectionFailed(
    name: sipDotJsLib.sipDotJsLibStrings.iceConnectionFailed,
    callback: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_iceGathering(
    name: sipDotJsLib.sipDotJsLibStrings.iceGathering,
    callback: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_iceGatheringComplete(
    name: sipDotJsLib.sipDotJsLibStrings.iceGatheringComplete,
    callback: js.Function1[/* sessionDescriptionHandler */ this.type, scala.Unit]
  ): scala.Unit = js.native
   // TODO:
  @JSName("on")
  def `on_peerConnection-SetLocalDescriptionFailed`(
    name: sipDotJsLib.sipDotJsLibStrings.`peerConnection-SetLocalDescriptionFailed`,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_peerConnection-createAnswerFailed`(
    name: sipDotJsLib.sipDotJsLibStrings.`peerConnection-createAnswerFailed`,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_peerConnection-createOfferFailed`(
    name: sipDotJsLib.sipDotJsLibStrings.`peerConnection-createOfferFailed`,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def `on_peerConnection-setRemoteDescriptionFailed`(
    name: sipDotJsLib.sipDotJsLibStrings.`peerConnection-setRemoteDescriptionFailed`,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
   // TODO: SessionDescriptionHandlerException
  @JSName("on")
  def on_setDescription(
    name: sipDotJsLib.sipDotJsLibStrings.setDescription,
    callback: js.Function1[/* description */ stdLib.RTCSessionDescriptionInit, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_setRemoteDescription(
    name: sipDotJsLib.sipDotJsLibStrings.setRemoteDescription,
    callback: js.Function1[/* receivers */ js.Array[stdLib.RTCRtpReceiver], scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_userMedia(
    name: sipDotJsLib.sipDotJsLibStrings.userMedia,
    callback: js.Function1[/* streams */ stdLib.MediaStream, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_userMediaFailed(
    name: sipDotJsLib.sipDotJsLibStrings.userMediaFailed,
    callback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_userMediaRequest(
    name: sipDotJsLib.sipDotJsLibStrings.userMediaRequest,
    callback: js.Function1[/* constraints */ stdLib.MediaStreamConstraints, scala.Unit]
  ): scala.Unit = js.native
  def setDescription(sdp: java.lang.String, options: WebSessionDescriptionHandlerOptions): js.Promise[scala.Unit] = js.native
  def setDescription(
    sdp: java.lang.String,
    options: WebSessionDescriptionHandlerOptions,
    modifiers: sipDotJsLib.typesSessionDashDescriptionDashHandlerMod.SessionDescriptionHandlerModifiers
  ): js.Promise[scala.Unit] = js.native
}

