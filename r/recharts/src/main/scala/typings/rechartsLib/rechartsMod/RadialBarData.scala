package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialBarData extends js.Object {
  var cx: scala.Double
  var cy: scala.Double
  var innerRadius: scala.Double
  var outerRadius: scala.Double
  var value: js.Any
}

object RadialBarData {
  @scala.inline
  def apply(
    cx: scala.Double,
    cy: scala.Double,
    innerRadius: scala.Double,
    outerRadius: scala.Double,
    value: js.Any
  ): RadialBarData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cx")(cx)
    __obj.updateDynamic("cy")(cy)
    __obj.updateDynamic("innerRadius")(innerRadius)
    __obj.updateDynamic("outerRadius")(outerRadius)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[RadialBarData]
  }
}

