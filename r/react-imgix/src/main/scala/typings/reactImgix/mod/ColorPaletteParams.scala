package typings.reactImgix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorPaletteParams extends js.Object {
  
  var colors: js.UndefOr[ImgixParamType] = js.native
  
  var palette: js.UndefOr[ImgixParamType] = js.native
  
  var prefix: js.UndefOr[ImgixParamType] = js.native
}
object ColorPaletteParams {
  
  @scala.inline
  def apply(): ColorPaletteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPaletteParams]
  }
  
  @scala.inline
  implicit class ColorPaletteParamsOps[Self <: ColorPaletteParams] (val x: Self) extends AnyVal {
    
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
    def setColors(value: ImgixParamType): Self = this.set("colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    
    @scala.inline
    def setPalette(value: ImgixParamType): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setPrefix(value: ImgixParamType): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
