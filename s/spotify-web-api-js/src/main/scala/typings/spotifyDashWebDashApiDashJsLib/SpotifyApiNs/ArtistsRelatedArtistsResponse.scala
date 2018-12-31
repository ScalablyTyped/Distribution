package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Get an Artist’s Related Artists
  * 
  * GET /v1/artists/{id}/related-artists
  * https://developer.spotify.com/web-api/get-related-artists/
  */
trait ArtistsRelatedArtistsResponse extends js.Object {
  var artists: js.Array[ArtistObjectFull]
}

