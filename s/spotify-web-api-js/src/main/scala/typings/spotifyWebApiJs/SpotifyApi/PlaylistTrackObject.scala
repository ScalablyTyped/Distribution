package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Track Object in Playlists
  * [](https://developer.spotify.com/web-api/object-model/)
  */
@js.native
trait PlaylistTrackObject extends js.Object {
  
  var added_at: String = js.native
  
  var added_by: UserObjectPublic = js.native
  
  var is_local: Boolean = js.native
  
  var track: TrackObjectFull | EpisodeObjectFull = js.native
}
object PlaylistTrackObject {
  
  @scala.inline
  def apply(
    added_at: String,
    added_by: UserObjectPublic,
    is_local: Boolean,
    track: TrackObjectFull | EpisodeObjectFull
  ): PlaylistTrackObject = {
    val __obj = js.Dynamic.literal(added_at = added_at.asInstanceOf[js.Any], added_by = added_by.asInstanceOf[js.Any], is_local = is_local.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistTrackObject]
  }
  
  @scala.inline
  implicit class PlaylistTrackObjectOps[Self <: PlaylistTrackObject] (val x: Self) extends AnyVal {
    
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
    def setAdded_by(value: UserObjectPublic): Self = this.set("added_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_local(value: Boolean): Self = this.set("is_local", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrack(value: TrackObjectFull | EpisodeObjectFull): Self = this.set("track", value.asInstanceOf[js.Any])
  }
}
