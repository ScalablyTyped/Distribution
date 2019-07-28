package typings.slonik

import typings.slonik.slonikMod.TransactionFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handler extends js.Object {
  def transaction[T](handler: TransactionFunctionType[T]): js.Promise[T]
}

object Anon_Handler {
  @scala.inline
  def apply(transaction: TransactionFunctionType[js.Any] => js.Promise[js.Any]): Anon_Handler = {
    val __obj = js.Dynamic.literal(transaction = js.Any.fromFunction1(transaction))
  
    __obj.asInstanceOf[Anon_Handler]
  }
}

