package typings.stellarBase.xdrMod.default

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "TransactionResultResult")
@js.native
class TransactionResultResult ()
  extends typings.stellarBase.xdrMod.xdr.TransactionResultResult

/* static members */
@JSImport("stellar-base/types/xdr", "TransactionResultResult")
@js.native
object TransactionResultResult extends js.Object {
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  @JSName("fromXDR")
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.TransactionResultResult): Boolean = js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.TransactionResultResult): Buffer = js.native
  def txFailed(value: js.Array[typings.stellarBase.xdrMod.xdr.OperationResult]): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  def txFeeBumpInnerFailed(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  def txFeeBumpInnerSuccess(value: typings.stellarBase.xdrMod.xdr.InnerTransactionResultPair): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  def txSuccess(value: js.Array[typings.stellarBase.xdrMod.xdr.OperationResult]): typings.stellarBase.xdrMod.xdr.TransactionResultResult = js.native
  def write(value: typings.stellarBase.xdrMod.xdr.TransactionResultResult, io: Buffer): Unit = js.native
}

