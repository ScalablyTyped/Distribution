package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.artist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simplified Artist Object
  * [artist object (simplified)](https://developer.spotify.com/web-api/object-model/)
  */
trait ArtistObjectSimplified extends StObject {
  
  var external_urls: ExternalUrlObject
  
  var href: String
  
  var id: String
  
  var name: String
  
  var `type`: artist
  
  var uri: String
}
object ArtistObjectSimplified {
  
  inline def apply(external_urls: ExternalUrlObject, href: String, id: String, name: String, uri: String): ArtistObjectSimplified = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("artist")
    __obj.asInstanceOf[ArtistObjectSimplified]
  }
  
  extension [Self <: ArtistObjectSimplified](x: Self) {
    
    inline def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: artist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
