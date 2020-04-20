package typings.spotifyWebPlaybackSdk.Spotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaybackTrackWindow extends js.Object {
  var current_track: Track
  var next_tracks: js.Array[Track]
  var previous_tracks: js.Array[Track]
}

object PlaybackTrackWindow {
  @scala.inline
  def apply(current_track: Track, next_tracks: js.Array[Track], previous_tracks: js.Array[Track]): PlaybackTrackWindow = {
    val __obj = js.Dynamic.literal(current_track = current_track.asInstanceOf[js.Any], next_tracks = next_tracks.asInstanceOf[js.Any], previous_tracks = previous_tracks.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackTrackWindow]
  }
}

