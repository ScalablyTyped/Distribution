package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.ad
import typings.spotifyApi.spotifyApiStrings.context
import typings.spotifyApi.spotifyApiStrings.episode
import typings.spotifyApi.spotifyApiStrings.off
import typings.spotifyApi.spotifyApiStrings.track
import typings.spotifyApi.spotifyApiStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentPlaybackResponse
  extends StObject
     with CurrentlyPlayingObject
     with PlaybackObject
object CurrentPlaybackResponse {
  
  inline def apply(
    actions: ActionsObject,
    currently_playing_type: track | episode | ad | unknown,
    device: UserDevice,
    is_playing: Boolean,
    repeat_state: off | track | context,
    shuffle_state: Boolean,
    timestamp: Double
  ): CurrentPlaybackResponse = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], currently_playing_type = currently_playing_type.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], is_playing = is_playing.asInstanceOf[js.Any], repeat_state = repeat_state.asInstanceOf[js.Any], shuffle_state = shuffle_state.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], context = null, item = null, progress_ms = null)
    __obj.asInstanceOf[CurrentPlaybackResponse]
  }
}
