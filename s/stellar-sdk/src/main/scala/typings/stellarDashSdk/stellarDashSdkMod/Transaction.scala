package typings.stellarDashSdk.stellarDashSdkMod

import typings.stellarDashBase.stellarDashBaseMod.MemoType
import typings.stellarDashBase.stellarDashBaseMod.Operation
import typings.stellarDashBase.stellarDashBaseMod.xdr.TransactionEnvelope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Transaction")
@js.native
class Transaction[TMemo /* <: typings.stellarDashBase.stellarDashBaseMod.Memo[MemoType] */, TOps /* <: js.Array[Operation] */] protected ()
  extends typings.stellarDashBase.stellarDashBaseMod.Transaction[TMemo, TOps] {
  def this(envelope: String) = this()
  def this(envelope: TransactionEnvelope) = this()
  def this(envelope: String, networkPassphrase: String) = this()
  def this(envelope: TransactionEnvelope, networkPassphrase: String) = this()
}

