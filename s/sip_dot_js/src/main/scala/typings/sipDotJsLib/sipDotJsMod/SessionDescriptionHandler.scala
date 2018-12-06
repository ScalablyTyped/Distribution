package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SessionDescriptionHandler extends js.Object {
  var peerConnection: js.Any = js.native
  def close(): scala.Unit = js.native
  def getDescription(options: SessionDescriptionHandlerParameters, modifiers: js.Array[DescriptionModifier]): stdLib.Promise[_] = js.native
  def hasDescription(contentType: java.lang.String): scala.Boolean = js.native
  def holdModifier(description: stdLib.RTCSessionDescription): stdLib.Promise[stdLib.RTCSessionDescription] = js.native
  def on(
    name: sipDotJsLib.sipDotJsLibStrings.iceGathering | sipDotJsLib.sipDotJsLibStrings.iceGatheringComplete | sipDotJsLib.sipDotJsLibStrings.iceConnection | sipDotJsLib.sipDotJsLibStrings.iceConnectionChecking | sipDotJsLib.sipDotJsLibStrings.iceConnectionConnected | sipDotJsLib.sipDotJsLibStrings.iceConnectionCompleted | sipDotJsLib.sipDotJsLibStrings.iceConnectionFailed | sipDotJsLib.sipDotJsLibStrings.iceConnectionDisconnected | sipDotJsLib.sipDotJsLibStrings.iceConnectionClosed | java.lang.String,
    callback: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_addTrack(
    name: sipDotJsLib.sipDotJsLibStrings.addTrack,
    callback: js.Function1[/* track */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_dataChannel(
    name: sipDotJsLib.sipDotJsLibStrings.dataChannel,
    callback: js.Function1[/* sdpWrapper */ sipDotJsLib.Anon_Type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_getDescription(
    name: sipDotJsLib.sipDotJsLibStrings.getDescription,
    callback: js.Function1[/* sdpWrapper */ sipDotJsLib.Anon_Type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_iceCandidate(
    name: sipDotJsLib.sipDotJsLibStrings.iceCandidate,
    callback: js.Function1[/* candidate */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_setDescription(
    name: sipDotJsLib.sipDotJsLibStrings.setDescription,
    callback: js.Function1[/* sdpWrapper */ sipDotJsLib.Anon_Type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_userMedia(
    name: sipDotJsLib.sipDotJsLibStrings.userMedia,
    callback: js.Function1[/* stream */ stdLib.MediaStream, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_userMediaFailed(
    name: sipDotJsLib.sipDotJsLibStrings.userMediaFailed,
    callback: js.Function1[/* error */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_userMediaRequest(
    name: sipDotJsLib.sipDotJsLibStrings.userMediaRequest,
    callback: js.Function1[/* constraints */ MediaConstraints, scala.Unit]
  ): scala.Unit = js.native
  def setDescription(
    sessionDescription: java.lang.String,
    options: SessionDescriptionHandlerParameters,
    modifiers: js.Array[DescriptionModifier]
  ): stdLib.Promise[_] = js.native
}

