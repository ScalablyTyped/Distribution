package typings
package spotifyDashApiLib.SpotifyApiNs

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
  var message: js.UndefOr[java.lang.String] = js.undefined
}

object ListOfNewReleasesResponse {
  @scala.inline
  def apply(albums: PagingObject[AlbumObjectSimplified], message: java.lang.String = null): ListOfNewReleasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("albums")(albums)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[ListOfNewReleasesResponse]
  }
}

