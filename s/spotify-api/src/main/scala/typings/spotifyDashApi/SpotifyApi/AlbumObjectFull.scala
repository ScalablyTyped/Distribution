package typings.spotifyDashApi.SpotifyApi

import typings.spotifyDashApi.spotifyDashApiStrings.album
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//
// Objects from the Object Models of the Spotify Web Api, ordered alphabetically.
// [Object Model](https://developer.spotify.com/web-api/object-model)
//
/**
  * Full Album Object
  * [album object (full)](https://developer.spotify.com/web-api/object-model/#album-object-simplified)
  */
trait AlbumObjectFull extends AlbumObjectSimplified {
  var copyrights: js.Array[CopyrightObject]
  var external_ids: ExternalIdObject
  var genres: js.Array[String]
  var label: String
  var popularity: Double
  var tracks: PagingObject[TrackObjectSimplified]
}

object AlbumObjectFull {
  @scala.inline
  def apply(
    album_type: String,
    artists: js.Array[ArtistObjectSimplified],
    copyrights: js.Array[CopyrightObject],
    external_ids: ExternalIdObject,
    external_urls: ExternalUrlObject,
    genres: js.Array[String],
    href: String,
    id: String,
    images: js.Array[ImageObject],
    label: String,
    name: String,
    popularity: Double,
    release_date: String,
    release_date_precision: String,
    tracks: PagingObject[TrackObjectSimplified],
    `type`: album,
    uri: String,
    album_group: String = null,
    available_markets: js.Array[String] = null,
    restrictions: RestrictionsObject = null
  ): AlbumObjectFull = {
    val __obj = js.Dynamic.literal(album_type = album_type.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], copyrights = copyrights.asInstanceOf[js.Any], external_ids = external_ids.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], genres = genres.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], popularity = popularity.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], tracks = tracks.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (album_group != null) __obj.updateDynamic("album_group")(album_group.asInstanceOf[js.Any])
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumObjectFull]
  }
}

