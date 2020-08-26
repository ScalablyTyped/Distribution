package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.SignaturesTx
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope")
@js.native
class FeeBumpTransactionEnvelope protected ()
  extends typings.stellarBase.xdrMod.default.FeeBumpTransactionEnvelope {
  def this(attributes: SignaturesTx) = this()
}

/* static members */
@JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope")
@js.native
object FeeBumpTransactionEnvelope extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope, io: Buffer): Unit = js.native
}

