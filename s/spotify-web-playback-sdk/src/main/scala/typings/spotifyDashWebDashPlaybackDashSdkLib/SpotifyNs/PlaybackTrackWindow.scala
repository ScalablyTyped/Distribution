package typings
package spotifyDashWebDashPlaybackDashSdkLib.SpotifyNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("current_track")(current_track)
    __obj.updateDynamic("next_tracks")(next_tracks)
    __obj.updateDynamic("previous_tracks")(previous_tracks)
    __obj.asInstanceOf[PlaybackTrackWindow]
  }
}

