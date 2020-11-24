package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BorderAndPaddingParams extends js.Object {
  
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
  implicit class BorderAndPaddingParamsOps[Self <: BorderAndPaddingParams] (val x: Self) extends AnyVal {
    
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
    def setBorder(value: ImgixParamType): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def `setBorder-radius`(value: ImgixParamType): Self = this.set("border-radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBorder-radius`: Self = this.set("border-radius", js.undefined)
    
    @scala.inline
    def `setBorder-radius-inner`(value: ImgixParamType): Self = this.set("border-radius-inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteBorder-radius-inner`: Self = this.set("border-radius-inner", js.undefined)
    
    @scala.inline
    def setPad(value: ImgixParamType): Self = this.set("pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
  }
}
