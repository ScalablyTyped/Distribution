package typings.spotifyWebApiJs.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Context Object
  * [](https://developer.spotify.com/web-api/object-model/#context-object)
  */
trait ContextObject extends StObject {
  
  var external_urls: ExternalUrlObject | Null
  
  var href: String | Null
  
  var `type`: ContextObjectType
  
  var uri: String
}
object ContextObject {
  
  @scala.inline
  def apply(`type`: ContextObjectType, uri: String): ContextObject = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], external_urls = null, href = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextObject]
  }
  
  @scala.inline
  implicit class ContextObjectMutableBuilder[Self <: ContextObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternal_urls(value: ExternalUrlObject): Self = StObject.set(x, "external_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_urlsNull: Self = StObject.set(x, "external_urls", null)
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefNull: Self = StObject.set(x, "href", null)
    
    @scala.inline
    def setType(value: ContextObjectType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
