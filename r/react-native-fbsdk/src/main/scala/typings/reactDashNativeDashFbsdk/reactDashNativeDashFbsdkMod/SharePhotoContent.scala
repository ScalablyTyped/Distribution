package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkStrings.photo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharePhotoContent extends ShareContent {
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.undefined
  /**
    * The type of content to be shared is photo.
    */
  var contentType: photo
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  /**
    * Photos to be shared.
    */
  var photos: js.Array[SharePhoto]
}

object SharePhotoContent {
  @scala.inline
  def apply(
    contentType: photo,
    photos: js.Array[SharePhoto],
    commonParameters: ShareContentCommonParameters = null,
    contentUrl: String = null
  ): SharePhotoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any])
    if (commonParameters != null) __obj.updateDynamic("commonParameters")(commonParameters.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePhotoContent]
  }
}

