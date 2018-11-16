package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Search for an artist
     * 
     * GET /v1/search?type=artist
     * https://developer.spotify.com/web-api/search-item/
     */

trait ArtistSearchResponse extends js.Object {
  var artists: PagingObject[ArtistObjectFull]
}

