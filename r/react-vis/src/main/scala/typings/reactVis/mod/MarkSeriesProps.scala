package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarkSeriesProps
  extends StObject
     with AbstractSeriesProps[MarkSeriesPoint] {
  
  var getNull: js.UndefOr[RVGetNull[MarkSeriesPoint]] = js.undefined
  
  var strokeWidth: js.UndefOr[Double] = js.undefined
}
object MarkSeriesProps {
  
  inline def apply(): MarkSeriesProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkSeriesProps]
  }
  
  extension [Self <: MarkSeriesProps](x: Self) {
    
    inline def setGetNull(value: MarkSeriesPoint => Any): Self = StObject.set(x, "getNull", js.Any.fromFunction1(value))
    
    inline def setGetNullUndefined: Self = StObject.set(x, "getNull", js.undefined)
    
    inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
  }
}
