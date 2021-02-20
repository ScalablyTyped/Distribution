package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.photo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharePhotoContent extends ShareContent {
  
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.native
  
  /**
    * The type of content to be shared is photo.
    */
  var contentType: photo = js.native
  
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.native
  
  /**
    * Photos to be shared.
    */
  var photos: js.Array[SharePhoto] = js.native
}
object SharePhotoContent {
  
  @scala.inline
  def apply(contentType: photo, photos: js.Array[SharePhoto]): SharePhotoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePhotoContent]
  }
  
  @scala.inline
  implicit class SharePhotoContentMutableBuilder[Self <: SharePhotoContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonParameters(value: ShareContentCommonParameters): Self = StObject.set(x, "commonParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonParametersUndefined: Self = StObject.set(x, "commonParameters", js.undefined)
    
    @scala.inline
    def setContentType(value: photo): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    @scala.inline
    def setPhotos(value: js.Array[SharePhoto]): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotosVarargs(value: SharePhoto*): Self = StObject.set(x, "photos", js.Array(value :_*))
  }
}
