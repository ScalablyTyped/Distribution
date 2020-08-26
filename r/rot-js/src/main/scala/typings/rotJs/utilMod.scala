package typings.rotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  def capitalize(string: String): String = js.native
  def clamp(`val`: Double): Double = js.native
  def clamp(`val`: Double, min: js.UndefOr[scala.Nothing], max: Double): Double = js.native
  def clamp(`val`: Double, min: Double): Double = js.native
  def clamp(`val`: Double, min: Double, max: Double): Double = js.native
  def format(template: String, args: js.Any*): String = js.native
  def mod(x: Double, n: Double): Double = js.native
}

