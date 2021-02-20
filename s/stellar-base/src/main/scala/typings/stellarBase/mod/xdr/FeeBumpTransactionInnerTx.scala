package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx")
@js.native
class FeeBumpTransactionInnerTx ()
  extends typings.stellarBase.xdrMod.default.FeeBumpTransactionInnerTx
object FeeBumpTransactionInnerTx {
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.envelopeTypeTx")
  @js.native
  def envelopeTypeTx(value: typings.stellarBase.xdrMod.xdr.TransactionV1Envelope): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.FeeBumpTransactionInnerTx.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx, io: Buffer): Unit = js.native
}
