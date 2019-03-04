package typings
package reactDashPlotlyDotJsLib.reactDashPlotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var data: js.Array[reactDashPlotlyDotJsLib.Anon_X]
  var group: reactDashPlotlyDotJsLib.reactDashPlotlyDotJsLibStrings.lower | reactDashPlotlyDotJsLib.reactDashPlotlyDotJsLibStrings.upper
  var name: java.lang.String
}

object Frame {
  @scala.inline
  def apply(
    data: js.Array[reactDashPlotlyDotJsLib.Anon_X],
    group: reactDashPlotlyDotJsLib.reactDashPlotlyDotJsLibStrings.lower | reactDashPlotlyDotJsLib.reactDashPlotlyDotJsLibStrings.upper,
    name: java.lang.String
  ): Frame = {
    val __obj = js.Dynamic.literal(data = data, group = group.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[Frame]
  }
}

