package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get a list of featured playlists
  *
  * GET /v1/browse/featured-playlists
  * https://developer.spotify.com/web-api/get-list-featured-playlists/
  */
@js.native
trait ListOfFeaturedPlaylistsResponse extends js.Object {
  var message: js.UndefOr[String] = js.native
  var playlists: PagingObject[PlaylistObjectSimplified] = js.native
}

object ListOfFeaturedPlaylistsResponse {
  @scala.inline
  def apply(playlists: PagingObject[PlaylistObjectSimplified]): ListOfFeaturedPlaylistsResponse = {
    val __obj = js.Dynamic.literal(playlists = playlists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOfFeaturedPlaylistsResponse]
  }
  @scala.inline
  implicit class ListOfFeaturedPlaylistsResponseOps[Self <: ListOfFeaturedPlaylistsResponse] (val x: Self) extends AnyVal {
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
    def setPlaylists(value: PagingObject[PlaylistObjectSimplified]): Self = this.set("playlists", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

