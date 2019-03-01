package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

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
  var contentType: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkLibStrings.`open-graph`
  /**
    * URL for the content being shared.
    */
  var contentUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Property name that points to the primary Open Graph Object in the action.
    */
  var previewPropertyName: java.lang.String
}

object ShareOpenGraphContent {
  @scala.inline
  def apply(
    action: ShareOpenGraphAction,
    contentType: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkLibStrings.`open-graph`,
    previewPropertyName: java.lang.String,
    commonParameters: ShareContentCommonParameters = null,
    contentUrl: java.lang.String = null
  ): ShareOpenGraphContent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("previewPropertyName")(previewPropertyName)
    if (commonParameters != null) __obj.updateDynamic("commonParameters")(commonParameters)
    if (contentUrl != null) __obj.updateDynamic("contentUrl")(contentUrl)
    __obj.asInstanceOf[ShareOpenGraphContent]
  }
}

