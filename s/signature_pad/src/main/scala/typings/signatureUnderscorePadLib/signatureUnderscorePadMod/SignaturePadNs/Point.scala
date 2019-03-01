package typings
package signatureUnderscorePadLib.signatureUnderscorePadMod.SignaturePadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var time: scala.Double
  var x: scala.Double
  var y: scala.Double
  def distanceTo(start: Point): scala.Double
  def velocityFrom(start: Point): scala.Double
}

object Point {
  @scala.inline
  def apply(
    distanceTo: js.Function1[Point, scala.Double],
    time: scala.Double,
    velocityFrom: js.Function1[Point, scala.Double],
    x: scala.Double,
    y: scala.Double,
    color: java.lang.String = null
  ): Point = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("distanceTo")(distanceTo)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("velocityFrom")(velocityFrom)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    if (color != null) __obj.updateDynamic("color")(color)
    __obj.asInstanceOf[Point]
  }
}

