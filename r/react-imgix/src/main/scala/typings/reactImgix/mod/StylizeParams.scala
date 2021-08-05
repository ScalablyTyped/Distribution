package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StylizeParams extends StObject {
  
  var blur: js.UndefOr[ImgixParamType] = js.undefined
  
  var duotone: js.UndefOr[ImgixParamType] = js.undefined
  
  var `duotone-alpha`: js.UndefOr[ImgixParamType] = js.undefined
  
  var htn: js.UndefOr[ImgixParamType] = js.undefined
  
  var monochrome: js.UndefOr[ImgixParamType] = js.undefined
  
  var px: js.UndefOr[ImgixParamType] = js.undefined
  
  var sepia: js.UndefOr[ImgixParamType] = js.undefined
}
object StylizeParams {
  
  inline def apply(): StylizeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylizeParams]
  }
  
  extension [Self <: StylizeParams](x: Self) {
    
    inline def setBlur(value: ImgixParamType): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    inline def setDuotone(value: ImgixParamType): Self = StObject.set(x, "duotone", value.asInstanceOf[js.Any])
    
    inline def `setDuotone-alpha`(value: ImgixParamType): Self = StObject.set(x, "duotone-alpha", value.asInstanceOf[js.Any])
    
    inline def `setDuotone-alphaUndefined`: Self = StObject.set(x, "duotone-alpha", js.undefined)
    
    inline def setDuotoneUndefined: Self = StObject.set(x, "duotone", js.undefined)
    
    inline def setHtn(value: ImgixParamType): Self = StObject.set(x, "htn", value.asInstanceOf[js.Any])
    
    inline def setHtnUndefined: Self = StObject.set(x, "htn", js.undefined)
    
    inline def setMonochrome(value: ImgixParamType): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
    
    inline def setMonochromeUndefined: Self = StObject.set(x, "monochrome", js.undefined)
    
    inline def setPx(value: ImgixParamType): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
    
    inline def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
    
    inline def setSepia(value: ImgixParamType): Self = StObject.set(x, "sepia", value.asInstanceOf[js.Any])
    
    inline def setSepiaUndefined: Self = StObject.set(x, "sepia", js.undefined)
  }
}
