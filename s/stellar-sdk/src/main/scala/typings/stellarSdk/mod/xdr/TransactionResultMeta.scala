package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.FeeProcessing
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TransactionResultMeta")
@js.native
class TransactionResultMeta protected ()
  extends typings.stellarBase.mod.xdr.TransactionResultMeta {
  def this(attributes: FeeProcessing) = this()
}
object TransactionResultMeta {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionResultMeta = js.native
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionResultMeta = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionResultMeta = js.native
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionResultMeta = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionResultMeta): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionResultMeta = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionResultMeta): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionResultMeta.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionResultMeta, io: Buffer): Unit = js.native
}
