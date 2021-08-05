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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextStyle extends StObject {
  
  var color: js.UndefOr[Color] = js.undefined
  
  var fontFamily: js.UndefOr[String] = js.undefined
  
  var fontSize: js.UndefOr[Double] = js.undefined
  
  var fontStyle: js.UndefOr[normal | italic] = js.undefined
  
  var fontWeight: js.UndefOr[String] = js.undefined
  
  var letterSpacing: js.UndefOr[Double] = js.undefined
  
  var lineHeight: js.UndefOr[Double] = js.undefined
  
  var paragraphSpacing: js.UndefOr[Double] = js.undefined
  
  var textAlign: js.UndefOr[auto | left | right | center | justify] = js.undefined
  
  var textDecoration: js.UndefOr[String] = js.undefined
  
  var textShadowColor: js.UndefOr[Color] = js.undefined
  
  var textShadowOffset: js.UndefOr[Width] = js.undefined
  
  var textShadowOpacity: js.UndefOr[Double] = js.undefined
  
  var textShadowRadius: js.UndefOr[Double] = js.undefined
  
  var textShadowSpread: js.UndefOr[Double] = js.undefined
  
  var textTransform: js.UndefOr[uppercase | lowercase] = js.undefined
  
  var writingDirection: js.UndefOr[auto | ltr | rtl] = js.undefined
}
object TextStyle {
  
  inline def apply(): TextStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextStyle]
  }
  
  extension [Self <: TextStyle](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
    
    inline def setFontStyle(value: normal | italic): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
    
    inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
    
    inline def setParagraphSpacing(value: Double): Self = StObject.set(x, "paragraphSpacing", value.asInstanceOf[js.Any])
    
    inline def setParagraphSpacingUndefined: Self = StObject.set(x, "paragraphSpacing", js.undefined)
    
    inline def setTextAlign(value: auto | left | right | center | justify): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
    
    inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    
    inline def setTextShadowColor(value: Color): Self = StObject.set(x, "textShadowColor", value.asInstanceOf[js.Any])
    
    inline def setTextShadowColorUndefined: Self = StObject.set(x, "textShadowColor", js.undefined)
    
    inline def setTextShadowOffset(value: Width): Self = StObject.set(x, "textShadowOffset", value.asInstanceOf[js.Any])
    
    inline def setTextShadowOffsetUndefined: Self = StObject.set(x, "textShadowOffset", js.undefined)
    
    inline def setTextShadowOpacity(value: Double): Self = StObject.set(x, "textShadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setTextShadowOpacityUndefined: Self = StObject.set(x, "textShadowOpacity", js.undefined)
    
    inline def setTextShadowRadius(value: Double): Self = StObject.set(x, "textShadowRadius", value.asInstanceOf[js.Any])
    
    inline def setTextShadowRadiusUndefined: Self = StObject.set(x, "textShadowRadius", js.undefined)
    
    inline def setTextShadowSpread(value: Double): Self = StObject.set(x, "textShadowSpread", value.asInstanceOf[js.Any])
    
    inline def setTextShadowSpreadUndefined: Self = StObject.set(x, "textShadowSpread", js.undefined)
    
    inline def setTextTransform(value: uppercase | lowercase): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
    
    inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    
    inline def setWritingDirection(value: auto | ltr | rtl): Self = StObject.set(x, "writingDirection", value.asInstanceOf[js.Any])
    
    inline def setWritingDirectionUndefined: Self = StObject.set(x, "writingDirection", js.undefined)
  }
}
