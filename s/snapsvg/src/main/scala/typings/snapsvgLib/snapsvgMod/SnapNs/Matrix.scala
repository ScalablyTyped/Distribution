package typings
package snapsvgLib.snapsvgMod.SnapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matrix extends js.Object {
  def add(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double
  ): Matrix = js.native
  def add(matrix: Matrix): Matrix = js.native
  def determinant(): scala.Double = js.native
  def invert(): Matrix = js.native
  def rotate(a: scala.Double): Matrix = js.native
  def rotate(a: scala.Double, x: scala.Double): Matrix = js.native
  def rotate(a: scala.Double, x: scala.Double, y: scala.Double): Matrix = js.native
  def scale(x: scala.Double): Matrix = js.native
  def scale(x: scala.Double, y: scala.Double): Matrix = js.native
  def scale(x: scala.Double, y: scala.Double, cx: scala.Double): Matrix = js.native
  def scale(x: scala.Double, y: scala.Double, cx: scala.Double, cy: scala.Double): Matrix = js.native
  def split(): ExplicitTransform = js.native
  def toTransformString(): java.lang.String = js.native
  def translate(x: scala.Double, y: scala.Double): Matrix = js.native
  def x(x: scala.Double, y: scala.Double): scala.Double = js.native
  def y(x: scala.Double, y: scala.Double): scala.Double = js.native
}

