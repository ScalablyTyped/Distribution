package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.PlotDatum
import typings.plotlyJs.mod.SelectionRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.PlotSelectionEvent> */
@js.native
trait ReadonlyPlotSelectionEven extends StObject {
  
  val lassoPoints: js.UndefOr[SelectionRange] = js.native
  
  val points: js.Array[PlotDatum] = js.native
  
  val range: js.UndefOr[SelectionRange] = js.native
}
object ReadonlyPlotSelectionEven {
  
  @scala.inline
  def apply(points: js.Array[PlotDatum]): ReadonlyPlotSelectionEven = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPlotSelectionEven]
  }
  
  @scala.inline
  implicit class ReadonlyPlotSelectionEvenMutableBuilder[Self <: ReadonlyPlotSelectionEven] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLassoPoints(value: SelectionRange): Self = StObject.set(x, "lassoPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLassoPointsUndefined: Self = StObject.set(x, "lassoPoints", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[PlotDatum]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: PlotDatum*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: SelectionRange): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
