package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrimParams extends StObject {
  
  var trim: js.UndefOr[ImgixParamType] = js.native
  
  var `trim-color`: js.UndefOr[ImgixParamType] = js.native
  
  var `trim-md`: js.UndefOr[ImgixParamType] = js.native
  
  var `trim-sd`: js.UndefOr[ImgixParamType] = js.native
  
  var `trim-tol`: js.UndefOr[ImgixParamType] = js.native
}
object TrimParams {
  
  @scala.inline
  def apply(): TrimParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimParams]
  }
  
  @scala.inline
  implicit class TrimParamsMutableBuilder[Self <: TrimParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrim(value: ImgixParamType): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTrim-color`(value: ImgixParamType): Self = StObject.set(x, "trim-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTrim-colorUndefined`: Self = StObject.set(x, "trim-color", js.undefined)
    
    @scala.inline
    def `setTrim-md`(value: ImgixParamType): Self = StObject.set(x, "trim-md", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTrim-mdUndefined`: Self = StObject.set(x, "trim-md", js.undefined)
    
    @scala.inline
    def `setTrim-sd`(value: ImgixParamType): Self = StObject.set(x, "trim-sd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTrim-sdUndefined`: Self = StObject.set(x, "trim-sd", js.undefined)
    
    @scala.inline
    def `setTrim-tol`(value: ImgixParamType): Self = StObject.set(x, "trim-tol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setTrim-tolUndefined`: Self = StObject.set(x, "trim-tol", js.undefined)
    
    @scala.inline
    def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
  }
}
