package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.album
import typings.spotifyApi.spotifyApiStrings.appears_on
import typings.spotifyApi.spotifyApiStrings.compilation
import typings.spotifyApi.spotifyApiStrings.day
import typings.spotifyApi.spotifyApiStrings.month
import typings.spotifyApi.spotifyApiStrings.single
import typings.spotifyApi.spotifyApiStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Album Object
  * [album object (simplified)](https://developer.spotify.com/web-api/object-model/#album-object-simplified)
  */
trait AlbumObjectSimplified extends ContextObject {
  /**
    * The field is present when getting an artist’s albums.
    * Possible values are “album”, “single”, “compilation”, “appears_on”.
    * Compare to album_type this field represents relationship between the artist and the album.
    */
  var album_group: js.UndefOr[album | single | compilation | appears_on] = js.undefined
  /**
    * The type of the album: one of “album”, “single”, or “compilation”.
    */
  var album_type: album | single | compilation
  /**
    * The artists of the album.
    * Each artist object includes a link in href to more detailed information about the artist.
    */
  var artists: js.Array[ArtistObjectSimplified]
  /**
    * The markets in which the album is available: [ISO 3166-1 alpha-2 country codes](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2).
    * Note that an album is considered available in a market when at least 1 of its tracks is available in that market.
    */
  var available_markets: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the album.
    */
  var id: String
  /**
    * The cover art for the album in various sizes, widest first.
    */
  var images: js.Array[ImageObject]
  /**
    * The name of the album. In case of an album takedown, the value may be an empty string.
    */
  var name: String
  /**
    * The date the album was first released, for example `1981`.
    * Depending on the precision, it might be shown as `1981-12` or `1981-12-15`.
    */
  var release_date: String
  /**
    * The precision with which release_date value is known: `year`, `month`, or `day`.
    */
  var release_date_precision: year | month | day
  /**
    * Part of the response when [Track Relinking](https://developer.spotify.com/documentation/general/guides/track-relinking-guide/) is applied,
    * the original track is not available in the given market, and Spotify did not have any tracks to relink it with.
    * The track response will still contain metadata for the original track,
    * and a restrictions object containing the reason why the track is not available: `"restrictions" : {"reason" : "market"}`
    */
  var restrictions: js.UndefOr[RestrictionsObject] = js.undefined
  @JSName("type")
  var type_AlbumObjectSimplified: album
}

object AlbumObjectSimplified {
  @scala.inline
  def apply(
    album_type: album | single | compilation,
    artists: js.Array[ArtistObjectSimplified],
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    name: String,
    release_date: String,
    release_date_precision: year | month | day,
    `type`: album,
    uri: String,
    album_group: album | single | compilation | appears_on = null,
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

