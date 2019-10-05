package typings.spotifyDashApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackObject extends js.Object {
  var repeat_state: PlaybackRepeatState
  var shuffle_state: Boolean
}

object PlaybackObject {
  @scala.inline
  def apply(repeat_state: PlaybackRepeatState, shuffle_state: Boolean): PlaybackObject = {
    val __obj = js.Dynamic.literal(repeat_state = repeat_state, shuffle_state = shuffle_state)
  
    __obj.asInstanceOf[PlaybackObject]
  }
}

