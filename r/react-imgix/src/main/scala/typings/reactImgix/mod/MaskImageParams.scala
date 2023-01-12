package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaskImageParams extends StObject {
  
  var `corner-radius`: js.UndefOr[ImgixParamType] = js.undefined
  
  var mask: js.UndefOr[ImgixParamType] = js.undefined
  
  var `mask-bg`: js.UndefOr[ImgixParamType] = js.undefined
}
object MaskImageParams {
  
  inline def apply(): MaskImageParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskImageParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MaskImageParams] (val x: Self) extends AnyVal {
    
    inline def `setCorner-radius`(value: ImgixParamType): Self = StObject.set(x, "corner-radius", value.asInstanceOf[js.Any])
    
    inline def `setCorner-radiusUndefined`: Self = StObject.set(x, "corner-radius", js.undefined)
    
    inline def setMask(value: ImgixParamType): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def `setMask-bg`(value: ImgixParamType): Self = StObject.set(x, "mask-bg", value.asInstanceOf[js.Any])
    
    inline def `setMask-bgUndefined`: Self = StObject.set(x, "mask-bg", js.undefined)
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
