package typings
package raphaelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelMatrix extends js.Object {
  def add(
    a: scala.Double,
    b: scala.Double,
    c: scala.Double,
    d: scala.Double,
    e: scala.Double,
    f: scala.Double,
    matrix: RaphaelMatrix
  ): RaphaelMatrix = js.native
  def invert(): RaphaelMatrix = js.native
  def rotate(a: scala.Double, x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scale(x: scala.Double): scala.Unit = js.native
  def scale(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scale(x: scala.Double, y: scala.Double, cx: scala.Double): scala.Unit = js.native
  def scale(x: scala.Double, y: scala.Double, cx: scala.Double, cy: scala.Double): scala.Unit = js.native
  def split(): Anon_Dx = js.native
  def toTransformString(): java.lang.String = js.native
  def translate(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def x(x: scala.Double, y: scala.Double): scala.Double = js.native
  def y(x: scala.Double, y: scala.Double): scala.Double = js.native
}

