package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.SignaturesTx
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope")
@js.native
class FeeBumpTransactionEnvelope protected ()
  extends typings.stellarBase.xdrMod.default.FeeBumpTransactionEnvelope {
  def this(attributes: SignaturesTx) = this()
}
object FeeBumpTransactionEnvelope {
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionEnvelope.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionEnvelope, io: Buffer): Unit = js.native
}
