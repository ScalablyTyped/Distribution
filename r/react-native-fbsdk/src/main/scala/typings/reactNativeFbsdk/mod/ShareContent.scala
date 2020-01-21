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
  def ShareLinkContent(
    contentType: link,
    contentUrl: String,
    commonParameters: ShareContentCommonParameters = null,
    contentDescription: String = null,
    contentTitle: String = null,
    imageUrl: String = null,
    quote: String = null
  ): ShareContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
    if (commonParameters != null) __obj.updateDynamic("commonParameters")(commonParameters.asInstanceOf[js.Any])
    if (contentDescription != null) __obj.updateDynamic("contentDescription")(contentDescription.asInstanceOf[js.Any])
    if (contentTitle != null) __obj.updateDynamic("contentTitle")(contentTitle.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
  @scala.inline
  def SharePhotoContent(
    contentType: photo,
    photos: js.Array[SharePhoto],
    commonParameters: ShareContentCommonParameters = null,
    contentUrl: String = null
  ): ShareContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], photos = photos.asInstanceOf[js.Any])
    if (commonParameters != null) __obj.updateDynamic("commonParameters")(commonParameters.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
  @scala.inline
  def ShareVideoContent(
    contentType: video,
    video: ShareVideo,
    commonParameters: ShareContentCommonParameters = null,
    contentDescription: String = null,
    contentTitle: String = null,
    contentUrl: String = null,
    previewPhoto: SharePhoto = null
  ): ShareContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    if (commonParameters != null) __obj.updateDynamic("commonParameters")(commonParameters.asInstanceOf[js.Any])
    if (contentDescription != null) __obj.updateDynamic("contentDescription")(contentDescription.asInstanceOf[js.Any])
    if (contentTitle != null) __obj.updateDynamic("contentTitle")(contentTitle.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    if (previewPhoto != null) __obj.updateDynamic("previewPhoto")(previewPhoto.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
  @scala.inline
  def ShareOpenGraphContent(
    action: ShareOpenGraphAction,
    contentType: `open-graph`,
    previewPropertyName: String,
    commonParameters: ShareContentCommonParameters = null,
    contentUrl: String = null
  ): ShareContent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], previewPropertyName = previewPropertyName.asInstanceOf[js.Any])
    if (commonParameters != null) __obj.updateDynamic("commonParameters")(commonParameters.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareContent]
  }
}

