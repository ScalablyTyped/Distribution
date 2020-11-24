package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Messages
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.LedgerScpMessages")
@js.native
class LedgerScpMessages protected ()
  extends typings.stellarBase.xdrMod.default.LedgerScpMessages {
  def this(attributes: Messages) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.LedgerScpMessages")
@js.native
object LedgerScpMessages extends js.Object {
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerScpMessages = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerScpMessages = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerScpMessages = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerScpMessages = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerScpMessages): Boolean = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerScpMessages = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerScpMessages): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerScpMessages, io: Buffer): Unit = js.native
}
