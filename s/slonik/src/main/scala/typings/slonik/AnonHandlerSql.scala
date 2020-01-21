package typings.slonik

import typings.slonik.mod.QueryResultRowType
import typings.slonik.mod.StreamHandlerType
import typings.slonik.mod.TaggedTemplateLiteralInvocationType
import typings.slonik.mod.TransactionFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandlerSql extends js.Object {
  def stream(
    sql: TaggedTemplateLiteralInvocationType[QueryResultRowType[String]],
    streamHandler: StreamHandlerType
  ): js.Promise[Null]
  def transaction[T](handler: TransactionFunctionType[T]): js.Promise[T]
}

object AnonHandlerSql {
  @scala.inline
  def apply(
    stream: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null],
    transaction: TransactionFunctionType[js.Any] => js.Promise[js.Any]
  ): AnonHandlerSql = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction2(stream), transaction = js.Any.fromFunction1(transaction))
  
    __obj.asInstanceOf[AnonHandlerSql]
  }
}

