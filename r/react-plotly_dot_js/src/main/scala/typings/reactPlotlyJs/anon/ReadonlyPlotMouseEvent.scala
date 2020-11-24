package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.PlotDatum
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.PlotMouseEvent> */
@js.native
trait ReadonlyPlotMouseEvent extends js.Object {
  
  val event: MouseEvent = js.native
  
  val points: js.Array[PlotDatum] = js.native
}
object ReadonlyPlotMouseEvent {
  
  @scala.inline
  def apply(event: MouseEvent, points: js.Array[PlotDatum]): ReadonlyPlotMouseEvent = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPlotMouseEvent]
  }
  
  @scala.inline
  implicit class ReadonlyPlotMouseEventOps[Self <: ReadonlyPlotMouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvent(value: MouseEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: PlotDatum*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[PlotDatum]): Self = this.set("points", value.asInstanceOf[js.Any])
  }
}
