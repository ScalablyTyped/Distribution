package typings.stellarSdk.anon

import typings.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operations extends js.Object {
  var operations: js.Array[String]
  var transaction: TransactionFailedResultCodes
}

object Operations {
  @scala.inline
  def apply(operations: js.Array[String], transaction: TransactionFailedResultCodes): Operations = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operations]
  }
}

