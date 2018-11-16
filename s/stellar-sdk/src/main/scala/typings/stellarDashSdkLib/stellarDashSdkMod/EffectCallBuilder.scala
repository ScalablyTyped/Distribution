package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "EffectCallBuilder")
@js.native
class EffectCallBuilder () extends CallBuilder[EffectRecord] {
  def forAccount(accountId: java.lang.String): this.type = js.native
  def forLedger(sequence: java.lang.String): this.type = js.native
  def forOperation(operationId: scala.Double): this.type = js.native
  def forTransaction(transactionId: java.lang.String): this.type = js.native
}

