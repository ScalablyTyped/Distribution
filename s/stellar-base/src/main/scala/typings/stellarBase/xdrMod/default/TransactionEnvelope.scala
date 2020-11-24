package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "TransactionEnvelope")
@js.native
class TransactionEnvelope ()
  extends typings.stellarBase.xdrMod.xdr.TransactionEnvelope
/* static members */
@JSImport("stellar-base/types/xdr", "TransactionEnvelope")
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
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionEnvelope, io: Buffer): Unit = js.native
}
