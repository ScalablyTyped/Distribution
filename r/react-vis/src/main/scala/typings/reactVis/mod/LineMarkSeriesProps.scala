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
  
  var curve: js.UndefOr[String | (js.Function1[/* x */ js.Any, js.Any])] = js.undefined
  
  // default: null
  var getNull: js.UndefOr[RVGetNull[LineMarkSeriesPoint]] = js.undefined
  
  var lineStyle: js.UndefOr[CSSProperties] = js.undefined
  
  // default: {}
  var markStyle: js.UndefOr[CSSProperties] = js.undefined
  
  // default: {}
  var strokeStyle: js.UndefOr[dashed | solid] = js.undefined
}
object LineMarkSeriesProps {
  
  inline def apply(): LineMarkSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineMarkSeriesProps]
  }
  
  extension [Self <: LineMarkSeriesProps](x: Self) {
    
    inline def setCurve(value: String | (js.Function1[/* x */ js.Any, js.Any])): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveFunction1(value: /* x */ js.Any => js.Any): Self = StObject.set(x, "curve", js.Any.fromFunction1(value))
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setGetNull(value: LineMarkSeriesPoint => js.Any): Self = StObject.set(x, "getNull", js.Any.fromFunction1(value))
    
    inline def setGetNullUndefined: Self = StObject.set(x, "getNull", js.undefined)
    
    inline def setLineStyle(value: CSSProperties): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
    
    inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
    
    inline def setMarkStyle(value: CSSProperties): Self = StObject.set(x, "markStyle", value.asInstanceOf[js.Any])
    
    inline def setMarkStyleUndefined: Self = StObject.set(x, "markStyle", js.undefined)
    
    inline def setStrokeStyle(value: dashed | solid): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
  }
}
