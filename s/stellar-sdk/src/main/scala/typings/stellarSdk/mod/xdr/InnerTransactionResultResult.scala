package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "xdr.InnerTransactionResultResult")
@js.native
class InnerTransactionResultResult ()
  extends typings.stellarBase.mod.xdr.InnerTransactionResultResult

/* static members */
@JSImport("stellar-sdk", "xdr.InnerTransactionResultResult")
@js.native
object InnerTransactionResultResult extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult): Buffer = js.native
  def txBadAuth(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txBadAuthExtra(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txBadSeq(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txFailed(value: js.Array[typings.stellarBase.xdrMod.xdr.OperationResult]): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txInsufficientBalance(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txInsufficientFee(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txInternalError(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txMissingOperation(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txNoAccount(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txNotSupported(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txSuccess(value: js.Array[typings.stellarBase.xdrMod.xdr.OperationResult]): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txTooEarly(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def txTooLate(): typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultResult, io: Buffer): Unit = js.native
}

