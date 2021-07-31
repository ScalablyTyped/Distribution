package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FillParams extends StObject {
  
  var bg: js.UndefOr[ImgixParamType] = js.undefined
  
  var fill: js.UndefOr[ImgixParamType] = js.undefined
  
  var `fill-color`: js.UndefOr[ImgixParamType] = js.undefined
}
object FillParams {
  
  @scala.inline
  def apply(): FillParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillParams]
  }
  
  @scala.inline
  implicit class FillParamsMutableBuilder[Self <: FillParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBg(value: ImgixParamType): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
    
    @scala.inline
    def setFill(value: ImgixParamType): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-color`(value: ImgixParamType): Self = StObject.set(x, "fill-color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFill-colorUndefined`: Self = StObject.set(x, "fill-color", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
