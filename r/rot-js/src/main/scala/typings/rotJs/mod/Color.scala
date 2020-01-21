package typings.rotJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Color")
@js.native
object Color extends js.Object {
  def add(color1: typings.rotJs.colorMod.Color, colors: typings.rotJs.colorMod.Color*): typings.rotJs.colorMod.Color = js.native
  def add_(color1: typings.rotJs.colorMod.Color, colors: typings.rotJs.colorMod.Color*): typings.rotJs.colorMod.Color = js.native
  def fromString(str: String): js.Array[Double] = js.native
  def hsl2rgb(color: typings.rotJs.colorMod.Color): typings.rotJs.colorMod.Color = js.native
  def interpolate(color1: typings.rotJs.colorMod.Color, color2: typings.rotJs.colorMod.Color): typings.rotJs.colorMod.Color = js.native
  def interpolate(color1: typings.rotJs.colorMod.Color, color2: typings.rotJs.colorMod.Color, factor: Double): typings.rotJs.colorMod.Color = js.native
  def interpolateHSL(color1: typings.rotJs.colorMod.Color, color2: typings.rotJs.colorMod.Color): typings.rotJs.colorMod.Color = js.native
  def interpolateHSL(color1: typings.rotJs.colorMod.Color, color2: typings.rotJs.colorMod.Color, factor: Double): typings.rotJs.colorMod.Color = js.native
  def multiply(color1: typings.rotJs.colorMod.Color, colors: typings.rotJs.colorMod.Color*): typings.rotJs.colorMod.Color = js.native
  def multiply_(color1: typings.rotJs.colorMod.Color, colors: typings.rotJs.colorMod.Color*): typings.rotJs.colorMod.Color = js.native
  def randomize(color: typings.rotJs.colorMod.Color, diff: Double): typings.rotJs.colorMod.Color = js.native
  def randomize(color: typings.rotJs.colorMod.Color, diff: typings.rotJs.colorMod.Color): typings.rotJs.colorMod.Color = js.native
  def rgb2hsl(color: typings.rotJs.colorMod.Color): typings.rotJs.colorMod.Color = js.native
  def toHex(color: typings.rotJs.colorMod.Color): String = js.native
  def toRGB(color: typings.rotJs.colorMod.Color): String = js.native
}

