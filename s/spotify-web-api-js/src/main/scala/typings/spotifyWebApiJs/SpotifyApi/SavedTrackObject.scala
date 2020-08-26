package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Saved Track Object in Playlists
  * [](https://developer.spotify.com/documentation/web-api/reference/object-model/#saved-track-object)
  */
@js.native
trait SavedTrackObject extends js.Object {
  var added_at: String = js.native
  var track: TrackObjectFull = js.native
}

object SavedTrackObject {
  @scala.inline
  def apply(added_at: String, track: TrackObjectFull): SavedTrackObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavedTrackObject]
  }
  @scala.inline
  implicit class SavedTrackObjectOps[Self <: SavedTrackObject] (val x: Self) extends AnyVal {
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
    def setAdded_at(value: String): Self = this.set("added_at", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrack(value: TrackObjectFull): Self = this.set("track", value.asInstanceOf[js.Any])
  }
  
}

