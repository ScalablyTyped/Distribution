package typings.reactDashPlotlyDotJs.reactDashPlotlyDotJsMod

import typings.reactDashPlotlyDotJs.Anon_X
import typings.reactDashPlotlyDotJs.reactDashPlotlyDotJsStrings.lower
import typings.reactDashPlotlyDotJs.reactDashPlotlyDotJsStrings.upper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Frame extends js.Object {
  var data: js.Array[Anon_X]
  var group: lower | upper
  var name: String
}

object Frame {
  @scala.inline
  def apply(data: js.Array[Anon_X], group: lower | upper, name: String): Frame = {
    val __obj = js.Dynamic.literal(data = data, group = group.asInstanceOf[js.Any], name = name)
  
    __obj.asInstanceOf[Frame]
  }
}

