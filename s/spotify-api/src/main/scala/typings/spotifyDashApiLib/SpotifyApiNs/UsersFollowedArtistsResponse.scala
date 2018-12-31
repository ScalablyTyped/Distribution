package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get User’s Followed Artists
  * 
  * GET /v1/me/following
  * https://developer.spotify.com/web-api/get-followed-artists/
  */
trait UsersFollowedArtistsResponse extends js.Object {
  var artists: CursorBasedPagingObject[ArtistObjectFull]
}

