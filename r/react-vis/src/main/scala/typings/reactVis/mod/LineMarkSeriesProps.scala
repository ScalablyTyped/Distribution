package typings.reactVis.mod

import typings.react.mod.CSSProperties
import typings.reactVis.reactVisStrings.dashed
import typings.reactVis.reactVisStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineMarkSeriesProps
  extends StObject
     with AbstractSeriesProps[LineMarkSeriesPoint] {
  
  var curve: js.UndefOr[String | (js.Function1[/* x */ Any, Any])] = js.undefined
  
  // default: null
  var getNull: js.UndefOr[RVGetNull[LineMarkSeriesPoint]] = js.undefined
  
  var lineStyle: js.UndefOr[CSSProperties] = js.undefined
  
  // default: {}
  var markStyle: js.UndefOr[CSSProperties] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  // default: {}
  var strokeStyle: js.UndefOr[dashed | solid] = js.undefined
  
  // default: 'solid'
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object LineMarkSeriesProps {
  
  inline def apply(): LineMarkSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineMarkSeriesProps]
  }
  
  extension [Self <: LineMarkSeriesProps](x: Self) {
    
    inline def setCurve(value: String | (js.Function1[/* x */ Any, Any])): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveFunction1(value: /* x */ Any => Any): Self = StObject.set(x, "curve", js.Any.fromFunction1(value))
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setGetNull(value: LineMarkSeriesPoint => Any): Self = StObject.set(x, "getNull", js.Any.fromFunction1(value))
    
    inline def setGetNullUndefined: Self = StObject.set(x, "getNull", js.undefined)
    
    inline def setLineStyle(value: CSSProperties): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setMarkStyle(value: CSSProperties): Self = StObject.set(x, "markStyle", value.asInstanceOf[js.Any])
    
    inline def setMarkStyleUndefined: Self = StObject.set(x, "markStyle", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStrokeStyle(value: dashed | solid): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
