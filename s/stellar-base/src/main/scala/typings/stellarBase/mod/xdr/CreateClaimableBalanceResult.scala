package typings.stellarBase.mod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-base", "xdr.CreateClaimableBalanceResult")
@js.native
class CreateClaimableBalanceResult ()
  extends typings.stellarBase.xdrMod.default.CreateClaimableBalanceResult
object CreateClaimableBalanceResult {
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.createClaimableBalanceSuccess")
  @js.native
  def createClaimableBalanceSuccess(value: typings.stellarBase.xdrMod.xdr.ClaimableBalanceId): typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceResult = js.native
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceResult = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceResult = js.native
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceResult = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-base", "xdr.CreateClaimableBalanceResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.CreateClaimableBalanceResult, io: Buffer): Unit = js.native
}
