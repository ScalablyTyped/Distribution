package typings.spotifyDashApi.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get Several Albums
  * 
  * GET /v1/albums?ids={ids}
  * https://developer.spotify.com/web-api/get-several-albums/ 
  */
trait MultipleAlbumsResponse extends js.Object {
  var albums: js.Array[AlbumObjectFull]
}

object MultipleAlbumsResponse {
  @scala.inline
  def apply(albums: js.Array[AlbumObjectFull]): MultipleAlbumsResponse = {
    val __obj = js.Dynamic.literal(albums = albums)
  
    __obj.asInstanceOf[MultipleAlbumsResponse]
  }
}

