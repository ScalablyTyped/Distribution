package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.context
import typings.spotifyApi.spotifyApiStrings.off
import typings.spotifyApi.spotifyApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackObject extends js.Object {
  var repeat_state: off | track | context
  var shuffle_state: Boolean
}

object PlaybackObject {
  @scala.inline
  def apply(repeat_state: off | track | context, shuffle_state: Boolean): PlaybackObject = {
    val __obj = js.Dynamic.literal(repeat_state = repeat_state.asInstanceOf[js.Any], shuffle_state = shuffle_state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackObject]
  }
}

