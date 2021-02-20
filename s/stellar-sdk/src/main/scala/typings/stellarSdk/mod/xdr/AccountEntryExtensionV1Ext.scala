package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext")
@js.native
class AccountEntryExtensionV1Ext ()
  extends typings.stellarBase.mod.xdr.AccountEntryExtensionV1Ext
object AccountEntryExtensionV1Ext {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountEntryExtensionV1Ext.2")
  @js.native
  def `2`(value: typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV2): typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1Ext = js.native
}
