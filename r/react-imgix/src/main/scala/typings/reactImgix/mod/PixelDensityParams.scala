package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PixelDensityParams extends StObject {
  
  var dpr: js.UndefOr[ImgixParamType] = js.undefined
}
object PixelDensityParams {
  
  @scala.inline
  def apply(): PixelDensityParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PixelDensityParams]
  }
  
  @scala.inline
  implicit class PixelDensityParamsMutableBuilder[Self <: PixelDensityParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDpr(value: ImgixParamType): Self = StObject.set(x, "dpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDprUndefined: Self = StObject.set(x, "dpr", js.undefined)
  }
}
