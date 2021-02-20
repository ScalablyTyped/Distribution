package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt")
@js.native
class LedgerHeaderHistoryEntryExt ()
  extends typings.stellarBase.mod.xdr.LedgerHeaderHistoryEntryExt
object LedgerHeaderHistoryEntryExt {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerHeaderHistoryEntryExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.LedgerHeaderHistoryEntryExt = js.native
}
