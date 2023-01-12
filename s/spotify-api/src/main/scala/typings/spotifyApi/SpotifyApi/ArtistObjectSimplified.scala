package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.artist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simplified Artist Object
  * [artist object (simplified)](https://developer.spotify.com/web-api/object-model/)
  */
trait ArtistObjectSimplified
  extends StObject
     with ContextObject {
  
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
  
  inline def apply(external_urls: ExternalUrlObject, href: String, id: String, name: String, uri: String): ArtistObjectSimplified = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("artist")
    __obj.asInstanceOf[ArtistObjectSimplified]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtistObjectSimplified] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: artist): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
