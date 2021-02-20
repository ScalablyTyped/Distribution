package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.AccountEntryExt")
@js.native
class AccountEntryExt ()
  extends typings.stellarBase.xdrMod.xdr.AccountEntryExt
object AccountEntryExt {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.AccountEntryExt): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AccountEntryExt): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.AccountEntryExt, io: Buffer): Unit = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.0")
  @js.native
  def `0`(): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.AccountEntryExt.1")
  @js.native
  def `1`(value: typings.stellarBase.xdrMod.xdr.AccountEntryExtensionV1): typings.stellarBase.xdrMod.xdr.AccountEntryExt = js.native
}
