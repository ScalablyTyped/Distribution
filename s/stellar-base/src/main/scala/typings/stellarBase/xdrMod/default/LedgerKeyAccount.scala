package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.anon.AccountIdAccountId
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "LedgerKeyAccount")
@js.native
class LedgerKeyAccount protected ()
  extends typings.stellarBase.xdrMod.xdr.LedgerKeyAccount {
  def this(attributes: AccountIdAccountId) = this()
}

/* static members */
@JSImport("stellar-base/types/xdr", "LedgerKeyAccount")
@js.native
object LedgerKeyAccount extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerKeyAccount): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerKeyAccount): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerKeyAccount, io: Buffer): Unit = js.native
}

