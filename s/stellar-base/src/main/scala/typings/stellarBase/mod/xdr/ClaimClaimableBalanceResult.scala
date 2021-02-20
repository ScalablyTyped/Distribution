package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult")
@js.native
class ClaimClaimableBalanceResult ()
  extends typings.stellarBase.xdrMod.default.ClaimClaimableBalanceResult
object ClaimClaimableBalanceResult {
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.claimClaimableBalanceSuccess")
  @js.native
  def claimClaimableBalanceSuccess(): typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceResult = js.native
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceResult = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceResult = js.native
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.ClaimClaimableBalanceResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.ClaimClaimableBalanceResult, io: Buffer): Unit = js.native
}
