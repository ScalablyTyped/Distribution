package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get Several Artists
  * 
  * /v1/artists?ids={ids} 
  * https://developer.spotify.com/web-api/get-several-artists/
  */
trait MultipleArtistsResponse extends js.Object {
  var artists: js.Array[ArtistObjectFull]
}

