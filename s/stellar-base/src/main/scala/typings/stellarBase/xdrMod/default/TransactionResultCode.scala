package typings.stellarBase.xdrMod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-base/types/xdr", "TransactionResultCode")
@js.native
class TransactionResultCode ()
  extends typings.stellarBase.xdrMod.xdr.TransactionResultCode

/* static members */
@JSImport("stellar-base/types/xdr", "TransactionResultCode")
@js.native
object TransactionResultCode extends js.Object {
  def txBadAuth(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txBadAuthExtra(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txBadSeq(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txFailed(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txFeeBumpInnerFailed(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txFeeBumpInnerSuccess(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txInsufficientBalance(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txInsufficientFee(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txInternalError(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txMissingOperation(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txNoAccount(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txNotSupported(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txSuccess(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txTooEarly(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
  def txTooLate(): typings.stellarBase.xdrMod.xdr.TransactionResultCode = js.native
}

