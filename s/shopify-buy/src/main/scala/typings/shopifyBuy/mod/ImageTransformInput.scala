package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageTransformInput extends StObject {
  
  var crop: js.UndefOr[CropRegion] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var preferredContentType: js.UndefOr[ImageContentType] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
}
object ImageTransformInput {
  
  inline def apply(): ImageTransformInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageTransformInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageTransformInput] (val x: Self) extends AnyVal {
    
    inline def setCrop(value: CropRegion): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setPreferredContentType(value: ImageContentType): Self = StObject.set(x, "preferredContentType", value.asInstanceOf[js.Any])
    
    inline def setPreferredContentTypeUndefined: Self = StObject.set(x, "preferredContentType", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
  }
}
