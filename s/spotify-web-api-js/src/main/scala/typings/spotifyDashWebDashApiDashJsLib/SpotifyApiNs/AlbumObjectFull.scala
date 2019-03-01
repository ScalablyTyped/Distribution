package typings
package spotifyDashWebDashApiDashJsLib.SpotifyApiNs

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
  var genres: js.Array[java.lang.String]
  var popularity: scala.Double
  var release_date: java.lang.String
  var release_date_precision: java.lang.String
  var tracks: PagingObject[TrackObjectSimplified]
}

object AlbumObjectFull {
  @scala.inline
  def apply(
    album_type: java.lang.String,
    artists: js.Array[ArtistObjectSimplified],
    copyrights: js.Array[CopyrightObject],
    external_ids: ExternalIdObject,
    external_urls: ExternalUrlObject,
    genres: js.Array[java.lang.String],
    href: java.lang.String,
    id: java.lang.String,
    images: js.Array[ImageObject],
    name: java.lang.String,
    popularity: scala.Double,
    release_date: java.lang.String,
    release_date_precision: java.lang.String,
    tracks: PagingObject[TrackObjectSimplified],
    `type`: spotifyDashWebDashApiDashJsLib.spotifyDashWebDashApiDashJsLibStrings.album,
    uri: java.lang.String,
    available_markets: js.Array[java.lang.String] = null
  ): AlbumObjectFull = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("album_type")(album_type)
    __obj.updateDynamic("artists")(artists)
    __obj.updateDynamic("copyrights")(copyrights)
    __obj.updateDynamic("external_ids")(external_ids)
    __obj.updateDynamic("external_urls")(external_urls)
    __obj.updateDynamic("genres")(genres)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("images")(images)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("popularity")(popularity)
    __obj.updateDynamic("release_date")(release_date)
    __obj.updateDynamic("release_date_precision")(release_date_precision)
    __obj.updateDynamic("tracks")(tracks)
    __obj.updateDynamic("uri")(uri)
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets)
    __obj.asInstanceOf[AlbumObjectFull]
  }
}

