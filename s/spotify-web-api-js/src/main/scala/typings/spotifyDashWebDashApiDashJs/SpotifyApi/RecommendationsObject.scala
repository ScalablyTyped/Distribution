package typings.spotifyDashWebDashApiDashJs.SpotifyApi

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

object RecommendationsObject {
  @scala.inline
  def apply(seeds: js.Array[RecommendationsSeedObject], tracks: js.Array[TrackObjectSimplified]): RecommendationsObject = {
    val __obj = js.Dynamic.literal(seeds = seeds, tracks = tracks)
  
    __obj.asInstanceOf[RecommendationsObject]
  }
}

