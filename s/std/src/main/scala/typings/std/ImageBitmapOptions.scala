package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageBitmapOptions extends StObject {
  
  var colorSpaceConversion: js.UndefOr[ColorSpaceConversion] = js.native
  
  var imageOrientation: js.UndefOr[ImageOrientation] = js.native
  
  var premultiplyAlpha: js.UndefOr[PremultiplyAlpha] = js.native
  
  var resizeHeight: js.UndefOr[Double] = js.native
  
  var resizeQuality: js.UndefOr[ResizeQuality] = js.native
  
  var resizeWidth: js.UndefOr[Double] = js.native
}
object ImageBitmapOptions {
  
  @scala.inline
  def apply(): ImageBitmapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageBitmapOptions]
  }
  
  @scala.inline
  implicit class ImageBitmapOptionsMutableBuilder[Self <: ImageBitmapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorSpaceConversion(value: ColorSpaceConversion): Self = StObject.set(x, "colorSpaceConversion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpaceConversionUndefined: Self = StObject.set(x, "colorSpaceConversion", js.undefined)
    
    @scala.inline
    def setImageOrientation(value: ImageOrientation): Self = StObject.set(x, "imageOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageOrientationUndefined: Self = StObject.set(x, "imageOrientation", js.undefined)
    
    @scala.inline
    def setPremultiplyAlpha(value: PremultiplyAlpha): Self = StObject.set(x, "premultiplyAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremultiplyAlphaUndefined: Self = StObject.set(x, "premultiplyAlpha", js.undefined)
    
    @scala.inline
    def setResizeHeight(value: Double): Self = StObject.set(x, "resizeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeHeightUndefined: Self = StObject.set(x, "resizeHeight", js.undefined)
    
    @scala.inline
    def setResizeQuality(value: ResizeQuality): Self = StObject.set(x, "resizeQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeQualityUndefined: Self = StObject.set(x, "resizeQuality", js.undefined)
    
    @scala.inline
    def setResizeWidth(value: Double): Self = StObject.set(x, "resizeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeWidthUndefined: Self = StObject.set(x, "resizeWidth", js.undefined)
  }
}
