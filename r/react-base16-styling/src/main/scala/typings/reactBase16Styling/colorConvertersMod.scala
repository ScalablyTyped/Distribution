package typings.reactBase16Styling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-base16-styling/lib/colorConverters", JSImport.Namespace)
@js.native
object colorConvertersMod extends js.Object {
  
  def rgb2yuv(rgb: Color): Color = js.native
  
  def yuv2rgb(yuv: Color): Color = js.native
  
  type Color = js.Tuple3[Double, Double, Double]
}
