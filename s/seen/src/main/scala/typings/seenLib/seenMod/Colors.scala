package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seen", "Colors")
@js.native
object Colors extends js.Object {
  var CSS_RGBA_STRING_REGEX: stdLib.RegExp = js.native
  def black(): seenLib.seenMod.Color = js.native
  def gray(): seenLib.seenMod.Color = js.native
  def hex(hex: java.lang.String): seenLib.seenMod.Color = js.native
  def hsl(h: scala.Double, s: scala.Double, l: scala.Double): seenLib.seenMod.Color = js.native
  def hsl(h: scala.Double, s: scala.Double, l: scala.Double, a: scala.Double): seenLib.seenMod.Color = js.native
  def parse(str: java.lang.String): seenLib.seenMod.Color = js.native
  def randomShape(shape: seenLib.seenMod.Shape): scala.Unit = js.native
  def randomShape(shape: seenLib.seenMod.Shape, sat: scala.Double): scala.Unit = js.native
  def randomShape(shape: seenLib.seenMod.Shape, sat: scala.Double, lit: scala.Double): scala.Unit = js.native
  def randomSurfaces(shape: seenLib.seenMod.Shape): scala.Unit = js.native
  def randomSurfaces(shape: seenLib.seenMod.Shape, sat: scala.Double): scala.Unit = js.native
  def randomSurfaces(shape: seenLib.seenMod.Shape, sat: scala.Double, lit: scala.Double): scala.Unit = js.native
  def randomSurfaces2(shape: seenLib.seenMod.Shape): scala.Unit = js.native
  def randomSurfaces2(shape: seenLib.seenMod.Shape, drift: scala.Double): scala.Unit = js.native
  def randomSurfaces2(shape: seenLib.seenMod.Shape, drift: scala.Double, sat: scala.Double): scala.Unit = js.native
  def randomSurfaces2(shape: seenLib.seenMod.Shape, drift: scala.Double, sat: scala.Double, lit: scala.Double): scala.Unit = js.native
  def rgb(r: scala.Double, g: scala.Double, b: scala.Double): seenLib.seenMod.Color = js.native
  def rgb(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): seenLib.seenMod.Color = js.native
  def white(): seenLib.seenMod.Color = js.native
}

