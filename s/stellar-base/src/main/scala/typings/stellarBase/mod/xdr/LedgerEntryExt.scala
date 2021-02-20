package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerEntryExt")
@js.native
class LedgerEntryExt ()
  extends typings.stellarBase.xdrMod.default.LedgerEntryExt
object LedgerEntryExt {
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerEntryExt.1")
  @js.native
  def `1`(value: typings.stellarBase.xdrMod.xdr.LedgerEntryExtensionV1): typings.stellarBase.xdrMod.xdr.LedgerEntryExt = js.native
}
