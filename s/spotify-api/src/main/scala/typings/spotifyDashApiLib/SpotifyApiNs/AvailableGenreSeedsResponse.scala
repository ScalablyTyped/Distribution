package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Get available genre seeds
     * 
     * GET /v1/recommendations/available-genre-seeds
     * https://developer.spotify.com/web-api/get-recommendations/#available-genre-seeds
     */

trait AvailableGenreSeedsResponse extends js.Object {
  var genres: js.Array[java.lang.String]
}

