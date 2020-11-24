package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionEnvelope extends js.Object {
  
  def feeBump(): FeeBumpTransactionEnvelope = js.native
  def feeBump(value: FeeBumpTransactionEnvelope): FeeBumpTransactionEnvelope = js.native
  
  def switch(): EnvelopeType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def v0(): TransactionV0Envelope = js.native
  def v0(value: TransactionV0Envelope): TransactionV0Envelope = js.native
  
  def v1(): TransactionV1Envelope = js.native
  def v1(value: TransactionV1Envelope): TransactionV1Envelope = js.native
  
  def value(): TransactionV0Envelope | TransactionV1Envelope | FeeBumpTransactionEnvelope = js.native
}
