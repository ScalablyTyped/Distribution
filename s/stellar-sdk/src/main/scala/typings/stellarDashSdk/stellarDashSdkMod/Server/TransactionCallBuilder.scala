package typings.stellarDashSdk.stellarDashSdkMod.Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server.TransactionCallBuilder")
@js.native
abstract class TransactionCallBuilder () extends CallBuilder[TransactionRecord] {
  def forAccount(accountId: String): this.type = js.native
  def forLedger(sequence: String): this.type = js.native
  def forLedger(sequence: Double): this.type = js.native
  def transaction(transactionId: String): this.type = js.native
}

