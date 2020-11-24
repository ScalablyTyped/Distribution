package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.AccountEntryExt")
@js.native
class AccountEntryExt ()
  extends typings.stellarBase.xdrMod.default.AccountEntryExt
/* static members */
@JSImport("stellar-base", "xdr.AccountEntryExt")
@js.native
object AccountEntryExt extends js.Object {
  
  def `0`(): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  
  def `1`(value: typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.AccountEntryExt): Boolean = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AccountEntryExt): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.AccountEntryExt, io: Buffer): Unit = js.native
}
