package typings.reactSketchapp.propsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontProps extends StObject {
  
  var font: js.UndefOr[Font] = js.native
  
  var fontFamily: js.UndefOr[FontFamily] = js.native
  
  var fontSize: js.UndefOr[typings.reactSketchapp.propsMod.fontSize] = js.native
  
  var fontStretch: js.UndefOr[FontStretch] = js.native
  
  var fontStyle: js.UndefOr[FontStyle] = js.native
  
  var fontVariant: js.UndefOr[FontVariant] = js.native
  
  var fontVariantLigatures: js.UndefOr[FontVariantLigatures] = js.native
  
  var fontWeight: js.UndefOr[FontWeight] = js.native
  
  var kerning: js.UndefOr[Kerning] = js.native
  
  var letterSpacing: js.UndefOr[LetterSpacing] = js.native
  
  var textAnchor: js.UndefOr[TextAnchor] = js.native
  
  var textDecoration: js.UndefOr[TextDecoration] = js.native
  
  var wordSpacing: js.UndefOr[WordSpacing] = js.native
}
object FontProps {
  
  @scala.inline
  def apply(): FontProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontProps]
  }
  
  @scala.inline
  implicit class FontPropsMutableBuilder[Self <: FontProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: Font): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamily(value: FontFamily): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: fontSize): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStretch(value: FontStretch): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setFontVariant(value: FontVariant): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantLigatures(value: FontVariantLigatures): Self = StObject.set(x, "fontVariantLigatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantLigaturesUndefined: Self = StObject.set(x, "fontVariantLigatures", js.undefined)
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setKerning(value: Kerning): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKerningUndefined: Self = StObject.set(x, "kerning", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: LetterSpacing): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: TextAnchor): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: TextDecoration): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: WordSpacing): Self = StObject.set(x, "wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordSpacingUndefined: Self = StObject.set(x, "wordSpacing", js.undefined)
  }
}
