package typings.spotifyWebPlaybackSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Spotify {
  type AddListenerFn = (js.Function2[
    /* event */ typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.ready | typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.not_ready, 
    /* cb */ typings.spotifyWebPlaybackSdk.Spotify.PlaybackInstanceListener, 
    scala.Unit
  ]) with (js.Function2[
    typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkStrings.player_state_changed, 
    /* cb */ typings.spotifyWebPlaybackSdk.Spotify.PlaybackStateListener, 
    scala.Unit
  ]) with (js.Function2[
    /* event */ typings.spotifyWebPlaybackSdk.Spotify.ErrorTypes, 
    /* cb */ typings.spotifyWebPlaybackSdk.Spotify.ErrorListener, 
    scala.Unit
  ])
  type ErrorListener = js.Function1[/* err */ typings.spotifyWebPlaybackSdk.Spotify.Error, scala.Unit]
  type PlaybackInstanceListener = js.Function1[/* inst */ typings.spotifyWebPlaybackSdk.Spotify.WebPlaybackInstance, scala.Unit]
  type PlaybackStateListener = js.Function1[/* s */ typings.spotifyWebPlaybackSdk.Spotify.PlaybackState, scala.Unit]
}
