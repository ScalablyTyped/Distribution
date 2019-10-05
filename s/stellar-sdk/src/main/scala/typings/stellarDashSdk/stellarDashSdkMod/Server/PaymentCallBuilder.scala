package typings.stellarDashSdk.stellarDashSdkMod.Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server.PaymentCallBuilder")
@js.native
abstract class PaymentCallBuilder () extends CallBuilder[PaymentOperationRecord] {
  def forAccount(accountId: String): this.type = js.native
  def forLedger(sequence: String): this.type = js.native
  def forTransaction(transactionId: String): this.type = js.native
}

