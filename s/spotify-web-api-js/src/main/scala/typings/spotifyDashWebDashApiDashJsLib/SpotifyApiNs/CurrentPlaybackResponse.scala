package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

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
    is_playing: scala.Boolean,
    repeat_state: PlaybackRepeatState,
    shuffle_state: scala.Boolean,
    timestamp: scala.Double,
    context: ContextObject = null,
    item: TrackObjectFull = null,
    progress_ms: scala.Int | scala.Double = null
  ): CurrentPlaybackResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("device")(device)
    __obj.updateDynamic("is_playing")(is_playing)
    __obj.updateDynamic("repeat_state")(repeat_state)
    __obj.updateDynamic("shuffle_state")(shuffle_state)
    __obj.updateDynamic("timestamp")(timestamp)
    if (context != null) __obj.updateDynamic("context")(context)
    if (item != null) __obj.updateDynamic("item")(item)
    if (progress_ms != null) __obj.updateDynamic("progress_ms")(progress_ms.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentPlaybackResponse]
  }
}

