package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get a categorys playlists
  *
  * GET /v1/browse/categories/{id}/playlists
  * https://developer.spotify.com/web-api/get-categorys-playlists/
  */
trait CategoryPlaylistsResponse extends js.Object {
  var playlists: PagingObject[PlaylistObjectSimplified]
}

object CategoryPlaylistsResponse {
  @scala.inline
  def apply(playlists: PagingObject[PlaylistObjectSimplified]): CategoryPlaylistsResponse = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryPlaylistsResponse]
  }
}

