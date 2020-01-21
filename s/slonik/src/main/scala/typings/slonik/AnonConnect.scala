package typings.slonik

import typings.slonik.mod.ConnectionRoutineType
import typings.slonik.mod.PoolStateType
import typings.slonik.mod.QueryResultRowType
import typings.slonik.mod.StreamHandlerType
import typings.slonik.mod.TaggedTemplateLiteralInvocationType
import typings.slonik.mod.TransactionFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConnect extends js.Object {
  def connect[T](connectionRoutine: ConnectionRoutineType[T]): js.Promise[T]
  def end(): js.Promise[Unit]
  def getPoolState(): PoolStateType
  def stream(
    sql: TaggedTemplateLiteralInvocationType[QueryResultRowType[String]],
    streamHandler: StreamHandlerType
  ): js.Promise[Null]
  def transaction[T](handler: TransactionFunctionType[T]): js.Promise[T]
}

object AnonConnect {
  @scala.inline
  def apply(
    connect: ConnectionRoutineType[js.Any] => js.Promise[js.Any],
    end: () => js.Promise[Unit],
    getPoolState: () => PoolStateType,
    stream: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null],
    transaction: TransactionFunctionType[js.Any] => js.Promise[js.Any]
  ): AnonConnect = {
    val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), end = js.Any.fromFunction0(end), getPoolState = js.Any.fromFunction0(getPoolState), stream = js.Any.fromFunction2(stream), transaction = js.Any.fromFunction1(transaction))
  
    __obj.asInstanceOf[AnonConnect]
  }
}

