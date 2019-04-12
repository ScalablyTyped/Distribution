package typings
package slonikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connect extends js.Object {
  def connect[T](connectionRoutine: slonikLib.slonikMod.ConnectionRoutineType[T]): js.Promise[T]
  def transaction[T](handler: slonikLib.slonikMod.TransactionFunctionType[T]): js.Promise[T]
}

object Anon_Connect {
  @scala.inline
  def apply(
    connect: slonikLib.slonikMod.ConnectionRoutineType[js.Any] => js.Promise[js.Any],
    transaction: slonikLib.slonikMod.TransactionFunctionType[js.Any] => js.Promise[js.Any]
  ): Anon_Connect = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), transaction = js.Any.fromFunction1(transaction))
  
    __obj.asInstanceOf[Anon_Connect]
  }
}

