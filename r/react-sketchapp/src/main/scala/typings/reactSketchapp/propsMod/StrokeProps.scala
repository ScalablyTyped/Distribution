package typings.reactSketchapp.propsMod

import typings.reactSketchapp.reactSketchappStrings.bevel
import typings.reactSketchapp.reactSketchappStrings.butt
import typings.reactSketchapp.reactSketchappStrings.miter
import typings.reactSketchapp.reactSketchappStrings.round
import typings.reactSketchapp.reactSketchappStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StrokeProps extends StObject {
  
  var stroke: js.UndefOr[String] = js.undefined
  
  var strokeDasharray: js.UndefOr[NumberArrayProp] = js.undefined
  
  var strokeDashoffset: js.UndefOr[NumberProp] = js.undefined
  
  var strokeLinecap: js.UndefOr[butt | square | round] = js.undefined
  
  var strokeLinejoin: js.UndefOr[miter | bevel | round] = js.undefined
  
  var strokeMiterlimit: js.UndefOr[NumberProp] = js.undefined
  
  var strokeOpacity: js.UndefOr[NumberProp] = js.undefined
  
  var strokeWidth: js.UndefOr[NumberProp] = js.undefined
}
object StrokeProps {
  
  inline def apply(): StrokeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrokeProps]
  }
  
  extension [Self <: StrokeProps](x: Self) {
    
    inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharray(value: NumberArrayProp): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    inline def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    inline def setStrokeDasharrayVarargs(value: NumberProp*): Self = StObject.set(x, "strokeDasharray", js.Array(value :_*))
    
    inline def setStrokeDashoffset(value: NumberProp): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    inline def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    inline def setStrokeLinecap(value: butt | square | round): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    inline def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    inline def setStrokeLinejoin(value: miter | bevel | round): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    inline def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    inline def setStrokeMiterlimit(value: NumberProp): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
    
    inline def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
    
    inline def setStrokeOpacity(value: NumberProp): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    inline def setStrokeWidth(value: NumberProp): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
