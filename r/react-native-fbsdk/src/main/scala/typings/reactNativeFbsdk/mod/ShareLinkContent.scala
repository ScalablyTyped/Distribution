package typings.reactNativeFbsdk.mod

import typings.reactNativeFbsdk.reactNativeFbsdkStrings.link
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareLinkContent
  extends StObject
     with ShareContent {
  
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
  
  inline def apply(contentUrl: String): ShareLinkContent = {
    val __obj = js.Dynamic.literal(contentType = "link", contentUrl = contentUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareLinkContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareLinkContent] (val x: Self) extends AnyVal {
    
    inline def setCommonParameters(value: ShareContentCommonParameters): Self = StObject.set(x, "commonParameters", value.asInstanceOf[js.Any])
    
    inline def setCommonParametersUndefined: Self = StObject.set(x, "commonParameters", js.undefined)
    
    inline def setContentDescription(value: String): Self = StObject.set(x, "contentDescription", value.asInstanceOf[js.Any])
    
    inline def setContentDescriptionUndefined: Self = StObject.set(x, "contentDescription", js.undefined)
    
    inline def setContentTitle(value: String): Self = StObject.set(x, "contentTitle", value.asInstanceOf[js.Any])
    
    inline def setContentTitleUndefined: Self = StObject.set(x, "contentTitle", js.undefined)
    
    inline def setContentType(value: link): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    inline def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    
    inline def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
  }
}
