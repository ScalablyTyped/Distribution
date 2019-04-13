package typings
package reactDashPlotlyDotJsLib.reactDashPlotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Figure extends js.Object {
  var data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data]
  var layout: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout]
}

object Figure {
  @scala.inline
  def apply(
    data: js.Array[plotlyDotJsLib.plotlyDotJsMod.Data],
    layout: stdLib.Partial[plotlyDotJsLib.plotlyDotJsMod.Layout]
  ): Figure = {
    val __obj = js.Dynamic.literal(data = data, layout = layout)
  
    __obj.asInstanceOf[Figure]
  }
}

