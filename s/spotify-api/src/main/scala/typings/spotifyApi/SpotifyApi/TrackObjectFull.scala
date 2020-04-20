package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full Track Object
  * [track object (full)](https://developer.spotify.com/web-api/object-model/#track-object-full)
  */
trait TrackObjectFull extends TrackObjectSimplified {
  /**
    * The album on which the track appears.
    */
  var album: AlbumObjectSimplified
  /**
    * Known external IDs for the track.
    */
  var external_ids: ExternalIdObject
  /**
    * Whether or not the track is from a local file.
    */
  var is_local: js.UndefOr[Boolean] = js.undefined
  /**
    * The popularity of the track. The value will be between `0` and `100`, with `100` being the most popular.
    * The popularity of a track is a value between `0` and `100`, with `100` being the most popular.
    * The popularity is calculated by algorithm and is based, in the most part,
    * on the total number of plays the track has had and how recent those plays are.
    */
  var popularity: Double
}

object TrackObjectFull {
  @scala.inline
  def apply(
    album: AlbumObjectSimplified,
    artists: js.Array[ArtistObjectSimplified],
    disc_number: Double,
    duration_ms: Double,
    explicit: Boolean,
    external_ids: ExternalIdObject,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    name: String,
    popularity: Double,
    track_number: Double,
    `type`: track,
    uri: String,
    available_markets: js.Array[String] = null,
    is_local: js.UndefOr[Boolean] = js.undefined,
    is_playable: js.UndefOr[Boolean] = js.undefined,
    linked_from: TrackLinkObject = null,
    preview_url: String = null,
    restrictions: RestrictionsObject = null
  ): TrackObjectFull = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_ids = external_ids.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets.asInstanceOf[js.Any])
    if (!js.isUndefined(is_local)) __obj.updateDynamic("is_local")(is_local.asInstanceOf[js.Any])
    if (!js.isUndefined(is_playable)) __obj.updateDynamic("is_playable")(is_playable.asInstanceOf[js.Any])
    if (linked_from != null) __obj.updateDynamic("linked_from")(linked_from.asInstanceOf[js.Any])
    if (preview_url != null) __obj.updateDynamic("preview_url")(preview_url.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackObjectFull]
  }
}

