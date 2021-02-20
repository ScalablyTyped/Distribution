package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormatParams extends StObject {
  
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
  implicit class FormatParamsMutableBuilder[Self <: FormatParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCh(value: ImgixParamType): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
    
    @scala.inline
    def setChromasub(value: ImgixParamType): Self = StObject.set(x, "chromasub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChromasubUndefined: Self = StObject.set(x, "chromasub", js.undefined)
    
    @scala.inline
    def setColorquant(value: ImgixParamType): Self = StObject.set(x, "colorquant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorquantUndefined: Self = StObject.set(x, "colorquant", js.undefined)
    
    @scala.inline
    def setCs(value: ImgixParamType): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsUndefined: Self = StObject.set(x, "cs", js.undefined)
    
    @scala.inline
    def setDl(value: ImgixParamType): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDlUndefined: Self = StObject.set(x, "dl", js.undefined)
    
    @scala.inline
    def setDpi(value: ImgixParamType): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    @scala.inline
    def setFm(value: ImgixParamType): Self = StObject.set(x, "fm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFmUndefined: Self = StObject.set(x, "fm", js.undefined)
    
    @scala.inline
    def setLossless(value: ImgixParamType): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
    
    @scala.inline
    def setQ(value: ImgixParamType): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQUndefined: Self = StObject.set(x, "q", js.undefined)
  }
}
