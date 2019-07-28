package typings.raphael

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaphaelMatrix extends js.Object {
  def add(a: Double, b: Double, c: Double, d: Double, e: Double, f: Double, matrix: RaphaelMatrix): RaphaelMatrix = js.native
  def invert(): RaphaelMatrix = js.native
  def rotate(a: Double, x: Double, y: Double): Unit = js.native
  def scale(x: Double): Unit = js.native
  def scale(x: Double, y: Double): Unit = js.native
  def scale(x: Double, y: Double, cx: Double): Unit = js.native
  def scale(x: Double, y: Double, cx: Double, cy: Double): Unit = js.native
  def split(): Anon_Dx = js.native
  def toTransformString(): String = js.native
  def translate(x: Double, y: Double): Unit = js.native
  def x(x: Double, y: Double): Double = js.native
  def y(x: Double, y: Double): Double = js.native
}

