package typings
package spotifyDashApiLib.SpotifyApiNs

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

object ListOfFeaturedPlaylistsResponse {
  @scala.inline
  def apply(playlists: PagingObject[PlaylistObjectSimplified], message: java.lang.String = null): ListOfFeaturedPlaylistsResponse = {
    val __obj = js.Dynamic.literal(playlists = playlists)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ListOfFeaturedPlaylistsResponse]
  }
}

