package typings
package slonikLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HandlerSql extends js.Object {
  def stream(
    sql: slonikLib.slonikMod.TaggedTemplateLiteralInvocationType,
    streamHandler: slonikLib.slonikMod.StreamHandlerType
  ): js.Promise[scala.Null]
  def transaction[T](handler: slonikLib.slonikMod.TransactionFunctionType[T]): js.Promise[T]
}

object Anon_HandlerSql {
  @scala.inline
  def apply(
    stream: (slonikLib.slonikMod.TaggedTemplateLiteralInvocationType, slonikLib.slonikMod.StreamHandlerType) => js.Promise[scala.Null],
    transaction: slonikLib.slonikMod.TransactionFunctionType[js.Any] => js.Promise[js.Any]
  ): Anon_HandlerSql = {
    val __obj = js.Dynamic.literal(stream = js.Any.fromFunction2(stream), transaction = js.Any.fromFunction1(transaction))
  
    __obj.asInstanceOf[Anon_HandlerSql]
  }
}

