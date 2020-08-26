package typings.reduxOrm.databaseMod

import typings.reduxOrm.sessionMod.BatchToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends js.Object {
  var batchToken: BatchToken = js.native
  var withMutations: Boolean = js.native
}

object Transaction {
  @scala.inline
  def apply(batchToken: BatchToken, withMutations: Boolean): Transaction = {
    val __obj = js.Dynamic.literal(batchToken = batchToken.asInstanceOf[js.Any], withMutations = withMutations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  @scala.inline
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
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
    def setBatchToken(value: BatchToken): Self = this.set("batchToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setWithMutations(value: Boolean): Self = this.set("withMutations", value.asInstanceOf[js.Any])
  }
  
}

