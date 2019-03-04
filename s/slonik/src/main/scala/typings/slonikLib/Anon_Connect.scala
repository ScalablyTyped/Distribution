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
    connect: js.Function1[slonikLib.slonikMod.ConnectionRoutineType, js.Promise[_]],
    transaction: js.Function1[slonikLib.slonikMod.TransactionFunctionType, js.Promise[_]]
  ): Anon_Connect = {
    val __obj = js.Dynamic.literal(connect = connect, transaction = transaction)
  
    __obj.asInstanceOf[Anon_Connect]
  }
}

