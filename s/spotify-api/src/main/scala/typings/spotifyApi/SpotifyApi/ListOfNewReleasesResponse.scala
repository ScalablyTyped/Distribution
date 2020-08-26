package typings.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get a list of new releases
  * 
  * GET /v1/browse/new-releases
  * https://developer.spotify.com/web-api/get-list-new-releases/
  */
@js.native
trait ListOfNewReleasesResponse extends js.Object {
  var albums: PagingObject[AlbumObjectSimplified] = js.native
  var message: js.UndefOr[String] = js.native
}

object ListOfNewReleasesResponse {
  @scala.inline
  def apply(albums: PagingObject[AlbumObjectSimplified]): ListOfNewReleasesResponse = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOfNewReleasesResponse]
  }
  @scala.inline
  implicit class ListOfNewReleasesResponseOps[Self <: ListOfNewReleasesResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

