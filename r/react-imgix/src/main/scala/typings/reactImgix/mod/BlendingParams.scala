package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlendingParams extends js.Object {
  
  var blend: js.UndefOr[ImgixParamType] = js.native
  
  var `blend-align`: js.UndefOr[ImgixParamType] = js.native
  
  var `blend-alpha`: js.UndefOr[ImgixParamType] = js.native
  
  var `blend-crop`: js.UndefOr[ImgixParamType] = js.native
  
  var `blend-fit`: js.UndefOr[ImgixParamType] = js.native
  
  var `blend-mode`: js.UndefOr[ImgixParamType] = js.native
  
  var `blend-pad`: js.UndefOr[ImgixParamType] = js.native
  
  var `blend-size`: js.UndefOr[ImgixParamType] = js.native
  
  var `blend-x`: js.UndefOr[ImgixParamType] = js.native
  
  var `blend-y`: js.UndefOr[ImgixParamType] = js.native
}
object BlendingParams {
  
  @scala.inline
  def apply(): BlendingParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlendingParams]
  }
  
  @scala.inline
  implicit class BlendingParamsOps[Self <: BlendingParams] (val x: Self) extends AnyVal {
    
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
    def setBlend(value: ImgixParamType): Self = this.set("blend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlend: Self = this.set("blend", js.undefined)
    
    @scala.inline
    def `setBlend-align`(value: ImgixParamType): Self = this.set("blend-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBlend-align`: Self = this.set("blend-align", js.undefined)
    
    @scala.inline
    def `setBlend-alpha`(value: ImgixParamType): Self = this.set("blend-alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBlend-alpha`: Self = this.set("blend-alpha", js.undefined)
    
    @scala.inline
    def `setBlend-crop`(value: ImgixParamType): Self = this.set("blend-crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBlend-crop`: Self = this.set("blend-crop", js.undefined)
    
    @scala.inline
    def `setBlend-fit`(value: ImgixParamType): Self = this.set("blend-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBlend-fit`: Self = this.set("blend-fit", js.undefined)
    
    @scala.inline
    def `setBlend-mode`(value: ImgixParamType): Self = this.set("blend-mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBlend-mode`: Self = this.set("blend-mode", js.undefined)
    
    @scala.inline
    def `setBlend-pad`(value: ImgixParamType): Self = this.set("blend-pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBlend-pad`: Self = this.set("blend-pad", js.undefined)
    
    @scala.inline
    def `setBlend-size`(value: ImgixParamType): Self = this.set("blend-size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBlend-size`: Self = this.set("blend-size", js.undefined)
    
    @scala.inline
    def `setBlend-x`(value: ImgixParamType): Self = this.set("blend-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBlend-x`: Self = this.set("blend-x", js.undefined)
    
    @scala.inline
    def `setBlend-y`(value: ImgixParamType): Self = this.set("blend-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBlend-y`: Self = this.set("blend-y", js.undefined)
  }
}
