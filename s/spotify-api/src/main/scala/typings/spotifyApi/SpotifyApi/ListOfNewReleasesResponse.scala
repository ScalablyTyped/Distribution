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
trait ListOfNewReleasesResponse extends js.Object {
  var albums: PagingObject[AlbumObjectSimplified]
  var message: js.UndefOr[String] = js.undefined
}

object ListOfNewReleasesResponse {
  @scala.inline
  def apply(albums: PagingObject[AlbumObjectSimplified], message: String = null): ListOfNewReleasesResponse = {
    val __obj = js.Dynamic.literal(albums = albums.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOfNewReleasesResponse]
  }
}

