package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.context
import typings.spotifyApi.spotifyApiStrings.off
import typings.spotifyApi.spotifyApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentPlaybackResponse
  extends CurrentlyPlayingObject
     with PlaybackObject

object CurrentPlaybackResponse {
  @scala.inline
  def apply(
    device: UserDevice,
    is_playing: Boolean,
    repeat_state: off | track | context,
    shuffle_state: Boolean,
    timestamp: Double
  ): CurrentPlaybackResponse = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any], is_playing = is_playing.asInstanceOf[js.Any], repeat_state = repeat_state.asInstanceOf[js.Any], shuffle_state = shuffle_state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentPlaybackResponse]
  }
}

