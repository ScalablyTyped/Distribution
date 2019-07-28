package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasPath extends js.Object {
  def arc(x: Double, y: Double, radius: Double, startAngle: Double, endAngle: Double): Unit = js.native
  def arc(
    x: Double,
    y: Double,
    radius: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: scala.Boolean
  ): Unit = js.native
  def arcTo(x1: Double, y1: Double, x2: Double, y2: Double, radius: Double): Unit = js.native
  def bezierCurveTo(cp1x: Double, cp1y: Double, cp2x: Double, cp2y: Double, x: Double, y: Double): Unit = js.native
  def closePath(): Unit = js.native
  def ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double
  ): Unit = js.native
  def ellipse(
    x: Double,
    y: Double,
    radiusX: Double,
    radiusY: Double,
    rotation: Double,
    startAngle: Double,
    endAngle: Double,
    anticlockwise: scala.Boolean
  ): Unit = js.native
  def lineTo(x: Double, y: Double): Unit = js.native
  def moveTo(x: Double, y: Double): Unit = js.native
  def quadraticCurveTo(cpx: Double, cpy: Double, x: Double, y: Double): Unit = js.native
  def rect(x: Double, y: Double, w: Double, h: Double): Unit = js.native
}

