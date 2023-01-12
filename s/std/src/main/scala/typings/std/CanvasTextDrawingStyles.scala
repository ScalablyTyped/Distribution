package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasTextDrawingStyles extends StObject {
  
  /* standard dom */
  var direction: CanvasDirection
  
  /* standard dom */
  var font: java.lang.String
  
  /* standard dom */
  var fontKerning: CanvasFontKerning
  
  /* standard dom */
  var textAlign: CanvasTextAlign
  
  /* standard dom */
  var textBaseline: CanvasTextBaseline
}
object CanvasTextDrawingStyles {
  
  inline def apply(
    direction: CanvasDirection,
    font: java.lang.String,
    fontKerning: CanvasFontKerning,
    textAlign: CanvasTextAlign,
    textBaseline: CanvasTextBaseline
  ): CanvasTextDrawingStyles = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontKerning = fontKerning.asInstanceOf[js.Any], textAlign = textAlign.asInstanceOf[js.Any], textBaseline = textBaseline.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTextDrawingStyles]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasTextDrawingStyles] (val x: Self) extends AnyVal {
    
    inline def setDirection(value: CanvasDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setFont(value: java.lang.String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontKerning(value: CanvasFontKerning): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
    
    inline def setTextAlign(value: CanvasTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextBaseline(value: CanvasTextBaseline): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
  }
}
