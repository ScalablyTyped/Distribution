package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simplified Show Object
  * [show object (simplified)](https://developer.spotify.com/documentation/web-api/reference/object-model/#show-object-simplified)
  */
trait ShowObjectSimplified extends StObject {
  
  var available_markets: js.UndefOr[js.Array[String]] = js.undefined
  
  var copyrights: js.Array[CopyrightObject]
  
  var description: String
  
  var explicit: Boolean
  
  var external_urls: ExternalUrlObject
  
  var href: String
  
  var id: String
  
  var images: js.Array[ImageObject]
  
  var is_externally_hosted: Boolean
  
  var languages: js.Array[String]
  
  var media_type: String
  
  var name: String
  
  var publisher: String
  
  var `type`: show
  
  var uri: String
}
object ShowObjectSimplified {
  
  inline def apply(
    copyrights: js.Array[CopyrightObject],
    description: String,
    explicit: Boolean,
    external_urls: ExternalUrlObject,
    href: String,
    id: String,
    images: js.Array[ImageObject],
    is_externally_hosted: Boolean,
    languages: js.Array[String],
    media_type: String,
    name: String,
    publisher: String,
    uri: String
  ): ShowObjectSimplified = {
    val __obj = js.Dynamic.literal(copyrights = copyrights.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_externally_hosted = is_externally_hosted.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("show")
    __obj.asInstanceOf[ShowObjectSimplified]
  }
  
  extension [Self <: ShowObjectSimplified](x: Self) {
    
    inline def setAvailable_markets(value: js.Array[String]): Self = StObject.set(x, "available_markets", value.asInstanceOf[js.Any])
    
    inline def setAvailable_marketsUndefined: Self = StObject.set(x, "available_markets", js.undefined)
    
    inline def setAvailable_marketsVarargs(value: String*): Self = StObject.set(x, "available_markets", js.Array(value :_*))
    
    inline def setCopyrights(value: js.Array[CopyrightObject]): Self = StObject.set(x, "copyrights", value.asInstanceOf[js.Any])
    
    inline def setCopyrightsVarargs(value: CopyrightObject*): Self = StObject.set(x, "copyrights", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    inline def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setImages(value: js.Array[ImageObject]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesVarargs(value: ImageObject*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    inline def setIs_externally_hosted(value: Boolean): Self = StObject.set(x, "is_externally_hosted", value.asInstanceOf[js.Any])
    
    inline def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    inline def setMedia_type(value: String): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setType(value: show): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
