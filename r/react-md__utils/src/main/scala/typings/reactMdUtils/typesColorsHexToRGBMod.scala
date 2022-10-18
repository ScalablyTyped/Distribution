package typings.reactMdUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesColorsHexToRGBMod {
  
  @JSImport("@react-md/utils/types/colors/hexToRGB", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRGB")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[RedBit, GreenBit, BlueBit]]
  
  type BlueBit = Double
  
  type GreenBit = Double
  
  type HexString = String
  
  type RedBit = Double
}
