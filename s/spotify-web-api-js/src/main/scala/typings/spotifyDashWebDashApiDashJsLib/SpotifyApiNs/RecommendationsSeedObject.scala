package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

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
  var `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.artist | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.track | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.genre
}

object RecommendationsSeedObject {
  @scala.inline
  def apply(
    afterFilteringSize: scala.Double,
    afterRelinkingSize: scala.Double,
    href: java.lang.String,
    id: java.lang.String,
    initialPoolSize: scala.Double,
    `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.artist | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.track | spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.genre
  ): RecommendationsSeedObject = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("afterFilteringSize")(afterFilteringSize)
    __obj.updateDynamic("afterRelinkingSize")(afterRelinkingSize)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("initialPoolSize")(initialPoolSize)
    __obj.asInstanceOf[RecommendationsSeedObject]
  }
}

