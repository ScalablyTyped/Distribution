package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Play History Object
     * [](https://developer.spotify.com/web-api/web-api-personalization-endpoints/get-recently-played/#play-history-object)
     */

trait PlayHistoryObject extends js.Object {
  var context: ContextObject
  var played_at: java.lang.String
  var track: TrackObjectSimplified
}

