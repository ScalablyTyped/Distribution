package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.PlotDatum
import typings.plotlyJs.mod.SelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.PlotSelectionEvent> */
trait ReadonlyPlotSelectionEven extends StObject {
  
  val lassoPoints: js.UndefOr[SelectionRange] = js.undefined
  
  val points: js.Array[PlotDatum]
  
  val range: js.UndefOr[SelectionRange] = js.undefined
}
object ReadonlyPlotSelectionEven {
  
  inline def apply(points: js.Array[PlotDatum]): ReadonlyPlotSelectionEven = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPlotSelectionEven]
  }
  
  extension [Self <: ReadonlyPlotSelectionEven](x: Self) {
    
    inline def setLassoPoints(value: SelectionRange): Self = StObject.set(x, "lassoPoints", value.asInstanceOf[js.Any])
    
    inline def setLassoPointsUndefined: Self = StObject.set(x, "lassoPoints", js.undefined)
    
    inline def setPoints(value: js.Array[PlotDatum]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: PlotDatum*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setRange(value: SelectionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
