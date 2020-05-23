package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.track
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Full Track Object
  * [track object (full)](https://developer.spotify.com/web-api/object-model/#track-object-full)
  */
trait TrackObjectFull extends TrackObjectSimplified {
  var album: AlbumObjectSimplified
  var external_ids: ExternalIdObject
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
    preview_url: String,
    track_number: Double,
    `type`: track,
    uri: String,
    available_markets: js.Array[String] = null,
    is_playable: js.UndefOr[Boolean] = js.undefined,
    linked_from: TrackLinkObject = null
  ): TrackObjectFull = {
    val __obj = js.Dynamic.literal(album = album.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], disc_number = disc_number.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_ids = external_ids.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], preview_url = preview_url.asInstanceOf[js.Any], track_number = track_number.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets.asInstanceOf[js.Any])
    if (!js.isUndefined(is_playable)) __obj.updateDynamic("is_playable")(is_playable.get.asInstanceOf[js.Any])
    if (linked_from != null) __obj.updateDynamic("linked_from")(linked_from.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackObjectFull]
  }
}

