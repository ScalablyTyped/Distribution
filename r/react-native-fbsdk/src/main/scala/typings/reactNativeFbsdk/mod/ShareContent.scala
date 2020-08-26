package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.`open-graph`
import typings.reactNativeFbsdk.reactNativeFbsdkStrings.link
import typings.reactNativeFbsdk.reactNativeFbsdkStrings.photo
import typings.reactNativeFbsdk.reactNativeFbsdkStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeFbsdk.mod.ShareLinkContent
  - typings.reactNativeFbsdk.mod.SharePhotoContent
  - typings.reactNativeFbsdk.mod.ShareVideoContent
  - typings.reactNativeFbsdk.mod.ShareOpenGraphContent
*/
trait ShareContent extends js.Object

object ShareContent {
  @scala.inline
  def ShareLinkContent(contentType: link, contentUrl: String): ShareContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
  @scala.inline
  def SharePhotoContent(contentType: photo, photos: js.Array[SharePhoto]): ShareContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
  @scala.inline
  def ShareVideoContent(contentType: video, video: ShareVideo): ShareContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
  @scala.inline
  def ShareOpenGraphContent(action: ShareOpenGraphAction, contentType: `open-graph`, previewPropertyName: String): ShareContent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], previewPropertyName = previewPropertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
}

