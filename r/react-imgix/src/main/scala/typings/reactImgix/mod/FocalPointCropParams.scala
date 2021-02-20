package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocalPointCropParams extends StObject {
  
  var `fp-debug`: js.UndefOr[ImgixParamType] = js.native
  
  var `fp-x`: js.UndefOr[ImgixParamType] = js.native
  
  var `fp-y`: js.UndefOr[ImgixParamType] = js.native
  
  var `fp-z`: js.UndefOr[ImgixParamType] = js.native
}
object FocalPointCropParams {
  
  @scala.inline
  def apply(): FocalPointCropParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FocalPointCropParams]
  }
  
  @scala.inline
  implicit class FocalPointCropParamsMutableBuilder[Self <: FocalPointCropParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def `setFp-debug`(value: ImgixParamType): Self = StObject.set(x, "fp-debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFp-debugUndefined`: Self = StObject.set(x, "fp-debug", js.undefined)
    
    @scala.inline
    def `setFp-x`(value: ImgixParamType): Self = StObject.set(x, "fp-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFp-xUndefined`: Self = StObject.set(x, "fp-x", js.undefined)
    
    @scala.inline
    def `setFp-y`(value: ImgixParamType): Self = StObject.set(x, "fp-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFp-yUndefined`: Self = StObject.set(x, "fp-y", js.undefined)
    
    @scala.inline
    def `setFp-z`(value: ImgixParamType): Self = StObject.set(x, "fp-z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setFp-zUndefined`: Self = StObject.set(x, "fp-z", js.undefined)
  }
}
