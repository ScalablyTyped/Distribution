package typings.spotifyWebPlaybackSdk.Spotify

import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`0`
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`1`
import typings.spotifyWebPlaybackSdk.spotifyWebPlaybackSdkNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackState extends js.Object {
  var context: PlaybackContext = js.native
  var disallows: PlaybackDisallows = js.native
  var duration: Double = js.native
  var paused: Boolean = js.native
  var position: Double = js.native
  /**
    * 0: NO_REPEAT
    * 1: ONCE_REPEAT
    * 2: FULL_REPEAT
    */
  var repeat_mode: `0` | `1` | `2` = js.native
  var restrictions: PlaybackRestrictions = js.native
  var shuffle: Boolean = js.native
  var track_window: PlaybackTrackWindow = js.native
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
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], disallows = disallows.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], repeat_mode = repeat_mode.asInstanceOf[js.Any], restrictions = restrictions.asInstanceOf[js.Any], shuffle = shuffle.asInstanceOf[js.Any], track_window = track_window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackState]
  }
  @scala.inline
  implicit class PlaybackStateOps[Self <: PlaybackState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContext(value: PlaybackContext): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisallows(value: PlaybackDisallows): Self = this.set("disallows", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: Double): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeat_mode(value: `0` | `1` | `2`): Self = this.set("repeat_mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestrictions(value: PlaybackRestrictions): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    @scala.inline
    def setShuffle(value: Boolean): Self = this.set("shuffle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack_window(value: PlaybackTrackWindow): Self = this.set("track_window", value.asInstanceOf[js.Any])
  }
  
}

