package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlaybackTrackWindow extends js.Object {
  var current_track: Track = js.native
  var next_tracks: js.Array[Track] = js.native
  var previous_tracks: js.Array[Track] = js.native
}

object PlaybackTrackWindow {
  @scala.inline
  def apply(current_track: Track, next_tracks: js.Array[Track], previous_tracks: js.Array[Track]): PlaybackTrackWindow = {
    val __obj = js.Dynamic.literal(current_track = current_track.asInstanceOf[js.Any], next_tracks = next_tracks.asInstanceOf[js.Any], previous_tracks = previous_tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackTrackWindow]
  }
  @scala.inline
  implicit class PlaybackTrackWindowOps[Self <: PlaybackTrackWindow] (val x: Self) extends AnyVal {
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
    def setCurrent_track(value: Track): Self = this.set("current_track", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext_tracksVarargs(value: Track*): Self = this.set("next_tracks", js.Array(value :_*))
    @scala.inline
    def setNext_tracks(value: js.Array[Track]): Self = this.set("next_tracks", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevious_tracksVarargs(value: Track*): Self = this.set("previous_tracks", js.Array(value :_*))
    @scala.inline
    def setPrevious_tracks(value: js.Array[Track]): Self = this.set("previous_tracks", value.asInstanceOf[js.Any])
  }
  
}

