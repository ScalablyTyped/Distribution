package typings.reactImgix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorPaletteParams extends StObject {
  
  var colors: js.UndefOr[ImgixParamType] = js.undefined
  
  var palette: js.UndefOr[ImgixParamType] = js.undefined
  
  var prefix: js.UndefOr[ImgixParamType] = js.undefined
}
object ColorPaletteParams {
  
  @scala.inline
  def apply(): ColorPaletteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorPaletteParams]
  }
  
  @scala.inline
  implicit class ColorPaletteParamsMutableBuilder[Self <: ColorPaletteParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColors(value: ImgixParamType): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    @scala.inline
    def setPalette(value: ImgixParamType): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    @scala.inline
    def setPrefix(value: ImgixParamType): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
