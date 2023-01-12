package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareVideoContent
  extends StObject
     with ShareContent {
  
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.undefined
  
  /**
    *  Description of the video.
    */
  var contentDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the video.
    */
  var contentTitle: js.UndefOr[String] = js.undefined
  
  /**
    * The type of content to be shared is photo.
    */
  var contentType: video
  
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The photo that represents the video.
    */
  var previewPhoto: js.UndefOr[SharePhoto] = js.undefined
  
  /**
    * Video to be shared.
    */
  var video: ShareVideo
}
object ShareVideoContent {
  
  inline def apply(video: ShareVideo): ShareVideoContent = {
    val __obj = js.Dynamic.literal(contentType = "video", video = video.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareVideoContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareVideoContent] (val x: Self) extends AnyVal {
    
    inline def setCommonParameters(value: ShareContentCommonParameters): Self = StObject.set(x, "commonParameters", value.asInstanceOf[js.Any])
    
    inline def setCommonParametersUndefined: Self = StObject.set(x, "commonParameters", js.undefined)
    
    inline def setContentDescription(value: String): Self = StObject.set(x, "contentDescription", value.asInstanceOf[js.Any])
    
    inline def setContentDescriptionUndefined: Self = StObject.set(x, "contentDescription", js.undefined)
    
    inline def setContentTitle(value: String): Self = StObject.set(x, "contentTitle", value.asInstanceOf[js.Any])
    
    inline def setContentTitleUndefined: Self = StObject.set(x, "contentTitle", js.undefined)
    
    inline def setContentType(value: video): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
    
    inline def setPreviewPhoto(value: SharePhoto): Self = StObject.set(x, "previewPhoto", value.asInstanceOf[js.Any])
    
    inline def setPreviewPhotoUndefined: Self = StObject.set(x, "previewPhoto", js.undefined)
    
    inline def setVideo(value: ShareVideo): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
  }
}
