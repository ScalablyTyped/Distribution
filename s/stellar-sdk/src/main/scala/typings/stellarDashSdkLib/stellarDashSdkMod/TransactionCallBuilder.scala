package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "TransactionCallBuilder")
@js.native
class TransactionCallBuilder () extends CallBuilder[TransactionRecord] {
  def forAccount(accountId: java.lang.String): this.type = js.native
  def forLedger(sequence: java.lang.String): this.type = js.native
  def forLedger(sequence: scala.Double): this.type = js.native
  def transaction(transactionId: java.lang.String): this.type = js.native
}

