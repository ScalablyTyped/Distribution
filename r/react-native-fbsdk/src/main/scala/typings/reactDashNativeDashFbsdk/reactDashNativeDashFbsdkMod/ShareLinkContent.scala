package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkStrings.link
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
  var contentDescription: js.UndefOr[String] = js.undefined
  /**
    * The title to display for this link.
    * @deprecated `contentTitle` is deprecated from Graph API 2.9.
    * For more information, see https://developers.facebook.com/docs/apps/changelog#v2_9_deprecations.
    */
  var contentTitle: js.UndefOr[String] = js.undefined
  /**
    * The type of content to be shared is link.
    */
  var contentType: link
  /**
    * URL for the content being shared.
    */
  var contentUrl: String
  /**
    * The URL of a picture to attach to this comment.
    * @deprecated `imageUrl` is deprecated from Graph API 2.9.
    * For more information, see https://developers.facebook.com/docs/apps/changelog#v2_9_deprecations.
    */
  var imageUrl: js.UndefOr[String] = js.undefined
  /**
    * The predefined quote to attach to this comment.
    * If specified, the quote text will render with custom styling on top of the link.
    */
  var quote: js.UndefOr[String] = js.undefined
}

object ShareLinkContent {
  @scala.inline
  def apply(
    contentType: link,
    contentUrl: String,
    commonParameters: ShareContentCommonParameters = null,
    contentDescription: String = null,
    contentTitle: String = null,
    imageUrl: String = null,
    quote: String = null
  ): ShareLinkContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
    if (commonParameters != null) __obj.updateDynamic("commonParameters")(commonParameters.asInstanceOf[js.Any])
    if (contentDescription != null) __obj.updateDynamic("contentDescription")(contentDescription.asInstanceOf[js.Any])
    if (contentTitle != null) __obj.updateDynamic("contentTitle")(contentTitle.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareLinkContent]
  }
}

