package typings.slonik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseTransactionConnectionType
  extends StObject
     with CommonQueryMethodsType {
  
  def transaction[T](handler: TransactionFunctionType[T]): js.Promise[T]
}
object DatabaseTransactionConnectionType {
  
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
    transaction: TransactionFunctionType[Any] => js.Promise[Any]
  ): DatabaseTransactionConnectionType = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), anyFirst = anyFirst.asInstanceOf[js.Any], exists = js.Any.fromFunction1(exists), many = many.asInstanceOf[js.Any], manyFirst = manyFirst.asInstanceOf[js.Any], maybeOne = js.Any.fromFunction1(maybeOne), maybeOneFirst = js.Any.fromFunction1(maybeOneFirst), one = js.Any.fromFunction1(one), oneFirst = js.Any.fromFunction1(oneFirst), query = js.Any.fromFunction1(query), transaction = js.Any.fromFunction1(transaction))
    __obj.asInstanceOf[DatabaseTransactionConnectionType]
  }
  
  extension [Self <: DatabaseTransactionConnectionType](x: Self) {
    
    inline def setTransaction(value: TransactionFunctionType[Any] => js.Promise[Any]): Self = StObject.set(x, "transaction", js.Any.fromFunction1(value))
  }
}
