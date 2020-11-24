package typings.reactMdUtils.isContrastCompliantMod

import typings.reactMdUtils.hexToRGBMod.HexString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-md/utils/types/colors/isContrastCompliant", "isContrastCompliant")
@js.native
object isContrastCompliant extends js.Object {
  
  def apply(background: HexString, foreground: HexString): Boolean = js.native
  def apply(background: HexString, foreground: HexString, compliance: Double): Boolean = js.native
  def apply(background: HexString, foreground: HexString, compliance: ContrastRatioCompliance): Boolean = js.native
}
