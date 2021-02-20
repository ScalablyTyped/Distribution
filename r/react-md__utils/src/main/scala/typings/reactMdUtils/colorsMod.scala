package typings.reactMdUtils

import typings.reactMdUtils.hexToRGBMod.BlueBit
import typings.reactMdUtils.hexToRGBMod.GreenBit
import typings.reactMdUtils.hexToRGBMod.HexString
import typings.reactMdUtils.hexToRGBMod.RedBit
import typings.reactMdUtils.isContrastCompliantMod.ContrastRatioCompliance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod {
  
  @JSImport("@react-md/utils/types/colors", "AAA_CONTRAST_RATIO")
  @js.native
  val AAA_CONTRAST_RATIO: /* 7 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors", "LARGE_TEXT_CONTRAST_RATIO")
  @js.native
  val LARGE_TEXT_CONTRAST_RATIO: /* 3 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors", "NORMAL_TEXT_CONTRAST_RATIO")
  @js.native
  val NORMAL_TEXT_CONTRAST_RATIO: /* 4.5 */ Double = js.native
  
  @JSImport("@react-md/utils/types/colors", "getContrastRatio")
  @js.native
  def getContrastRatio(background: HexString, foreground: HexString): Double = js.native
  
  @JSImport("@react-md/utils/types/colors", "hexToRGB")
  @js.native
  def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = js.native
  
  @JSImport("@react-md/utils/types/colors", "isContrastCompliant")
  @js.native
  def isContrastCompliant(background: HexString, foreground: HexString): Boolean = js.native
  @JSImport("@react-md/utils/types/colors", "isContrastCompliant")
  @js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = js.native
  @JSImport("@react-md/utils/types/colors", "isContrastCompliant")
  @js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = js.native
}
