package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabasePoolConnectionType
  extends StObject
     with CommonQueryMethodsType {
  
  def stream(
    sql: TaggedTemplateLiteralInvocationType[QueryResultRowType[String]],
    streamHandler: StreamHandlerType
  ): js.Promise[Null]
  
  def transaction[T](handler: TransactionFunctionType[T]): js.Promise[T]
}
object DatabasePoolConnectionType {
  
  inline def apply(
    any: /* args */ QueryMethodParams[Any] => js.Promise[js.Array[Any]],
    anyFirst: QueryAnyFirstFunctionType,
    exists: /* args */ QueryMethodParams[Any] => js.Promise[Boolean],
    many: QueryManyFunctionType,
    manyFirst: QueryManyFirstFunctionType,
    maybeOne: /* args */ QueryMethodParams[Any] => js.Promise[Any | Null],
    maybeOneFirst: /* args */ QueryMethodParams[Any] => js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | Null
    ],
    one: /* args */ QueryMethodParams[Any] => js.Promise[Any],
    oneFirst: /* args */ QueryMethodParams[Any] => js.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    query: /* args */ QueryMethodParams[Any] => js.Promise[QueryResultType[Any]],
    stream: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null],
    transaction: TransactionFunctionType[Any] => js.Promise[Any]
  ): DatabasePoolConnectionType = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), anyFirst = anyFirst.asInstanceOf[js.Any], exists = js.Any.fromFunction1(exists), many = many.asInstanceOf[js.Any], manyFirst = manyFirst.asInstanceOf[js.Any], maybeOne = js.Any.fromFunction1(maybeOne), maybeOneFirst = js.Any.fromFunction1(maybeOneFirst), one = js.Any.fromFunction1(one), oneFirst = js.Any.fromFunction1(oneFirst), query = js.Any.fromFunction1(query), stream = js.Any.fromFunction2(stream), transaction = js.Any.fromFunction1(transaction))
    __obj.asInstanceOf[DatabasePoolConnectionType]
  }
  
  extension [Self <: DatabasePoolConnectionType](x: Self) {
    
    inline def setStream(
      value: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null]
    ): Self = StObject.set(x, "stream", js.Any.fromFunction2(value))
    
    inline def setTransaction(value: TransactionFunctionType[Any] => js.Promise[Any]): Self = StObject.set(x, "transaction", js.Any.fromFunction1(value))
  }
}
