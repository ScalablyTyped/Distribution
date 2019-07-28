package typings.rotDashJs.rotDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rot-js", "Color")
@js.native
object ColorNs extends js.Object {
  def add(color1: js.Tuple3[Double, Double, Double], colors2: (js.Tuple3[Double, Double, Double])*): js.Tuple3[Double, Double, Double] = js.native
  def add_(color1: js.Tuple3[Double, Double, Double], colors2: (js.Tuple3[Double, Double, Double])*): js.Tuple3[Double, Double, Double] = js.native
  def fromString(str: String): js.Tuple3[Double, Double, Double] = js.native
  def hsl2rgb(color: js.Tuple3[Double, Double, Double]): js.Tuple3[Double, Double, Double] = js.native
  def interpolate(
    color1: js.Tuple3[Double, Double, Double],
    color2: js.Tuple3[Double, Double, Double],
    factor: Double
  ): js.Tuple3[Double, Double, Double] = js.native
  def interpolateHSL(
    color1: js.Tuple3[Double, Double, Double],
    color2: js.Tuple3[Double, Double, Double],
    factor: Double
  ): js.Tuple3[Double, Double, Double] = js.native
  def multiply(color1: js.Tuple3[Double, Double, Double], colors2: (js.Tuple3[Double, Double, Double])*): js.Tuple3[Double, Double, Double] = js.native
  def multiply_(color1: js.Tuple3[Double, Double, Double], colors2: (js.Tuple3[Double, Double, Double])*): js.Tuple3[Double, Double, Double] = js.native
  def randomize(color: js.Tuple3[Double, Double, Double], diff: js.Tuple3[Double, Double, Double]): js.Tuple3[Double, Double, Double] = js.native
  def randomize(color: js.Tuple3[Double, Double, Double], diff: Double): js.Tuple3[Double, Double, Double] = js.native
  def rgb2hsl(color: js.Tuple3[Double, Double, Double]): js.Tuple3[Double, Double, Double] = js.native
  def toHex(color: js.Tuple3[Double, Double, Double]): String = js.native
  def toRGB(color: js.Tuple3[Double, Double, Double]): String = js.native
}

