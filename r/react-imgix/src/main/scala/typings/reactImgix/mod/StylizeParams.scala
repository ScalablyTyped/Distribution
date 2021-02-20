package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylizeParams extends StObject {
  
  var blur: js.UndefOr[ImgixParamType] = js.native
  
  var duotone: js.UndefOr[ImgixParamType] = js.native
  
  var `duotone-alpha`: js.UndefOr[ImgixParamType] = js.native
  
  var htn: js.UndefOr[ImgixParamType] = js.native
  
  var monochrome: js.UndefOr[ImgixParamType] = js.native
  
  var px: js.UndefOr[ImgixParamType] = js.native
  
  var sepia: js.UndefOr[ImgixParamType] = js.native
}
object StylizeParams {
  
  @scala.inline
  def apply(): StylizeParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StylizeParams]
  }
  
  @scala.inline
  implicit class StylizeParamsMutableBuilder[Self <: StylizeParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlur(value: ImgixParamType): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    @scala.inline
    def setDuotone(value: ImgixParamType): Self = StObject.set(x, "duotone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDuotone-alpha`(value: ImgixParamType): Self = StObject.set(x, "duotone-alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDuotone-alphaUndefined`: Self = StObject.set(x, "duotone-alpha", js.undefined)
    
    @scala.inline
    def setDuotoneUndefined: Self = StObject.set(x, "duotone", js.undefined)
    
    @scala.inline
    def setHtn(value: ImgixParamType): Self = StObject.set(x, "htn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtnUndefined: Self = StObject.set(x, "htn", js.undefined)
    
    @scala.inline
    def setMonochrome(value: ImgixParamType): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonochromeUndefined: Self = StObject.set(x, "monochrome", js.undefined)
    
    @scala.inline
    def setPx(value: ImgixParamType): Self = StObject.set(x, "px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPxUndefined: Self = StObject.set(x, "px", js.undefined)
    
    @scala.inline
    def setSepia(value: ImgixParamType): Self = StObject.set(x, "sepia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSepiaUndefined: Self = StObject.set(x, "sepia", js.undefined)
  }
}
