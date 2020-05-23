package typings.spotifyWebPlaybackSdk.Spotify

import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.not_ready
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.player_state_changed
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotifyPlayer extends js.Object {
  @JSName("addListener")
  var addListener_Original: AddListenerFn = js.native
  @JSName("on")
  var on_Original: AddListenerFn = js.native
  def addListener(event: ErrorTypes, cb: ErrorListener): Unit = js.native
  @JSName("addListener")
  def addListener_notready(event: not_ready, cb: PlaybackInstanceListener): Unit = js.native
  @JSName("addListener")
  def addListener_playerstatechanged(event: player_state_changed, cb: PlaybackStateListener): Unit = js.native
  @JSName("addListener")
  def addListener_ready(event: ready, cb: PlaybackInstanceListener): Unit = js.native
  def connect(): js.Promise[Boolean] = js.native
  def disconnect(): Unit = js.native
  def getCurrentState(): js.Promise[PlaybackState | Null] = js.native
  def getVolume(): js.Promise[Double] = js.native
  def nextTrack(): js.Promise[Unit] = js.native
  def on(event: ErrorTypes, cb: ErrorListener): Unit = js.native
  @JSName("on")
  def on_notready(event: not_ready, cb: PlaybackInstanceListener): Unit = js.native
  @JSName("on")
  def on_playerstatechanged(event: player_state_changed, cb: PlaybackStateListener): Unit = js.native
  @JSName("on")
  def on_ready(event: ready, cb: PlaybackInstanceListener): Unit = js.native
  def pause(): js.Promise[Unit] = js.native
  def previousTrack(): js.Promise[Unit] = js.native
  def removeListener(event: ErrorTypes): Unit = js.native
  def removeListener(event: ErrorTypes, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
  @JSName("removeListener")
  def removeListener_notready(event: not_ready): Unit = js.native
  @JSName("removeListener")
  def removeListener_notready(event: not_ready, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
  @JSName("removeListener")
  def removeListener_playerstatechanged(event: player_state_changed): Unit = js.native
  @JSName("removeListener")
  def removeListener_playerstatechanged(event: player_state_changed, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
  @JSName("removeListener")
  def removeListener_ready(event: ready): Unit = js.native
  @JSName("removeListener")
  def removeListener_ready(event: ready, cb: ErrorListener | PlaybackInstanceListener | PlaybackStateListener): Unit = js.native
  def resume(): js.Promise[Unit] = js.native
  def seek(pos_ms: Double): js.Promise[Unit] = js.native
  def setName(name: String): js.Promise[Unit] = js.native
  def setVolume(volume: Double): js.Promise[Unit] = js.native
  def togglePlay(): js.Promise[Unit] = js.native
}

