package typings.spotifyDashWebDashApiDashJs.SpotifyApiNs

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
  var genres: js.Array[String]
}

object AvailableGenreSeedsResponse {
  @scala.inline
  def apply(genres: js.Array[String]): AvailableGenreSeedsResponse = {
    val __obj = js.Dynamic.literal(genres = genres)
  
    __obj.asInstanceOf[AvailableGenreSeedsResponse]
  }
}

