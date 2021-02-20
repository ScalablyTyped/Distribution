package typings.spotifyWebApiJs.SpotifyApi

import typings.spotifyWebApiJs.spotifyWebApiJsStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simplified Show Object
  * [show object (simplified)](https://developer.spotify.com/documentation/web-api/reference/object-model/#show-object-simplified)
  */
@js.native
trait ShowObjectSimplified extends StObject {
  
  var available_markets: js.UndefOr[js.Array[String]] = js.native
  
  var copyrights: js.Array[CopyrightObject] = js.native
  
  var description: String = js.native
  
  var explicit: Boolean = js.native
  
  var external_urls: ExternalUrlObject = js.native
  
  var href: String = js.native
  
  var id: String = js.native
  
  var images: js.Array[ImageObject] = js.native
  
  var is_externally_hosted: Boolean = js.native
  
  var languages: js.Array[String] = js.native
  
  var media_type: String = js.native
  
  var name: String = js.native
  
  var publisher: String = js.native
  
  var `type`: show = js.native
  
  var uri: String = js.native
}
object ShowObjectSimplified {
  
  @scala.inline
  def apply(
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
    `type`: show,
    uri: String
  ): ShowObjectSimplified = {
    val __obj = js.Dynamic.literal(copyrights = copyrights.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], explicit = explicit.asInstanceOf[js.Any], external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], is_externally_hosted = is_externally_hosted.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], media_type = media_type.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowObjectSimplified]
  }
  
  @scala.inline
  implicit class ShowObjectSimplifiedMutableBuilder[Self <: ShowObjectSimplified] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailable_markets(value: js.Array[String]): Self = StObject.set(x, "available_markets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailable_marketsUndefined: Self = StObject.set(x, "available_markets", js.undefined)
    
    @scala.inline
    def setAvailable_marketsVarargs(value: String*): Self = StObject.set(x, "available_markets", js.Array(value :_*))
    
    @scala.inline
    def setCopyrights(value: js.Array[CopyrightObject]): Self = StObject.set(x, "copyrights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightsVarargs(value: CopyrightObject*): Self = StObject.set(x, "copyrights", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicit(value: Boolean): Self = StObject.set(x, "explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: js.Array[ImageObject]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesVarargs(value: ImageObject*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setIs_externally_hosted(value: Boolean): Self = StObject.set(x, "is_externally_hosted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages(value: js.Array[String]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguagesVarargs(value: String*): Self = StObject.set(x, "languages", js.Array(value :_*))
    
    @scala.inline
    def setMedia_type(value: String): Self = StObject.set(x, "media_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: show): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
