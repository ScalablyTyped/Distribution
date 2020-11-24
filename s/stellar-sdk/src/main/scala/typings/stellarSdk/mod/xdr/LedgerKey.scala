package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.LedgerKey")
@js.native
class LedgerKey ()
  extends typings.stellarBase.mod.xdr.LedgerKey
/* static members */
@JSImport("stellar-sdk", "xdr.LedgerKey")
@js.native
object LedgerKey extends js.Object {
  
  def account(value: typings.stellarBase.xdrMod.xdr.LedgerKeyAccount): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  def claimableBalance(value: typings.stellarBase.xdrMod.xdr.LedgerKeyClaimableBalance): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  def data(value: typings.stellarBase.xdrMod.xdr.LedgerKeyData): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  def isValid(value: typings.stellarBase.xdrMod.xdr.LedgerKey): Boolean = js.native
  
  def offer(value: typings.stellarBase.xdrMod.xdr.LedgerKeyOffer): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  def toXDR(value: typings.stellarBase.xdrMod.xdr.LedgerKey): Buffer = js.native
  
  def trustline(value: typings.stellarBase.xdrMod.xdr.LedgerKeyTrustLine): typings.stellarBase.xdrMod.xdr.LedgerKey = js.native
  
  def validateXDR(input: Buffer): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSName("validateXDR")
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  def write(value: typings.stellarBase.xdrMod.xdr.LedgerKey, io: Buffer): Unit = js.native
}
