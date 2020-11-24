package typings.reactSketchapp.typesMod

import typings.reactSketchapp.anon.Width
import typings.reactSketchapp.reactSketchappStrings.auto
import typings.reactSketchapp.reactSketchappStrings.center
import typings.reactSketchapp.reactSketchappStrings.italic
import typings.reactSketchapp.reactSketchappStrings.justify
import typings.reactSketchapp.reactSketchappStrings.left
import typings.reactSketchapp.reactSketchappStrings.lowercase
import typings.reactSketchapp.reactSketchappStrings.ltr
import typings.reactSketchapp.reactSketchappStrings.normal
import typings.reactSketchapp.reactSketchappStrings.right
import typings.reactSketchapp.reactSketchappStrings.rtl
import typings.reactSketchapp.reactSketchappStrings.uppercase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextStyle extends js.Object {
  
  var color: js.UndefOr[Color] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontSize: js.UndefOr[Double] = js.native
  
  var fontStyle: js.UndefOr[normal | italic] = js.native
  
  var fontWeight: js.UndefOr[String] = js.native
  
  var letterSpacing: js.UndefOr[Double] = js.native
  
  var lineHeight: js.UndefOr[Double] = js.native
  
  var paragraphSpacing: js.UndefOr[Double] = js.native
  
  var textAlign: js.UndefOr[auto | left | right | center | justify] = js.native
  
  var textDecoration: js.UndefOr[String] = js.native
  
  var textShadowColor: js.UndefOr[Color] = js.native
  
  var textShadowOffset: js.UndefOr[Width] = js.native
  
  var textShadowOpacity: js.UndefOr[Double] = js.native
  
  var textShadowRadius: js.UndefOr[Double] = js.native
  
  var textShadowSpread: js.UndefOr[Double] = js.native
  
  var textTransform: js.UndefOr[uppercase | lowercase] = js.native
  
  var writingDirection: js.UndefOr[auto | ltr | rtl] = js.native
}
object TextStyle {
  
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  
  @scala.inline
  implicit class TextStyleOps[Self <: TextStyle] (val x: Self) extends AnyVal {
    
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
    def setColor(value: Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: normal | italic): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontStyle: Self = this.set("fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = this.set("letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLetterSpacing: Self = this.set("letterSpacing", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = this.set("lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineHeight: Self = this.set("lineHeight", js.undefined)
    
    @scala.inline
    def setParagraphSpacing(value: Double): Self = this.set("paragraphSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParagraphSpacing: Self = this.set("paragraphSpacing", js.undefined)
    
    @scala.inline
    def setTextAlign(value: auto | left | right | center | justify): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
    
    @scala.inline
    def setTextShadowColor(value: Color): Self = this.set("textShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowColor: Self = this.set("textShadowColor", js.undefined)
    
    @scala.inline
    def setTextShadowOffset(value: Width): Self = this.set("textShadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowOffset: Self = this.set("textShadowOffset", js.undefined)
    
    @scala.inline
    def setTextShadowOpacity(value: Double): Self = this.set("textShadowOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowOpacity: Self = this.set("textShadowOpacity", js.undefined)
    
    @scala.inline
    def setTextShadowRadius(value: Double): Self = this.set("textShadowRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowRadius: Self = this.set("textShadowRadius", js.undefined)
    
    @scala.inline
    def setTextShadowSpread(value: Double): Self = this.set("textShadowSpread", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextShadowSpread: Self = this.set("textShadowSpread", js.undefined)
    
    @scala.inline
    def setTextTransform(value: uppercase | lowercase): Self = this.set("textTransform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextTransform: Self = this.set("textTransform", js.undefined)
    
    @scala.inline
    def setWritingDirection(value: auto | ltr | rtl): Self = this.set("writingDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWritingDirection: Self = this.set("writingDirection", js.undefined)
  }
}
