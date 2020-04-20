package typings.recharts.mod

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
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], innerRadius = innerRadius.asInstanceOf[js.Any], outerRadius = outerRadius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialBarData]
  }
}

