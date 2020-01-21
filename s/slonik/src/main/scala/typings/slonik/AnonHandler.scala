package typings.slonik

import typings.slonik.mod.TransactionFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandler extends js.Object {
  def transaction[T](handler: TransactionFunctionType[T]): js.Promise[T]
}

object AnonHandler {
  @scala.inline
  def apply(transaction: TransactionFunctionType[js.Any] => js.Promise[js.Any]): AnonHandler = {
    val __obj = js.Dynamic.literal(transaction = js.Any.fromFunction1(transaction))
  
    __obj.asInstanceOf[AnonHandler]
  }
}

