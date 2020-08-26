package typings.reactMdUtils

import typings.reactMdUtils.hexToRGBMod.BlueBit
import typings.reactMdUtils.hexToRGBMod.GreenBit
import typings.reactMdUtils.hexToRGBMod.HexString
import typings.reactMdUtils.hexToRGBMod.RedBit
import typings.reactMdUtils.isContrastCompliantMod.ContrastRatioCompliance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/colors", JSImport.Namespace)
@js.native
object colorsMod extends js.Object {
  def getContrastRatio(background: HexString, foreground: HexString): Double = js.native
  def hexToRGB(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = js.native
  def isContrastCompliant(background: HexString, foreground: HexString): Boolean = js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: Double): Boolean = js.native
  def isContrastCompliant(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = js.native
}

