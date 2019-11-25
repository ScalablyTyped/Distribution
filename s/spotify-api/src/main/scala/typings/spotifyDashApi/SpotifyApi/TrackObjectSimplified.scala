package typings.spotifyDashApi.SpotifyApi

import typings.spotifyDashApi.spotifyDashApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Track Object
  * [track object (simplified)](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
trait TrackObjectSimplified extends js.Object {
  var artists: js.Array[ArtistObjectSimplified]
  var available_markets: js.UndefOr[js.Array[String]] = js.undefined
  var disc_number: Double
  var duration_ms: Double
  var explicit: Boolean
  var external_urls: ExternalUrlObject
  var href: String
  var id: String
  var is_playable: js.UndefOr[Boolean] = js.undefined
  var linked_from: js.UndefOr[TrackLinkObject] = js.undefined
  var name: String
  var preview_url: String
  var track_number: Double
  var `type`: track
  var uri: String
}

object TrackObjectSimplified {
  @scala.inline
  def apply(
    artists: js.Array[ArtistObjectSimplified],
    disc_number: Double,
    duration_ms: Double,
    explicit: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    name: String,
    preview_url: String,
    track_number: Double,
    `type`: track,
    uri: String,
    available_markets: js.Array[String] = null,
    is_playable: js.UndefOr[Boolean] = js.undefined,
    linked_from: TrackLinkObject = null
  ): TrackObjectSimplified = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], preview_url = preview_url.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets.asInstanceOf[js.Any])
    if (!js.isUndefined(is_playable)) __obj.updateDynamic("is_playable")(is_playable.asInstanceOf[js.Any])
    if (linked_from != null) __obj.updateDynamic("linked_from")(linked_from.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackObjectSimplified]
  }
}

