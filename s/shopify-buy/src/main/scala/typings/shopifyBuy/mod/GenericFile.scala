package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//  interface ExternalVideo {}
trait GenericFile
  extends StObject
     with Node
     with MetafieldReference {
  
  var alt: js.UndefOr[String] = js.undefined
  
  var mimeType: js.UndefOr[String] = js.undefined
  
  var originalFileSize: js.UndefOr[Double] = js.undefined
  
  var previewImage: js.UndefOr[Image] = js.undefined
  
  var url: js.UndefOr[URL] = js.undefined
}
object GenericFile {
  
  inline def apply(id: ID): GenericFile = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericFile] (val x: Self) extends AnyVal {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
    
    inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    
    inline def setOriginalFileSize(value: Double): Self = StObject.set(x, "originalFileSize", value.asInstanceOf[js.Any])
    
    inline def setOriginalFileSizeUndefined: Self = StObject.set(x, "originalFileSize", js.undefined)
    
    inline def setPreviewImage(value: Image): Self = StObject.set(x, "previewImage", value.asInstanceOf[js.Any])
    
    inline def setPreviewImageUndefined: Self = StObject.set(x, "previewImage", js.undefined)
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
