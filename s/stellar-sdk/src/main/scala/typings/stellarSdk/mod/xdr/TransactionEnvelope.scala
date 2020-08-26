package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.TransactionEnvelope")
@js.native
class TransactionEnvelope ()
  extends typings.stellarBase.mod.xdr.TransactionEnvelope

/* static members */
@JSImport("stellar-sdk", "xdr.TransactionEnvelope")
@js.native
object TransactionEnvelope extends js.Object {
  def envelopeTypeTx(value: typings.stellarBase.xdrMod.xdr.TransactionV1Envelope): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  def envelopeTypeTxFeeBump(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  def envelopeTypeTxV0(value: typings.stellarBase.xdrMod.xdr.TransactionV0Envelope): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionEnvelope): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionEnvelope): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionEnvelope, io: Buffer): Unit = js.native
}

