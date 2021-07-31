package typings.reactMdUtils

import typings.reactMdUtils.hexToRGBMod.BlueBit
import typings.reactMdUtils.hexToRGBMod.GreenBit
import typings.reactMdUtils.hexToRGBMod.HexString
import typings.reactMdUtils.hexToRGBMod.RedBit
import typings.reactMdUtils.isContrastCompliantMod.ContrastRatioCompliance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod {
  
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
  
  @scala.inline
  def getContrastRatio(background: HexString, foreground: HexString): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getContrastRatio")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hexToRGB")(hex.asInstanceOf[js.Any]).asInstanceOf[js.Tuple3[RedBit, GreenBit, BlueBit]]
  
  @scala.inline
  def isContrastCompliant(background: HexString, foreground: HexString): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isContrastCompliant")(background.asInstanceOf[js.Any], foreground.asInstanceOf[js.Any], compliance.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
