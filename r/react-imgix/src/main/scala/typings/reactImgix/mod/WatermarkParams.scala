package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatermarkParams extends js.Object {
  
  var mark: js.UndefOr[ImgixParamType] = js.native
  
  var `mark-align`: js.UndefOr[ImgixParamType] = js.native
  
  var `mark-alpha`: js.UndefOr[ImgixParamType] = js.native
  
  var `mark-base`: js.UndefOr[ImgixParamType] = js.native
  
  var `mark-fit`: js.UndefOr[ImgixParamType] = js.native
  
  var `mark-h`: js.UndefOr[ImgixParamType] = js.native
  
  var `mark-pad`: js.UndefOr[ImgixParamType] = js.native
  
  var `mark-scale`: js.UndefOr[ImgixParamType] = js.native
  
  var `mark-w`: js.UndefOr[ImgixParamType] = js.native
  
  var `mark-x`: js.UndefOr[ImgixParamType] = js.native
  
  var `mark-y`: js.UndefOr[ImgixParamType] = js.native
}
object WatermarkParams {
  
  @scala.inline
  def apply(): WatermarkParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatermarkParams]
  }
  
  @scala.inline
  implicit class WatermarkParamsOps[Self <: WatermarkParams] (val x: Self) extends AnyVal {
    
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
    def setMark(value: ImgixParamType): Self = this.set("mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMark: Self = this.set("mark", js.undefined)
    
    @scala.inline
    def `setMark-align`(value: ImgixParamType): Self = this.set("mark-align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMark-align`: Self = this.set("mark-align", js.undefined)
    
    @scala.inline
    def `setMark-alpha`(value: ImgixParamType): Self = this.set("mark-alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMark-alpha`: Self = this.set("mark-alpha", js.undefined)
    
    @scala.inline
    def `setMark-base`(value: ImgixParamType): Self = this.set("mark-base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMark-base`: Self = this.set("mark-base", js.undefined)
    
    @scala.inline
    def `setMark-fit`(value: ImgixParamType): Self = this.set("mark-fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMark-fit`: Self = this.set("mark-fit", js.undefined)
    
    @scala.inline
    def `setMark-h`(value: ImgixParamType): Self = this.set("mark-h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMark-h`: Self = this.set("mark-h", js.undefined)
    
    @scala.inline
    def `setMark-pad`(value: ImgixParamType): Self = this.set("mark-pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMark-pad`: Self = this.set("mark-pad", js.undefined)
    
    @scala.inline
    def `setMark-scale`(value: ImgixParamType): Self = this.set("mark-scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMark-scale`: Self = this.set("mark-scale", js.undefined)
    
    @scala.inline
    def `setMark-w`(value: ImgixParamType): Self = this.set("mark-w", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMark-w`: Self = this.set("mark-w", js.undefined)
    
    @scala.inline
    def `setMark-x`(value: ImgixParamType): Self = this.set("mark-x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMark-x`: Self = this.set("mark-x", js.undefined)
    
    @scala.inline
    def `setMark-y`(value: ImgixParamType): Self = this.set("mark-y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMark-y`: Self = this.set("mark-y", js.undefined)
  }
}
