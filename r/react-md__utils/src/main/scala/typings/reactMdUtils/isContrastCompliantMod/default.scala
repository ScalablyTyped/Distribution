package typings.reactMdUtils.isContrastCompliantMod

import typings.reactMdUtils.hexToRGBMod.HexString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/colors/isContrastCompliant", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(background: HexString, foreground: HexString): Boolean = js.native
  def apply(background: HexString, foreground: HexString, compliance: Double): Boolean = js.native
  def apply(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = js.native
}

