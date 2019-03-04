package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Recommendations Seed Object
  * [](https://developer.spotify.com/web-api/object-model/#recommendations-seed-object)
  */
trait RecommendationsSeedObject extends js.Object {
  var afterFilteringSize: scala.Double
  var afterRelinkingSize: scala.Double
  var href: java.lang.String
  var id: java.lang.String
  var initialPoolSize: scala.Double
  var `type`: spotifyDashApiLib.spotifyDashApiLibStrings.artist | spotifyDashApiLib.spotifyDashApiLibStrings.track | spotifyDashApiLib.spotifyDashApiLibStrings.genre
}

object RecommendationsSeedObject {
  @scala.inline
  def apply(
    afterFilteringSize: scala.Double,
    afterRelinkingSize: scala.Double,
    href: java.lang.String,
    id: java.lang.String,
    initialPoolSize: scala.Double,
    `type`: spotifyDashApiLib.spotifyDashApiLibStrings.artist | spotifyDashApiLib.spotifyDashApiLibStrings.track | spotifyDashApiLib.spotifyDashApiLibStrings.genre
  ): RecommendationsSeedObject = {
    val __obj = js.Dynamic.literal(afterFilteringSize = afterFilteringSize, afterRelinkingSize = afterRelinkingSize, href = href, id = id, initialPoolSize = initialPoolSize)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationsSeedObject]
  }
}

