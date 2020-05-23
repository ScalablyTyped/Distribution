package typings.qrcodeGenerator

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeFactory extends js.Object {
  var stringToBytesFuncs: StringDictionary[js.Function1[/* s */ String, js.Array[Double]]] = js.native
  def apply(typeNumber: TypeNumber, errorCorrectionLevel: ErrorCorrectionLevel): QRCode = js.native
  def createStringToBytes(unicodeData: String, numChars: Double): js.Function1[/* s */ String, js.Array[Double]] = js.native
  def stringToBytes(s: String): js.Array[Double] = js.native
}

