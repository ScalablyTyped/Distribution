package typings.slonik

import typings.slonik.slonikMod.QueryResultRowType
import typings.slonik.slonikMod.StreamHandlerType
import typings.slonik.slonikMod.TaggedTemplateLiteralInvocationType
import typings.slonik.slonikMod.TransactionFunctionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerSql extends js.Object {
  def stream(
    sql: TaggedTemplateLiteralInvocationType[QueryResultRowType[String]],
    streamHandler: StreamHandlerType
  ): js.Promise[Null]
  def transaction[T](handler: TransactionFunctionType[T]): js.Promise[T]
}

object Anon_HandlerSql {
  @scala.inline
  def apply(
    stream: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null],
    transaction: TransactionFunctionType[js.Any] => js.Promise[js.Any]
  ): Anon_HandlerSql = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction2(stream), transaction = js.Any.fromFunction1(transaction))
  
    __obj.asInstanceOf[Anon_HandlerSql]
  }
}

