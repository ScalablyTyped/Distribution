package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.track
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Track Link Object
  * [](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
trait TrackLinkObject extends StObject {
  
  var external_urls: ExternalUrlObject
  
  var href: String
  
  var id: String
  
  var `type`: track
  
  var uri: String
}
object TrackLinkObject {
  
  inline def apply(external_urls: ExternalUrlObject, href: String, id: String, uri: String): TrackLinkObject = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("track")
    __obj.asInstanceOf[TrackLinkObject]
  }
  
  extension [Self <: TrackLinkObject](x: Self) {
    
    inline def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: track): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
