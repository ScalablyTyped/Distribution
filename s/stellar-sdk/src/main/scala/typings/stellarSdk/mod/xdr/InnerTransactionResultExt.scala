package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.InnerTransactionResultExt")
@js.native
class InnerTransactionResultExt ()
  extends typings.stellarBase.mod.xdr.InnerTransactionResultExt
object InnerTransactionResultExt {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.InnerTransactionResultExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultExt = js.native
}
