package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BorderAndPaddingParams extends StObject {
  
  var border: js.UndefOr[ImgixParamType] = js.undefined
  
  var `border-radius`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `border-radius-inner`: js.UndefOr[ImgixParamType] = js.undefined
  
  var pad: js.UndefOr[ImgixParamType] = js.undefined
}
object BorderAndPaddingParams {
  
  inline def apply(): BorderAndPaddingParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderAndPaddingParams]
  }
  
  extension [Self <: BorderAndPaddingParams](x: Self) {
    
    inline def setBorder(value: ImgixParamType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius`(value: ImgixParamType): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-inner`(value: ImgixParamType): Self = StObject.set(x, "border-radius-inner", value.asInstanceOf[js.Any])
    
    inline def `setBorder-radius-innerUndefined`: Self = StObject.set(x, "border-radius-inner", js.undefined)
    
    inline def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setPad(value: ImgixParamType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
