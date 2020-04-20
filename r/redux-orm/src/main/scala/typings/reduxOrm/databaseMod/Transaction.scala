package typings.reduxOrm.databaseMod

import typings.reduxOrm.sessionMod.BatchToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transaction extends js.Object {
  var batchToken: BatchToken
  var withMutations: Boolean
}

object Transaction {
  @scala.inline
  def apply(batchToken: BatchToken, withMutations: Boolean): Transaction = {
    val __obj = js.Dynamic.literal(batchToken = batchToken.asInstanceOf[js.Any], withMutations = withMutations.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
}

