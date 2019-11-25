package typings.stellarDashSdk

import typings.stellarDashSdk.libHorizonUnderscoreApiMod.Horizon.TransactionFailedResultCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Operations extends js.Object {
  var operations: js.Array[String]
  var transaction: TransactionFailedResultCodes
}

object Anon_Operations {
  @scala.inline
  def apply(operations: js.Array[String], transaction: TransactionFailedResultCodes): Anon_Operations = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Operations]
  }
}

