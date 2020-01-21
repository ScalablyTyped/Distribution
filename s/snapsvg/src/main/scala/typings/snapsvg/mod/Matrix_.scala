package typings.snapsvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix_ extends js.Object {
  def add(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix_ = js.native
  def add(matrix: Matrix_): Matrix_ = js.native
  def determinant(): Double = js.native
  def invert(): Matrix_ = js.native
  def rotate(a: Double): Matrix_ = js.native
  def rotate(a: Double, x: Double): Matrix_ = js.native
  def rotate(a: Double, x: Double, y: Double): Matrix_ = js.native
  def scale(x: Double): Matrix_ = js.native
  def scale(x: Double, y: Double): Matrix_ = js.native
  def scale(x: Double, y: Double, cx: Double): Matrix_ = js.native
  def scale(x: Double, y: Double, cx: Double, cy: Double): Matrix_ = js.native
  def split(): ExplicitTransform = js.native
  def toTransformString(): String = js.native
  def translate(x: Double, y: Double): Matrix_ = js.native
  def x(x: Double, y: Double): Double = js.native
  def y(x: Double, y: Double): Double = js.native
}

@JSImport("snapsvg", "Matrix")
@js.native
object Matrix_ extends js.Object {
  def apply(): Unit = js.native
}

