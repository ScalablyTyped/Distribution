package typings
package reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareLinkContent extends ShareContent {
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.undefined
  /**
    * The Description of the link.
    * If not specified, this field is automatically populated by information scraped
    * from the contentURL,  typically the title of the page.
    * @deprecated `contentDescription` is deprecated from Graph API 2.9.
    * For more information, see https://developers.facebook.com/docs/apps/changelog#v2_9_deprecations.
    */
  var contentDescription: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The title to display for this link.
    * @deprecated `contentTitle` is deprecated from Graph API 2.9.
    * For more information, see https://developers.facebook.com/docs/apps/changelog#v2_9_deprecations.
    */
  var contentTitle: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of content to be shared is link.
    */
  var contentType: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkLibStrings.link
  /**
    * URL for the content being shared.
    */
  var contentUrl: java.lang.String
  /**
    * The URL of a picture to attach to this comment.
    * @deprecated `imageUrl` is deprecated from Graph API 2.9.
    * For more information, see https://developers.facebook.com/docs/apps/changelog#v2_9_deprecations.
    */
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The predefined quote to attach to this comment.
    * If specified, the quote text will render with custom styling on top of the link.
    */
  var quote: js.UndefOr[java.lang.String] = js.undefined
}

object ShareLinkContent {
  @scala.inline
  def apply(
    contentType: reactDashNativeDashFbsdkLib.reactDashNativeDashFbsdkLibStrings.link,
    contentUrl: java.lang.String,
    commonParameters: ShareContentCommonParameters = null,
    contentDescription: java.lang.String = null,
    contentTitle: java.lang.String = null,
    imageUrl: java.lang.String = null,
    quote: java.lang.String = null
  ): ShareLinkContent = {
    val __obj = js.Dynamic.literal(contentType = contentType, contentUrl = contentUrl)
    if (commonParameters != null) __obj.updateDynamic("commonParameters")(commonParameters)
    if (contentDescription != null) __obj.updateDynamic("contentDescription")(contentDescription)
    if (contentTitle != null) __obj.updateDynamic("contentTitle")(contentTitle)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (quote != null) __obj.updateDynamic("quote")(quote)
    __obj.asInstanceOf[ShareLinkContent]
  }
}

