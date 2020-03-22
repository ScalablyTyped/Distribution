package typings.reactPlotlyJs

import typings.plotlyJs.mod.PlotAxis
import typings.plotlyJs.mod.PlotScene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<plotly.js.plotly.js.PlotRelayoutEvent> */
trait ReadonlyPlotRelayoutEvent extends js.Object {
  val scene: PlotScene
  val xaxis: PlotAxis
  val yaxis: PlotAxis
}

object ReadonlyPlotRelayoutEvent {
  @scala.inline
  def apply(scene: PlotScene, xaxis: PlotAxis, yaxis: PlotAxis): ReadonlyPlotRelayoutEvent = {
    val __obj = js.Dynamic.literal(scene = scene.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReadonlyPlotRelayoutEvent]
  }
}

