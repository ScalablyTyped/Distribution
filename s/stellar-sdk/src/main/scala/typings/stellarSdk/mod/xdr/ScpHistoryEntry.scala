package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.ScpHistoryEntry")
@js.native
class ScpHistoryEntry ()
  extends typings.stellarBase.mod.xdr.ScpHistoryEntry
object ScpHistoryEntry {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ScpHistoryEntry): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ScpHistoryEntry): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ScpHistoryEntry, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.ScpHistoryEntry.0")
  @js.native
  def `0`(value: typings.stellarBase.xdrMod.xdr.ScpHistoryEntryV0): typings.stellarBase.xdrMod.xdr.ScpHistoryEntry = js.native
}
