package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.AccountMergeResult")
@js.native
class AccountMergeResult ()
  extends typings.stellarBase.mod.xdr.AccountMergeResult

/* static members */
@JSImport("stellar-sdk", "xdr.AccountMergeResult")
@js.native
object AccountMergeResult extends js.Object {
  def accountMergeSuccess(value: typings.stellarBase.xdrMod.xdr.Int64): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.AccountMergeResult): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.AccountMergeResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.AccountMergeResult): Buffer = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.AccountMergeResult, io: Buffer): Unit = js.native
}

