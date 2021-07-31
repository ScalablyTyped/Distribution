package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorMod {
  
  @JSImport("rot-js/lib/color", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def add(color1: Color, colors: Color*): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(color1.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  @scala.inline
  def add_(color1: Color, colors: Color*): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("add_")(color1.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  @scala.inline
  def fromString(str: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  @scala.inline
  def hsl2rgb(color: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("hsl2rgb")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  @scala.inline
  def interpolate(color1: Color, color2: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Color]
  @scala.inline
  def interpolate(color1: Color, color2: Color, factor: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  @scala.inline
  def interpolateHSL(color1: Color, color2: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHSL")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any])).asInstanceOf[Color]
  @scala.inline
  def interpolateHSL(color1: Color, color2: Color, factor: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolateHSL")(color1.asInstanceOf[js.Any], color2.asInstanceOf[js.Any], factor.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  @JSImport("rot-js/lib/color", "lerp")
  @js.native
  val lerp: js.Function3[/* color1 */ Color, /* color2 */ Color, /* factor */ js.UndefOr[Double], Color] = js.native
  
  @JSImport("rot-js/lib/color", "lerpHSL")
  @js.native
  val lerpHSL: js.Function3[/* color1 */ Color, /* color2 */ Color, /* factor */ js.UndefOr[Double], Color] = js.native
  
  @scala.inline
  def multiply(color1: Color, colors: Color*): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(color1.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  @scala.inline
  def multiply_(color1: Color, colors: Color*): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply_")(color1.asInstanceOf[js.Any], colors.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  @scala.inline
  def randomize(color: Color, diff: Double): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("randomize")(color.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[Color]
  @scala.inline
  def randomize(color: Color, diff: Color): Color = (^.asInstanceOf[js.Dynamic].applyDynamic("randomize")(color.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[Color]
  
  @scala.inline
  def rgb2hsl(color: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2hsl")(color.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  @scala.inline
  def toHex(color: Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHex")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toRGB(color: Color): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toRGB")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Color = js.Tuple3[Double, Double, Double]
}
