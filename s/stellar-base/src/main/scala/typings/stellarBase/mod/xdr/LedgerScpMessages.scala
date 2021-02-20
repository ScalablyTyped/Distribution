package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Messages
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerScpMessages")
@js.native
class LedgerScpMessages protected ()
  extends typings.stellarBase.xdrMod.default.LedgerScpMessages {
  def this(attributes: Messages) = this()
}
object LedgerScpMessages {
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerScpMessages.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerScpMessages = js.native
  @JSImport("stellar-base", "xdr.LedgerScpMessages.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerScpMessages = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerScpMessages.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerScpMessages = js.native
  @JSImport("stellar-base", "xdr.LedgerScpMessages.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerScpMessages = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerScpMessages.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerScpMessages): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerScpMessages.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerScpMessages = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerScpMessages.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerScpMessages): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerScpMessages.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerScpMessages.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerScpMessages.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.LedgerScpMessages.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.LedgerScpMessages.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerScpMessages, io: Buffer): Unit = js.native
}
