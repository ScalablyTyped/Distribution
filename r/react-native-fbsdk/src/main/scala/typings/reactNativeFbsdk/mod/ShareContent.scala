package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.`open-graph`
import typings.reactNativeFbsdk.reactNativeFbsdkStrings.link
import typings.reactNativeFbsdk.reactNativeFbsdkStrings.photo
import typings.reactNativeFbsdk.reactNativeFbsdkStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def ShareLinkContent(contentType: link, contentUrl: String): typings.reactNativeFbsdk.mod.ShareLinkContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeFbsdk.mod.ShareLinkContent]
  }
  
  @scala.inline
  def ShareOpenGraphContent(action: ShareOpenGraphAction, contentType: `open-graph`, previewPropertyName: String): typings.reactNativeFbsdk.mod.ShareOpenGraphContent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], previewPropertyName = previewPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeFbsdk.mod.ShareOpenGraphContent]
  }
  
  @scala.inline
  def SharePhotoContent(contentType: photo, photos: js.Array[SharePhoto]): typings.reactNativeFbsdk.mod.SharePhotoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeFbsdk.mod.SharePhotoContent]
  }
  
  @scala.inline
  def ShareVideoContent(contentType: video, video: ShareVideo): typings.reactNativeFbsdk.mod.ShareVideoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactNativeFbsdk.mod.ShareVideoContent]
  }
}
