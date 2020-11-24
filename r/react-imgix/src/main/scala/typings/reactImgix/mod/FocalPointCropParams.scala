package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FocalPointCropParams extends js.Object {
  
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
  implicit class FocalPointCropParamsOps[Self <: FocalPointCropParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def `setFp-debug`(value: ImgixParamType): Self = this.set("fp-debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFp-debug`: Self = this.set("fp-debug", js.undefined)
    
    @scala.inline
    def `setFp-x`(value: ImgixParamType): Self = this.set("fp-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFp-x`: Self = this.set("fp-x", js.undefined)
    
    @scala.inline
    def `setFp-y`(value: ImgixParamType): Self = this.set("fp-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFp-y`: Self = this.set("fp-y", js.undefined)
    
    @scala.inline
    def `setFp-z`(value: ImgixParamType): Self = this.set("fp-z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteFp-z`: Self = this.set("fp-z", js.undefined)
  }
}
