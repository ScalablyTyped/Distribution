package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx")
@js.native
class FeeBumpTransactionInnerTx ()
  extends typings.stellarBase.mod.xdr.FeeBumpTransactionInnerTx
object FeeBumpTransactionInnerTx {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.envelopeTypeTx")
  @js.native
  def envelopeTypeTx(value: typings.stellarBase.xdrMod.xdr.TransactionV1Envelope): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionInnerTx.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionInnerTx, io: Buffer): Unit = js.native
}
