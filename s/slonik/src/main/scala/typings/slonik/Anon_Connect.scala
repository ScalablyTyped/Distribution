package typings.slonik

import typings.slonik.slonikMod.ConnectionRoutineType
import typings.slonik.slonikMod.QueryResultRowType
import typings.slonik.slonikMod.StreamHandlerType
import typings.slonik.slonikMod.TaggedTemplateLiteralInvocationType
import typings.slonik.slonikMod.TransactionFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Connect extends js.Object {
  def connect[T](connectionRoutine: ConnectionRoutineType[T]): js.Promise[T]
  def stream(
    sql: TaggedTemplateLiteralInvocationType[QueryResultRowType[String]],
    streamHandler: StreamHandlerType
  ): js.Promise[Null]
  def transaction[T](handler: TransactionFunctionType[T]): js.Promise[T]
}

object Anon_Connect {
  @scala.inline
  def apply(
    connect: ConnectionRoutineType[js.Any] => js.Promise[js.Any],
    stream: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null],
    transaction: TransactionFunctionType[js.Any] => js.Promise[js.Any]
  ): Anon_Connect = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), stream = js.Any.fromFunction2(stream), transaction = js.Any.fromFunction1(transaction))
  
    __obj.asInstanceOf[Anon_Connect]
  }
}

