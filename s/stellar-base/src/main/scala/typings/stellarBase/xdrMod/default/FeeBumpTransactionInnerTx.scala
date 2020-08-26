package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "FeeBumpTransactionInnerTx")
@js.native
class FeeBumpTransactionInnerTx ()
  extends typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx

/* static members */
@JSImport("stellar-base/types/xdr", "FeeBumpTransactionInnerTx")
@js.native
object FeeBumpTransactionInnerTx extends js.Object {
  def envelopeTypeTx(value: typings.stellarBase.xdrMod.xdr.TransactionV1Envelope): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx, io: Buffer): Unit = js.native
}

