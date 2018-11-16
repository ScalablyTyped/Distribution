package typings
package qrcodeDashGeneratorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeFactory extends js.Object {
  var stringToBytesFuncs: ScalablyTyped.runtime.StringDictionary[js.Function1[/* s */ java.lang.String, js.Array[scala.Double]]] = js.native
  def apply(typeNumber: TypeNumber, errorCorrectionLevel: ErrorCorrectionLevel): QRCode = js.native
  def createStringToBytes(unicodeData: java.lang.String, numChars: scala.Double): js.Function1[/* s */ java.lang.String, js.Array[scala.Double]] = js.native
  def stringToBytes(s: java.lang.String): js.Array[scala.Double] = js.native
}

