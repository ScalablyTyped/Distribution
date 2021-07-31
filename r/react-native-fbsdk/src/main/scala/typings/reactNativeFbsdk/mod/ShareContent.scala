package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeFbsdk.mod.ShareLinkContent
  - typings.reactNativeFbsdk.mod.SharePhotoContent
  - typings.reactNativeFbsdk.mod.ShareVideoContent
  - typings.reactNativeFbsdk.mod.ShareOpenGraphContent
*/
trait ShareContent extends StObject
object ShareContent {
  
  @scala.inline
  def ShareLinkContent(contentUrl: String): typings.reactNativeFbsdk.mod.ShareLinkContent = {
    val __obj = js.Dynamic.literal(contentType = "link", contentUrl = contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeFbsdk.mod.ShareLinkContent]
  }
  
  @scala.inline
  def ShareOpenGraphContent(action: ShareOpenGraphAction, previewPropertyName: String): typings.reactNativeFbsdk.mod.ShareOpenGraphContent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], contentType = "open-graph", previewPropertyName = previewPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeFbsdk.mod.ShareOpenGraphContent]
  }
  
  @scala.inline
  def SharePhotoContent(photos: js.Array[SharePhoto]): typings.reactNativeFbsdk.mod.SharePhotoContent = {
    val __obj = js.Dynamic.literal(contentType = "photo", photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeFbsdk.mod.SharePhotoContent]
  }
  
  @scala.inline
  def ShareVideoContent(video: ShareVideo): typings.reactNativeFbsdk.mod.ShareVideoContent = {
    val __obj = js.Dynamic.literal(contentType = "video", video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeFbsdk.mod.ShareVideoContent]
  }
}
