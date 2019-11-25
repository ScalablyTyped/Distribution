package typings.spotifyDashApi.SpotifyApi

import typings.spotifyDashApi.spotifyDashApiStrings.artist
import typings.spotifyDashApi.spotifyDashApiStrings.genre
import typings.spotifyDashApi.spotifyDashApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Recommendations Seed Object
  * [](https://developer.spotify.com/web-api/object-model/#recommendations-seed-object)
  */
trait RecommendationsSeedObject extends js.Object {
  var afterFilteringSize: Double
  var afterRelinkingSize: Double
  var href: String
  var id: String
  var initialPoolSize: Double
  var `type`: artist | track | genre
}

object RecommendationsSeedObject {
  @scala.inline
  def apply(
    afterFilteringSize: Double,
    afterRelinkingSize: Double,
    href: String,
    id: String,
    initialPoolSize: Double,
    `type`: artist | track | genre
  ): RecommendationsSeedObject = {
    val __obj = js.Dynamic.literal(afterFilteringSize = afterFilteringSize.asInstanceOf[js.Any], afterRelinkingSize = afterRelinkingSize.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initialPoolSize = initialPoolSize.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationsSeedObject]
  }
}

