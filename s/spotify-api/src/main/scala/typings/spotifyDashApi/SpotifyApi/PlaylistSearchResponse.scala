package typings.spotifyDashApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for a playlist
  * 
  * GET /v1/search?type=playlist
  * https://developer.spotify.com/web-api/search-item/
  */
trait PlaylistSearchResponse extends js.Object {
  var playlists: PagingObject[PlaylistObjectSimplified]
}

object PlaylistSearchResponse {
  @scala.inline
  def apply(playlists: PagingObject[PlaylistObjectSimplified]): PlaylistSearchResponse = {
    val __obj = js.Dynamic.literal(playlists = playlists)
  
    __obj.asInstanceOf[PlaylistSearchResponse]
  }
}

