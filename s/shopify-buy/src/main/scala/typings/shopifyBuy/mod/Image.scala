package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Image extends StObject {
  
  var altText: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var id: js.UndefOr[ID] = js.undefined
  
  /**
    * @deprecated
    */
  var originalSrc: URL
  
  /**
    * @deprecated
    */
  var src: URL
  
  /**
    * @deprecated
    */
  var transformedSrc: URL
  
  var url: URL
  
  var width: js.UndefOr[Double] = js.undefined
}
object Image {
  
  inline def apply(originalSrc: URL, src: URL, transformedSrc: URL, url: URL): Image = {
    val __obj = js.Dynamic.literal(originalSrc = originalSrc.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], transformedSrc = transformedSrc.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextUndefined: Self = StObject.set(x, "altText", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: ID): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOriginalSrc(value: URL): Self = StObject.set(x, "originalSrc", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: URL): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setTransformedSrc(value: URL): Self = StObject.set(x, "transformedSrc", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: URL): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
