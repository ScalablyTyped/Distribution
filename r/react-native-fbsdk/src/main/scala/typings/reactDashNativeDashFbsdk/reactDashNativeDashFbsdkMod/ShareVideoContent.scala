package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareVideoContent extends ShareContent {
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
  @scala.inline
  def apply(
    contentType: video,
    video: ShareVideo,
    commonParameters: ShareContentCommonParameters = null,
    contentDescription: String = null,
    contentTitle: String = null,
    contentUrl: String = null,
    previewPhoto: SharePhoto = null
  ): ShareVideoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType, video = video)
    if (commonParameters != null) __obj.updateDynamic("commonParameters")(commonParameters)
    if (contentDescription != null) __obj.updateDynamic("contentDescription")(contentDescription)
    if (contentTitle != null) __obj.updateDynamic("contentTitle")(contentTitle)
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    if (previewPhoto != null) __obj.updateDynamic("previewPhoto")(previewPhoto)
    __obj.asInstanceOf[ShareVideoContent]
  }
}

