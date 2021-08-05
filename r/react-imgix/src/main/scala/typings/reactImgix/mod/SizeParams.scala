package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeParams extends StObject {
  
  var ar: js.UndefOr[ImgixParamType] = js.undefined
  
  var crop: js.UndefOr[ImgixParamType] = js.undefined
  
  var fit: js.UndefOr[ImgixParamType] = js.undefined
  
  var h: js.UndefOr[ImgixParamType] = js.undefined
  
  var `max-h`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `max-w`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `min-h`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `min-w`: js.UndefOr[ImgixParamType] = js.undefined
  
  var rect: js.UndefOr[ImgixParamType] = js.undefined
  
  var w: js.UndefOr[ImgixParamType] = js.undefined
}
object SizeParams {
  
  inline def apply(): SizeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeParams]
  }
  
  extension [Self <: SizeParams](x: Self) {
    
    inline def setAr(value: ImgixParamType): Self = StObject.set(x, "ar", value.asInstanceOf[js.Any])
    
    inline def setArUndefined: Self = StObject.set(x, "ar", js.undefined)
    
    inline def setCrop(value: ImgixParamType): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setFit(value: ImgixParamType): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setH(value: ImgixParamType): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def `setMax-h`(value: ImgixParamType): Self = StObject.set(x, "max-h", value.asInstanceOf[js.Any])
    
    inline def `setMax-hUndefined`: Self = StObject.set(x, "max-h", js.undefined)
    
    inline def `setMax-w`(value: ImgixParamType): Self = StObject.set(x, "max-w", value.asInstanceOf[js.Any])
    
    inline def `setMax-wUndefined`: Self = StObject.set(x, "max-w", js.undefined)
    
    inline def `setMin-h`(value: ImgixParamType): Self = StObject.set(x, "min-h", value.asInstanceOf[js.Any])
    
    inline def `setMin-hUndefined`: Self = StObject.set(x, "min-h", js.undefined)
    
    inline def `setMin-w`(value: ImgixParamType): Self = StObject.set(x, "min-w", value.asInstanceOf[js.Any])
    
    inline def `setMin-wUndefined`: Self = StObject.set(x, "min-w", js.undefined)
    
    inline def setRect(value: ImgixParamType): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    inline def setW(value: ImgixParamType): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
  }
}
