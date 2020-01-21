package typings.stellarSdk

import typings.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOperations extends js.Object {
  var operations: js.Array[String]
  var transaction: TransactionFailedResultCodes
}

object AnonOperations {
  @scala.inline
  def apply(operations: js.Array[String], transaction: TransactionFailedResultCodes): AnonOperations = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOperations]
  }
}

