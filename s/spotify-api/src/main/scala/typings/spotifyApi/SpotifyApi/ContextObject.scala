package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.album
import typings.spotifyApi.spotifyApiStrings.artist
import typings.spotifyApi.spotifyApiStrings.playlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Context Object
  * [](https://developer.spotify.com/web-api/object-model/#context-object)
  */
@js.native
trait ContextObject extends StObject {
  
  /**
    * Known external URLs.
    */
  var external_urls: ExternalUrlObject = js.native
  
  /**
    * A link to the Web API endpoint providing full details.
    */
  var href: String = js.native
  
  /**
    * The object type.
    */
  var `type`: artist | playlist | album = js.native
  
  /**
    * The [Spotify URI](https://developer.spotify.com/documentation/web-api/#spotify-uris-and-ids).
    */
  var uri: String = js.native
}
object ContextObject {
  
  @scala.inline
  def apply(external_urls: ExternalUrlObject, href: String, `type`: artist | playlist | album, uri: String): ContextObject = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextObject]
  }
  
  @scala.inline
  implicit class ContextObjectMutableBuilder[Self <: ContextObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: artist | playlist | album): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
