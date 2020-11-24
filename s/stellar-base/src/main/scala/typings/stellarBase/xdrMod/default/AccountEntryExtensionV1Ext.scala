package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "AccountEntryExtensionV1Ext")
@js.native
class AccountEntryExtensionV1Ext ()
  extends typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext
/* static members */
@JSImport("stellar-base/types/xdr", "AccountEntryExtensionV1Ext")
@js.native
object AccountEntryExtensionV1Ext extends js.Object {
  
  def `0`(): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  
  def `2`(value: typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV2): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext): Boolean = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext): Buffer = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext, io: Buffer): Unit = js.native
}
