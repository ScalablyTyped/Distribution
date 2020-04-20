package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for an album
  * 
  * GET /v1/search?type=album
  * https://developer.spotify.com/web-api/search-item/
  */
trait AlbumSearchResponse extends js.Object {
  var albums: PagingObject[AlbumObjectSimplified]
}

object AlbumSearchResponse {
  @scala.inline
  def apply(albums: PagingObject[AlbumObjectSimplified]): AlbumSearchResponse = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumSearchResponse]
  }
}

