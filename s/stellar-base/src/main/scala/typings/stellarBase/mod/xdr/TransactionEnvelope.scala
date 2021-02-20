package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.TransactionEnvelope")
@js.native
class TransactionEnvelope ()
  extends typings.stellarBase.xdrMod.default.TransactionEnvelope
object TransactionEnvelope {
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionEnvelope.envelopeTypeTx")
  @js.native
  def envelopeTypeTx(value: typings.stellarBase.xdrMod.xdr.TransactionV1Envelope): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionEnvelope.envelopeTypeTxFeeBump")
  @js.native
  def envelopeTypeTxFeeBump(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionEnvelope.envelopeTypeTxV0")
  @js.native
  def envelopeTypeTxV0(value: typings.stellarBase.xdrMod.xdr.TransactionV0Envelope): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionEnvelope.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  @JSImport("stellar-base", "xdr.TransactionEnvelope.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionEnvelope.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  @JSImport("stellar-base", "xdr.TransactionEnvelope.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionEnvelope.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionEnvelope): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionEnvelope.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionEnvelope.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionEnvelope): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionEnvelope.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.TransactionEnvelope.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionEnvelope.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.TransactionEnvelope.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.TransactionEnvelope.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionEnvelope, io: Buffer): Unit = js.native
}
