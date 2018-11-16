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
  def connect(): stdLib.Promise[scala.Boolean] = js.native
  def disconnect(): scala.Unit = js.native
  def getCurrentState(): stdLib.Promise[PlaybackState | scala.Null] = js.native
  def getVolume(): stdLib.Promise[scala.Double] = js.native
  def nextTrack(): stdLib.Promise[scala.Unit] = js.native
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
  def pause(): stdLib.Promise[scala.Unit] = js.native
  def previousTrack(): stdLib.Promise[scala.Unit] = js.native
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
  def resume(): stdLib.Promise[scala.Unit] = js.native
  def seek(pos_ms: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def setVolume(volume: scala.Double): stdLib.Promise[scala.Unit] = js.native
  def togglePlay(): stdLib.Promise[scala.Unit] = js.native
}

