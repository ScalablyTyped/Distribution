package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Playlist Object Full
     * [](https://developer.spotify.com/web-api/object-model/)
     */

trait PlaylistObjectFull extends PlaylistBaseObject {
  var description: java.lang.String
  var followers: FollowersObject
  var tracks: PagingObject[PlaylistTrackObject]
}

