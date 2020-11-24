package typings.spotifyApi.SpotifyApi

import typings.spotifyApi.spotifyApiStrings.user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User Object (Public)
  * [](https://developer.spotify.com/web-api/object-model/#track-object-simplified)
  */
@js.native
trait UserObjectPublic extends js.Object {
  
  var display_name: js.UndefOr[String] = js.native
  
  var external_urls: ExternalUrlObject = js.native
  
  var followers: js.UndefOr[FollowersObject] = js.native
  
  var href: String = js.native
  
  var id: String = js.native
  
  var images: js.UndefOr[js.Array[ImageObject]] = js.native
  
  var `type`: user = js.native
  
  var uri: String = js.native
}
object UserObjectPublic {
  
  @scala.inline
  def apply(external_urls: ExternalUrlObject, href: String, id: String, `type`: user, uri: String): UserObjectPublic = {
    val __obj = js.Dynamic.literal(external_urls = external_urls.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserObjectPublic]
  }
  
  @scala.inline
  implicit class UserObjectPublicOps[Self <: UserObjectPublic] (val x: Self) extends AnyVal {
    
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
    def setExternal_urls(value: ExternalUrlObject): Self = this.set("external_urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: user): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplay_name(value: String): Self = this.set("display_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay_name: Self = this.set("display_name", js.undefined)
    
    @scala.inline
    def setFollowers(value: FollowersObject): Self = this.set("followers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollowers: Self = this.set("followers", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: ImageObject*): Self = this.set("images", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[ImageObject]): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImages: Self = this.set("images", js.undefined)
  }
}
