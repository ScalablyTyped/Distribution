package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Context Object
  * [](https://developer.spotify.com/web-api/object-model/#context-object)
  */
@js.native
trait ContextObject extends js.Object {
  
  var external_urls: ExternalUrlObject | Null = js.native
  
  var href: String | Null = js.native
  
  var `type`: ContextObjectType = js.native
  
  var uri: String = js.native
}
object ContextObject {
  
  @scala.inline
  def apply(`type`: ContextObjectType, uri: String): ContextObject = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextObject]
  }
  
  @scala.inline
  implicit class ContextObjectOps[Self <: ContextObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: ContextObjectType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_urls(value: ExternalUrlObject): Self = this.set("external_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternal_urlsNull: Self = this.set("external_urls", null)
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefNull: Self = this.set("href", null)
  }
}
