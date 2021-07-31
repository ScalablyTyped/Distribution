package typings.reactSketchapp.mod

import typings.reactSketchapp.anon.Width
import typings.reactSketchapp.reactSketchappStrings.`line-through`
import typings.reactSketchapp.reactSketchappStrings.auto
import typings.reactSketchapp.reactSketchappStrings.center
import typings.reactSketchapp.reactSketchappStrings.double
import typings.reactSketchapp.reactSketchappStrings.italic
import typings.reactSketchapp.reactSketchappStrings.justify
import typings.reactSketchapp.reactSketchappStrings.left
import typings.reactSketchapp.reactSketchappStrings.ltr
import typings.reactSketchapp.reactSketchappStrings.none
import typings.reactSketchapp.reactSketchappStrings.normal
import typings.reactSketchapp.reactSketchappStrings.right
import typings.reactSketchapp.reactSketchappStrings.rtl
import typings.reactSketchapp.reactSketchappStrings.underline
import typings.reactSketchapp.typesMod.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyle
  extends StObject
     with Style {
  
  var color: js.UndefOr[Color] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[normal | italic] = js.undefined
  
  var fontWeight: js.UndefOr[String] = js.undefined
  
  var letterSpacing: js.UndefOr[Double] = js.undefined
  
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  var textAlign: js.UndefOr[auto | left | right | center | justify] = js.undefined
  
  var textDecorationLine: js.UndefOr[none | underline | double | `line-through`] = js.undefined
  
  var textShadowColor: js.UndefOr[Color] = js.undefined
  
  var textShadowOffset: js.UndefOr[Width] = js.undefined
  
  var textShadowRadius: js.UndefOr[Double] = js.undefined
  
  var writingDirection: js.UndefOr[auto | ltr | rtl] = js.undefined
}
object TextStyle {
  
  @scala.inline
  def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  
  @scala.inline
  implicit class TextStyleMutableBuilder[Self <: TextStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    @scala.inline
    def setFontStyle(value: normal | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    @scala.inline
    def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    @scala.inline
    def setTextAlign(value: auto | left | right | center | justify): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextDecorationLine(value: none | underline | double | `line-through`): Self = StObject.set(x, "textDecorationLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextDecorationLineUndefined: Self = StObject.set(x, "textDecorationLine", js.undefined)
    
    @scala.inline
    def setTextShadowColor(value: Color): Self = StObject.set(x, "textShadowColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowColorUndefined: Self = StObject.set(x, "textShadowColor", js.undefined)
    
    @scala.inline
    def setTextShadowOffset(value: Width): Self = StObject.set(x, "textShadowOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowOffsetUndefined: Self = StObject.set(x, "textShadowOffset", js.undefined)
    
    @scala.inline
    def setTextShadowRadius(value: Double): Self = StObject.set(x, "textShadowRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextShadowRadiusUndefined: Self = StObject.set(x, "textShadowRadius", js.undefined)
    
    @scala.inline
    def setWritingDirection(value: auto | ltr | rtl): Self = StObject.set(x, "writingDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingDirectionUndefined: Self = StObject.set(x, "writingDirection", js.undefined)
  }
}
