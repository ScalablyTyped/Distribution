package typings.recharts.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadarPoint extends js.Object {
  var angle: Double
  var cx: Double
  var cy: Double
  var payload: js.Object
  var radius: Double
  var value: Double
  var x: Double
  var y: Double
}

object RadarPoint {
  @scala.inline
  def apply(
    angle: Double,
    cx: Double,
    cy: Double,
    payload: js.Object,
    radius: Double,
    value: Double,
    x: Double,
    y: Double
  ): RadarPoint = {
    val __obj = js.Dynamic.literal(angle = angle, cx = cx, cy = cy, payload = payload, radius = radius, value = value, x = x, y = y)
  
    __obj.asInstanceOf[RadarPoint]
  }
}

