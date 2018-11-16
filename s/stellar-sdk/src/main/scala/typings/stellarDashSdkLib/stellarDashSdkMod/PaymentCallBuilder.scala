package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "PaymentCallBuilder")
@js.native
class PaymentCallBuilder () extends CallBuilder[PaymentOperationRecord] {
  def forAccount(accountId: java.lang.String): this.type = js.native
  def forLedger(sequence: java.lang.String): this.type = js.native
  def forTransaction(transactionId: java.lang.String): this.type = js.native
}

