package typings
package spotifyDashApiLib.SpotifyApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Track Object
  * [track object (simplified)](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
trait TrackObjectSimplified extends js.Object {
  var artists: js.Array[ArtistObjectSimplified]
  var available_markets: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var disc_number: scala.Double
  var duration_ms: scala.Double
  var explicit: scala.Boolean
  var external_urls: ExternalUrlObject
  var href: java.lang.String
  var id: java.lang.String
  var is_playable: js.UndefOr[scala.Boolean] = js.undefined
  var linked_from: js.UndefOr[TrackLinkObject] = js.undefined
  var name: java.lang.String
  var preview_url: java.lang.String
  var track_number: scala.Double
  var `type`: spotifyDashApiLib.spotifyDashApiLibStrings.track
  var uri: java.lang.String
}

