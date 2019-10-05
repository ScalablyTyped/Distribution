package typings.snapsvg.snapsvgMod

import typings.std.SVGMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends js.Object {
  def add(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix = js.native
  def add(matrix: Matrix): Matrix = js.native
  def determinant(): Double = js.native
  def invert(): Matrix = js.native
  def rotate(a: Double): Matrix = js.native
  def rotate(a: Double, x: Double): Matrix = js.native
  def rotate(a: Double, x: Double, y: Double): Matrix = js.native
  def scale(x: Double): Matrix = js.native
  def scale(x: Double, y: Double): Matrix = js.native
  def scale(x: Double, y: Double, cx: Double): Matrix = js.native
  def scale(x: Double, y: Double, cx: Double, cy: Double): Matrix = js.native
  def split(): ExplicitTransform = js.native
  def toTransformString(): String = js.native
  def translate(x: Double, y: Double): Matrix = js.native
  def x(x: Double, y: Double): Double = js.native
  def y(x: Double, y: Double): Double = js.native
}

@JSImport("snapsvg", "Matrix")
@js.native
object Matrix extends js.Object {
  def apply(): Unit = js.native
}

@JSImport("snapsvg", "matrix")
@js.native
object matrix extends js.Object {
  def apply(): Matrix = js.native
  def apply(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double): Matrix = js.native
  def apply(svgMatrix: SVGMatrix): Matrix = js.native
}

