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
    any: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Array[js.Any]],
    anyFirst: /* args */ QueryMethodParams[js.Any] => js.Promise[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ],
    exists: /* args */ QueryMethodParams[js.Any] => js.Promise[Boolean],
    many: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Array[js.Any]],
    manyFirst: /* args */ QueryMethodParams[js.Any] => js.Promise[
      js.Array[
        /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
      ]
    ],
    maybeOne: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Any | Null],
    maybeOneFirst: /* args */ QueryMethodParams[js.Any] => js.Promise[
      (/* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any) | Null
    ],
    one: /* args */ QueryMethodParams[js.Any] => js.Promise[js.Any],
    oneFirst: /* args */ QueryMethodParams[js.Any] => js.Promise[
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    query: /* args */ QueryMethodParams[js.Any] => js.Promise[QueryResultType[js.Any]],
    stream: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null],
    transaction: TransactionFunctionType[js.Any] => js.Promise[js.Any]
  ): DatabasePoolConnectionType = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), anyFirst = js.Any.fromFunction1(anyFirst), exists = js.Any.fromFunction1(exists), many = js.Any.fromFunction1(many), manyFirst = js.Any.fromFunction1(manyFirst), maybeOne = js.Any.fromFunction1(maybeOne), maybeOneFirst = js.Any.fromFunction1(maybeOneFirst), one = js.Any.fromFunction1(one), oneFirst = js.Any.fromFunction1(oneFirst), query = js.Any.fromFunction1(query), stream = js.Any.fromFunction2(stream), transaction = js.Any.fromFunction1(transaction))
    __obj.asInstanceOf[DatabasePoolConnectionType]
  }
  
  extension [Self <: DatabasePoolConnectionType](x: Self) {
    
    inline def setStream(
      value: (TaggedTemplateLiteralInvocationType[QueryResultRowType[String]], StreamHandlerType) => js.Promise[Null]
    ): Self = StObject.set(x, "stream", js.Any.fromFunction2(value))
    
    inline def setTransaction(value: TransactionFunctionType[js.Any] => js.Promise[js.Any]): Self = StObject.set(x, "transaction", js.Any.fromFunction1(value))
  }
}
