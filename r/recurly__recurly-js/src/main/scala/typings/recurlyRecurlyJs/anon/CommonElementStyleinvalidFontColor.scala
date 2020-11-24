package typings.recurlyRecurlyJs.anon

import typings.recurlyRecurlyJs.elementsMod.CommonElementStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @recurly/recurly-js.@recurly/recurly-js/lib/elements.CommonElementStyle & {  invalid :@recurly/recurly-js.@recurly/recurly-js/lib/elements.CommonElementStyle | undefined,   padding :string | undefined,   placeholder :{  color :string | undefined,   content :string | undefined} | undefined} */
@js.native
trait CommonElementStyleinvalidFontColor extends js.Object {
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/color|color}
    */
  var fontColor: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-family|font-family}
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-feature-settings|feature-settings}
    */
  var fontFeatureSettings: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-kerning|font-kerning}
    */
  var fontKerning: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-size|font-size}
    */
  var fontSize: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-smoothing|font-smoothing}
    */
  var fontSmooth: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-stretch|font-stretch}
    */
  var fontStretch: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-style|font-style}
    */
  var fontStyle: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-variant|font-variant}
    */
  var fontVariant: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight|font-weight}
    */
  var fontWeight: js.UndefOr[String] = js.native
  
  /**
    * Style to apply to input elements when they contain an invalid value.
    *
    * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#styling-the-individual-card-elements|Styling the invididual card elements}
    */
  var invalid: js.UndefOr[CommonElementStyle] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing|letter-spacing}
    */
  var letterSpacing: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/line-height|line-height}
    */
  var lineHeight: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/padding}
    */
  var padding: js.UndefOr[String] = js.native
  
  var placeholder: js.UndefOr[Color] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/text-align|text-align}
    */
  var textAlign: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/text-decoration|text-decoration}
    */
  var textDecoration: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/text-rendering|text-rendering}
    */
  var textRendering: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/text-shadow|text-shadow}
    */
  var textShadow: js.UndefOr[String] = js.native
  
  /**
    * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/text-transform|text-transform}
    */
  var textTransform: js.UndefOr[String] = js.native
}
object CommonElementStyleinvalidFontColor {
  
  @scala.inline
  def apply(): CommonElementStyleinvalidFontColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonElementStyleinvalidFontColor]
  }
  
  @scala.inline
  implicit class CommonElementStyleinvalidFontColorOps[Self <: CommonElementStyleinvalidFontColor] (val x: Self) extends AnyVal {
    
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
    def setFontColor(value: String): Self = this.set("fontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontColor: Self = this.set("fontColor", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontFeatureSettings(value: String): Self = this.set("fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFeatureSettings: Self = this.set("fontFeatureSettings", js.undefined)
    
    @scala.inline
    def setFontKerning(value: String): Self = this.set("fontKerning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontKerning: Self = this.set("fontKerning", js.undefined)
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontSmooth(value: String): Self = this.set("fontSmooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSmooth: Self = this.set("fontSmooth", js.undefined)
    
    @scala.inline
    def setFontStretch(value: String): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStretch: Self = this.set("fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: String): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: String): Self = this.set("fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontVariant: Self = this.set("fontVariant", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setInvalid(value: CommonElementStyle): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalid: Self = this.set("invalid", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: String): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLineHeight(value: String): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: Color): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    
    @scala.inline
    def setTextRendering(value: String): Self = this.set("textRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextRendering: Self = this.set("textRendering", js.undefined)
    
    @scala.inline
    def setTextShadow(value: String): Self = this.set("textShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadow: Self = this.set("textShadow", js.undefined)
    
    @scala.inline
    def setTextTransform(value: String): Self = this.set("textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextTransform: Self = this.set("textTransform", js.undefined)
  }
}
