package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrimParams extends StObject {
  
  var trim: js.UndefOr[ImgixParamType] = js.undefined
  
  var `trim-color`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `trim-md`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `trim-pad`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `trim-sd`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `trim-tol`: js.UndefOr[ImgixParamType] = js.undefined
}
object TrimParams {
  
  inline def apply(): TrimParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimParams]
  }
  
  extension [Self <: TrimParams](x: Self) {
    
    inline def setTrim(value: ImgixParamType): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def `setTrim-color`(value: ImgixParamType): Self = StObject.set(x, "trim-color", value.asInstanceOf[js.Any])
    
    inline def `setTrim-colorUndefined`: Self = StObject.set(x, "trim-color", js.undefined)
    
    inline def `setTrim-md`(value: ImgixParamType): Self = StObject.set(x, "trim-md", value.asInstanceOf[js.Any])
    
    inline def `setTrim-mdUndefined`: Self = StObject.set(x, "trim-md", js.undefined)
    
    inline def `setTrim-pad`(value: ImgixParamType): Self = StObject.set(x, "trim-pad", value.asInstanceOf[js.Any])
    
    inline def `setTrim-padUndefined`: Self = StObject.set(x, "trim-pad", js.undefined)
    
    inline def `setTrim-sd`(value: ImgixParamType): Self = StObject.set(x, "trim-sd", value.asInstanceOf[js.Any])
    
    inline def `setTrim-sdUndefined`: Self = StObject.set(x, "trim-sd", js.undefined)
    
    inline def `setTrim-tol`(value: ImgixParamType): Self = StObject.set(x, "trim-tol", value.asInstanceOf[js.Any])
    
    inline def `setTrim-tolUndefined`: Self = StObject.set(x, "trim-tol", js.undefined)
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
  }
}
