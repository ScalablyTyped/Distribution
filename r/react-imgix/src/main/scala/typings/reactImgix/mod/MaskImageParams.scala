package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaskImageParams extends StObject {
  
  var `corner-radius`: js.UndefOr[ImgixParamType] = js.native
  
  var mask: js.UndefOr[ImgixParamType] = js.native
}
object MaskImageParams {
  
  @scala.inline
  def apply(): MaskImageParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaskImageParams]
  }
  
  @scala.inline
  implicit class MaskImageParamsMutableBuilder[Self <: MaskImageParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setCorner-radius`(value: ImgixParamType): Self = StObject.set(x, "corner-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setCorner-radiusUndefined`: Self = StObject.set(x, "corner-radius", js.undefined)
    
    @scala.inline
    def setMask(value: ImgixParamType): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
  }
}
