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

object TrackObjectSimplified {
  @scala.inline
  def apply(
    artists: js.Array[ArtistObjectSimplified],
    disc_number: scala.Double,
    duration_ms: scala.Double,
    explicit: scala.Boolean,
    external_urls: ExternalUrlObject,
    href: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    preview_url: java.lang.String,
    track_number: scala.Double,
    `type`: spotifyDashApiLib.spotifyDashApiLibStrings.track,
    uri: java.lang.String,
    available_markets: js.Array[java.lang.String] = null,
    is_playable: js.UndefOr[scala.Boolean] = js.undefined,
    linked_from: TrackLinkObject = null
  ): TrackObjectSimplified = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("artists")(artists)
    __obj.updateDynamic("disc_number")(disc_number)
    __obj.updateDynamic("duration_ms")(duration_ms)
    __obj.updateDynamic("explicit")(explicit)
    __obj.updateDynamic("external_urls")(external_urls)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("preview_url")(preview_url)
    __obj.updateDynamic("track_number")(track_number)
    __obj.updateDynamic("uri")(uri)
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets)
    if (!js.isUndefined(is_playable)) __obj.updateDynamic("is_playable")(is_playable)
    if (linked_from != null) __obj.updateDynamic("linked_from")(linked_from)
    __obj.asInstanceOf[TrackObjectSimplified]
  }
}

