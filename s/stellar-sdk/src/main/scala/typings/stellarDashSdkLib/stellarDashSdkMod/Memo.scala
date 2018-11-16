package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Memo")
@js.native
class Memo protected () extends js.Object {
  def this(`type`: stellarDashSdkLib.stellarDashSdkLibStrings.none) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkLibStrings.`return`, value: java.lang.String) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkLibStrings.`return`, value: nodeLib.Buffer) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkLibStrings.hash, value: java.lang.String) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkLibStrings.hash, value: nodeLib.Buffer) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkLibStrings.id, value: java.lang.String) = this()
  def this(`type`: stellarDashSdkLib.stellarDashSdkLibStrings.text, value: java.lang.String) = this()
  var `type`: java.lang.String = js.native
  var value: scala.Null | java.lang.String | nodeLib.Buffer = js.native
  def toXDRObject(): stellarDashSdkLib.stellarDashSdkMod.xdrNs.Memo = js.native
}

@JSImport("stellar-sdk", "Memo")
@js.native
object Memo extends js.Object {
  def fromXDRObject(memo: stellarDashSdkLib.stellarDashSdkMod.xdrNs.Memo): stellarDashSdkLib.stellarDashSdkMod.Memo = js.native
  def hash(hash: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.Memo = js.native
  def id(id: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.Memo = js.native
  def none(): stellarDashSdkLib.stellarDashSdkMod.Memo = js.native
  def `return`(hash: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.Memo = js.native
  def text(text: java.lang.String): stellarDashSdkLib.stellarDashSdkMod.Memo = js.native
}

