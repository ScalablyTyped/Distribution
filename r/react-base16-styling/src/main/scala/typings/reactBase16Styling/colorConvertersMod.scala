package typings.reactBase16Styling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorConvertersMod {
  
  @JSImport("react-base16-styling/lib/colorConverters", "rgb2yuv")
  @js.native
  def rgb2yuv(rgb: Color): Color = js.native
  
  @JSImport("react-base16-styling/lib/colorConverters", "yuv2rgb")
  @js.native
  def yuv2rgb(yuv: Color): Color = js.native
  
  type Color = js.Tuple3[Double, Double, Double]
}
