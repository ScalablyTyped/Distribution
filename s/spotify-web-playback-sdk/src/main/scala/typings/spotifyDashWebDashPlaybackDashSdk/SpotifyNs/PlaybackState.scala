package typings.spotifyDashWebDashPlaybackDashSdk.SpotifyNs

import typings.spotifyDashWebDashPlaybackDashSdk.spotifyDashWebDashPlaybackDashSdkNumbers.`0`
import typings.spotifyDashWebDashPlaybackDashSdk.spotifyDashWebDashPlaybackDashSdkNumbers.`1`
import typings.spotifyDashWebDashPlaybackDashSdk.spotifyDashWebDashPlaybackDashSdkNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackState extends js.Object {
  var context: PlaybackContext
  var disallows: PlaybackDisallows
  var duration: Double
  var paused: Boolean
  var position: Double
  /**
    * 0: NO_REPEAT
    * 1: ONCE_REPEAT
    * 2: FULL_REPEAT
    */
  var repeat_mode: `0` | `1` | `2`
  var restrictions: PlaybackRestrictions
  var shuffle: Boolean
  var track_window: PlaybackTrackWindow
}

object PlaybackState {
  @scala.inline
  def apply(
    context: PlaybackContext,
    disallows: PlaybackDisallows,
    duration: Double,
    paused: Boolean,
    position: Double,
    repeat_mode: `0` | `1` | `2`,
    restrictions: PlaybackRestrictions,
    shuffle: Boolean,
    track_window: PlaybackTrackWindow
  ): PlaybackState = {
    val __obj = js.Dynamic.literal(context = context, disallows = disallows, duration = duration, paused = paused, position = position, repeat_mode = repeat_mode.asInstanceOf[js.Any], restrictions = restrictions, shuffle = shuffle, track_window = track_window)
  
    __obj.asInstanceOf[PlaybackState]
  }
}

