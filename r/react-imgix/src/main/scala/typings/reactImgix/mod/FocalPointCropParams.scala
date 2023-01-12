package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FocalPointCropParams extends StObject {
  
  var `fp-debug`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `fp-x`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `fp-y`: js.UndefOr[ImgixParamType] = js.undefined
  
  var `fp-z`: js.UndefOr[ImgixParamType] = js.undefined
}
object FocalPointCropParams {
  
  inline def apply(): FocalPointCropParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocalPointCropParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FocalPointCropParams] (val x: Self) extends AnyVal {
    
    inline def `setFp-debug`(value: ImgixParamType): Self = StObject.set(x, "fp-debug", value.asInstanceOf[js.Any])
    
    inline def `setFp-debugUndefined`: Self = StObject.set(x, "fp-debug", js.undefined)
    
    inline def `setFp-x`(value: ImgixParamType): Self = StObject.set(x, "fp-x", value.asInstanceOf[js.Any])
    
    inline def `setFp-xUndefined`: Self = StObject.set(x, "fp-x", js.undefined)
    
    inline def `setFp-y`(value: ImgixParamType): Self = StObject.set(x, "fp-y", value.asInstanceOf[js.Any])
    
    inline def `setFp-yUndefined`: Self = StObject.set(x, "fp-y", js.undefined)
    
    inline def `setFp-z`(value: ImgixParamType): Self = StObject.set(x, "fp-z", value.asInstanceOf[js.Any])
    
    inline def `setFp-zUndefined`: Self = StObject.set(x, "fp-z", js.undefined)
  }
}
