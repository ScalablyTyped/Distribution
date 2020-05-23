package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.PlotDatum
import typings.plotlyJs.mod.SelectionRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.PlotSelectionEvent> */
trait ReadonlyPlotSelectionEven extends js.Object {
  val lassoPoints: js.UndefOr[SelectionRange] = js.undefined
  val points: js.Array[PlotDatum]
  val range: js.UndefOr[SelectionRange] = js.undefined
}

object ReadonlyPlotSelectionEven {
  @scala.inline
  def apply(points: js.Array[PlotDatum], lassoPoints: SelectionRange = null, range: SelectionRange = null): ReadonlyPlotSelectionEven = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    if (lassoPoints != null) __obj.updateDynamic("lassoPoints")(lassoPoints.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyPlotSelectionEven]
  }
}

