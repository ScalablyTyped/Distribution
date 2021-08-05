package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightProps
  extends StObject
     with AbstractSeriesProps[LineMarkSeriesPoint] {
  
  var drag: js.UndefOr[Boolean] = js.undefined
  
  var enableX: js.UndefOr[Boolean] = js.undefined
  
  var enableY: js.UndefOr[Boolean] = js.undefined
  
  var highlightHeight: js.UndefOr[Double] = js.undefined
  
  var highlightWidth: js.UndefOr[Double] = js.undefined
  
  var highlightX: js.UndefOr[String | Double] = js.undefined
  
  var highlightY: js.UndefOr[String | Double] = js.undefined
  
  var onBrush: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.undefined
  
  var onBrushEnd: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.undefined
  
  var onBrushStart: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.undefined
  
  var onDrag: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.undefined
  
  var onDragStart: js.UndefOr[js.Function1[/* area */ HighlightArea | Null, Unit]] = js.undefined
}
object HighlightProps {
  
  inline def apply(): HighlightProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlightProps]
  }
  
  extension [Self <: HighlightProps](x: Self) {
    
    inline def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
    
    inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
    
    inline def setEnableX(value: Boolean): Self = StObject.set(x, "enableX", value.asInstanceOf[js.Any])
    
    inline def setEnableXUndefined: Self = StObject.set(x, "enableX", js.undefined)
    
    inline def setEnableY(value: Boolean): Self = StObject.set(x, "enableY", value.asInstanceOf[js.Any])
    
    inline def setEnableYUndefined: Self = StObject.set(x, "enableY", js.undefined)
    
    inline def setHighlightHeight(value: Double): Self = StObject.set(x, "highlightHeight", value.asInstanceOf[js.Any])
    
    inline def setHighlightHeightUndefined: Self = StObject.set(x, "highlightHeight", js.undefined)
    
    inline def setHighlightWidth(value: Double): Self = StObject.set(x, "highlightWidth", value.asInstanceOf[js.Any])
    
    inline def setHighlightWidthUndefined: Self = StObject.set(x, "highlightWidth", js.undefined)
    
    inline def setHighlightX(value: String | Double): Self = StObject.set(x, "highlightX", value.asInstanceOf[js.Any])
    
    inline def setHighlightXUndefined: Self = StObject.set(x, "highlightX", js.undefined)
    
    inline def setHighlightY(value: String | Double): Self = StObject.set(x, "highlightY", value.asInstanceOf[js.Any])
    
    inline def setHighlightYUndefined: Self = StObject.set(x, "highlightY", js.undefined)
    
    inline def setOnBrush(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onBrush", js.Any.fromFunction1(value))
    
    inline def setOnBrushEnd(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onBrushEnd", js.Any.fromFunction1(value))
    
    inline def setOnBrushEndUndefined: Self = StObject.set(x, "onBrushEnd", js.undefined)
    
    inline def setOnBrushStart(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onBrushStart", js.Any.fromFunction1(value))
    
    inline def setOnBrushStartUndefined: Self = StObject.set(x, "onBrushStart", js.undefined)
    
    inline def setOnBrushUndefined: Self = StObject.set(x, "onBrush", js.undefined)
    
    inline def setOnDrag(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
    
    inline def setOnDragEnd(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragStart(value: /* area */ HighlightArea | Null => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
  }
}
