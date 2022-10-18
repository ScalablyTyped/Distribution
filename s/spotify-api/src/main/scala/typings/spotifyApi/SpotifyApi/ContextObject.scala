package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.album_
import typings.spotifyApi.spotifyApiStrings.artist
import typings.spotifyApi.spotifyApiStrings.episode
import typings.spotifyApi.spotifyApiStrings.playlist
import typings.spotifyApi.spotifyApiStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Context Object
  * [](https://developer.spotify.com/web-api/object-model/#context-object)
  */
trait ContextObject extends StObject {
  
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
  var `type`: artist | playlist | album_ | show | episode
  
  /**
    * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids).
    */
  var uri: String
}
object ContextObject {
  
  inline def apply(
    external_urls: ExternalUrlObject,
    href: String,
    `type`: artist | playlist | album_ | show | episode,
    uri: String
  ): ContextObject = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextObject]
  }
  
  extension [Self <: ContextObject](x: Self) {
    
    inline def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setType(value: artist | playlist | album_ | show | episode): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
