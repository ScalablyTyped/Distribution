package typings
package spotifyDashWebDashPlaybackDashSdkLib.SpotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Spotify.SpotifyPlayer")
@js.native
class SpotifyPlayer protected () extends js.Object {
  def this(options: PlayerInit) = this()
  @JSName("addListener")
  var addListener_Original: AddListenerFn = js.native
  @JSName("on")
  var on_Original: AddListenerFn = js.native
  def addListener(event: ErrorTypes, cb: ErrorListener): scala.Unit = js.native
  @JSName("addListener")
  def addListener_not_ready(
    event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.not_ready,
    cb: PlaybackInstanceListener
  ): scala.Unit = js.native
  @JSName("addListener")
  def addListener_player_state_changed(
    event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.player_state_changed,
    cb: PlaybackStateListener
  ): scala.Unit = js.native
  @JSName("addListener")
  def addListener_ready(
    event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.ready,
    cb: PlaybackInstanceListener
  ): scala.Unit = js.native
  def connect(): js.Promise[scala.Boolean] = js.native
  def disconnect(): scala.Unit = js.native
  def getCurrentState(): js.Promise[PlaybackState | scala.Null] = js.native
  def getVolume(): js.Promise[scala.Double] = js.native
  def nextTrack(): js.Promise[scala.Unit] = js.native
  def on(event: ErrorTypes, cb: ErrorListener): scala.Unit = js.native
  @JSName("on")
  def on_not_ready(
    event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.not_ready,
    cb: PlaybackInstanceListener
  ): scala.Unit = js.native
  @JSName("on")
  def on_player_state_changed(
    event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.player_state_changed,
    cb: PlaybackStateListener
  ): scala.Unit = js.native
  @JSName("on")
  def on_ready(
    event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.ready,
    cb: PlaybackInstanceListener
  ): scala.Unit = js.native
  def pause(): js.Promise[scala.Unit] = js.native
  def previousTrack(): js.Promise[scala.Unit] = js.native
  def removeListener(event: ErrorTypes): scala.Unit = js.native
  def removeListener(event: ErrorTypes, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_not_ready(event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.not_ready): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_not_ready(
    event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.not_ready,
    cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener
  ): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_player_state_changed(
    event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.player_state_changed
  ): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_player_state_changed(
    event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.player_state_changed,
    cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener
  ): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_ready(event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.ready): scala.Unit = js.native
  @JSName("removeListener")
  def removeListener_ready(
    event: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.ready,
    cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener
  ): scala.Unit = js.native
  def resume(): js.Promise[scala.Unit] = js.native
  def seek(pos_ms: scala.Double): js.Promise[scala.Unit] = js.native
  def setName(name: java.lang.String): js.Promise[scala.Unit] = js.native
  def setVolume(volume: scala.Double): js.Promise[scala.Unit] = js.native
  def togglePlay(): js.Promise[scala.Unit] = js.native
}

