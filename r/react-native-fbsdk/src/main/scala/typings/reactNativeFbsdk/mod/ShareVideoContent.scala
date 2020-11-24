package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareVideoContent extends ShareContent {
  
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.native
  
  /**
    *  Description of the video.
    */
  var contentDescription: js.UndefOr[String] = js.native
  
  /**
    * Title of the video.
    */
  var contentTitle: js.UndefOr[String] = js.native
  
  /**
    * The type of content to be shared is photo.
    */
  var contentType: video = js.native
  
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.native
  
  /**
    * The photo that represents the video.
    */
  var previewPhoto: js.UndefOr[SharePhoto] = js.native
  
  /**
    * Video to be shared.
    */
  var video: ShareVideo = js.native
}
object ShareVideoContent {
  
  @scala.inline
  def apply(contentType: video, video: ShareVideo): ShareVideoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareVideoContent]
  }
  
  @scala.inline
  implicit class ShareVideoContentOps[Self <: ShareVideoContent] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: video): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo(value: ShareVideo): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonParameters(value: ShareContentCommonParameters): Self = this.set("commonParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommonParameters: Self = this.set("commonParameters", js.undefined)
    
    @scala.inline
    def setContentDescription(value: String): Self = this.set("contentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentDescription: Self = this.set("contentDescription", js.undefined)
    
    @scala.inline
    def setContentTitle(value: String): Self = this.set("contentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentTitle: Self = this.set("contentTitle", js.undefined)
    
    @scala.inline
    def setContentUrl(value: String): Self = this.set("contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentUrl: Self = this.set("contentUrl", js.undefined)
    
    @scala.inline
    def setPreviewPhoto(value: SharePhoto): Self = this.set("previewPhoto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreviewPhoto: Self = this.set("previewPhoto", js.undefined)
  }
}
