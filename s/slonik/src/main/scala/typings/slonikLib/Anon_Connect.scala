package typings
package slonikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connect extends js.Object {
  def connect(connectionRoutine: slonikLib.slonikMod.ConnectionRoutineType): js.Promise[_]
  def transaction(handler: slonikLib.slonikMod.TransactionFunctionType): js.Promise[_]
}

object Anon_Connect {
  @scala.inline
  def apply(
    connect: slonikLib.slonikMod.ConnectionRoutineType => js.Promise[_],
    transaction: slonikLib.slonikMod.TransactionFunctionType => js.Promise[_]
  ): Anon_Connect = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), transaction = js.Any.fromFunction1(transaction))
  
    __obj.asInstanceOf[Anon_Connect]
  }
}

