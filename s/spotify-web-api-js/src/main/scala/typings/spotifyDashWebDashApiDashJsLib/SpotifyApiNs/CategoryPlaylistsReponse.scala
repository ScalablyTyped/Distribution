package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get a categorys playlists
  * 
  * GET /v1/browse/categories/{id}/playlists
  * https://developer.spotify.com/web-api/get-categorys-playlists/
  */
trait CategoryPlaylistsReponse extends js.Object {
  var playlists: PagingObject[PlaylistObjectSimplified]
}

object CategoryPlaylistsReponse {
  @scala.inline
  def apply(playlists: PagingObject[PlaylistObjectSimplified]): CategoryPlaylistsReponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("playlists")(playlists)
    __obj.asInstanceOf[CategoryPlaylistsReponse]
  }
}

