package typings.seen.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Colors")
@js.native
object Colors extends js.Object {
  var CSS_RGBA_STRING_REGEX: RegExp = js.native
  def black(): Color = js.native
  def gray(): Color = js.native
  def hex(hex: String): Color = js.native
  def hsl(h: Double, s: Double, l: Double): Color = js.native
  def hsl(h: Double, s: Double, l: Double, a: Double): Color = js.native
  def parse(str: String): Color = js.native
  def randomShape(shape: Shape): Unit = js.native
  def randomShape(shape: Shape, sat: Double): Unit = js.native
  def randomShape(shape: Shape, sat: Double, lit: Double): Unit = js.native
  def randomSurfaces(shape: Shape): Unit = js.native
  def randomSurfaces(shape: Shape, sat: Double): Unit = js.native
  def randomSurfaces(shape: Shape, sat: Double, lit: Double): Unit = js.native
  def randomSurfaces2(shape: Shape): Unit = js.native
  def randomSurfaces2(shape: Shape, drift: Double): Unit = js.native
  def randomSurfaces2(shape: Shape, drift: Double, sat: Double): Unit = js.native
  def randomSurfaces2(shape: Shape, drift: Double, sat: Double, lit: Double): Unit = js.native
  def rgb(r: Double, g: Double, b: Double): Color = js.native
  def rgb(r: Double, g: Double, b: Double, a: Double): Color = js.native
  def white(): Color = js.native
}

