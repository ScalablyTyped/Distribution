package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialBarData extends js.Object {
  var cx: Double
  var cy: Double
  var innerRadius: Double
  var outerRadius: Double
  var value: js.Any
}

object RadialBarData {
  @scala.inline
  def apply(cx: Double, cy: Double, innerRadius: Double, outerRadius: Double, value: js.Any): RadialBarData = {
    val __obj = js.Dynamic.literal(cx = cx, cy = cy, innerRadius = innerRadius, outerRadius = outerRadius, value = value)
  
    __obj.asInstanceOf[RadialBarData]
  }
}

