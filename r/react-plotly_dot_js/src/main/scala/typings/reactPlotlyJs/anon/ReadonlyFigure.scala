package typings.reactPlotlyJs.anon

import typings.plotlyJs.mod.Data
import typings.plotlyJs.mod.Frame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<react-plotly.js.react-plotly.js.Figure> */
trait ReadonlyFigure extends js.Object {
  val data: js.Array[Data]
  val frames: js.UndefOr[js.Array[Frame]] = js.undefined
  val layout: PartialLayout
}

object ReadonlyFigure {
  @scala.inline
  def apply(data: js.Array[Data], layout: PartialLayout, frames: js.Array[Frame] = null): ReadonlyFigure = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any])
    if (frames != null) __obj.updateDynamic("frames")(frames.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyFigure]
  }
}

