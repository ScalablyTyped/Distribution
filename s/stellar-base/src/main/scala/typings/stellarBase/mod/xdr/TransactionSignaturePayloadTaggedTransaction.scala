package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.TransactionSignaturePayloadTaggedTransaction")
@js.native
class TransactionSignaturePayloadTaggedTransaction ()
  extends typings.stellarBase.xdrMod.default.TransactionSignaturePayloadTaggedTransaction

/* static members */
@JSImport("stellar-base", "xdr.TransactionSignaturePayloadTaggedTransaction")
@js.native
object TransactionSignaturePayloadTaggedTransaction extends js.Object {
  def envelopeTypeTx(value: typings.stellarBase.xdrMod.xdr.Transaction): typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  def envelopeTypeTxFeeBump(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransaction): typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionSignaturePayloadTaggedTransaction, io: Buffer): Unit = js.native
}

