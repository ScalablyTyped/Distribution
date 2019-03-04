package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

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
  var contentType: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkLibStrings.photo
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Photos to be shared.
    */
  var photos: js.Array[SharePhoto]
}

object SharePhotoContent {
  @scala.inline
  def apply(
    contentType: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkLibStrings.photo,
    photos: js.Array[SharePhoto],
    commonParameters: ShareContentCommonParameters = null,
    contentUrl: java.lang.String = null
  ): SharePhotoContent = {
    val __obj = js.Dynamic.literal(contentType = contentType, photos = photos)
    if (commonParameters != null) __obj.updateDynamic("commonParameters")(commonParameters)
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    __obj.asInstanceOf[SharePhotoContent]
  }
}

