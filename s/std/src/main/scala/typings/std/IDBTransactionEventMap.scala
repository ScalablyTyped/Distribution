package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDBTransactionEventMap extends js.Object {
  var abort: Event_
  var complete: Event_
  var error: Event_
}

object IDBTransactionEventMap {
  @scala.inline
  def apply(abort: Event_, complete: Event_, error: Event_): IDBTransactionEventMap = {
    val __obj = js.Dynamic.literal(abort = abort.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDBTransactionEventMap]
  }
}

