package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Recommendations Object
  * [](https://developer.spotify.com/web-api/object-model/#recommendations-object)
  */
trait RecommendationsObject extends js.Object {
  var seeds: js.Array[RecommendationsSeedObject]
  var tracks: js.Array[TrackObjectSimplified]
}

