package typings.reactDashPlotlyDotJs.reactDashPlotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsMod.Data
import typings.plotlyDotJs.plotlyDotJsMod.Frame
import typings.plotlyDotJs.plotlyDotJsMod.Layout
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Figure extends js.Object {
  var data: js.Array[Data]
  var frames: js.Array[Frame] | Null
  var layout: Partial[Layout]
}

object Figure {
  @scala.inline
  def apply(data: js.Array[Data], layout: Partial[Layout], frames: js.Array[Frame] = null): Figure = {
    val __obj = js.Dynamic.literal(data = data, layout = layout)
    if (frames != null) __obj.updateDynamic("frames")(frames)
    __obj.asInstanceOf[Figure]
  }
}

