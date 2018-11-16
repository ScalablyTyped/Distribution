package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js", "WebRTC")
@js.native
object WebRTCNs extends js.Object {
  @js.native
  class MediaHandler () extends js.Object {
    def getLocalStreams(): js.Array[_] = js.native
    def getRemoteStreams(): js.Array[_] = js.native
    def on(
      name: sipDotJsLib.sipDotJsLibStrings.iceGathering | sipDotJsLib.sipDotJsLibStrings.iceGatheringComplete | sipDotJsLib.sipDotJsLibStrings.iceConnection | sipDotJsLib.sipDotJsLibStrings.iceConnectionChecking | sipDotJsLib.sipDotJsLibStrings.iceConnectionConnected | sipDotJsLib.sipDotJsLibStrings.iceConnectionCompleted | sipDotJsLib.sipDotJsLibStrings.iceConnectionFailed | sipDotJsLib.sipDotJsLibStrings.iceConnectionDisconnected | sipDotJsLib.sipDotJsLibStrings.iceConnectionClosed | java.lang.String,
      callback: js.Function0[scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_addStream(
      name: sipDotJsLib.sipDotJsLibStrings.addStream,
      callback: js.Function1[/* stream */ js.Any, scala.Unit]
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
      callback: js.Function1[/* stream */ js.Any, scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_userMediaFailed(
      name: sipDotJsLib.sipDotJsLibStrings.userMediaFailed,
      callback: js.Function1[/* error */ java.lang.String, scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_userMediaRequest(
      name: sipDotJsLib.sipDotJsLibStrings.userMediaRequest,
      callback: js.Function1[/* constraints */ sipDotJsLib.sipDotJsMod.MediaConstraints, scala.Unit]
    ): scala.Unit = js.native
    def render(renderHint: sipDotJsLib.sipDotJsMod.RenderHint): scala.Unit = js.native
  }
  
  
  trait Options extends js.Object {
    var RTCConstraints: js.UndefOr[js.Any] = js.undefined
    var stunServers: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
    var turnServers: js.UndefOr[
        sipDotJsLib.sipDotJsMod.TurnServer | js.Array[sipDotJsLib.sipDotJsMod.TurnServer]
      ] = js.undefined
  }
  
  @js.native
  class Simple protected () extends js.Object {
    def this(options: sipDotJsLib.sipDotJsMod.SimpleConfigurationParameters) = this()
    def call(target: java.lang.String): sipDotJsLib.sipDotJsMod.Session = js.native
    def call(target: sipDotJsLib.sipDotJsMod.URI): sipDotJsLib.sipDotJsMod.Session = js.native
    def hangup(): sipDotJsLib.sipDotJsMod.Session | scala.Unit = js.native
    @JSName("on")
    def on_connected(
      name: sipDotJsLib.sipDotJsLibStrings.connected,
      callback: js.Function1[/* session */ sipDotJsLib.sipDotJsMod.Session, scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_connecting(
      name: sipDotJsLib.sipDotJsLibStrings.connecting,
      callback: js.Function1[/* session */ sipDotJsLib.sipDotJsMod.Session, scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_ended(
      name: sipDotJsLib.sipDotJsLibStrings.ended,
      callback: js.Function1[/* session */ sipDotJsLib.sipDotJsMod.Session, scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_message(
      name: sipDotJsLib.sipDotJsLibStrings.message,
      callback: js.Function1[/* message */ sipDotJsLib.sipDotJsMod.Message, scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_registered(
      name: sipDotJsLib.sipDotJsLibStrings.registered,
      callback: js.Function1[/* ua */ sipDotJsLib.sipDotJsMod.UA, scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_ringing(
      name: sipDotJsLib.sipDotJsLibStrings.ringing,
      callback: js.Function1[/* session */ sipDotJsLib.sipDotJsMod.Session, scala.Unit]
    ): scala.Unit = js.native
    @JSName("on")
    def on_unregistered(
      name: sipDotJsLib.sipDotJsLibStrings.unregistered,
      callback: js.Function1[/* ua */ sipDotJsLib.sipDotJsMod.UA, scala.Unit]
    ): scala.Unit = js.native
    def toggleMute(mute: scala.Boolean): scala.Unit = js.native
  }
  
  type MediaHandlerFactory = js.Function2[/* session */ sipDotJsLib.sipDotJsMod.Session, /* options */ Options, MediaHandler]
}

