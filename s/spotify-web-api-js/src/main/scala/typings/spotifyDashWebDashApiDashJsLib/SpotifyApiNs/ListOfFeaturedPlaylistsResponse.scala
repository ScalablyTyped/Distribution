package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get a list of featured playlists
  * 
  * GET /v1/browse/featured-playlists
  * https://developer.spotify.com/web-api/get-list-featured-playlists/
  */
trait ListOfFeaturedPlaylistsResponse extends js.Object {
  var message: js.UndefOr[java.lang.String] = js.undefined
  var playlists: PagingObject[PlaylistObjectSimplified]
}

