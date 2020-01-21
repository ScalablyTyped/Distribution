package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.`open-graph`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareOpenGraphContent extends ShareContent {
  /**
    * Open Graph Action to be shared.
    */
  var action: ShareOpenGraphAction
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.undefined
  /**
    * The type of content to be shared is open graph content.
    */
  var contentType: `open-graph`
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[String] = js.undefined
  /**
    * Property name that points to the primary Open Graph Object in the action.
    */
  var previewPropertyName: String
}

object ShareOpenGraphContent {
  @scala.inline
  def apply(
    action: ShareOpenGraphAction,
    contentType: `open-graph`,
    previewPropertyName: String,
    commonParameters: ShareContentCommonParameters = null,
    contentUrl: String = null
  ): ShareOpenGraphContent = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any], previewPropertyName = previewPropertyName.asInstanceOf[js.Any])
    if (commonParameters != null) __obj.updateDynamic("commonParameters")(commonParameters.asInstanceOf[js.Any])
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareOpenGraphContent]
  }
}

