package typings.spotifyDashApi.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Track Object in Playlists
  * [](https://developer.spotify.com/web-api/object-model/)
  */
trait PlaylistTrackObject extends js.Object {
  var added_at: String
  var added_by: UserObjectPublic
  var is_local: Boolean
  var track: TrackObjectFull
}

object PlaylistTrackObject {
  @scala.inline
  def apply(added_at: String, added_by: UserObjectPublic, is_local: Boolean, track: TrackObjectFull): PlaylistTrackObject = {
    val __obj = js.Dynamic.literal(added_at = added_at, added_by = added_by, is_local = is_local, track = track)
  
    __obj.asInstanceOf[PlaylistTrackObject]
  }
}

