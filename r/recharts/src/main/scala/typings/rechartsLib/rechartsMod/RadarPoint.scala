package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadarPoint extends js.Object {
  var angle: scala.Double
  var cx: scala.Double
  var cy: scala.Double
  var payload: js.Object
  var radius: scala.Double
  var value: scala.Double
  var x: scala.Double
  var y: scala.Double
}

object RadarPoint {
  @scala.inline
  def apply(
    angle: scala.Double,
    cx: scala.Double,
    cy: scala.Double,
    payload: js.Object,
    radius: scala.Double,
    value: scala.Double,
    x: scala.Double,
    y: scala.Double
  ): RadarPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("angle")(angle)
    __obj.updateDynamic("cx")(cx)
    __obj.updateDynamic("cy")(cy)
    __obj.updateDynamic("payload")(payload)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("value")(value)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[RadarPoint]
  }
}

