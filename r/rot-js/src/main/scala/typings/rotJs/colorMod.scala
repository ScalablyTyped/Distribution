package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("rot-js/lib/color", "add")
  @js.native
  def add(color1: Color, colors: Color*): Color = js.native
  
  @JSImport("rot-js/lib/color", "add_")
  @js.native
  def add_(color1: Color, colors: Color*): Color = js.native
  
  @JSImport("rot-js/lib/color", "fromString")
  @js.native
  def fromString(str: String): Color = js.native
  
  @JSImport("rot-js/lib/color", "hsl2rgb")
  @js.native
  def hsl2rgb(color: Color): Color = js.native
  
  @JSImport("rot-js/lib/color", "interpolate")
  @js.native
  def interpolate(color1: Color, color2: Color): Color = js.native
  @JSImport("rot-js/lib/color", "interpolate")
  @js.native
  def interpolate(color1: Color, color2: Color, factor: Double): Color = js.native
  
  @JSImport("rot-js/lib/color", "interpolateHSL")
  @js.native
  def interpolateHSL(color1: Color, color2: Color): Color = js.native
  @JSImport("rot-js/lib/color", "interpolateHSL")
  @js.native
  def interpolateHSL(color1: Color, color2: Color, factor: Double): Color = js.native
  
  @JSImport("rot-js/lib/color", "lerp")
  @js.native
  val lerp: js.Function3[/* color1 */ Color, /* color2 */ Color, /* factor */ js.UndefOr[Double], Color] = js.native
  
  @JSImport("rot-js/lib/color", "lerpHSL")
  @js.native
  val lerpHSL: js.Function3[/* color1 */ Color, /* color2 */ Color, /* factor */ js.UndefOr[Double], Color] = js.native
  
  @JSImport("rot-js/lib/color", "multiply")
  @js.native
  def multiply(color1: Color, colors: Color*): Color = js.native
  
  @JSImport("rot-js/lib/color", "multiply_")
  @js.native
  def multiply_(color1: Color, colors: Color*): Color = js.native
  
  @JSImport("rot-js/lib/color", "randomize")
  @js.native
  def randomize(color: Color, diff: Double): Color = js.native
  @JSImport("rot-js/lib/color", "randomize")
  @js.native
  def randomize(color: Color, diff: Color): Color = js.native
  
  @JSImport("rot-js/lib/color", "rgb2hsl")
  @js.native
  def rgb2hsl(color: Color): Color = js.native
  
  @JSImport("rot-js/lib/color", "toHex")
  @js.native
  def toHex(color: Color): String = js.native
  
  @JSImport("rot-js/lib/color", "toRGB")
  @js.native
  def toRGB(color: Color): String = js.native
  
  type Color = js.Tuple3[Double, Double, Double]
}
