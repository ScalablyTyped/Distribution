package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.album
import typings.spotifyApi.spotifyApiStrings.artist
import typings.spotifyApi.spotifyApiStrings.playlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Context Object
  * [](https://developer.spotify.com/web-api/object-model/#context-object)
  */
trait ContextObject extends js.Object {
  /**
    * Known external URLs.
    */
  var external_urls: ExternalUrlObject
  /**
    * A link to the Web API endpoint providing full details.
    */
  var href: String
  /**
    * The object type.
    */
  var `type`: artist | playlist | album
  /**
    * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids).
    */
  var uri: String
}

object ContextObject {
  @scala.inline
  def apply(external_urls: ExternalUrlObject, href: String, `type`: artist | playlist | album, uri: String): ContextObject = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextObject]
  }
}

