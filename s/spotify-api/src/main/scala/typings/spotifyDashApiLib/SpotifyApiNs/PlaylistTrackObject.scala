package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The Track Object in Playlists
     * [](https://developer.spotify.com/web-api/object-model/)
     */

trait PlaylistTrackObject extends js.Object {
  var added_at: java.lang.String
  var added_by: UserObjectPublic
  var is_local: scala.Boolean
  var track: TrackObjectFull
}

