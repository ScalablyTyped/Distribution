package typings
package spotifyDashApiLib.SpotifyApiNs

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

