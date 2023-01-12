package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Datum
import typings.plotlyJs.mod.PlotDatum
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.PlotHoverEvent> */
trait ReadonlyPlotHoverEvent extends StObject {
  
  val event: MouseEvent
  
  val points: js.Array[PlotDatum]
  
  val xvals: js.Array[Datum]
  
  val yvals: js.Array[Datum]
}
object ReadonlyPlotHoverEvent {
  
  inline def apply(event: MouseEvent, points: js.Array[PlotDatum], xvals: js.Array[Datum], yvals: js.Array[Datum]): ReadonlyPlotHoverEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], xvals = xvals.asInstanceOf[js.Any], yvals = yvals.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPlotHoverEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyPlotHoverEvent] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: MouseEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setPoints(value: js.Array[PlotDatum]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: PlotDatum*): Self = StObject.set(x, "points", js.Array(value*))
    
    inline def setXvals(value: js.Array[Datum]): Self = StObject.set(x, "xvals", value.asInstanceOf[js.Any])
    
    inline def setXvalsVarargs(value: Datum*): Self = StObject.set(x, "xvals", js.Array(value*))
    
    inline def setYvals(value: js.Array[Datum]): Self = StObject.set(x, "yvals", value.asInstanceOf[js.Any])
    
    inline def setYvalsVarargs(value: Datum*): Self = StObject.set(x, "yvals", js.Array(value*))
  }
}
