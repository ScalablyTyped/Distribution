package typings
package spotifyDashWebDashPlaybackDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object SpotifyNs {
  type AddListenerFn = (js.Function2[
    /* event */ spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.ready | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.not_ready, 
    /* cb */ PlaybackInstanceListener, 
    scala.Unit
  ]) with (js.Function2[
    spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.player_state_changed, 
    /* cb */ PlaybackStateListener, 
    scala.Unit
  ]) with (js.Function2[/* event */ ErrorTypes, /* cb */ ErrorListener, scala.Unit])
  type ErrorListener = js.Function1[/* err */ Error, scala.Unit]
  type ErrorTypes = spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.account_error | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.authentication_error | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.initialization_error | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibStrings.playback_error
  type PlaybackInstanceListener = js.Function1[/* inst */ WebPlaybackInstance, scala.Unit]
  type PlaybackStateListener = js.Function1[/* s */ PlaybackState, scala.Unit]
}
