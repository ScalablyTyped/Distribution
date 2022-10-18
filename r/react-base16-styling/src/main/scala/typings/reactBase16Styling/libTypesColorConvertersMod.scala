package typings.reactBase16Styling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesColorConvertersMod {
  
  @JSImport("react-base16-styling/lib/types/colorConverters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rgb2yuv(rgb: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("rgb2yuv")(rgb.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  inline def yuv2rgb(yuv: Color): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("yuv2rgb")(yuv.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  type Color = js.Tuple3[Double, Double, Double]
}
