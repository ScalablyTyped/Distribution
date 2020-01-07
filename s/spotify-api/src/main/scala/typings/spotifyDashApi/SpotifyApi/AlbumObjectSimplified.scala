package typings.spotifyDashApi.SpotifyApi

import typings.spotifyDashApi.spotifyDashApiStrings.album
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Album Object
  * [album object (simplified)](https://developer.spotify.com/web-api/object-model/#album-object-simplified)
  */
trait AlbumObjectSimplified extends js.Object {
  var album_group: js.UndefOr[String] = js.undefined
  var album_type: String
  var artists: js.Array[ArtistObjectSimplified]
  var available_markets: js.UndefOr[js.Array[String]] = js.undefined
  var external_urls: ExternalUrlObject
  var href: String
  var id: String
  var images: js.Array[ImageObject]
  var name: String
  var release_date: String
  var release_date_precision: String
  var restrictions: js.UndefOr[RestrictionsObject] = js.undefined
  var `type`: album
  var uri: String
}

object AlbumObjectSimplified {
  @scala.inline
  def apply(
    album_type: String,
    artists: js.Array[ArtistObjectSimplified],
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    release_date: String,
    release_date_precision: String,
    `type`: album,
    uri: String,
    album_group: String = null,
    available_markets: js.Array[String] = null,
    restrictions: RestrictionsObject = null
  ): AlbumObjectSimplified = {
    val __obj = js.Dynamic.literal(album_type = album_type.asInstanceOf[js.Any], artists = artists.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], release_date = release_date.asInstanceOf[js.Any], release_date_precision = release_date_precision.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (album_group != null) __obj.updateDynamic("album_group")(album_group.asInstanceOf[js.Any])
    if (available_markets != null) __obj.updateDynamic("available_markets")(available_markets.asInstanceOf[js.Any])
    if (restrictions != null) __obj.updateDynamic("restrictions")(restrictions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbumObjectSimplified]
  }
}

