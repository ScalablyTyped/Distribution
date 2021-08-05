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
    transaction: TransactionFunctionType[js.Any] => js.Promise[js.Any]
  ): DatabaseTransactionConnectionType = {
    val __obj = js.Dynamic.literal(any = js.Any.fromFunction1(any), anyFirst = js.Any.fromFunction1(anyFirst), exists = js.Any.fromFunction1(exists), many = js.Any.fromFunction1(many), manyFirst = js.Any.fromFunction1(manyFirst), maybeOne = js.Any.fromFunction1(maybeOne), maybeOneFirst = js.Any.fromFunction1(maybeOneFirst), one = js.Any.fromFunction1(one), oneFirst = js.Any.fromFunction1(oneFirst), query = js.Any.fromFunction1(query), transaction = js.Any.fromFunction1(transaction))
    __obj.asInstanceOf[DatabaseTransactionConnectionType]
  }
  
  extension [Self <: DatabaseTransactionConnectionType](x: Self) {
    
    inline def setTransaction(value: TransactionFunctionType[js.Any] => js.Promise[js.Any]): Self = StObject.set(x, "transaction", js.Any.fromFunction1(value))
  }
}
