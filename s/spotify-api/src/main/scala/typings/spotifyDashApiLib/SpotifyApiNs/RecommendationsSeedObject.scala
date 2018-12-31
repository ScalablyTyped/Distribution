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

