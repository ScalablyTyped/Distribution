package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Media extends StObject {
  
  var alt: js.UndefOr[String] = js.undefined
  
  var mediaContentType: MediaContentType
  
  var previewImage: js.UndefOr[Image] = js.undefined
}
object Media {
  
  inline def apply(mediaContentType: MediaContentType): Media = {
    val __obj = js.Dynamic.literal(mediaContentType = mediaContentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Media]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Media] (val x: Self) extends AnyVal {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setMediaContentType(value: MediaContentType): Self = StObject.set(x, "mediaContentType", value.asInstanceOf[js.Any])
    
    inline def setPreviewImage(value: Image): Self = StObject.set(x, "previewImage", value.asInstanceOf[js.Any])
    
    inline def setPreviewImageUndefined: Self = StObject.set(x, "previewImage", js.undefined)
  }
}
