package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Color")
@js.native
object Color extends js.Object {
  def add(color1: typings.rotDashJs.libColorMod.Color, colors: typings.rotDashJs.libColorMod.Color*): typings.rotDashJs.libColorMod.Color = js.native
  def add_(color1: typings.rotDashJs.libColorMod.Color, colors: typings.rotDashJs.libColorMod.Color*): typings.rotDashJs.libColorMod.Color = js.native
  def fromString(str: String): js.Array[Double] = js.native
  def hsl2rgb(color: typings.rotDashJs.libColorMod.Color): typings.rotDashJs.libColorMod.Color = js.native
  def interpolate(color1: typings.rotDashJs.libColorMod.Color, color2: typings.rotDashJs.libColorMod.Color): typings.rotDashJs.libColorMod.Color = js.native
  def interpolate(
    color1: typings.rotDashJs.libColorMod.Color,
    color2: typings.rotDashJs.libColorMod.Color,
    factor: Double
  ): typings.rotDashJs.libColorMod.Color = js.native
  def interpolateHSL(color1: typings.rotDashJs.libColorMod.Color, color2: typings.rotDashJs.libColorMod.Color): typings.rotDashJs.libColorMod.Color = js.native
  def interpolateHSL(
    color1: typings.rotDashJs.libColorMod.Color,
    color2: typings.rotDashJs.libColorMod.Color,
    factor: Double
  ): typings.rotDashJs.libColorMod.Color = js.native
  def multiply(color1: typings.rotDashJs.libColorMod.Color, colors: typings.rotDashJs.libColorMod.Color*): typings.rotDashJs.libColorMod.Color = js.native
  def multiply_(color1: typings.rotDashJs.libColorMod.Color, colors: typings.rotDashJs.libColorMod.Color*): typings.rotDashJs.libColorMod.Color = js.native
  def randomize(color: typings.rotDashJs.libColorMod.Color, diff: Double): typings.rotDashJs.libColorMod.Color = js.native
  def randomize(color: typings.rotDashJs.libColorMod.Color, diff: typings.rotDashJs.libColorMod.Color): typings.rotDashJs.libColorMod.Color = js.native
  def rgb2hsl(color: typings.rotDashJs.libColorMod.Color): typings.rotDashJs.libColorMod.Color = js.native
  def toHex(color: typings.rotDashJs.libColorMod.Color): String = js.native
  def toRGB(color: typings.rotDashJs.libColorMod.Color): String = js.native
}

