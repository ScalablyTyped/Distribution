package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Fee
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.Transaction")
@js.native
class Transaction protected ()
  extends typings.stellarBase.xdrMod.default.Transaction {
  def this(attributes: Fee) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.Transaction")
@js.native
object Transaction extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.Transaction = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.Transaction = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.Transaction = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.Transaction = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.Transaction): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.Transaction = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.Transaction): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.Transaction, io: Buffer): Unit = js.native
}

