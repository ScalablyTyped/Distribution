package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base/types/xdr", "default.LedgerKey")
@js.native
class LedgerKey ()
  extends typings.stellarBase.xdrMod.xdr.LedgerKey
object LedgerKey {
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.account")
  @js.native
  def account(value: typings.stellarBase.xdrMod.xdr.LedgerKeyAccount): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.claimableBalance")
  @js.native
  def claimableBalance(value: typings.stellarBase.xdrMod.xdr.LedgerKeyClaimableBalance): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.data")
  @js.native
  def data(value: typings.stellarBase.xdrMod.xdr.LedgerKeyData): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerKey): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.offer")
  @js.native
  def offer(value: typings.stellarBase.xdrMod.xdr.LedgerKeyOffer): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerKey): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.trustline")
  @js.native
  def trustline(value: typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base/types/xdr", "default.LedgerKey.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerKey, io: Buffer): Unit = js.native
}
