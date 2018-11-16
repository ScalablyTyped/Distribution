package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Search for a track
     * 
     * GET /v1/search?type=track
     * https://developer.spotify.com/web-api/search-item/
     */

trait TrackSearchResponse extends js.Object {
  var tracks: PagingObject[TrackObjectFull]
}

