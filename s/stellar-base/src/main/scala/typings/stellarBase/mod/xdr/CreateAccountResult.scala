package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.CreateAccountResult")
@js.native
class CreateAccountResult ()
  extends typings.stellarBase.xdrMod.default.CreateAccountResult

/* static members */
@JSImport("stellar-base", "xdr.CreateAccountResult")
@js.native
object CreateAccountResult extends js.Object {
  def createAccountSuccess(): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.CreateAccountResult): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.CreateAccountResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.CreateAccountResult): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.CreateAccountResult, io: Buffer): Unit = js.native
}

