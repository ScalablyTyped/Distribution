package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.artist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Simplified Artist Object
  * [artist object (simplified)](https://developer.spotify.com/web-api/object-model/)
  */
trait ArtistObjectSimplified extends ContextObject {
  /**
    * The [Spotify ID](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids) for the artist.
    */
  var id: String
  /**
    * The name of the artist.
    */
  var name: String
  @JSName("type")
  var type_ArtistObjectSimplified: artist
}

object ArtistObjectSimplified {
  @scala.inline
  def apply(
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    name: String,
    `type`: artist,
    uri: String
  ): ArtistObjectSimplified = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistObjectSimplified]
  }
}

