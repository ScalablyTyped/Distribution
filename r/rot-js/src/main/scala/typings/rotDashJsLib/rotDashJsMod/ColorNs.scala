package typings
package rotDashJsLib.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Color")
@js.native
object ColorNs extends js.Object {
  def add(
    color1: js.Tuple3[scala.Double, scala.Double, scala.Double],
    colors2: (js.Tuple3[scala.Double, scala.Double, scala.Double])*
  ): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  def add_(
    color1: js.Tuple3[scala.Double, scala.Double, scala.Double],
    colors2: (js.Tuple3[scala.Double, scala.Double, scala.Double])*
  ): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  def fromString(str: java.lang.String): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  def hsl2rgb(color: js.Tuple3[scala.Double, scala.Double, scala.Double]): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  def interpolate(
    color1: js.Tuple3[scala.Double, scala.Double, scala.Double],
    color2: js.Tuple3[scala.Double, scala.Double, scala.Double],
    factor: scala.Double
  ): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  def interpolateHSL(
    color1: js.Tuple3[scala.Double, scala.Double, scala.Double],
    color2: js.Tuple3[scala.Double, scala.Double, scala.Double],
    factor: scala.Double
  ): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  def multiply(
    color1: js.Tuple3[scala.Double, scala.Double, scala.Double],
    colors2: (js.Tuple3[scala.Double, scala.Double, scala.Double])*
  ): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  def multiply_(
    color1: js.Tuple3[scala.Double, scala.Double, scala.Double],
    colors2: (js.Tuple3[scala.Double, scala.Double, scala.Double])*
  ): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  def randomize(
    color: js.Tuple3[scala.Double, scala.Double, scala.Double],
    diff: js.Tuple3[scala.Double, scala.Double, scala.Double]
  ): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  def randomize(color: js.Tuple3[scala.Double, scala.Double, scala.Double], diff: scala.Double): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  def rgb2hsl(color: js.Tuple3[scala.Double, scala.Double, scala.Double]): js.Tuple3[scala.Double, scala.Double, scala.Double] = js.native
  def toHex(color: js.Tuple3[scala.Double, scala.Double, scala.Double]): java.lang.String = js.native
  def toRGB(color: js.Tuple3[scala.Double, scala.Double, scala.Double]): java.lang.String = js.native
}

