package typings
package spotifyDashWebDashPlaybackDashSdkLib.SpotifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait PlaybackState extends js.Object {
  var context: PlaybackContext
  var disallows: PlaybackDisallows
  var duration: scala.Double
  var paused: scala.Boolean
  var position: scala.Double
  /**
           * 0: NO_REPEAT
           * 1: ONCE_REPEAT
           * 2: FULL_REPEAT
           */
  var repeat_mode: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibNumbers.`0` | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibNumbers.`1` | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibNumbers.`2`
  var restrictions: PlaybackRestrictions
  var shuffle: scala.Boolean
  var track_window: PlaybackTrackWindow
}

