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
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RadarPoint]
  }
}

