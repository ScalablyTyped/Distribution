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
    val __obj = js.Dynamic.literal(angle = angle, cx = cx, cy = cy, payload = payload, radius = radius, value = value, x = x, y = y)
  
    __obj.asInstanceOf[RadarPoint]
  }
}

