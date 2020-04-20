package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Track Object
  * [track object (simplified)](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
trait TrackObjectSimplified extends js.Object {
  /**
    * The artists who performed the track.
    */
  var artists: js.Array[ArtistObjectSimplified]
  /**
    * A list of the countries in which the track can be played,
    * identified by their [ISO 3166-1 alpha-2 code](http://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
    */
  var available_markets: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The disc number (usually `1` unless the album consists of more than one disc).
    */
  var disc_number: Double
  /**
    * The track length in milliseconds.
    */
  var duration_ms: Double
  /**
    * Whether or not the track has explicit lyrics (`true` = yes it does; `false` = no it does not OR unknown).
    */
  var explicit: Boolean
  /**
    * Known external URLs for this track.
    */
  var external_urls: ExternalUrlObject
  /**
    * A link to the Web API endpoint providing full details of the track.
    */
  var href: String
  /**
    * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the track.
    */
  var id: String
  /**
    * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied.
    * If `true`, the track is playable in the given market. Otherwise, `false`.
    */
  var is_playable: js.UndefOr[Boolean] = js.undefined
  /**
    * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied,
    * and the requested track has been replaced with different track.
    * The track in the `linked_from` object contains information about the originally requested track.
    */
  var linked_from: js.UndefOr[TrackLinkObject] = js.undefined
  /**
    * The name of the track.
    */
  var name: String
  /**
    * A link to a 30 second preview (MP3 format) of the track. Can be null
    */
  var preview_url: String | Null
  /**
    * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied,
    * the original track is not available in the given market, and Spotify did not have any tracks to relink it with.
    * The track response will still contain metadata for the original track, and a restrictions object containing the reason
    * why the track is not available: `"restrictions" : {"reason" : "market"}`.
    */
  var restrictions: js.UndefOr[RestrictionsObject] = js.undefined
  /**
    * The number of the track. If an album has several discs, the track number is the number on the specified disc.
    */
  var track_number: Double
  /**
    * The object type: “track”.
    */
  var `type`: track
  /**
    * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the track.
    */
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
    track_number: Double,
    `type`: track,
    uri: String,
    available_markets: js.Array[String] = null,
    is_playable: js.UndefOr[Boolean] = js.undefined,
    linked_from: TrackLinkObject = null,
    preview_url: String = null,
    restrictions: RestrictionsObject = null
  ): TrackObjectSimplified = {
    val __obj = js.Dynamic.literal(artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets.asInstanceOf[js.Any])
    if (!js.isUndefined(is_playable)) __obj.updateDynamic("is_playable")(is_playable.asInstanceOf[js.Any])
    if (linked_from != null) __obj.updateDynamic("linked_from")(linked_from.asInstanceOf[js.Any])
    if (preview_url != null) __obj.updateDynamic("preview_url")(preview_url.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackObjectSimplified]
  }
}

