package typings
package slonikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connect extends js.Object {
  def connect[T](connectionRoutine: slonikLib.slonikMod.ConnectionRoutineType[T]): js.Promise[T]
  def stream(
    sql: slonikLib.slonikMod.TaggedTemplateLiteralInvocationType,
    streamHandler: slonikLib.slonikMod.StreamHandlerType
  ): js.Promise[scala.Null]
  def transaction[T](handler: slonikLib.slonikMod.TransactionFunctionType[T]): js.Promise[T]
}

object Anon_Connect {
  @scala.inline
  def apply(
    connect: slonikLib.slonikMod.ConnectionRoutineType[js.Any] => js.Promise[js.Any],
    stream: (slonikLib.slonikMod.TaggedTemplateLiteralInvocationType, slonikLib.slonikMod.StreamHandlerType) => js.Promise[scala.Null],
    transaction: slonikLib.slonikMod.TransactionFunctionType[js.Any] => js.Promise[js.Any]
  ): Anon_Connect = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), stream = js.Any.fromFunction2(stream), transaction = js.Any.fromFunction1(transaction))
  
    __obj.asInstanceOf[Anon_Connect]
  }
}

