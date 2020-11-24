package typings.reactSketchapp.propsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontProps extends js.Object {
  
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
  implicit class FontPropsOps[Self <: FontProps] (val x: Self) extends AnyVal {
    
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
    def setFont(value: Font): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontFamily(value: FontFamily): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: fontSize): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStretch(value: FontStretch): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: FontVariant): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setFontVariantLigatures(value: FontVariantLigatures): Self = this.set("fontVariantLigatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariantLigatures: Self = this.set("fontVariantLigatures", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setKerning(value: Kerning): Self = this.set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: LetterSpacing): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: TextAnchor): Self = this.set("textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAnchor: Self = this.set("textAnchor", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: TextDecoration): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    
    @scala.inline
    def setWordSpacing(value: WordSpacing): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
  }
}
