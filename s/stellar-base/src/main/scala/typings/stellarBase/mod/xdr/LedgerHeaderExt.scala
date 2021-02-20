package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerHeaderExt")
@js.native
class LedgerHeaderExt ()
  extends typings.stellarBase.xdrMod.default.LedgerHeaderExt
object LedgerHeaderExt {
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerHeaderExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerHeaderExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.LedgerHeaderExt = js.native
}
