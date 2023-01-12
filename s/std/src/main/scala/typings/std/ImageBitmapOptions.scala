package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageBitmapOptions extends StObject {
  
  /* standard dom */
  var colorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.undefined
  
  /* standard dom */
  var imageOrientation: js.UndefOr[ImageOrientation] = js.undefined
  
  /* standard dom */
  var premultiplyAlpha: js.UndefOr[PremultiplyAlpha] = js.undefined
  
  /* standard dom */
  var resizeHeight: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var resizeQuality: js.UndefOr[ResizeQuality] = js.undefined
  
  /* standard dom */
  var resizeWidth: js.UndefOr[Double] = js.undefined
}
object ImageBitmapOptions {
  
  inline def apply(): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBitmapOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageBitmapOptions] (val x: Self) extends AnyVal {
    
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
