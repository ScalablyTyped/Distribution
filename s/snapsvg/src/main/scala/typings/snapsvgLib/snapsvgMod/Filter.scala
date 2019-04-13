package typings
package snapsvgLib.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  def blur(x: scala.Double): java.lang.String = js.native
  def blur(x: scala.Double, y: scala.Double): java.lang.String = js.native
  def brightness(amount: scala.Double): java.lang.String = js.native
  def contrast(amount: scala.Double): java.lang.String = js.native
  def grayscale(amount: scala.Double): java.lang.String = js.native
  def hueRotate(angle: scala.Double): java.lang.String = js.native
  def invert(amount: scala.Double): java.lang.String = js.native
  def saturate(amount: scala.Double): java.lang.String = js.native
  def sepia(amount: scala.Double): java.lang.String = js.native
  def shadow(
    dx: scala.Double,
    dy: scala.Double,
    blur: scala.Double,
    color: java.lang.String,
    opacity: scala.Double
  ): java.lang.String = js.native
  def shadow(dx: scala.Double, dy: scala.Double, color: java.lang.String, opacity: scala.Double): java.lang.String = js.native
  def shadow(dx: scala.Double, dy: scala.Double, opacity: scala.Double): java.lang.String = js.native
}

