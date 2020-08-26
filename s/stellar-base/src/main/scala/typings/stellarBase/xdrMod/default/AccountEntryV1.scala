package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "AccountEntryV1")
@js.native
class AccountEntryV1 protected ()
  extends typings.stellarBase.xdrMod.xdr.AccountEntryV1 {
  def this(attributes: typings.stellarBase.anon.Liabilities) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "AccountEntryV1")
@js.native
object AccountEntryV1 extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryV1 = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AccountEntryV1 = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AccountEntryV1 = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AccountEntryV1 = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.AccountEntryV1): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryV1 = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AccountEntryV1): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.AccountEntryV1, io: Buffer): Unit = js.native
}

