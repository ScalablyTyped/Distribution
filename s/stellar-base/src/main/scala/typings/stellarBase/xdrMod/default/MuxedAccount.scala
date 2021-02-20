package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.MuxedAccount")
@js.native
class MuxedAccount ()
  extends typings.stellarBase.xdrMod.xdr.MuxedAccount
object MuxedAccount {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.MuxedAccount): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.keyTypeEd25519")
  @js.native
  def keyTypeEd25519(value: Buffer): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.keyTypeMuxedEd25519")
  @js.native
  def keyTypeMuxedEd25519(value: typings.stellarBase.xdrMod.xdr.MuxedAccountMed25519): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.MuxedAccount = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.MuxedAccount): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.MuxedAccount.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.MuxedAccount, io: Buffer): Unit = js.native
}
