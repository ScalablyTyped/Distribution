package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.AccountMergeResult")
@js.native
class AccountMergeResult ()
  extends typings.stellarBase.mod.xdr.AccountMergeResult
object AccountMergeResult {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.accountMergeSuccess")
  @js.native
  def accountMergeSuccess(value: typings.stellarBase.xdrMod.xdr.Int64): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.AccountMergeResult): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AccountMergeResult): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.AccountMergeResult.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.AccountMergeResult, io: Buffer): Unit = js.native
}
