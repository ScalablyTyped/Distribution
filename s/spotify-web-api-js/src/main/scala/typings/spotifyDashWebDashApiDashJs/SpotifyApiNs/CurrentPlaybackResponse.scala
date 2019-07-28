package typings.spotifyDashWebDashApiDashJs.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentPlaybackResponse
  extends CurrentlyPlayingObject
     with PlaybackObject

object CurrentPlaybackResponse {
  @scala.inline
  def apply(
    device: UserDevice,
    is_playing: Boolean,
    repeat_state: PlaybackRepeatState,
    shuffle_state: Boolean,
    timestamp: Double,
    context: ContextObject = null,
    item: TrackObjectFull = null,
    progress_ms: Int | Double = null
  ): CurrentPlaybackResponse = {
    val __obj = js.Dynamic.literal(device = device, is_playing = is_playing, repeat_state = repeat_state, shuffle_state = shuffle_state, timestamp = timestamp)
    if (context != null) __obj.updateDynamic("context")(context)
    if (item != null) __obj.updateDynamic("item")(item)
    if (progress_ms != null) __obj.updateDynamic("progress_ms")(progress_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentPlaybackResponse]
  }
}

