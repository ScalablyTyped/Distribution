package typings.rotDashJs

import typings.rotDashJs.libColorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js/lib/color", JSImport.Namespace)
@js.native
object libColorMod extends js.Object {
  val lerp: js.Function3[/* color1 */ Color, /* color2 */ Color, /* factor */ js.UndefOr[Double], Color] = js.native
  val lerpHSL: js.Function3[/* color1 */ Color, /* color2 */ Color, /* factor */ js.UndefOr[Double], Color] = js.native
  def add(color1: Color, colors: Color*): Color = js.native
  def add_(color1: Color, colors: Color*): Color = js.native
  def fromString(str: String): js.Array[Double] = js.native
  def hsl2rgb(color: Color): Color = js.native
  def interpolate(color1: Color, color2: Color): Color = js.native
  def interpolate(color1: Color, color2: Color, factor: Double): Color = js.native
  def interpolateHSL(color1: Color, color2: Color): Color = js.native
  def interpolateHSL(color1: Color, color2: Color, factor: Double): Color = js.native
  def multiply(color1: Color, colors: Color*): Color = js.native
  def multiply_(color1: Color, colors: Color*): Color = js.native
  def randomize(color: Color, diff: Double): Color = js.native
  def randomize(color: Color, diff: Color): Color = js.native
  def rgb2hsl(color: Color): Color = js.native
  def toHex(color: Color): String = js.native
  def toRGB(color: Color): String = js.native
  type Color = js.Tuple3[Double, Double, Double]
}

