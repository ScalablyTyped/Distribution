package typings.stellarSdk.anon

import typings.stellarSdk.horizonApiMod.Horizon.TransactionFailedResultCodes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Operations extends js.Object {
  var operations: js.Array[String] = js.native
  var transaction: TransactionFailedResultCodes = js.native
}

object Operations {
  @scala.inline
  def apply(operations: js.Array[String], transaction: TransactionFailedResultCodes): Operations = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operations]
  }
  @scala.inline
  implicit class OperationsOps[Self <: Operations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOperationsVarargs(value: String*): Self = this.set("operations", js.Array(value :_*))
    @scala.inline
    def setOperations(value: js.Array[String]): Self = this.set("operations", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransaction(value: TransactionFailedResultCodes): Self = this.set("transaction", value.asInstanceOf[js.Any])
  }
  
}

