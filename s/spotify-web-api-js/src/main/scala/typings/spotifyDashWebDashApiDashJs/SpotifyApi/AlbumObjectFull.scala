package typings.spotifyDashWebDashApiDashJs.SpotifyApi

import typings.spotifyDashWebDashApiDashJs.spotifyDashWebDashApiDashJsStrings.album
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
  var artists: js.Array[ArtistObjectSimplified]
  var copyrights: js.Array[CopyrightObject]
  var external_ids: ExternalIdObject
  var genres: js.Array[String]
  var popularity: Double
  var release_date: String
  var release_date_precision: String
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
    name: String,
    popularity: Double,
    release_date: String,
    release_date_precision: String,
    tracks: PagingObject[TrackObjectSimplified],
    `type`: album,
    uri: String,
    available_markets: js.Array[String] = null
  ): AlbumObjectFull = {
    val __obj = js.Dynamic.literal(album_type = album_type, artists = artists, copyrights = copyrights, external_ids = external_ids, external_urls = external_urls, genres = genres, href = href, id = id, images = images, name = name, popularity = popularity, release_date = release_date, release_date_precision = release_date_precision, tracks = tracks, uri = uri)
    __obj.updateDynamic("type")(`type`)
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets)
    __obj.asInstanceOf[AlbumObjectFull]
  }
}

