package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShareLinkContent extends ShareContent {
  
  /**
    * Common parameters for share content;
    */
  var commonParameters: js.UndefOr[ShareContentCommonParameters] = js.native
  
  /**
    * The Description of the link.
    * If not specified, this field is automatically populated by information scraped
    * from the contentURL,  typically the title of the page.
    * @deprecated `contentDescription` is deprecated from Graph API 2.9.
    * For more information, see https://developers.facebook.com/docs/apps/changelog#v2_9_deprecations.
    */
  var contentDescription: js.UndefOr[String] = js.native
  
  /**
    * The title to display for this link.
    * @deprecated `contentTitle` is deprecated from Graph API 2.9.
    * For more information, see https://developers.facebook.com/docs/apps/changelog#v2_9_deprecations.
    */
  var contentTitle: js.UndefOr[String] = js.native
  
  /**
    * The type of content to be shared is link.
    */
  var contentType: link = js.native
  
  /**
    * URL for the content being shared.
    */
  var contentUrl: String = js.native
  
  /**
    * The URL of a picture to attach to this comment.
    * @deprecated `imageUrl` is deprecated from Graph API 2.9.
    * For more information, see https://developers.facebook.com/docs/apps/changelog#v2_9_deprecations.
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /**
    * The predefined quote to attach to this comment.
    * If specified, the quote text will render with custom styling on top of the link.
    */
  var quote: js.UndefOr[String] = js.native
}
object ShareLinkContent {
  
  @scala.inline
  def apply(contentType: link, contentUrl: String): ShareLinkContent = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], contentUrl = contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareLinkContent]
  }
  
  @scala.inline
  implicit class ShareLinkContentMutableBuilder[Self <: ShareLinkContent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommonParameters(value: ShareContentCommonParameters): Self = StObject.set(x, "commonParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonParametersUndefined: Self = StObject.set(x, "commonParameters", js.undefined)
    
    @scala.inline
    def setContentDescription(value: String): Self = StObject.set(x, "contentDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentDescriptionUndefined: Self = StObject.set(x, "contentDescription", js.undefined)
    
    @scala.inline
    def setContentTitle(value: String): Self = StObject.set(x, "contentTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTitleUndefined: Self = StObject.set(x, "contentTitle", js.undefined)
    
    @scala.inline
    def setContentType(value: link): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
  }
}
