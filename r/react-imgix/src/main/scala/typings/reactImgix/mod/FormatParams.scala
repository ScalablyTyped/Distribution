package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormatParams extends StObject {
  
  var ch: js.UndefOr[ImgixParamType] = js.undefined
  
  var chromasub: js.UndefOr[ImgixParamType] = js.undefined
  
  var colorquant: js.UndefOr[ImgixParamType] = js.undefined
  
  var cs: js.UndefOr[ImgixParamType] = js.undefined
  
  var dl: js.UndefOr[ImgixParamType] = js.undefined
  
  var dpi: js.UndefOr[ImgixParamType] = js.undefined
  
  var fm: js.UndefOr[ImgixParamType] = js.undefined
  
  var iptc: js.UndefOr[ImgixParamType] = js.undefined
  
  var lossless: js.UndefOr[ImgixParamType] = js.undefined
  
  var q: js.UndefOr[ImgixParamType] = js.undefined
}
object FormatParams {
  
  inline def apply(): FormatParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormatParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormatParams] (val x: Self) extends AnyVal {
    
    inline def setCh(value: ImgixParamType): Self = StObject.set(x, "ch", value.asInstanceOf[js.Any])
    
    inline def setChUndefined: Self = StObject.set(x, "ch", js.undefined)
    
    inline def setChromasub(value: ImgixParamType): Self = StObject.set(x, "chromasub", value.asInstanceOf[js.Any])
    
    inline def setChromasubUndefined: Self = StObject.set(x, "chromasub", js.undefined)
    
    inline def setColorquant(value: ImgixParamType): Self = StObject.set(x, "colorquant", value.asInstanceOf[js.Any])
    
    inline def setColorquantUndefined: Self = StObject.set(x, "colorquant", js.undefined)
    
    inline def setCs(value: ImgixParamType): Self = StObject.set(x, "cs", value.asInstanceOf[js.Any])
    
    inline def setCsUndefined: Self = StObject.set(x, "cs", js.undefined)
    
    inline def setDl(value: ImgixParamType): Self = StObject.set(x, "dl", value.asInstanceOf[js.Any])
    
    inline def setDlUndefined: Self = StObject.set(x, "dl", js.undefined)
    
    inline def setDpi(value: ImgixParamType): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    inline def setFm(value: ImgixParamType): Self = StObject.set(x, "fm", value.asInstanceOf[js.Any])
    
    inline def setFmUndefined: Self = StObject.set(x, "fm", js.undefined)
    
    inline def setIptc(value: ImgixParamType): Self = StObject.set(x, "iptc", value.asInstanceOf[js.Any])
    
    inline def setIptcUndefined: Self = StObject.set(x, "iptc", js.undefined)
    
    inline def setLossless(value: ImgixParamType): Self = StObject.set(x, "lossless", value.asInstanceOf[js.Any])
    
    inline def setLosslessUndefined: Self = StObject.set(x, "lossless", js.undefined)
    
    inline def setQ(value: ImgixParamType): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
  }
}
