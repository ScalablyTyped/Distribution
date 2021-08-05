package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBitmapOptions extends StObject {
  
  var colorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.undefined
  
  var imageOrientation: js.UndefOr[ImageOrientation] = js.undefined
  
  var premultiplyAlpha: js.UndefOr[PremultiplyAlpha] = js.undefined
  
  var resizeHeight: js.UndefOr[Double] = js.undefined
  
  var resizeQuality: js.UndefOr[ResizeQuality] = js.undefined
  
  var resizeWidth: js.UndefOr[Double] = js.undefined
}
object ImageBitmapOptions {
  
  inline def apply(): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBitmapOptions]
  }
  
  extension [Self <: ImageBitmapOptions](x: Self) {
    
    inline def setColorSpaceConversion(value: ColorSpaceConversion): Self = StObject.set(x, "colorSpaceConversion", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceConversionUndefined: Self = StObject.set(x, "colorSpaceConversion", js.undefined)
    
    inline def setImageOrientation(value: ImageOrientation): Self = StObject.set(x, "imageOrientation", value.asInstanceOf[js.Any])
    
    inline def setImageOrientationUndefined: Self = StObject.set(x, "imageOrientation", js.undefined)
    
    inline def setPremultiplyAlpha(value: PremultiplyAlpha): Self = StObject.set(x, "premultiplyAlpha", value.asInstanceOf[js.Any])
    
    inline def setPremultiplyAlphaUndefined: Self = StObject.set(x, "premultiplyAlpha", js.undefined)
    
    inline def setResizeHeight(value: Double): Self = StObject.set(x, "resizeHeight", value.asInstanceOf[js.Any])
    
    inline def setResizeHeightUndefined: Self = StObject.set(x, "resizeHeight", js.undefined)
    
    inline def setResizeQuality(value: ResizeQuality): Self = StObject.set(x, "resizeQuality", value.asInstanceOf[js.Any])
    
    inline def setResizeQualityUndefined: Self = StObject.set(x, "resizeQuality", js.undefined)
    
    inline def setResizeWidth(value: Double): Self = StObject.set(x, "resizeWidth", value.asInstanceOf[js.Any])
    
    inline def setResizeWidthUndefined: Self = StObject.set(x, "resizeWidth", js.undefined)
  }
}
