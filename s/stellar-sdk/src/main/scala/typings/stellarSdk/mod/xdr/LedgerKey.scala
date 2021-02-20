package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerKey")
@js.native
class LedgerKey ()
  extends typings.stellarBase.mod.xdr.LedgerKey
object LedgerKey {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.account")
  @js.native
  def account(value: typings.stellarBase.xdrMod.xdr.LedgerKeyAccount): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.claimableBalance")
  @js.native
  def claimableBalance(value: typings.stellarBase.xdrMod.xdr.LedgerKeyClaimableBalance): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.data")
  @js.native
  def data(value: typings.stellarBase.xdrMod.xdr.LedgerKeyData): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKey.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKey.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerKey): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.offer")
  @js.native
  def offer(value: typings.stellarBase.xdrMod.xdr.LedgerKeyOffer): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerKey): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.trustline")
  @js.native
  def trustline(value: typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKey.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.LedgerKey.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.LedgerKey.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerKey, io: Buffer): Unit = js.native
}
