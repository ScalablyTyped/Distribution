package typings
package slonikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Handler extends js.Object {
  def transaction[T](handler: slonikLib.slonikMod.TransactionFunctionType[T]): js.Promise[T]
}

object Anon_Handler {
  @scala.inline
  def apply(transaction: slonikLib.slonikMod.TransactionFunctionType[js.Any] => js.Promise[js.Any]): Anon_Handler = {
    val __obj = js.Dynamic.literal(transaction = js.Any.fromFunction1(transaction))
  
    __obj.asInstanceOf[Anon_Handler]
  }
}

