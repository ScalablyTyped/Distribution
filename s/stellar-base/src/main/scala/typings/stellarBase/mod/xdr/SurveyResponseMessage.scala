package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.SurveyResponseMessage")
@js.native
class SurveyResponseMessage protected ()
  extends typings.stellarBase.xdrMod.default.SurveyResponseMessage {
  def this(attributes: typings.stellarBase.anon.EncryptedBody) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.SurveyResponseMessage")
@js.native
object SurveyResponseMessage extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.SurveyResponseMessage = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.SurveyResponseMessage = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.SurveyResponseMessage = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.SurveyResponseMessage = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.SurveyResponseMessage): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.SurveyResponseMessage = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.SurveyResponseMessage): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.SurveyResponseMessage, io: Buffer): Unit = js.native
}

