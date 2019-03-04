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

object PlaybackState {
  @scala.inline
  def apply(
    context: PlaybackContext,
    disallows: PlaybackDisallows,
    duration: scala.Double,
    paused: scala.Boolean,
    position: scala.Double,
    repeat_mode: spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibNumbers.`0` | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibNumbers.`1` | spotifyDashWebDashPlaybackDashSdkLib.spotifyDashWebDashPlaybackDashSdkLibNumbers.`2`,
    restrictions: PlaybackRestrictions,
    shuffle: scala.Boolean,
    track_window: PlaybackTrackWindow
  ): PlaybackState = {
    val __obj = js.Dynamic.literal(context = context, disallows = disallows, duration = duration, paused = paused, position = position, repeat_mode = repeat_mode.asInstanceOf[js.Any], restrictions = restrictions, shuffle = shuffle, track_window = track_window)
  
    __obj.asInstanceOf[PlaybackState]
  }
}

