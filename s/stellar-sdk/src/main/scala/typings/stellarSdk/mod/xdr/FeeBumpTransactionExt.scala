package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt")
@js.native
class FeeBumpTransactionExt ()
  extends typings.stellarBase.mod.xdr.FeeBumpTransactionExt
object FeeBumpTransactionExt {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.FeeBumpTransactionExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.FeeBumpTransactionExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.FeeBumpTransactionExt = js.native
}
