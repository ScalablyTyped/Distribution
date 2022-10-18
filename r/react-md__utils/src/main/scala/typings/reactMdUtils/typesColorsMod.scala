package typings.reactMdUtils

import typings.reactMdUtils.typesColorsHexToRGBMod.BlueBit
import typings.reactMdUtils.typesColorsHexToRGBMod.GreenBit
import typings.reactMdUtils.typesColorsHexToRGBMod.HexString
import typings.reactMdUtils.typesColorsHexToRGBMod.RedBit
import typings.reactMdUtils.typesColorsIsContrastCompliantMod.ContrastRatioCompliance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesColorsMod {
  
  @JSImport("@react-md/utils/types/colors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/utils/types/colors", "AAA_CONTRAST_RATIO")
  @js.native
  val AAA_CONTRAST_RATIO: /* 7 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors", "LARGE_TEXT_CONTRAST_RATIO")
  @js.native
  val LARGE_TEXT_CONTRAST_RATIO: /* 3 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors", "NORMAL_TEXT_CONTRAST_RATIO")
  @js.native
  val NORMAL_TEXT_CONTRAST_RATIO: /* 4.5 */ Double = js.native
  
  inline def getContrastRatio(background: HexString, foreground: HexString): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRGB")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[RedBit, GreenBit, BlueBit]]
  
  inline def isContrastCompliant(background: HexString, foreground: HexString): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
