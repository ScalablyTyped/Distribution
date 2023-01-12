package typings.reactVis.mod

import typings.reactVis.reactVisStrings.dashed
import typings.reactVis.reactVisStrings.solid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineSeriesProps
  extends StObject
     with AbstractSeriesProps[LineSeriesPoint] {
  
  // default: 'solid'
  var curve: js.UndefOr[String | (js.Function1[/* x */ Any, Any])] = js.undefined
  
  // default: null
  var getNull: js.UndefOr[RVGetNull[LineSeriesPoint]] = js.undefined
  
  var strokeStyle: js.UndefOr[dashed | solid] = js.undefined
}
object LineSeriesProps {
  
  inline def apply(): LineSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSeriesProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineSeriesProps] (val x: Self) extends AnyVal {
    
    inline def setCurve(value: String | (js.Function1[/* x */ Any, Any])): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveFunction1(value: /* x */ Any => Any): Self = StObject.set(x, "curve", js.Any.fromFunction1(value))
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setGetNull(value: LineSeriesPoint => Any): Self = StObject.set(x, "getNull", js.Any.fromFunction1(value))
    
    inline def setGetNullUndefined: Self = StObject.set(x, "getNull", js.undefined)
    
    inline def setStrokeStyle(value: dashed | solid): Self = StObject.set(x, "strokeStyle", value.asInstanceOf[js.Any])
    
    inline def setStrokeStyleUndefined: Self = StObject.set(x, "strokeStyle", js.undefined)
  }
}
