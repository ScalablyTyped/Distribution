package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppInviteContent extends StObject {
  
  /**
    * An app link target that will be used as a target when the user accepts the invite.
    */
  var applinkUrl: String
  
  /**
    * A URL to a preview image that will be displayed with the app invite.
    * This is optional. If you don't include it, a fallback image will be used.
    */
  var previewImageUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Promotional code to be displayed while sending and receiving the invite.
    * This is optional. This can be between 0 and 10 characters long and can contain
    * alphanumeric characters only. To set a promo code, you need to set promo text.
    */
  var promotionCode: js.UndefOr[String] = js.undefined
  
  /**
    * Promotional text to be displayed while sending and receiving the invite.
    * This is optional. This can be between 0 and 80 characters long and can contain
    * alphanumeric and spaces only.
    */
  var promotionText: js.UndefOr[String] = js.undefined
}
object AppInviteContent {
  
  inline def apply(applinkUrl: String): AppInviteContent = {
    val __obj = js.Dynamic.literal(applinkUrl = applinkUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInviteContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppInviteContent] (val x: Self) extends AnyVal {
    
    inline def setApplinkUrl(value: String): Self = StObject.set(x, "applinkUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewImageUrl(value: String): Self = StObject.set(x, "previewImageUrl", value.asInstanceOf[js.Any])
    
    inline def setPreviewImageUrlUndefined: Self = StObject.set(x, "previewImageUrl", js.undefined)
    
    inline def setPromotionCode(value: String): Self = StObject.set(x, "promotionCode", value.asInstanceOf[js.Any])
    
    inline def setPromotionCodeUndefined: Self = StObject.set(x, "promotionCode", js.undefined)
    
    inline def setPromotionText(value: String): Self = StObject.set(x, "promotionText", value.asInstanceOf[js.Any])
    
    inline def setPromotionTextUndefined: Self = StObject.set(x, "promotionText", js.undefined)
  }
}
