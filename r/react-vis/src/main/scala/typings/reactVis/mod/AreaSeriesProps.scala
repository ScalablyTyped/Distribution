package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaSeriesProps
  extends StObject
     with AbstractSeriesProps[AreaSeriesPoint] {
  
  var curve: js.UndefOr[String | (js.Function1[/* x */ Any, Any])] = js.undefined
  
  // default: null
  var getNull: js.UndefOr[RVGetNull[AreaSeriesPoint]] = js.undefined
}
object AreaSeriesProps {
  
  inline def apply(): AreaSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AreaSeriesProps]
  }
  
  extension [Self <: AreaSeriesProps](x: Self) {
    
    inline def setCurve(value: String | (js.Function1[/* x */ Any, Any])): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveFunction1(value: /* x */ Any => Any): Self = StObject.set(x, "curve", js.Any.fromFunction1(value))
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setGetNull(value: AreaSeriesPoint => Any): Self = StObject.set(x, "getNull", js.Any.fromFunction1(value))
    
    inline def setGetNullUndefined: Self = StObject.set(x, "getNull", js.undefined)
  }
}
