package typings.spotifyApi.SpotifyApi

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
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], is_playing = is_playing.asInstanceOf[js.Any], repeat_state = repeat_state.asInstanceOf[js.Any], shuffle_state = shuffle_state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (progress_ms != null) __obj.updateDynamic("progress_ms")(progress_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentPlaybackResponse]
  }
}

