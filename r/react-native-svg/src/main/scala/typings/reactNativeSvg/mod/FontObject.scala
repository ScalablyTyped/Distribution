package typings.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontObject extends js.Object {
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontFeatureSettings: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[NumberProp] = js.native
  
  var fontStretch: js.UndefOr[FontStretch] = js.native
  
  var fontStyle: js.UndefOr[FontStyle] = js.native
  
  var fontVariant: js.UndefOr[FontVariant] = js.native
  
  var fontVariantLigatures: js.UndefOr[FontVariantLigatures] = js.native
  
  var fontVariationSettings: js.UndefOr[String] = js.native
  
  var fontWeight: js.UndefOr[FontWeight] = js.native
  
  var kerning: js.UndefOr[NumberProp] = js.native
  
  var letterSpacing: js.UndefOr[NumberProp] = js.native
  
  var textAnchor: js.UndefOr[TextAnchor] = js.native
  
  var textDecoration: js.UndefOr[TextDecoration] = js.native
  
  var wordSpacing: js.UndefOr[NumberProp] = js.native
}
object FontObject {
  
  @scala.inline
  def apply(): FontObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontObject]
  }
  
  @scala.inline
  implicit class FontObjectOps[Self <: FontObject] (val x: Self) extends AnyVal {
    
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
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontFeatureSettings(value: String): Self = this.set("fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFeatureSettings: Self = this.set("fontFeatureSettings", js.undefined)
    
    @scala.inline
    def setFontSize(value: NumberProp): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
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
    def setFontVariationSettings(value: String): Self = this.set("fontVariationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariationSettings: Self = this.set("fontVariationSettings", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setKerning(value: NumberProp): Self = this.set("kerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKerning: Self = this.set("kerning", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: NumberProp): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
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
    def setWordSpacing(value: NumberProp): Self = this.set("wordSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordSpacing: Self = this.set("wordSpacing", js.undefined)
  }
}
