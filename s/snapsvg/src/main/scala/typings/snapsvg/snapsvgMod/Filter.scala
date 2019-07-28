package typings.snapsvg.snapsvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  def blur(x: Double): String = js.native
  def blur(x: Double, y: Double): String = js.native
  def brightness(amount: Double): String = js.native
  def contrast(amount: Double): String = js.native
  def grayscale(amount: Double): String = js.native
  def hueRotate(angle: Double): String = js.native
  def invert(amount: Double): String = js.native
  def saturate(amount: Double): String = js.native
  def sepia(amount: Double): String = js.native
  def shadow(dx: Double, dy: Double, blur: Double, color: String, opacity: Double): String = js.native
  def shadow(dx: Double, dy: Double, color: String, opacity: Double): String = js.native
  def shadow(dx: Double, dy: Double, opacity: Double): String = js.native
}

