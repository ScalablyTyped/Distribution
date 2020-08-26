package typings.reactMdUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@react-md/utils/types/colors/hexToRGB", JSImport.Namespace)
@js.native
object hexToRGBMod extends js.Object {
  def default(hex: HexString): js.Tuple3[RedBit, GreenBit, BlueBit] = js.native
  type BlueBit = Double
  type GreenBit = Double
  type HexString = String
  type RedBit = Double
}

