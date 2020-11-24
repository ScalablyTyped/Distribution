package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.AssetBalanceId
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.ClaimableBalanceEntry")
@js.native
class ClaimableBalanceEntry protected ()
  extends typings.stellarBase.xdrMod.default.ClaimableBalanceEntry {
  def this(attributes: AssetBalanceId) = this()
}
/* static members */
@JSImport("stellar-base", "xdr.ClaimableBalanceEntry")
@js.native
object ClaimableBalanceEntry extends js.Object {
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntry = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntry = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntry = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntry = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntry): Boolean = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntry = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntry): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.ClaimableBalanceEntry, io: Buffer): Unit = js.native
}
