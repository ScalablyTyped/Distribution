package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.PlotDatum
import typings.plotlyJs.mod.SelectionRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<plotly.js.plotly.js.PlotSelectionEvent> */
@js.native
trait ReadonlyPlotSelectionEven extends js.Object {
  
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
  implicit class ReadonlyPlotSelectionEvenOps[Self <: ReadonlyPlotSelectionEven] (val x: Self) extends AnyVal {
    
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
    def setPointsVarargs(value: PlotDatum*): Self = this.set("points", js.Array(value :_*))
    
    @scala.inline
    def setPoints(value: js.Array[PlotDatum]): Self = this.set("points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLassoPoints(value: SelectionRange): Self = this.set("lassoPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLassoPoints: Self = this.set("lassoPoints", js.undefined)
    
    @scala.inline
    def setRange(value: SelectionRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
}
