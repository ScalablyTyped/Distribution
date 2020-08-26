package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Search for an album
  * 
  * GET /v1/search?type=album
  * https://developer.spotify.com/web-api/search-item/
  */
@js.native
trait AlbumSearchResponse extends js.Object {
  var albums: PagingObject[AlbumObjectSimplified] = js.native
}

object AlbumSearchResponse {
  @scala.inline
  def apply(albums: PagingObject[AlbumObjectSimplified]): AlbumSearchResponse = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumSearchResponse]
  }
  @scala.inline
  implicit class AlbumSearchResponseOps[Self <: AlbumSearchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlbums(value: PagingObject[AlbumObjectSimplified]): Self = this.set("albums", value.asInstanceOf[js.Any])
  }
  
}

