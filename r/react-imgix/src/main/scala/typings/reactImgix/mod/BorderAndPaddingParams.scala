package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderAndPaddingParams extends StObject {
  
  var border: js.UndefOr[ImgixParamType] = js.native
  
  var `border-radius`: js.UndefOr[ImgixParamType] = js.native
  
  var `border-radius-inner`: js.UndefOr[ImgixParamType] = js.native
  
  var pad: js.UndefOr[ImgixParamType] = js.native
}
object BorderAndPaddingParams {
  
  @scala.inline
  def apply(): BorderAndPaddingParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderAndPaddingParams]
  }
  
  @scala.inline
  implicit class BorderAndPaddingParamsMutableBuilder[Self <: BorderAndPaddingParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBorder(value: ImgixParamType): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius`(value: ImgixParamType): Self = StObject.set(x, "border-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-inner`(value: ImgixParamType): Self = StObject.set(x, "border-radius-inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setBorder-radius-innerUndefined`: Self = StObject.set(x, "border-radius-inner", js.undefined)
    
    @scala.inline
    def `setBorder-radiusUndefined`: Self = StObject.set(x, "border-radius", js.undefined)
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setPad(value: ImgixParamType): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadUndefined: Self = StObject.set(x, "pad", js.undefined)
  }
}
