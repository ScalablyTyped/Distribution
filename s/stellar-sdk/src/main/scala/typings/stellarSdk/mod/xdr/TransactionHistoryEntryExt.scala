package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt")
@js.native
class TransactionHistoryEntryExt ()
  extends typings.stellarBase.mod.xdr.TransactionHistoryEntryExt
object TransactionHistoryEntryExt {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.TransactionHistoryEntryExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.TransactionHistoryEntryExt = js.native
}
