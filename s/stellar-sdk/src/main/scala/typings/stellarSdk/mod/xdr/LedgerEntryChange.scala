package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerEntryChange")
@js.native
class LedgerEntryChange ()
  extends typings.stellarBase.mod.xdr.LedgerEntryChange
object LedgerEntryChange {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerEntryChange): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.ledgerEntryCreated")
  @js.native
  def ledgerEntryCreated(value: typings.stellarBase.xdrMod.xdr.LedgerEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.ledgerEntryRemoved")
  @js.native
  def ledgerEntryRemoved(value: typings.stellarBase.xdrMod.xdr.LedgerKey): typings.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.ledgerEntryState")
  @js.native
  def ledgerEntryState(value: typings.stellarBase.xdrMod.xdr.LedgerEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.ledgerEntryUpdated")
  @js.native
  def ledgerEntryUpdated(value: typings.stellarBase.xdrMod.xdr.LedgerEntry): typings.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerEntryChange = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerEntryChange): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerEntryChange.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerEntryChange, io: Buffer): Unit = js.native
}
