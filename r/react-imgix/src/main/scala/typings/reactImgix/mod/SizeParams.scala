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
  
  @scala.inline
  def apply(): SizeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SizeParams]
  }
  
  @scala.inline
  implicit class SizeParamsMutableBuilder[Self <: SizeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAr(value: ImgixParamType): Self = StObject.set(x, "ar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArUndefined: Self = StObject.set(x, "ar", js.undefined)
    
    @scala.inline
    def setCrop(value: ImgixParamType): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    @scala.inline
    def setFit(value: ImgixParamType): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    @scala.inline
    def setH(value: ImgixParamType): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    @scala.inline
    def `setMax-h`(value: ImgixParamType): Self = StObject.set(x, "max-h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-hUndefined`: Self = StObject.set(x, "max-h", js.undefined)
    
    @scala.inline
    def `setMax-w`(value: ImgixParamType): Self = StObject.set(x, "max-w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMax-wUndefined`: Self = StObject.set(x, "max-w", js.undefined)
    
    @scala.inline
    def `setMin-h`(value: ImgixParamType): Self = StObject.set(x, "min-h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-hUndefined`: Self = StObject.set(x, "min-h", js.undefined)
    
    @scala.inline
    def `setMin-w`(value: ImgixParamType): Self = StObject.set(x, "min-w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMin-wUndefined`: Self = StObject.set(x, "min-w", js.undefined)
    
    @scala.inline
    def setRect(value: ImgixParamType): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    @scala.inline
    def setW(value: ImgixParamType): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWUndefined: Self = StObject.set(x, "w", js.undefined)
  }
}
