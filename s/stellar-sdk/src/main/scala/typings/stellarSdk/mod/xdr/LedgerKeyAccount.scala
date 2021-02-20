package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.AccountIdAccountId
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerKeyAccount")
@js.native
class LedgerKeyAccount protected ()
  extends typings.stellarBase.mod.xdr.LedgerKeyAccount {
  def this(attributes: AccountIdAccountId) = this()
}
object LedgerKeyAccount {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerKeyAccount): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKeyAccount = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerKeyAccount): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKeyAccount.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerKeyAccount, io: Buffer): Unit = js.native
}
