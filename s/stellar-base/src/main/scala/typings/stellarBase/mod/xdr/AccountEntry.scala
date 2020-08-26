package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.AccountId
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.AccountEntry")
@js.native
class AccountEntry protected ()
  extends typings.stellarBase.xdrMod.default.AccountEntry {
  def this(attributes: AccountId) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.AccountEntry")
@js.native
object AccountEntry extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AccountEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AccountEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AccountEntry = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.AccountEntry): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntry = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AccountEntry): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.AccountEntry, io: Buffer): Unit = js.native
}

