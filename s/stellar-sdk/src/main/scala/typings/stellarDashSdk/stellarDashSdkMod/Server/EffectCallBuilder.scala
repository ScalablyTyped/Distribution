package typings.stellarDashSdk.stellarDashSdkMod.Server

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Server.EffectCallBuilder")
@js.native
abstract class EffectCallBuilder () extends CallBuilder[EffectRecord] {
  def forAccount(accountId: String): this.type = js.native
  def forLedger(sequence: String): this.type = js.native
  def forOperation(operationId: Double): this.type = js.native
  def forTransaction(transactionId: String): this.type = js.native
}

