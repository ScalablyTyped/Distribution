package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatParams extends js.Object {
  
  var ch: js.UndefOr[ImgixParamType] = js.native
  
  var chromasub: js.UndefOr[ImgixParamType] = js.native
  
  var colorquant: js.UndefOr[ImgixParamType] = js.native
  
  var cs: js.UndefOr[ImgixParamType] = js.native
  
  var dl: js.UndefOr[ImgixParamType] = js.native
  
  var dpi: js.UndefOr[ImgixParamType] = js.native
  
  var fm: js.UndefOr[ImgixParamType] = js.native
  
  var lossless: js.UndefOr[ImgixParamType] = js.native
  
  var q: js.UndefOr[ImgixParamType] = js.native
}
object FormatParams {
  
  @scala.inline
  def apply(): FormatParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatParams]
  }
  
  @scala.inline
  implicit class FormatParamsOps[Self <: FormatParams] (val x: Self) extends AnyVal {
    
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
    def setCh(value: ImgixParamType): Self = this.set("ch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCh: Self = this.set("ch", js.undefined)
    
    @scala.inline
    def setChromasub(value: ImgixParamType): Self = this.set("chromasub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChromasub: Self = this.set("chromasub", js.undefined)
    
    @scala.inline
    def setColorquant(value: ImgixParamType): Self = this.set("colorquant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorquant: Self = this.set("colorquant", js.undefined)
    
    @scala.inline
    def setCs(value: ImgixParamType): Self = this.set("cs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCs: Self = this.set("cs", js.undefined)
    
    @scala.inline
    def setDl(value: ImgixParamType): Self = this.set("dl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDl: Self = this.set("dl", js.undefined)
    
    @scala.inline
    def setDpi(value: ImgixParamType): Self = this.set("dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDpi: Self = this.set("dpi", js.undefined)
    
    @scala.inline
    def setFm(value: ImgixParamType): Self = this.set("fm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFm: Self = this.set("fm", js.undefined)
    
    @scala.inline
    def setLossless(value: ImgixParamType): Self = this.set("lossless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLossless: Self = this.set("lossless", js.undefined)
    
    @scala.inline
    def setQ(value: ImgixParamType): Self = this.set("q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ: Self = this.set("q", js.undefined)
  }
}
